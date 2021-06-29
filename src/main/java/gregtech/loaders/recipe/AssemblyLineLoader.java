package gregtech.loaders.recipe;

import gregtech.api.recipes.RecipeMaps;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.common.ConfigHolder;
import gregtech.common.blocks.BlockWireCoil;
import gregtech.common.blocks.MetaBlocks;
import gregtech.common.items.MetaItems;
import gregtech.common.metatileentities.MetaTileEntities;
import net.minecraft.item.ItemStack;

import static gregtech.api.GTValues.L;

public class AssemblyLineLoader {
    public static void init() {

        // TODO Relocate
        RecipeMaps.FUSION_RECIPES.recipeBuilder().fluidInputs(Materials.Deuterium.getFluid(125), Materials.Tritium.getFluid(125)).fluidOutputs(Materials.Helium.getPlasma(125)).duration(16).EUt(4096).EUToStart(40000000).buildAndRegister();
        RecipeMaps.FUSION_RECIPES.recipeBuilder().fluidInputs(Materials.Deuterium.getFluid(125), Materials.Helium3.getFluid(125)).fluidOutputs(Materials.Helium.getPlasma(125)).duration(16).EUt(2048).EUToStart(60000000).buildAndRegister();
        RecipeMaps.FUSION_RECIPES.recipeBuilder().fluidInputs(Materials.Carbon.getFluid(125), Materials.Helium3.getFluid(125)).fluidOutputs(Materials.Oxygen.getPlasma(125)).duration(32).EUt(4096).EUToStart(80000000).buildAndRegister();
        RecipeMaps.FUSION_RECIPES.recipeBuilder().fluidInputs(Materials.Beryllium.getFluid(16), Materials.Deuterium.getFluid(375)).fluidOutputs(Materials.Nitrogen.getPlasma(175)).duration(16).EUt(16384).EUToStart(180000000).buildAndRegister();
        RecipeMaps.FUSION_RECIPES.recipeBuilder().fluidInputs(Materials.Silicon.getFluid(16), Materials.Magnesium.getFluid(16)).fluidOutputs(Materials.Iron.getPlasma(125)).duration(32).EUt(8192).EUToStart(360000000).buildAndRegister();
        RecipeMaps.FUSION_RECIPES.recipeBuilder().fluidInputs(Materials.Potassium.getFluid(16), Materials.Fluorine.getFluid(125)).fluidOutputs(Materials.Nickel.getPlasma(125)).duration(16).EUt(32768).EUToStart(480000000).buildAndRegister();
        RecipeMaps.FUSION_RECIPES.recipeBuilder().fluidInputs(Materials.Beryllium.getFluid(16), Materials.Tungsten.getFluid(16)).fluidOutputs(Materials.Platinum.getFluid(16)).duration(32).EUt(32768).EUToStart(150000000).buildAndRegister();
        RecipeMaps.FUSION_RECIPES.recipeBuilder().fluidInputs(Materials.Neodymium.getFluid(16), Materials.Hydrogen.getFluid(48)).fluidOutputs(Materials.Europium.getFluid(16)).duration(64).EUt(24576).EUToStart(150000000).buildAndRegister();
        RecipeMaps.FUSION_RECIPES.recipeBuilder().fluidInputs(Materials.Lutetium.getFluid(16), Materials.Chrome.getFluid(16)).fluidOutputs(Materials.Americium.getFluid(16)).duration(96).EUt(49152).EUToStart(200000000).buildAndRegister();
        RecipeMaps.FUSION_RECIPES.recipeBuilder().fluidInputs(Materials.Plutonium239.getFluid(16), Materials.Thorium.getFluid(16)).fluidOutputs(Materials.Naquadah.getFluid(16)).duration(64).EUt(32768).EUToStart(300000000).buildAndRegister();
        RecipeMaps.FUSION_RECIPES.recipeBuilder().fluidInputs(Materials.Americium.getFluid(16), Materials.Naquadria.getFluid(16)).fluidOutputs(Materials.Neutronium.getFluid(2)).duration(200).EUt(98304).EUToStart(600000000).buildAndRegister();
        RecipeMaps.FUSION_RECIPES.recipeBuilder().fluidInputs(Materials.Tungsten.getFluid(16), Materials.Helium.getFluid(16)).fluidOutputs(Materials.Osmium.getFluid(16)).duration(64).EUt(24578).EUToStart(150000000).buildAndRegister();
        RecipeMaps.FUSION_RECIPES.recipeBuilder().fluidInputs(Materials.Manganese.getFluid(16), Materials.Hydrogen.getFluid(16)).fluidOutputs(Materials.Iron.getFluid(16)).duration(64).EUt(8192).EUToStart(120000000).buildAndRegister();
        RecipeMaps.FUSION_RECIPES.recipeBuilder().fluidInputs(Materials.Mercury.getFluid(16), Materials.Magnesium.getFluid(16)).fluidOutputs(Materials.Uranium238.getFluid(16)).duration(64).EUt(49152).EUToStart(240000000).buildAndRegister();
        RecipeMaps.FUSION_RECIPES.recipeBuilder().fluidInputs(Materials.Gold.getFluid(16), Materials.Aluminium.getFluid(16)).fluidOutputs(Materials.Uranium238.getFluid(16)).duration(64).EUt(49152).EUToStart(240000000).buildAndRegister();
        RecipeMaps.FUSION_RECIPES.recipeBuilder().fluidInputs(Materials.Uranium238.getFluid(16), Materials.Helium.getFluid(16)).fluidOutputs(Materials.Plutonium239.getFluid(16)).duration(128).EUt(49152).EUToStart(480000000).buildAndRegister();
        RecipeMaps.FUSION_RECIPES.recipeBuilder().fluidInputs(Materials.Vanadium.getFluid(16), Materials.Hydrogen.getFluid(125)).fluidOutputs(Materials.Chrome.getFluid(16)).duration(64).EUt(24576).EUToStart(140000000).buildAndRegister();
        RecipeMaps.FUSION_RECIPES.recipeBuilder().fluidInputs(Materials.Gallium.getFluid(16), Materials.Radon.getFluid(125)).fluidOutputs(Materials.Duranium.getFluid(16)).duration(64).EUt(16384).EUToStart(140000000).buildAndRegister();
        RecipeMaps.FUSION_RECIPES.recipeBuilder().fluidInputs(Materials.Titanium.getFluid(48), Materials.Duranium.getFluid(32)).fluidOutputs(Materials.Tritanium.getFluid(16)).duration(64).EUt(32768).EUToStart(200000000).buildAndRegister();
        RecipeMaps.FUSION_RECIPES.recipeBuilder().fluidInputs(Materials.Gold.getFluid(16), Materials.Mercury.getFluid(16)).fluidOutputs(Materials.Radon.getFluid(125)).duration(64).EUt(32768).EUToStart(200000000).buildAndRegister();
        RecipeMaps.FUSION_RECIPES.recipeBuilder().fluidInputs(Materials.Tantalum.getFluid(16), Materials.Tritium.getFluid(16)).fluidOutputs(Materials.Tungsten.getFluid(16)).duration(16).EUt(24576).EUToStart(200000000).buildAndRegister();
        RecipeMaps.FUSION_RECIPES.recipeBuilder().fluidInputs(Materials.Silver.getFluid(16), Materials.Lithium.getFluid(16)).fluidOutputs(Materials.Indium.getFluid(16)).duration(32).EUt(24576).EUToStart(380000000).buildAndRegister();
        RecipeMaps.FUSION_RECIPES.recipeBuilder().fluidInputs(Materials.NaquadahEnriched.getFluid(15), Materials.Radon.getFluid(125)).fluidOutputs(Materials.Naquadria.getFluid(3)).duration(64).EUt(49152).EUToStart(400000000).buildAndRegister();
        RecipeMaps.FUSION_RECIPES.recipeBuilder().fluidInputs(Materials.Lanthanum.getFluid(16), Materials.Silicon.getFluid(16)).fluidOutputs(Materials.Lutetium.getFluid(16)).duration(16).EUt(8192).EUToStart(80000000).buildAndRegister();

        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(OrePrefix.stickLong, Materials.NeodymiumMagnetic)
                .input(OrePrefix.stickLong, Materials.HSSG, 2)
                .input(OrePrefix.ring, Materials.HSSG, 4)
                .input(OrePrefix.round, Materials.HSSG, 16)
                .input(OrePrefix.wireFine, Materials.AnnealedCopper, 64)
                .input(OrePrefix.wireFine, Materials.AnnealedCopper, 64)
                .input(OrePrefix.wireFine, Materials.AnnealedCopper, 64)
                .input(OrePrefix.wireFine, Materials.AnnealedCopper, 64)
                .input(OrePrefix.cableGtSingle, Materials.YttriumBariumCuprate, 2)
                .fluidInputs(Materials.SolderingAlloy.getFluid(L))
                .fluidInputs(Materials.Lubricant.getFluid(250))
                .outputs(MetaItems.ELECTRIC_MOTOR_LUV.getStackForm())
                .duration(600).EUt(10240)
                .buildAndRegister();

        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().inputs(OreDictUnifier.get(OrePrefix.stickLong, Materials.NeodymiumMagnetic, 2), OreDictUnifier.get(OrePrefix.stickLong, Materials.HSSE, 4), OreDictUnifier.get(OrePrefix.ring, Materials.HSSE, 4), OreDictUnifier.get(OrePrefix.round, Materials.HSSE, 16), OreDictUnifier.get(OrePrefix.wireFine, Materials.Platinum, 64), OreDictUnifier.get(OrePrefix.wireFine, Materials.Platinum, 64), OreDictUnifier.get(OrePrefix.wireFine, Materials.Platinum, 64), OreDictUnifier.get(OrePrefix.wireFine, Materials.Platinum, 64), OreDictUnifier.get(OrePrefix.cableGtDouble, Materials.VanadiumGallium, 2)).fluidInputs(Materials.SolderingAlloy.getFluid(288), Materials.Lubricant.getFluid(750)).outputs(MetaItems.ELECTRIC_MOTOR_ZPM.getStackForm()).duration(600).EUt(40960).buildAndRegister();
        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().inputs(OreDictUnifier.get(OrePrefix.block, Materials.NeodymiumMagnetic, 1), OreDictUnifier.get(OrePrefix.stickLong, Materials.Neutronium, 4), OreDictUnifier.get(OrePrefix.ring, Materials.Neutronium, 4), OreDictUnifier.get(OrePrefix.round, Materials.Neutronium, 16), OreDictUnifier.get(OrePrefix.wireGtSingle, MarkerMaterials.Tier.Superconductor, 64), OreDictUnifier.get(OrePrefix.wireGtSingle, MarkerMaterials.Tier.Superconductor, 64), OreDictUnifier.get(OrePrefix.wireGtSingle, MarkerMaterials.Tier.Superconductor, 64), OreDictUnifier.get(OrePrefix.wireGtSingle, MarkerMaterials.Tier.Superconductor, 64), OreDictUnifier.get(OrePrefix.cableGtQuadruple, Materials.NiobiumTitanium, 2)).fluidInputs(Materials.SolderingAlloy.getFluid(1296), Materials.Lubricant.getFluid(2000)).outputs(MetaItems.ELECTRIC_MOTOR_UV.getStackForm()).duration(600).EUt(163840).buildAndRegister();

        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().inputs(MetaItems.ELECTRIC_MOTOR_LUV.getStackForm(), OreDictUnifier.get(OrePrefix.plate, Materials.HSSG, 2), OreDictUnifier.get(OrePrefix.pipeSmall, Materials.Ultimet, 2), OreDictUnifier.get(OrePrefix.screw, Materials.HSSG, 8), OreDictUnifier.get(OrePrefix.ring, Materials.SiliconeRubber, 4), OreDictUnifier.get(OrePrefix.rotor, Materials.HSSG, 2), OreDictUnifier.get(OrePrefix.cableGtSingle, Materials.YttriumBariumCuprate, 2)).fluidInputs(Materials.SolderingAlloy.getFluid(144), Materials.Lubricant.getFluid(250)).outputs(MetaItems.ELECTRIC_PUMP_LUV.getStackForm()).duration(600).EUt(15360).buildAndRegister();
        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().inputs(MetaItems.ELECTRIC_MOTOR_ZPM.getStackForm(), OreDictUnifier.get(OrePrefix.plate, Materials.HSSE, 2), OreDictUnifier.get(OrePrefix.pipeMedium, Materials.Ultimet, 2), OreDictUnifier.get(OrePrefix.screw, Materials.HSSE, 8), OreDictUnifier.get(OrePrefix.ring, Materials.SiliconeRubber, 16), OreDictUnifier.get(OrePrefix.rotor, Materials.HSSE, 2), OreDictUnifier.get(OrePrefix.cableGtDouble, Materials.VanadiumGallium, 2)).fluidInputs(Materials.SolderingAlloy.getFluid(288), Materials.Lubricant.getFluid(750)).outputs(MetaItems.ELECTRIC_PUMP_ZPM.getStackForm()).duration(600).EUt(61440).buildAndRegister();
        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().inputs(MetaItems.ELECTRIC_MOTOR_UV.getStackForm(), OreDictUnifier.get(OrePrefix.plate, Materials.Neutronium, 2), OreDictUnifier.get(OrePrefix.pipeLarge, Materials.Ultimet, 2), OreDictUnifier.get(OrePrefix.screw, Materials.Neutronium, 8), OreDictUnifier.get(OrePrefix.ring, Materials.SiliconeRubber, 16), OreDictUnifier.get(OrePrefix.rotor, Materials.Neutronium, 2), OreDictUnifier.get(OrePrefix.cableGtQuadruple, Materials.NiobiumTitanium, 2)).fluidInputs(Materials.SolderingAlloy.getFluid(1296), Materials.Lubricant.getFluid(2000)).outputs(MetaItems.ELECTRIC_PUMP_UV.getStackForm()).duration(600).EUt(245760).buildAndRegister();

        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().inputs(MetaItems.ELECTRIC_MOTOR_LUV.getStackForm(2), OreDictUnifier.get(OrePrefix.plate, Materials.HSSG, 2), OreDictUnifier.get(OrePrefix.ring, Materials.HSSG, 4), OreDictUnifier.get(OrePrefix.round, Materials.HSSG, 32), OreDictUnifier.get(OrePrefix.cableGtSingle, Materials.YttriumBariumCuprate, 2)).fluidInputs(Materials.StyreneButadieneRubber.getFluid(1440), Materials.Lubricant.getFluid(250)).outputs(MetaItems.CONVEYOR_MODULE_LUV.getStackForm()).duration(600).EUt(15360).buildAndRegister();
        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().inputs(MetaItems.ELECTRIC_MOTOR_ZPM.getStackForm(2), OreDictUnifier.get(OrePrefix.plate, Materials.HSSE, 2), OreDictUnifier.get(OrePrefix.ring, Materials.HSSE, 4), OreDictUnifier.get(OrePrefix.round, Materials.HSSE, 32), OreDictUnifier.get(OrePrefix.cableGtDouble, Materials.VanadiumGallium, 2)).fluidInputs(Materials.StyreneButadieneRubber.getFluid(2880), Materials.Lubricant.getFluid(750)).outputs(MetaItems.CONVEYOR_MODULE_ZPM.getStackForm()).duration(600).EUt(61440).buildAndRegister();
        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().inputs(MetaItems.ELECTRIC_MOTOR_UV.getStackForm(2), OreDictUnifier.get(OrePrefix.plate, Materials.Neutronium, 2), OreDictUnifier.get(OrePrefix.ring, Materials.Neutronium, 4), OreDictUnifier.get(OrePrefix.round, Materials.Neutronium, 32), OreDictUnifier.get(OrePrefix.cableGtQuadruple, Materials.NiobiumTitanium, 2)).fluidInputs(Materials.StyreneButadieneRubber.getFluid(2880), Materials.Lubricant.getFluid(2000)).outputs(MetaItems.CONVEYOR_MODULE_UV.getStackForm()).duration(600).EUt(245760).buildAndRegister();

        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().inputs(MetaItems.ELECTRIC_MOTOR_LUV.getStackForm(), OreDictUnifier.get(OrePrefix.plate, Materials.HSSG, 6), OreDictUnifier.get(OrePrefix.ring, Materials.HSSG, 4), OreDictUnifier.get(OrePrefix.round, Materials.HSSG, 32), OreDictUnifier.get(OrePrefix.stick, Materials.HSSG, 4), OreDictUnifier.get(OrePrefix.gear, Materials.HSSG), OreDictUnifier.get(OrePrefix.gearSmall, Materials.HSSG, 2), OreDictUnifier.get(OrePrefix.cableGtSingle, Materials.YttriumBariumCuprate, 4)).fluidInputs(Materials.SolderingAlloy.getFluid(144), Materials.Lubricant.getFluid(250)).outputs(MetaItems.ELECTRIC_PISTON_LUV.getStackForm()).duration(600).EUt(15360).buildAndRegister();
        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().inputs(MetaItems.ELECTRIC_MOTOR_ZPM.getStackForm(), OreDictUnifier.get(OrePrefix.plate, Materials.HSSE, 6), OreDictUnifier.get(OrePrefix.ring, Materials.HSSE, 4), OreDictUnifier.get(OrePrefix.round, Materials.HSSE, 32), OreDictUnifier.get(OrePrefix.stick, Materials.HSSE, 4), OreDictUnifier.get(OrePrefix.gear, Materials.HSSE), OreDictUnifier.get(OrePrefix.gearSmall, Materials.HSSE, 2), OreDictUnifier.get(OrePrefix.cableGtDouble, Materials.VanadiumGallium, 4)).fluidInputs(Materials.SolderingAlloy.getFluid(288), Materials.Lubricant.getFluid(750)).outputs(MetaItems.ELECTRIC_PISTON_ZPM.getStackForm()).duration(600).EUt(61440).buildAndRegister();
        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().inputs(MetaItems.ELECTRIC_MOTOR_UV.getStackForm(), OreDictUnifier.get(OrePrefix.plate, Materials.Neutronium, 6), OreDictUnifier.get(OrePrefix.ring, Materials.Neutronium, 4), OreDictUnifier.get(OrePrefix.round, Materials.Neutronium, 32), OreDictUnifier.get(OrePrefix.stick, Materials.Neutronium, 4), OreDictUnifier.get(OrePrefix.gear, Materials.Neutronium), OreDictUnifier.get(OrePrefix.gearSmall, Materials.Neutronium, 2), OreDictUnifier.get(OrePrefix.cableGtQuadruple, Materials.NiobiumTitanium, 4)).fluidInputs(Materials.SolderingAlloy.getFluid(1296), Materials.Lubricant.getFluid(2000)).outputs(MetaItems.ELECTRIC_PISTON_UV.getStackForm()).duration(600).EUt(245760).buildAndRegister();

        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().inputs(OreDictUnifier.get(OrePrefix.cableGtSingle, Materials.YttriumBariumCuprate, 6), OreDictUnifier.get(OrePrefix.stickLong, Materials.HSSG, 4), OreDictUnifier.get(OrePrefix.gear, Materials.HSSG), OreDictUnifier.get(OrePrefix.gearSmall, Materials.HSSG, 3), MetaItems.ELECTRIC_MOTOR_LUV.getStackForm(2), MetaItems.ELECTRIC_PISTON_LUV.getStackForm()).input(OrePrefix.circuit, MarkerMaterials.Tier.Master, 2).input(OrePrefix.circuit, MarkerMaterials.Tier.Elite, 2).input(OrePrefix.circuit, MarkerMaterials.Tier.Extreme, 6).fluidInputs(Materials.SolderingAlloy.getFluid(576), Materials.Lubricant.getFluid(250)).outputs(MetaItems.ROBOT_ARM_LUV.getStackForm()).duration(600).EUt(15360).buildAndRegister();
        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().inputs(OreDictUnifier.get(OrePrefix.cableGtDouble, Materials.VanadiumGallium, 6), OreDictUnifier.get(OrePrefix.stickLong, Materials.HSSE, 4), OreDictUnifier.get(OrePrefix.gear, Materials.HSSE), OreDictUnifier.get(OrePrefix.gearSmall, Materials.HSSE, 3), MetaItems.ELECTRIC_MOTOR_ZPM.getStackForm(2), MetaItems.ELECTRIC_PISTON_ZPM.getStackForm()).input(OrePrefix.circuit, MarkerMaterials.Tier.Master, 4).input(OrePrefix.circuit, MarkerMaterials.Tier.Elite, 4).input(OrePrefix.circuit, MarkerMaterials.Tier.Extreme, 12).fluidInputs(Materials.SolderingAlloy.getFluid(1152), Materials.Lubricant.getFluid(750)).outputs(MetaItems.ROBOT_ARM_ZPM.getStackForm()).duration(600).EUt(61440).buildAndRegister();
        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().inputs(OreDictUnifier.get(OrePrefix.cableGtQuadruple, Materials.NiobiumTitanium, 6), OreDictUnifier.get(OrePrefix.stickLong, Materials.Neutronium, 4), OreDictUnifier.get(OrePrefix.gear, Materials.Neutronium), OreDictUnifier.get(OrePrefix.gearSmall, Materials.Neutronium, 3), MetaItems.ELECTRIC_MOTOR_UV.getStackForm(2), MetaItems.ELECTRIC_PISTON_UV.getStackForm()).input(OrePrefix.circuit, MarkerMaterials.Tier.Master, 8).input(OrePrefix.circuit, MarkerMaterials.Tier.Elite, 8).input(OrePrefix.circuit, MarkerMaterials.Tier.Extreme, 24).fluidInputs(Materials.SolderingAlloy.getFluid(2304), Materials.Lubricant.getFluid(2000)).outputs(MetaItems.ROBOT_ARM_UV.getStackForm()).duration(600).EUt(245760).buildAndRegister();

        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().inputs(OreDictUnifier.get(OrePrefix.frameGt, Materials.HSSG, 1), MetaItems.EMITTER_IV.getStackForm(1), MetaItems.EMITTER_EV.getStackForm(2), MetaItems.EMITTER_HV.getStackForm(4), OreDictUnifier.get(OrePrefix.foil, Materials.Electrum, 64), OreDictUnifier.get(OrePrefix.foil, Materials.Electrum, 64), OreDictUnifier.get(OrePrefix.foil, Materials.Electrum, 64), OreDictUnifier.get(OrePrefix.cableGtSingle, Materials.YttriumBariumCuprate, 7), OreDictUnifier.get(OrePrefix.gemExquisite, Materials.Ruby, 2)).input(OrePrefix.circuit, MarkerMaterials.Tier.Extreme, 7).fluidInputs(Materials.SolderingAlloy.getFluid(576)).outputs(MetaItems.EMITTER_LUV.getStackForm()).duration(600).EUt(15360).buildAndRegister();
        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().inputs(OreDictUnifier.get(OrePrefix.frameGt, Materials.HSSE, 1), MetaItems.EMITTER_LUV.getStackForm(1), MetaItems.EMITTER_IV.getStackForm(2), MetaItems.EMITTER_EV.getStackForm(4), OreDictUnifier.get(OrePrefix.foil, Materials.Platinum, 64), OreDictUnifier.get(OrePrefix.foil, Materials.Platinum, 64), OreDictUnifier.get(OrePrefix.foil, Materials.Platinum, 64), OreDictUnifier.get(OrePrefix.cableGtDouble, Materials.VanadiumGallium, 7), OreDictUnifier.get(OrePrefix.gemExquisite, Materials.Emerald, 2)).input(OrePrefix.circuit, MarkerMaterials.Tier.Elite, 7).fluidInputs(Materials.SolderingAlloy.getFluid(576)).outputs(MetaItems.EMITTER_ZPM.getStackForm()).duration(600).EUt(61440).buildAndRegister();
        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().inputs(OreDictUnifier.get(OrePrefix.frameGt, Materials.Neutronium, 1), MetaItems.EMITTER_ZPM.getStackForm(1), MetaItems.EMITTER_LUV.getStackForm(2), MetaItems.EMITTER_IV.getStackForm(4), OreDictUnifier.get(OrePrefix.foil, Materials.Osmiridium, 64), OreDictUnifier.get(OrePrefix.foil, Materials.Osmiridium, 64), OreDictUnifier.get(OrePrefix.foil, Materials.Osmiridium, 64), OreDictUnifier.get(OrePrefix.cableGtQuadruple, Materials.NiobiumTitanium, 7), OreDictUnifier.get(OrePrefix.gemExquisite, Materials.Diamond, 2)).input(OrePrefix.circuit, MarkerMaterials.Tier.Master, 7).fluidInputs(Materials.SolderingAlloy.getFluid(576)).outputs(MetaItems.EMITTER_UV.getStackForm()).duration(600).EUt(245760).buildAndRegister();

        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().inputs(OreDictUnifier.get(OrePrefix.frameGt, Materials.HSSG, 1), MetaItems.SENSOR_IV.getStackForm(1), MetaItems.SENSOR_EV.getStackForm(2), MetaItems.SENSOR_HV.getStackForm(4), OreDictUnifier.get(OrePrefix.foil, Materials.Electrum, 64), OreDictUnifier.get(OrePrefix.foil, Materials.Electrum, 64), OreDictUnifier.get(OrePrefix.foil, Materials.Electrum, 64), OreDictUnifier.get(OrePrefix.cableGtSingle, Materials.YttriumBariumCuprate, 7), OreDictUnifier.get(OrePrefix.gemExquisite, Materials.Ruby, 2)).input(OrePrefix.circuit, MarkerMaterials.Tier.Extreme, 7).fluidInputs(Materials.SolderingAlloy.getFluid(576)).outputs(MetaItems.SENSOR_LUV.getStackForm()).duration(600).EUt(15360).buildAndRegister();
        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().inputs(OreDictUnifier.get(OrePrefix.frameGt, Materials.HSSE, 1), MetaItems.SENSOR_LUV.getStackForm(1), MetaItems.SENSOR_IV.getStackForm(2), MetaItems.SENSOR_EV.getStackForm(4), OreDictUnifier.get(OrePrefix.foil, Materials.Platinum, 64), OreDictUnifier.get(OrePrefix.foil, Materials.Platinum, 64), OreDictUnifier.get(OrePrefix.foil, Materials.Platinum, 64), OreDictUnifier.get(OrePrefix.cableGtDouble, Materials.VanadiumGallium, 7), OreDictUnifier.get(OrePrefix.gemExquisite, Materials.Emerald, 2)).input(OrePrefix.circuit, MarkerMaterials.Tier.Elite, 7).fluidInputs(Materials.SolderingAlloy.getFluid(576)).outputs(MetaItems.SENSOR_ZPM.getStackForm()).duration(600).EUt(61440).buildAndRegister();
        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().inputs(OreDictUnifier.get(OrePrefix.frameGt, Materials.Neutronium, 1), MetaItems.SENSOR_ZPM.getStackForm(1), MetaItems.SENSOR_LUV.getStackForm(2), MetaItems.SENSOR_IV.getStackForm(4), OreDictUnifier.get(OrePrefix.foil, Materials.Osmiridium, 64), OreDictUnifier.get(OrePrefix.foil, Materials.Osmiridium, 64), OreDictUnifier.get(OrePrefix.foil, Materials.Osmiridium, 64), OreDictUnifier.get(OrePrefix.cableGtQuadruple, Materials.NiobiumTitanium, 7), OreDictUnifier.get(OrePrefix.gemExquisite, Materials.Diamond, 2)).input(OrePrefix.circuit, MarkerMaterials.Tier.Master, 7).fluidInputs(Materials.SolderingAlloy.getFluid(576)).outputs(MetaItems.SENSOR_UV.getStackForm()).duration(600).EUt(245760).buildAndRegister();

        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().inputs(OreDictUnifier.get(OrePrefix.frameGt, Materials.HSSG, 1), OreDictUnifier.get(OrePrefix.plate, Materials.HSSG, 6), MetaItems.QUANTUM_STAR.getStackForm(), MetaItems.EMITTER_LUV.getStackForm(4), OreDictUnifier.get(OrePrefix.wireFine, Materials.Osmium, 64), OreDictUnifier.get(OrePrefix.wireFine, Materials.Osmium, 64), OreDictUnifier.get(OrePrefix.wireFine, Materials.Osmium, 64), OreDictUnifier.get(OrePrefix.wireFine, Materials.Osmium, 64), OreDictUnifier.get(OrePrefix.cableGtSingle, Materials.YttriumBariumCuprate, 8)).input(OrePrefix.circuit, MarkerMaterials.Tier.Master, 8).fluidInputs(Materials.SolderingAlloy.getFluid(576)).outputs(MetaItems.FIELD_GENERATOR_LUV.getStackForm()).duration(600).EUt(30720).buildAndRegister();
        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().inputs(OreDictUnifier.get(OrePrefix.frameGt, Materials.HSSE, 1), OreDictUnifier.get(OrePrefix.plate, Materials.HSSE, 6), MetaItems.QUANTUM_STAR.getStackForm(4), MetaItems.EMITTER_ZPM.getStackForm(4), OreDictUnifier.get(OrePrefix.wireFine, Materials.Osmium, 64), OreDictUnifier.get(OrePrefix.wireFine, Materials.Osmium, 64), OreDictUnifier.get(OrePrefix.wireFine, Materials.Osmium, 64), OreDictUnifier.get(OrePrefix.wireFine, Materials.Osmium, 64), OreDictUnifier.get(OrePrefix.wireFine, Materials.Osmium, 64), OreDictUnifier.get(OrePrefix.wireFine, Materials.Osmium, 64), OreDictUnifier.get(OrePrefix.wireFine, Materials.Osmium, 64), OreDictUnifier.get(OrePrefix.wireFine, Materials.Osmium, 64), OreDictUnifier.get(OrePrefix.cableGtDouble, Materials.YttriumBariumCuprate, 8)).input(OrePrefix.circuit, MarkerMaterials.Tier.Master, 16).fluidInputs(Materials.SolderingAlloy.getFluid(1152)).outputs(MetaItems.FIELD_GENERATOR_ZPM.getStackForm()).duration(600).EUt(245760).buildAndRegister();
        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().inputs(OreDictUnifier.get(OrePrefix.frameGt, Materials.Neutronium, 1), OreDictUnifier.get(OrePrefix.plate, Materials.Neutronium, 6), MetaItems.GRAVI_STAR.getStackForm(), MetaItems.EMITTER_UV.getStackForm(4), OreDictUnifier.get(OrePrefix.wireFine, Materials.Osmium, 64), OreDictUnifier.get(OrePrefix.wireFine, Materials.Osmium, 64), OreDictUnifier.get(OrePrefix.wireFine, Materials.Osmium, 64), OreDictUnifier.get(OrePrefix.wireFine, Materials.Osmium, 64), OreDictUnifier.get(OrePrefix.wireFine, Materials.Osmium, 64), OreDictUnifier.get(OrePrefix.wireFine, Materials.Osmium, 64), OreDictUnifier.get(OrePrefix.wireFine, Materials.Osmium, 64), OreDictUnifier.get(OrePrefix.wireFine, Materials.Osmium, 64), OreDictUnifier.get(OrePrefix.cableGtQuadruple, Materials.YttriumBariumCuprate, 8)).input(OrePrefix.circuit, MarkerMaterials.Tier.Master, 64).fluidInputs(Materials.SolderingAlloy.getFluid(2304)).outputs(MetaItems.FIELD_GENERATOR_UV.getStackForm()).duration(600).EUt(491520).buildAndRegister();

        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().inputs(OreDictUnifier.get(OrePrefix.frameGt, Materials.Tritanium, 4), MetaItems.WETWARE_SUPER_COMPUTER_UV.getStackForm(8), MetaItems.SMALL_COIL.getStackForm(4), MetaItems.SMD_CAPACITOR.getStackForm(32), MetaItems.SMD_RESISTOR.getStackForm(32), MetaItems.SMD_TRANSISTOR.getStackForm(32), MetaItems.SMD_DIODE.getStackForm(32), MetaItems.RANDOM_ACCESS_MEMORY.getStackForm(16), OreDictUnifier.get(OrePrefix.wireGtDouble, MarkerMaterials.Tier.Superconductor, 16), OreDictUnifier.get(OrePrefix.foil, Materials.SiliconeRubber, 64)).fluidInputs(Materials.SolderingAlloy.getFluid(2880), Materials.Water.getFluid(10000)).outputs(MetaItems.WETWARE_MAINFRAME_MAX.getStackForm()).duration(2000).EUt(300000).buildAndRegister();

        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().inputs(MetaItems.WETWARE_BOARD.getStackForm(), MetaItems.STEM_CELLS.getStackForm(8), MetaItems.GLASS_TUBE.getStackForm(8), OreDictUnifier.get(OrePrefix.pipeTiny, Materials.Polyethylene, 4), OreDictUnifier.get(OrePrefix.foil, Materials.SiliconeRubber, 64)).input(OrePrefix.plate, Materials.Gold, 4).input(OrePrefix.plate, Materials.StainlessSteel, 4).fluidInputs(Materials.SterileGrowthMedium.getFluid(250), Materials.UUMatter.getFluid(100), Materials.DistilledWater.getFluid(1000)).outputs(MetaItems.NEURO_PROCESSOR.getStackForm(1)).duration(200).EUt(80000).buildAndRegister();

        ItemStack last_bat = (ConfigHolder.U.GT5u.replaceUVwithMAXBat ? MetaItems.MAX_BATTERY : MetaItems.ZPM2).getStackForm();
        if (ConfigHolder.U.GT5u.enableZPMandUVBats) {
            RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().inputs(OreDictUnifier.get(OrePrefix.plate, Materials.Europium, 16), MetaItems.WETWARE_SUPER_COMPUTER_UV.getStackForm(4), MetaItems.ENERGY_LAPOTRONIC_ORB2.getStackForm(8), MetaItems.FIELD_GENERATOR_LUV.getStackForm(2), MetaItems.NANO_CENTRAL_PROCESSING_UNIT.getStackForm(64), MetaItems.NANO_CENTRAL_PROCESSING_UNIT.getStackForm(64), MetaItems.SMD_DIODE.getStackForm(8), OreDictUnifier.get(OrePrefix.cableGtSingle, Materials.Naquadah, 32)).fluidInputs(Materials.SolderingAlloy.getFluid(2880), Materials.Water.getFluid(8000)).outputs(MetaItems.ENERGY_MODULE.getStackForm()).duration(2000).EUt(100000).buildAndRegister();

            RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().inputs(OreDictUnifier.get(OrePrefix.plate, Materials.Americium, 16), MetaItems.WETWARE_SUPER_COMPUTER_UV.getStackForm(4), MetaItems.ENERGY_MODULE.getStackForm(8), MetaItems.FIELD_GENERATOR_ZPM.getStackForm(2), MetaItems.HIGH_POWER_INTEGRATED_CIRCUIT.getStackForm(64), MetaItems.HIGH_POWER_INTEGRATED_CIRCUIT.getStackForm(64), MetaItems.SMD_DIODE.getStackForm(16), OreDictUnifier.get(OrePrefix.cableGtSingle, Materials.NaquadahAlloy, 32)).fluidInputs(Materials.SolderingAlloy.getFluid(2880), Materials.Water.getFluid(16000)).outputs(MetaItems.ENERGY_CLUSTER.getStackForm()).duration(2000).EUt(200000).buildAndRegister();

            RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().inputs(OreDictUnifier.get(OrePrefix.plate, Materials.Neutronium, 16), MetaItems.WETWARE_MAINFRAME_MAX.getStackForm(), MetaItems.WETWARE_MAINFRAME_MAX.getStackForm(), MetaItems.WETWARE_MAINFRAME_MAX.getStackForm(), MetaItems.WETWARE_MAINFRAME_MAX.getStackForm(), MetaItems.ENERGY_CLUSTER.getStackForm(8), MetaItems.FIELD_GENERATOR_UV.getStackForm(2), MetaItems.HIGH_POWER_INTEGRATED_CIRCUIT_WAFER.getStackForm(64), MetaItems.HIGH_POWER_INTEGRATED_CIRCUIT_WAFER.getStackForm(64), MetaItems.SMD_DIODE.getStackForm(16), OreDictUnifier.get(OrePrefix.wireGtSingle, MarkerMaterials.Tier.Superconductor, 32)).fluidInputs(Materials.SolderingAlloy.getFluid(2880), Materials.Water.getFluid(16000), Materials.Naquadria.getFluid(1152)).outputs(last_bat).duration(2000).EUt(300000).buildAndRegister();
        } else {
            RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().inputs(OreDictUnifier.get(OrePrefix.plate, Materials.Neutronium, 16), MetaItems.WETWARE_MAINFRAME_MAX.getStackForm(), MetaItems.WETWARE_MAINFRAME_MAX.getStackForm(), MetaItems.WETWARE_MAINFRAME_MAX.getStackForm(), MetaItems.WETWARE_MAINFRAME_MAX.getStackForm(), MetaItems.ENERGY_LAPOTRONIC_ORB2.getStackForm(8), MetaItems.FIELD_GENERATOR_UV.getStackForm(2), MetaItems.HIGH_POWER_INTEGRATED_CIRCUIT_WAFER.getStackForm(64), MetaItems.HIGH_POWER_INTEGRATED_CIRCUIT_WAFER.getStackForm(64), MetaItems.SMD_DIODE.getStackForm(16), OreDictUnifier.get(OrePrefix.wireGtSingle, MarkerMaterials.Tier.Superconductor, 32)).fluidInputs(Materials.SolderingAlloy.getFluid(2880), Materials.Water.getFluid(16000)).outputs(last_bat).duration(2000).EUt(300000).buildAndRegister();
        }

        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().inputs(MetaBlocks.WIRE_COIL.getItemVariant(BlockWireCoil.CoilType.FUSION_COIL), OreDictUnifier.get(OrePrefix.plate, Materials.Plutonium241), OreDictUnifier.get(OrePrefix.plate, Materials.NetherStar), MetaItems.FIELD_GENERATOR_IV.getStackForm(2), MetaItems.HIGH_POWER_INTEGRATED_CIRCUIT_WAFER.getStackForm(32), OreDictUnifier.get(OrePrefix.wireGtSingle, MarkerMaterials.Tier.Superconductor, 32)).input(OrePrefix.circuit, MarkerMaterials.Tier.Ultimate, 1).input(OrePrefix.circuit, MarkerMaterials.Tier.Ultimate, 1).input(OrePrefix.circuit, MarkerMaterials.Tier.Ultimate, 1).input(OrePrefix.circuit, MarkerMaterials.Tier.Ultimate, 1).fluidInputs(Materials.SolderingAlloy.getFluid(2880)).outputs(MetaTileEntities.FUSION_REACTOR[0].getStackForm()).duration(1000).EUt(30000).buildAndRegister();
        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().inputs(MetaBlocks.WIRE_COIL.getItemVariant(BlockWireCoil.CoilType.FUSION_COIL), OreDictUnifier.get(OrePrefix.plate, Materials.Europium, 4), MetaItems.FIELD_GENERATOR_LUV.getStackForm(2), MetaItems.HIGH_POWER_INTEGRATED_CIRCUIT_WAFER.getStackForm(48), OreDictUnifier.get(OrePrefix.wireGtDouble, MarkerMaterials.Tier.Superconductor, 32)).input(OrePrefix.circuit, MarkerMaterials.Tier.Superconductor, 1).input(OrePrefix.circuit, MarkerMaterials.Tier.Superconductor, 1).input(OrePrefix.circuit, MarkerMaterials.Tier.Superconductor, 1).input(OrePrefix.circuit, MarkerMaterials.Tier.Superconductor, 1).fluidInputs(Materials.SolderingAlloy.getFluid(2880)).outputs(MetaTileEntities.FUSION_REACTOR[1].getStackForm()).duration(1000).EUt(60000).buildAndRegister();
        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().inputs(MetaBlocks.WIRE_COIL.getItemVariant(BlockWireCoil.CoilType.FUSION_COIL), OreDictUnifier.get(OrePrefix.plate, Materials.Americium, 4), MetaItems.FIELD_GENERATOR_ZPM.getStackForm(2), MetaItems.HIGH_POWER_INTEGRATED_CIRCUIT_WAFER.getStackForm(64), MetaItems.WETWARE_MAINFRAME_MAX.getStackForm(1), MetaItems.WETWARE_MAINFRAME_MAX.getStackForm(1), MetaItems.WETWARE_MAINFRAME_MAX.getStackForm(1), MetaItems.WETWARE_MAINFRAME_MAX.getStackForm(1), OreDictUnifier.get(OrePrefix.wireGtQuadruple, MarkerMaterials.Tier.Superconductor, 32)).fluidInputs(Materials.SolderingAlloy.getFluid(2880)).outputs(MetaTileEntities.FUSION_REACTOR[2].getStackForm()).duration(1000).EUt(90000).buildAndRegister();
    }
}
