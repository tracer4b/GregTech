package gregtech.loaders.load;

import gregtech.GT_Mod;
import gregtech.api.util.GTLog;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class GT_SonictronLoader
        implements Runnable {
    public void run() {
        GTLog.out.println("GT_Mod: Loading Sonictron Sounds");
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.IRON_BLOCK, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("note.harp");
        GT_Mod.gregtechproxy.mSoundCounts.add(25);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.GOLD_BLOCK, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("note.pling");
        GT_Mod.gregtechproxy.mSoundCounts.add(25);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.STONE, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("note.bd");
        GT_Mod.gregtechproxy.mSoundCounts.add(25);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.LOG, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("note.bassattack");
        GT_Mod.gregtechproxy.mSoundCounts.add(25);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.PLANKS, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("note.bass");
        GT_Mod.gregtechproxy.mSoundCounts.add(25);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.GLASS, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("note.hat");
        GT_Mod.gregtechproxy.mSoundCounts.add(25);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.SAND, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("note.snare");
        GT_Mod.gregtechproxy.mSoundCounts.add(25);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.RECORD_CAT, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("streaming.");
        GT_Mod.gregtechproxy.mSoundCounts.add(12);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.TNT, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.explode");
        GT_Mod.gregtechproxy.mSoundCounts.add(3);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.FIRE, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("fire.fire");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.FLINT_AND_STEEL, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("fire.ignite");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.LAVA, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("liquid.lavapop");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.WATER, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("liquid.water");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.WATER_BUCKET, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("liquid.splash");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.LAVA_BUCKET, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.fizz");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.PORTAL, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("portal.portal");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.END_PORTAL, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("portal.travel");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.END_PORTAL_FRAME, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("portal.trigger");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.GLASS_PANE, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.glass");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.ENDER_PEARL, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.orb");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.ENDER_EYE, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.levelup");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.STONE_BUTTON, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.click");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.COBBLESTONE, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("damage.fallbig");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.DIRT, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("damage.fallsmall");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.IRON_SWORD, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("damage.hurtflesh");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.DIAMOND_SWORD, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.hurt");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.BOW, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.bow");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.ARROW, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.drr");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.FISHING_ROD, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.bowhit");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.IRON_SHOVEL, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.break");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.BUCKET, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.breath");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.POTIONITEM, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.drink");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.GLASS_BOTTLE, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.burp");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.ENDER_CHEST == null ? Blocks.OBSIDIAN : Blocks.ENDER_CHEST, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.chestopen");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.CHEST, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.chestclosed");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.IRON_DOOR, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.door_open");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.OAK_DOOR, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.door_close");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.PORKCHOP, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.eat");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.WOOL, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("step.cloth");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.GRASS, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("step.grass");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.GRAVEL, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("step.gravel");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.SNOW, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("step.snow");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.PISTON, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("tile.piston.out");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.STICKY_PISTON, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("tile.piston.in");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.MOSSY_COBBLESTONE, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("ambient.cave.cave");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.LAPIS_BLOCK, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("ambient.weather.rain");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.DIAMOND_BLOCK, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("ambient.weather.thunder");
        GT_Mod.gregtechproxy.mSoundCounts.add(1);
    }
}
