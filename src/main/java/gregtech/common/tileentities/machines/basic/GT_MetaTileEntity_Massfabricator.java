package gregtech.common.tileentities.machines.basic;

import gregtech.api.GT_Values;
import gregtech.api.ConfigCategories;
import gregtech.api.items.ItemList;
import gregtech.api.unification.material.Materials;
import gregtech.api.enums.Textures;
import gregtech.api.interfaces.ITexture;
import gregtech.api.capability.internal.IGregTechTileEntity;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.implementations.MetaTileEntityBasicMachine;
import gregtech.api.objects.GT_RenderedTexture;
import gregtech.api.util.GT_Config;
import net.minecraftforge.fluids.FluidStack;

import static gregtech.api.GT_Values.V;

public class GT_MetaTileEntity_Massfabricator
        extends MetaTileEntityBasicMachine {
    public static int sUUAperUUM = 1;
    public static int sUUASpeedBonus = 4;
    public static int sDurationMultiplier = 3215;
    public static boolean sRequiresUUA = false;

    public GT_MetaTileEntity_Massfabricator(int aID, String aName, String aNameRegional, int aTier) {
        super(aID, aName, aNameRegional, aTier, 1, "UUM = Matter * Fabrication Squared", 1, 1, "Massfabricator.png", "", new ITexture[]{new GT_RenderedTexture(Textures.BlockIcons.OVERLAY_SIDE_MASSFAB_ACTIVE), new GT_RenderedTexture(Textures.BlockIcons.OVERLAY_SIDE_MASSFAB), new GT_RenderedTexture(Textures.BlockIcons.OVERLAY_FRONT_MASSFAB_ACTIVE), new GT_RenderedTexture(Textures.BlockIcons.OVERLAY_FRONT_MASSFAB), new GT_RenderedTexture(Textures.BlockIcons.OVERLAY_TOP_MASSFAB_ACTIVE), new GT_RenderedTexture(Textures.BlockIcons.OVERLAY_TOP_MASSFAB), new GT_RenderedTexture(Textures.BlockIcons.OVERLAY_BOTTOM_MASSFAB_ACTIVE), new GT_RenderedTexture(Textures.BlockIcons.OVERLAY_BOTTOM_MASSFAB)});
    }

    public GT_MetaTileEntity_Massfabricator(String aName, int aTier, String aDescription, ITexture[][][] aTextures, String aGUIName, String aNEIName) {
        super(aName, aTier, 1, aDescription, aTextures, 1, 1, aGUIName, aNEIName);
    }

    public MetaTileEntity newMetaEntity(IGregTechTileEntity aTileEntity) {
        return new GT_MetaTileEntity_Massfabricator(this.mName, this.mTier, this.mDescription, this.mTextures, this.mGUIName, this.mNEIName);
    }

    public void onConfigLoad(GT_Config aConfig) {
        super.onConfigLoad(aConfig);
        sDurationMultiplier = aConfig.get(ConfigCategories.machineconfig, "Massfabricator.UUM_Duration_Multiplier", sDurationMultiplier);
        sUUAperUUM = aConfig.get(ConfigCategories.machineconfig, "Massfabricator.UUA_per_UUM", sUUAperUUM);
        sUUASpeedBonus = aConfig.get(ConfigCategories.machineconfig, "Massfabricator.UUA_Speed_Bonus", sUUASpeedBonus);
        sRequiresUUA = aConfig.get(ConfigCategories.machineconfig, "Massfabricator.UUA_Requirement", sRequiresUUA);
        Materials.UUAmplifier.mChemicalFormula = ("Mass Fabricator Eff/Speed Bonus: x" + sUUASpeedBonus);
    }

    @Override
    public long maxAmperesIn() {
        return 10;
    }

    @Override
    public long maxEUStore() {
        return V[mTier] * 512;
    }

    public int checkRecipe() {
        FluidStack tFluid = getDrainableStack();
        if ((tFluid == null) || (tFluid.amount < getCapacity())) {
            this.mOutputFluid = Materials.UUMatter.getFluid(1L);
            this.mEUt =  (((int) GT_Values.V[1]) * (int)Math.pow(2, this.mTier + 2));
            this.mMaxProgresstime = (sDurationMultiplier / (1 << this.mTier - 1));
            if (((tFluid = getFillableStack()) != null) && (tFluid.amount >= sUUAperUUM) && (tFluid.isFluidEqual(Materials.UUAmplifier.getFluid(1L)))) {
                tFluid.amount -= sUUAperUUM;
                this.mMaxProgresstime /= sUUASpeedBonus;
                return 2;
            }
            return (sRequiresUUA) || (ItemList.Circuit_Integrated.isStackEqual(getInputAt(0), true, true)) ? 1 : 2;
        }
        return 0;
    }

    public boolean isFluidInputAllowed(FluidStack aFluid) {
        return aFluid.isFluidEqual(Materials.UUAmplifier.getFluid(1L));
    }

    public int getCapacity() {
        return Math.max(sUUAperUUM, 1000);
    }
}
