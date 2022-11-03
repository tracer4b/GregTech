package gregtech.api.unification.material.properties;

import gregtech.api.unification.material.Material;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class OreProperty implements IMaterialProperty<OreProperty> {

    /**
     * List of Ore byproducts.
     * <p>
     * Default: none, meaning only this property's Material.
     */
    private final List<Material> oreByProducts = new ArrayList<>();

    /**
     * Crushed Ore output amount multiplier during Maceration.
     * <p>
     * Default: 1 (no multiplier).
     */
    private int oreMultiplier;

    /**
     * Should ore block use the emissive texture.
     * <p>
     * Default: false.
     */
    private boolean emissive;

    /**
     * Material to which smelting of this Ore will result.
     * <p>
     * Material will have an Ingot Property.
     * Default: none.
     */
    private Material directSmeltResult;

    /**
     * Material that this Ore should create in a special Washing step.
     * Should be one of the 9 "Vitriol" Materials, or a new Material that
     * is considered part of this same category.
     * <p>
     * Any Material you pass here should follow the pattern of "?SO4" where
     * ? is some metal element.
     * <p>
     * Default: none
     */
    private Material vitriol;

    private Consumer<Material> bathRecipe;

    /**
     * Whether or not this Material should generate an actual Ore Block.
     * <p>
     * Default: true
     */
    private boolean doGenerateBlock;

    public OreProperty(int oreMultiplier) {
        this(oreMultiplier, false);
    }

    public OreProperty(int oreMultiplier, boolean emissive) {
        this(oreMultiplier, emissive, true);
    }

    public OreProperty(int oreMultiplier, boolean emissive, boolean doGenerateBlock) {
        this.oreMultiplier = oreMultiplier;
        this.emissive = emissive;
        this.doGenerateBlock = doGenerateBlock;
    }

    /**
     * Default values constructor.
     */
    public OreProperty() {
        this(1);
    }

    public void setOreMultiplier(int multiplier) {
        this.oreMultiplier = multiplier;
    }

    public int getOreMultiplier() {
        return this.oreMultiplier;
    }

    public boolean isEmissive() {
        return emissive;
    }

    public void setEmissive(boolean emissive) {
        this.emissive = emissive;
    }

    public void setDirectSmeltResult(Material m) {
        this.directSmeltResult = m;
    }

    @Nullable
    public Material getDirectSmeltResult() {
        return this.directSmeltResult;
    }

    public void setVitriol(Material m) {
        this.vitriol = m;
    }

    @Nullable
    public Material getVitriol() {
        return vitriol;
    }

    public void setBathHandler(Consumer<Material> c) {
        this.bathRecipe = c;
    }

    @Nullable
    public Consumer<Material> getBathRecipe() {
        return bathRecipe;
    }

    public void setOreByProducts(Material... materials) {
        for (Material m : materials) {
            m.getProperties().ensureSet(PropertyKey.ORE);
            this.oreByProducts.add(m);
        }
//        this.oreByProducts.addAll(Arrays.asList(materials));
    }

    public List<Material> getOreByProducts() {
        return this.oreByProducts;
    }

    public boolean doGenerateBlock() {
        return doGenerateBlock;
    }

    public void setGenerateBlock(boolean doGenerateBlock) {
        this.doGenerateBlock = doGenerateBlock;
    }

    @Override
    public void verifyProperty(MaterialProperties properties) {
        properties.ensureSet(PropertyKey.DUST, true);

        if (directSmeltResult != null) directSmeltResult.getProperties().ensureSet(PropertyKey.INGOT, true);
        if (vitriol != null) vitriol.getProperties().ensureSet(PropertyKey.FLUID, true);
        for (int i = 0; i < oreByProducts.size(); i++) {
            Material byproduct = oreByProducts.get(i);
            if (i == 3 || i == oreByProducts.size() - 1) {
                byproduct.getProperties().ensureSet(PropertyKey.ORE, true);
            } else {
                // Dust only needs to be set if the Ore is not set above
                byproduct.getProperties().ensureSet(PropertyKey.DUST, true);
            }
        }
    }
}
