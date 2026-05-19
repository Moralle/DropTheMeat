package com.morallenplay.dropthemeat.registry;

import com.morallenplay.dropthemeat.DropTheMeat;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemRegistry {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DropTheMeat.MODID);
	
	public static final DeferredItem<Item> RAW_ALLAY = ITEMS.register("raw_allay", () -> new Item(new Item.Properties().food(FoodRegistry.RAW_ALLAY)));
	public static final DeferredItem<Item> RAW_ARMADILLO = ITEMS.register("raw_armadillo", () -> new Item(new Item.Properties().food(FoodRegistry.RAW_ARMADILLO)));
	public static final DeferredItem<Item> RAW_AXOLOTL = ITEMS.register("raw_axolotl", () -> new Item(new Item.Properties().food(FoodRegistry.RAW_AXOLOTL)));
	public static final DeferredItem<Item> RAW_BAT = ITEMS.register("raw_bat", () -> new Item(new Item.Properties().food(FoodRegistry.RAW_BAT)));
	public static final DeferredItem<Item> RAW_BEAR = ITEMS.register("raw_bear", () -> new Item(new Item.Properties().food(FoodRegistry.RAW_BEAR)));
	public static final DeferredItem<Item> RAW_BEE = ITEMS.register("raw_bee", () -> new Item(new Item.Properties().food(FoodRegistry.RAW_BEE)));
	public static final DeferredItem<Item> RAW_CAMEL = ITEMS.register("raw_camel", () -> new Item(new Item.Properties().food(FoodRegistry.RAW_CAMEL)));
	public static final DeferredItem<Item> RAW_CAT = ITEMS.register("raw_cat", () -> new Item(new Item.Properties().food(FoodRegistry.RAW_CAT)));
	public static final DeferredItem<Item> RAW_DOLPHIN = ITEMS.register("raw_dolphin", () -> new Item(new Item.Properties().food(FoodRegistry.RAW_DOLPHIN)));
	public static final DeferredItem<Item> RAW_FOX = ITEMS.register("raw_fox", () -> new Item(new Item.Properties().food(FoodRegistry.RAW_FOX)));
	public static final DeferredItem<Item> RAW_FROG = ITEMS.register("raw_frog", () -> new Item(new Item.Properties().food(FoodRegistry.RAW_FROG)));
	public static final DeferredItem<Item> RAW_GOAT = ITEMS.register("raw_goat", () -> new Item(new Item.Properties().food(FoodRegistry.RAW_GOAT)));
	public static final DeferredItem<Item> RAW_HORSE = ITEMS.register("raw_horse", () -> new Item(new Item.Properties().food(FoodRegistry.RAW_HORSE)));
	public static final DeferredItem<Item> RAW_LLAMA = ITEMS.register("raw_llama", () -> new Item(new Item.Properties().food(FoodRegistry.RAW_LLAMA)));
	public static final DeferredItem<Item> RAW_PARROT = ITEMS.register("raw_parrot", () -> new Item(new Item.Properties().food(FoodRegistry.RAW_PARROT)));
	public static final DeferredItem<Item> RAW_SNIFFER = ITEMS.register("raw_sniffer", () -> new Item(new Item.Properties().food(FoodRegistry.RAW_SNIFFER)));
	public static final DeferredItem<Item> RAW_SQUID = ITEMS.register("raw_squid", () -> new Item(new Item.Properties().food(FoodRegistry.RAW_SQUID)));
	public static final DeferredItem<Item> RAW_TURTLE = ITEMS.register("raw_turtle", () -> new Item(new Item.Properties().food(FoodRegistry.RAW_TURTLE)));
	public static final DeferredItem<Item> RAW_VILLAGER = ITEMS.register("raw_villager", () -> new Item(new Item.Properties().food(FoodRegistry.RAW_VILLAGER)));
	public static final DeferredItem<Item> RAW_WOLF = ITEMS.register("raw_wolf", () -> new Item(new Item.Properties().food(FoodRegistry.RAW_WOLF)));
	public static final DeferredItem<Item> RAW_STRIDER = ITEMS.register("raw_strider", () -> new Item(new Item.Properties().food(FoodRegistry.RAW_STRIDER)));
	public static final DeferredItem<Item> RAW_IRON_GOLEM = ITEMS.register("raw_iron_golem", () -> new Item(new Item.Properties().food(FoodRegistry.RAW_IRON_GOLEM)));
	public static final DeferredItem<Item> FROZEN_GOLEM_NUGGET = ITEMS.register("frozen_golem_nugget", () -> new Item(new Item.Properties().food(FoodRegistry.FROZEN_GOLEM_NUGGET)));
	public static final DeferredItem<Item> PIGLIN_PORKCHOP = ITEMS.register("piglin_porkchop", () -> new Item(new Item.Properties().food(FoodRegistry.PIGLIN_PORKCHOP)));
	public static final DeferredItem<Item> VILLAGER_NOSE = ITEMS.register("villager_nose", () -> new Item(new Item.Properties().food(FoodRegistry.VILLAGER_NOSE)));
	public static final DeferredItem<Item> COOKED_ALLAY = ITEMS.register("cooked_allay", () -> new Item(new Item.Properties().food(FoodRegistry.COOKED_ALLAY)));
	public static final DeferredItem<Item> COOKED_ARMADILLO = ITEMS.register("cooked_armadillo", () -> new Item(new Item.Properties().food(FoodRegistry.COOKED_ARMADILLO)));
	public static final DeferredItem<Item> COOKED_AXOLOTL = ITEMS.register("cooked_axolotl", () -> new Item(new Item.Properties().food(FoodRegistry.COOKED_AXOLOTL)));
	public static final DeferredItem<Item> COOKED_BAT = ITEMS.register("cooked_bat", () -> new Item(new Item.Properties().food(FoodRegistry.COOKED_BAT)));
	public static final DeferredItem<Item> COOKED_BEAR = ITEMS.register("cooked_bear", () -> new Item(new Item.Properties().food(FoodRegistry.COOKED_BEAR)));
	public static final DeferredItem<Item> COOKED_BEE = ITEMS.register("cooked_bee", () -> new Item(new Item.Properties().food(FoodRegistry.COOKED_BEE)));
	public static final DeferredItem<Item> COOKED_CAMEL = ITEMS.register("cooked_camel", () -> new Item(new Item.Properties().food(FoodRegistry.COOKED_CAMEL)));
	public static final DeferredItem<Item> COOKED_CAT = ITEMS.register("cooked_cat", () -> new Item(new Item.Properties().food(FoodRegistry.COOKED_CAT)));
	public static final DeferredItem<Item> COOKED_DOLPHIN = ITEMS.register("cooked_dolphin", () -> new Item(new Item.Properties().food(FoodRegistry.COOKED_DOLPHIN)));
	public static final DeferredItem<Item> COOKED_FOX = ITEMS.register("cooked_fox", () -> new Item(new Item.Properties().food(FoodRegistry.COOKED_FOX)));
	public static final DeferredItem<Item> COOKED_FROG = ITEMS.register("cooked_frog", () -> new Item(new Item.Properties().food(FoodRegistry.COOKED_FROG)));
	public static final DeferredItem<Item> COOKED_GOAT = ITEMS.register("cooked_goat", () -> new Item(new Item.Properties().food(FoodRegistry.COOKED_GOAT)));
	public static final DeferredItem<Item> COOKED_HORSE = ITEMS.register("cooked_horse", () -> new Item(new Item.Properties().food(FoodRegistry.COOKED_HORSE)));
	public static final DeferredItem<Item> COOKED_LLAMA = ITEMS.register("cooked_llama", () -> new Item(new Item.Properties().food(FoodRegistry.COOKED_HORSE)));
	public static final DeferredItem<Item> COOKED_PARROT = ITEMS.register("cooked_parrot", () -> new Item(new Item.Properties().food(FoodRegistry.COOKED_PARROT)));
	public static final DeferredItem<Item> COOKED_SNIFFER = ITEMS.register("cooked_sniffer", () -> new Item(new Item.Properties().food(FoodRegistry.COOKED_SNIFFER)));
	public static final DeferredItem<Item> COOKED_SQUID = ITEMS.register("cooked_squid", () -> new Item(new Item.Properties().food(FoodRegistry.COOKED_SQUID)));
	public static final DeferredItem<Item> COOKED_TURTLE = ITEMS.register("cooked_turtle", () -> new Item(new Item.Properties().food(FoodRegistry.COOKED_TURTLE)));
	public static final DeferredItem<Item> COOKED_VILLAGER = ITEMS.register("cooked_villager", () -> new Item(new Item.Properties().food(FoodRegistry.COOKED_VILLAGER)));
	public static final DeferredItem<Item> COOKED_WOLF = ITEMS.register("cooked_wolf", () -> new Item(new Item.Properties().food(FoodRegistry.COOKED_WOLF)));
	public static final DeferredItem<Item> COOKED_STRIDER = ITEMS.register("cooked_strider", () -> new Item(new Item.Properties().food(FoodRegistry.COOKED_STRIDER)));
	public static final DeferredItem<Item> COOKED_GOLEM_NUGGET = ITEMS.register("cooked_golem_nugget", () -> new Item(new Item.Properties().food(FoodRegistry.COOKED_GOLEM_NUGGET)));
	public static final DeferredItem<Item> COOKED_IRON_GOLEM = ITEMS.register("cooked_iron_golem", () -> new Item(new Item.Properties().food(FoodRegistry.COOKED_IRON_GOLEM)));
	public static final DeferredItem<Item> COOKED_PIGLIN_PORKCHOP = ITEMS.register("cooked_piglin_porkchop", () -> new Item(new Item.Properties().food(FoodRegistry.COOKED_PIGLIN_PORKCHOP)));
	public static final DeferredItem<Item> RAW_RED_MEAT = ITEMS.register("raw_red_meat", () -> new Item(new Item.Properties().food(FoodRegistry.RAW_RED_MEAT)));
	public static final DeferredItem<Item> RAW_WHITE_MEAT = ITEMS.register("raw_white_meat", () -> new Item(new Item.Properties().food(FoodRegistry.RAW_WHITE_MEAT)));
	public static final DeferredItem<Item> RAW_MONSTER_MEAT = ITEMS.register("raw_monster_meat", () -> new Item(new Item.Properties().food(FoodRegistry.RAW_MONSTER_MEAT)));
	public static final DeferredItem<Item> COOKED_RED_MEAT = ITEMS.register("cooked_red_meat", () -> new Item(new Item.Properties().food(FoodRegistry.COOKED_RED_MEAT)));
	public static final DeferredItem<Item> COOKED_WHITE_MEAT = ITEMS.register("cooked_white_meat", () -> new Item(new Item.Properties().food(FoodRegistry.COOKED_WHITE_MEAT)));
	public static final DeferredItem<Item> COOKED_MONSTER_MEAT = ITEMS.register("cooked_monster_meat", () -> new Item(new Item.Properties().food(FoodRegistry.COOKED_MONSTER_MEAT)));
}
