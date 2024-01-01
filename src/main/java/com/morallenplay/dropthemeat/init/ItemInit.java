package com.morallenplay.dropthemeat.init;

import com.morallenplay.dropthemeat.DropTheMeat;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DropTheMeat.MOD_ID);
	
	public static final RegistryObject<Item> RAW_ALLAY = ITEMS.register("raw_allay", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2F).meat().build())));
	public static final RegistryObject<Item> RAW_AXOLOTL = ITEMS.register("raw_axolotl", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.1F).meat().build())));
	public static final RegistryObject<Item> RAW_BAT = ITEMS.register("raw_bat", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(1).saturationMod(0.2F).meat().build())));
	public static final RegistryObject<Item> RAW_BEAR = ITEMS.register("raw_bear", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(3).saturationMod(0.3F).meat().build())));
	public static final RegistryObject<Item> RAW_BEE = ITEMS.register("raw_bee", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2F).meat().build())));
	public static final RegistryObject<Item> RAW_CAT = ITEMS.register("raw_cat", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.1F).meat().build())));
	public static final RegistryObject<Item> RAW_DOLPHIN = ITEMS.register("raw_dolphin", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(3).saturationMod(0.3F).meat().build())));
	public static final RegistryObject<Item> RAW_FOX = ITEMS.register("raw_fox", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.1F).meat().build())));
	public static final RegistryObject<Item> RAW_FROG = ITEMS.register("raw_frog", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.1F).meat().build())));
	public static final RegistryObject<Item> RAW_GOAT = ITEMS.register("raw_goat", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(3).saturationMod(0.3F).meat().build())));
	public static final RegistryObject<Item> RAW_HORSE = ITEMS.register("raw_horse", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(3).saturationMod(0.3F).meat().build())));
	public static final RegistryObject<Item> RAW_LLAMA = ITEMS.register("raw_llama", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(3).saturationMod(0.3F).meat().build())));
	public static final RegistryObject<Item> RAW_PARROT = ITEMS.register("raw_parrot", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(1).saturationMod(0.2F).meat().build())));
	public static final RegistryObject<Item> RAW_SQUID = ITEMS.register("raw_squid", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.45F).meat().build())));
	public static final RegistryObject<Item> RAW_TURTLE = ITEMS.register("raw_turtle", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.1F).meat().build())));
	public static final RegistryObject<Item> RAW_VILLAGER = ITEMS.register("raw_villager", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(3).saturationMod(0.2F).meat().build())));
	public static final RegistryObject<Item> RAW_WOLF = ITEMS.register("raw_wolf", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).meat().build())));
	public static final RegistryObject<Item> RAW_STRIDER = ITEMS.register("raw_strider", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(3).saturationMod(0.2F).meat().build())));
	public static final RegistryObject<Item> RAW_IRON_GOLEM = ITEMS.register("raw_iron_golem", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.75F).meat().build())));
	public static final RegistryObject<Item> PIGLIN_PORKCHOP = ITEMS.register("piglin_porkchop", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.75F).meat().build())));
	public static final RegistryObject<Item> VILLAGER_NOSE = ITEMS.register("villager_nose", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(9).saturationMod(0.7F).meat().build())));
	public static final RegistryObject<Item> COOKED_ALLAY = ITEMS.register("cooked_allay", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.5F).meat().build())));
	public static final RegistryObject<Item> COOKED_AXOLOTL = ITEMS.register("cooked_axolotl", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.3F).meat().build())));
	public static final RegistryObject<Item> COOKED_BAT = ITEMS.register("cooked_bat", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.6F).meat().build())));
	public static final RegistryObject<Item> COOKED_BEAR = ITEMS.register("cooked_bear", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(8).saturationMod(0.8F).meat().build())));
	public static final RegistryObject<Item> COOKED_BEE = ITEMS.register("cooked_bee", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(6).saturationMod(0.5F).meat().build())));
	public static final RegistryObject<Item> COOKED_CAT = ITEMS.register("cooked_cat", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(5).saturationMod(0.4F).meat().build())));
	public static final RegistryObject<Item> COOKED_DOLPHIN = ITEMS.register("cooked_dolphin", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(8).saturationMod(0.8F).meat().build())));
	public static final RegistryObject<Item> COOKED_FOX = ITEMS.register("cooked_fox", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(5).saturationMod(0.4F).meat().build())));
	public static final RegistryObject<Item> COOKED_FROG = ITEMS.register("cooked_frog", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.8F).meat().build())));
	public static final RegistryObject<Item> COOKED_GOAT = ITEMS.register("cooked_goat", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(6).saturationMod(0.8F).meat().build())));
	public static final RegistryObject<Item> COOKED_HORSE = ITEMS.register("cooked_horse", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(8).saturationMod(0.8F).meat().build())));
	public static final RegistryObject<Item> COOKED_LLAMA = ITEMS.register("cooked_llama", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(6).saturationMod(0.8F).meat().build())));
	public static final RegistryObject<Item> COOKED_PARROT = ITEMS.register("cooked_parrot", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.7F).meat().build())));
	public static final RegistryObject<Item> COOKED_SQUID = ITEMS.register("cooked_squid", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(7).saturationMod(0.7F).meat().build())));
	public static final RegistryObject<Item> COOKED_TURTLE = ITEMS.register("cooked_turtle", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(6).saturationMod(0.5F).meat().build())));
	public static final RegistryObject<Item> COOKED_VILLAGER = ITEMS.register("cooked_villager", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(5).saturationMod(0.4F).meat().build())));
	public static final RegistryObject<Item> COOKED_WOLF = ITEMS.register("cooked_wolf", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(5).saturationMod(0.4F).meat().build())));
	public static final RegistryObject<Item> COOKED_STRIDER = ITEMS.register("cooked_strider", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(5).saturationMod(0.4F).meat().build())));
	public static final RegistryObject<Item> COOKED_IRON_GOLEM = ITEMS.register("cooked_iron_golem", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(8).saturationMod(0.85F).meat().build())));
	public static final RegistryObject<Item> COOKED_PIGLIN_PORKCHOP = ITEMS.register("cooked_piglin_porkchop", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(8).saturationMod(0.85F).meat().build())));
	public static final RegistryObject<Item> RAW_RED_MEAT = ITEMS.register("raw_red_meat", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).meat().build())));
	public static final RegistryObject<Item> RAW_WHITE_MEAT = ITEMS.register("raw_white_meat", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2F).meat().build())));
	public static final RegistryObject<Item> RAW_MONSTER_MEAT = ITEMS.register("raw_monster_meat", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).meat().build())));
	public static final RegistryObject<Item> COOKED_RED_MEAT = ITEMS.register("cooked_red_meat", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(6).saturationMod(0.6F).meat().build())));
	public static final RegistryObject<Item> COOKED_WHITE_MEAT = ITEMS.register("cooked_white_meat", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6F).meat().build())));
	public static final RegistryObject<Item> COOKED_MONSTER_MEAT = ITEMS.register("cooked_monster_meat", () -> new Item(new Item.Properties().tab(DropTheMeat.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(6).saturationMod(0.6F).meat().build())));
	
}
