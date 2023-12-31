package com.morallenplay.dropthemeat.events;

import com.morallenplay.dropthemeat.DropTheMeat;
import com.morallenplay.dropthemeat.setup.Config;

import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootTableReference;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = DropTheMeat.MOD_ID, bus = Bus.FORGE)
public class MeatDrop {
	
	private static ResourceLocation horse = new ResourceLocation("minecraft", "entities/horse");
	private static ResourceLocation donkey = new ResourceLocation("minecraft", "entities/donkey");
	private static ResourceLocation mule = new ResourceLocation("minecraft", "entities/mule");
	private static ResourceLocation bat = new ResourceLocation("minecraft", "entities/bat");
	private static ResourceLocation polar_bear = new ResourceLocation("minecraft", "entities/polar_bear");
	private static ResourceLocation panda = new ResourceLocation("minecraft", "entities/panda");
	private static ResourceLocation bee = new ResourceLocation("minecraft", "entities/bee");
	private static ResourceLocation cat = new ResourceLocation("minecraft", "entities/cat");
	private static ResourceLocation ocelot = new ResourceLocation("minecraft", "entities/ocelot");
	private static ResourceLocation dolphin = new ResourceLocation("minecraft", "entities/dolphin");
	private static ResourceLocation fox = new ResourceLocation("minecraft", "entities/fox");
	private static ResourceLocation llama = new ResourceLocation("minecraft", "entities/llama");
	private static ResourceLocation trader_llama = new ResourceLocation("minecraft", "entities/trader_llama");
	private static ResourceLocation parrot = new ResourceLocation("minecraft", "entities/parrot");
	private static ResourceLocation squid = new ResourceLocation("minecraft", "entities/squid");
	private static ResourceLocation turtle = new ResourceLocation("minecraft", "entities/turtle");
	private static ResourceLocation villager = new ResourceLocation("minecraft", "entities/villager");
	private static ResourceLocation wandering_trader = new ResourceLocation("minecraft", "entities/wandering_trader");
	private static ResourceLocation wolf = new ResourceLocation("minecraft", "entities/wolf");
	private static ResourceLocation strider = new ResourceLocation("minecraft", "entities/strider");
	private static ResourceLocation iron_golem = new ResourceLocation("minecraft", "entities/iron_golem");
	private static ResourceLocation piglin = new ResourceLocation("minecraft", "entities/piglin");
	private static ResourceLocation piglin_brute = new ResourceLocation("minecraft", "entities/piglin_brute");
	private static ResourceLocation axolotl = new ResourceLocation("minecraft", "entities/axolotl");
	private static ResourceLocation goat = new ResourceLocation("minecraft", "entities/goat");
	private static ResourceLocation glow_squid = new ResourceLocation("minecraft", "entities/glow_squid");
	
	@SubscribeEvent
    public static void onLootLoad(LootTableLoadEvent event) {
		if (event.getName().equals(horse)&&Config.HORSE_MEAT.get()) {
            event.getTable().addPool(LootPool.lootPool().add(LootTableReference.lootTableReference(new ResourceLocation(DropTheMeat.MOD_ID, "entities/horse")).setWeight(1).setQuality(0)).name("dm_horse").build());
        }
		if (event.getName().equals(donkey)&&Config.DONKEY_MEAT.get()) {
            event.getTable().addPool(LootPool.lootPool().add(LootTableReference.lootTableReference(new ResourceLocation(DropTheMeat.MOD_ID, "entities/horse")).setWeight(1).setQuality(0)).name("dm_horse").build());
        }
		if (event.getName().equals(mule)&&Config.MULE_MEAT.get()) {
            event.getTable().addPool(LootPool.lootPool().add(LootTableReference.lootTableReference(new ResourceLocation(DropTheMeat.MOD_ID, "entities/horse")).setWeight(1).setQuality(0)).name("dm_horse").build());
        }
        if (event.getName().equals(bat)&&Config.BAT_MEAT.get()) {
            event.getTable().addPool(LootPool.lootPool().add(LootTableReference.lootTableReference(new ResourceLocation(DropTheMeat.MOD_ID, "entities/bat")).setWeight(1).setQuality(0)).name("dm_bat").build());
        }
        if (event.getName().equals(polar_bear)&&Config.POLAR_BEAR_MEAT.get()) {
            event.getTable().addPool(LootPool.lootPool().add(LootTableReference.lootTableReference(new ResourceLocation(DropTheMeat.MOD_ID, "entities/bear")).setWeight(1).setQuality(0)).name("dm_bear").build());
        }
        if (event.getName().equals(panda)&&Config.PANDA_MEAT.get()) {
            event.getTable().addPool(LootPool.lootPool().add(LootTableReference.lootTableReference(new ResourceLocation(DropTheMeat.MOD_ID, "entities/bear")).setWeight(1).setQuality(0)).name("dm_bear").build());
        }
        if (event.getName().equals(bee)&&Config.BEE_MEAT.get()) {
            event.getTable().addPool(LootPool.lootPool().add(LootTableReference.lootTableReference(new ResourceLocation(DropTheMeat.MOD_ID, "entities/bee")).setWeight(1).setQuality(0)).name("dm_bee").build());
        }
        if (event.getName().equals(cat)&&Config.CAT_MEAT.get()) {
            event.getTable().addPool(LootPool.lootPool().add(LootTableReference.lootTableReference(new ResourceLocation(DropTheMeat.MOD_ID, "entities/cat")).setWeight(1).setQuality(0)).name("dm_cat").build());
        }
        if (event.getName().equals(ocelot)&&Config.OCELOT_MEAT.get()) {
            event.getTable().addPool(LootPool.lootPool().add(LootTableReference.lootTableReference(new ResourceLocation(DropTheMeat.MOD_ID, "entities/cat")).setWeight(1).setQuality(0)).name("dm_cat").build());
        }
        if (event.getName().equals(dolphin)&&Config.DOLPHIN_MEAT.get()) {
            event.getTable().addPool(LootPool.lootPool().add(LootTableReference.lootTableReference(new ResourceLocation(DropTheMeat.MOD_ID, "entities/dolphin")).setWeight(1).setQuality(0)).name("dm_dolphin").build());
        }
        if (event.getName().equals(fox)&&Config.FOX_MEAT.get()) {
            event.getTable().addPool(LootPool.lootPool().add(LootTableReference.lootTableReference(new ResourceLocation(DropTheMeat.MOD_ID, "entities/fox")).setWeight(1).setQuality(0)).name("dm_fox").build());
        }
        if (event.getName().equals(llama)&&Config.LLAMA_MEAT.get()) {
            event.getTable().addPool(LootPool.lootPool().add(LootTableReference.lootTableReference(new ResourceLocation(DropTheMeat.MOD_ID, "entities/llama")).setWeight(1).setQuality(0)).name("dm_llama").build());
        }
        if (event.getName().equals(trader_llama)&&Config.TRADER_LLAMA_MEAT.get()) {
            event.getTable().addPool(LootPool.lootPool().add(LootTableReference.lootTableReference(new ResourceLocation(DropTheMeat.MOD_ID, "entities/llama")).setWeight(1).setQuality(0)).name("dm_llama").build());
        }
        if (event.getName().equals(parrot)&&Config.PARROT_MEAT.get()) {
            event.getTable().addPool(LootPool.lootPool().add(LootTableReference.lootTableReference(new ResourceLocation(DropTheMeat.MOD_ID, "entities/parrot")).setWeight(1).setQuality(0)).name("dm_parrot").build());
        }
        if (event.getName().equals(squid)&&Config.SQUID_MEAT.get()) {
            event.getTable().addPool(LootPool.lootPool().add(LootTableReference.lootTableReference(new ResourceLocation(DropTheMeat.MOD_ID, "entities/squid")).setWeight(1).setQuality(0)).name("dm_squid").build());
        }
        if (event.getName().equals(turtle)&&Config.TURTLE_MEAT.get()) {
            event.getTable().addPool(LootPool.lootPool().add(LootTableReference.lootTableReference(new ResourceLocation(DropTheMeat.MOD_ID, "entities/turtle")).setWeight(1).setQuality(0)).name("dm_turtle").build());
        }
        if (event.getName().equals(villager)&&Config.VILLAGER_MEAT.get()) {
            event.getTable().addPool(LootPool.lootPool().add(LootTableReference.lootTableReference(new ResourceLocation(DropTheMeat.MOD_ID, "entities/villager")).setWeight(1).setQuality(0)).name("dm_villager").build());
        }
        if (event.getName().equals(wandering_trader)&&Config.WANDERING_TRADER_MEAT.get()) {
            event.getTable().addPool(LootPool.lootPool().add(LootTableReference.lootTableReference(new ResourceLocation(DropTheMeat.MOD_ID, "entities/villager")).setWeight(1).setQuality(0)).name("dm_villager").build());
        }
        if (event.getName().equals(wolf)&&Config.WOLF_MEAT.get()) {
            event.getTable().addPool(LootPool.lootPool().add(LootTableReference.lootTableReference(new ResourceLocation(DropTheMeat.MOD_ID, "entities/wolf")).setWeight(1).setQuality(0)).name("dm_wolf").build());
        }
        if (event.getName().equals(iron_golem)&&Config.IRON_GOLEM_MEAT.get()) {
            event.getTable().addPool(LootPool.lootPool().add(LootTableReference.lootTableReference(new ResourceLocation(DropTheMeat.MOD_ID, "entities/iron_golem")).setWeight(1).setQuality(0)).name("dm_golem").build());
        }
        if (event.getName().equals(strider)&&Config.STRIDER_MEAT.get()) {
            event.getTable().addPool(LootPool.lootPool().add(LootTableReference.lootTableReference(new ResourceLocation(DropTheMeat.MOD_ID, "entities/strider")).setWeight(1).setQuality(0)).name("dm_strider").build());
        }
        if (event.getName().equals(piglin)&&Config.PIGLIN_MEAT.get()) {
            event.getTable().addPool(LootPool.lootPool().add(LootTableReference.lootTableReference(new ResourceLocation(DropTheMeat.MOD_ID, "entities/piglin")).setWeight(1).setQuality(0)).name("dm_piglin").build());
        }
        if (event.getName().equals(piglin_brute)&&Config.PIGLIN_BRUTE_MEAT.get()) {
            event.getTable().addPool(LootPool.lootPool().add(LootTableReference.lootTableReference(new ResourceLocation(DropTheMeat.MOD_ID, "entities/piglin")).setWeight(1).setQuality(0)).name("dm_piglin").build());
        }
        if (event.getName().equals(axolotl)&&Config.AXOLOTL_MEAT.get()) {
            event.getTable().addPool(LootPool.lootPool().add(LootTableReference.lootTableReference(new ResourceLocation(DropTheMeat.MOD_ID, "entities/axolotl")).setWeight(1).setQuality(0)).name("dm_axolotl").build());
        }
        if (event.getName().equals(goat)&&Config.GOAT_MEAT.get()) {
            event.getTable().addPool(LootPool.lootPool().add(LootTableReference.lootTableReference(new ResourceLocation(DropTheMeat.MOD_ID, "entities/goat")).setWeight(1).setQuality(0)).name("dm_goat").build());
        }
        if (event.getName().equals(glow_squid)&&Config.GLOW_SQUID_MEAT.get()) {
            event.getTable().addPool(LootPool.lootPool().add(LootTableReference.lootTableReference(new ResourceLocation(DropTheMeat.MOD_ID, "entities/squid")).setWeight(1).setQuality(0)).name("dm_squid").build());
        }
    }
}