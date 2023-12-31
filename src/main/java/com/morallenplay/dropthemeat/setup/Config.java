package com.morallenplay.dropthemeat.setup;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class Config {
	
	public static ForgeConfigSpec COMMON_CONFIG;
	
	public static final String CATEGORY_MEAT = "meat";
	
	public static ForgeConfigSpec.BooleanValue AXOLOTL_MEAT;
	public static ForgeConfigSpec.BooleanValue BAT_MEAT;
	public static ForgeConfigSpec.BooleanValue BEE_MEAT;
	public static ForgeConfigSpec.BooleanValue CAT_MEAT;
	public static ForgeConfigSpec.BooleanValue DOLPHIN_MEAT;
	public static ForgeConfigSpec.BooleanValue DONKEY_MEAT;
	public static ForgeConfigSpec.BooleanValue FOX_MEAT;
	public static ForgeConfigSpec.BooleanValue GLOW_SQUID_MEAT;
	public static ForgeConfigSpec.BooleanValue GOAT_MEAT;
	public static ForgeConfigSpec.BooleanValue HORSE_MEAT;
	public static ForgeConfigSpec.BooleanValue IRON_GOLEM_MEAT;
	public static ForgeConfigSpec.BooleanValue LLAMA_MEAT;
	public static ForgeConfigSpec.BooleanValue MULE_MEAT;
	public static ForgeConfigSpec.BooleanValue OCELOT_MEAT;
	public static ForgeConfigSpec.BooleanValue PANDA_MEAT;
	public static ForgeConfigSpec.BooleanValue PARROT_MEAT;
	public static ForgeConfigSpec.BooleanValue PIGLIN_MEAT;
	public static ForgeConfigSpec.BooleanValue PIGLIN_BRUTE_MEAT;
	public static ForgeConfigSpec.BooleanValue POLAR_BEAR_MEAT;
	public static ForgeConfigSpec.BooleanValue SQUID_MEAT;
	public static ForgeConfigSpec.BooleanValue STRIDER_MEAT;
	public static ForgeConfigSpec.BooleanValue TRADER_LLAMA_MEAT;
	public static ForgeConfigSpec.BooleanValue TURTLE_MEAT;
	public static ForgeConfigSpec.BooleanValue VILLAGER_MEAT;
	public static ForgeConfigSpec.BooleanValue WANDERING_TRADER_MEAT;
	public static ForgeConfigSpec.BooleanValue WOLF_MEAT;
	
	public static final String CATEGORY_TRADES = "trades";
	
	public static ForgeConfigSpec.BooleanValue AXOLOTL_TRADE;
	public static ForgeConfigSpec.BooleanValue BAT_TRADE;
	public static ForgeConfigSpec.BooleanValue BEAR_TRADE;
	public static ForgeConfigSpec.BooleanValue BEE_TRADE;
	public static ForgeConfigSpec.BooleanValue CAT_TRADE;
	public static ForgeConfigSpec.BooleanValue DOLPHIN_TRADE;
	public static ForgeConfigSpec.BooleanValue FOX_TRADE;
	public static ForgeConfigSpec.BooleanValue GOAT_TRADE;
	public static ForgeConfigSpec.BooleanValue HORSE_TRADE;
	public static ForgeConfigSpec.BooleanValue IRON_GOLEM_TRADE;
	public static ForgeConfigSpec.BooleanValue LLAMA_TRADE;
	public static ForgeConfigSpec.BooleanValue PARROT_TRADE;
	public static ForgeConfigSpec.BooleanValue PIGLIN_TRADE;
	public static ForgeConfigSpec.BooleanValue SQUID_TRADE;
	public static ForgeConfigSpec.BooleanValue STRIDER_TRADE;
	public static ForgeConfigSpec.BooleanValue TURTLE_TRADE;
	public static ForgeConfigSpec.BooleanValue VILLAGER_TRADE;
	public static ForgeConfigSpec.BooleanValue WOLF_TRADE;
	
	
	static {
		
		ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
		
		COMMON_BUILDER.comment("Enable/Disable Meat").push(CATEGORY_MEAT);
		AXOLOTL_MEAT = COMMON_BUILDER.comment("Enable Axolotl Meat?").define("enableAxolotlMeat", true);
		BAT_MEAT = COMMON_BUILDER.comment("Enable Bat Meat?").define("enableBatMeat", true);
		BEE_MEAT = COMMON_BUILDER.comment("Enable Bee Meat?").define("enableBeeMeat", true);
		CAT_MEAT = COMMON_BUILDER.comment("Enable Cat Meat from Cats?").define("enableCatMeat", true);
		DOLPHIN_MEAT = COMMON_BUILDER.comment("Enable Dolphin Meat?").define("enableDolphinMeat", true);
		DONKEY_MEAT = COMMON_BUILDER.comment("Enable Horse Meat from Donkeys?").define("enableDonkeyMeat", true);
		GLOW_SQUID_MEAT = COMMON_BUILDER.comment("Enable Glow Squid Meat?").define("enableGlowSquidMeat", true);
		FOX_MEAT = COMMON_BUILDER.comment("Enable Fox Meat?").define("enableFoxMeat", true);
		GOAT_MEAT = COMMON_BUILDER.comment("Enable Goat Meat?").define("enableGoatMeat", true);
		HORSE_MEAT = COMMON_BUILDER.comment("Enable Horse Meat from Horses?").define("enableHorseMeat", true);
		IRON_GOLEM_MEAT = COMMON_BUILDER.comment("Enable Iron Golem Meat?").define("enableIronGolemMeat", true);
		LLAMA_MEAT = COMMON_BUILDER.comment("Enable Llama Meat from Llamas?").define("enableLlamaMeat", true);
		MULE_MEAT = COMMON_BUILDER.comment("Enable Horse Meat from Mules?").define("enableMuleMeat", true);
		OCELOT_MEAT = COMMON_BUILDER.comment("Enable Cat Meat from Ocelots?").define("enableOcelotMeat", true);
		PANDA_MEAT = COMMON_BUILDER.comment("Enable Bear Meat from Pandas?").define("enablePandaMeat", true);
		PARROT_MEAT = COMMON_BUILDER.comment("Enable Parrot Meat?").define("enableParrotMeat", true);
		PIGLIN_MEAT = COMMON_BUILDER.comment("Enable Piglin Porkchops from Piglins?").define("enablePiglinMeat", true);
		PIGLIN_BRUTE_MEAT = COMMON_BUILDER.comment("Enable Piglin Porkchops from Pigling Brutes?").define("enablePiglinBruteMeat", true);
		POLAR_BEAR_MEAT = COMMON_BUILDER.comment("Enable Bear Meat from Polar Bears?").define("enablePolarBearMeat", true);
		SQUID_MEAT = COMMON_BUILDER.comment("Enable Squid Meat?").define("enableSquidMeat", true);
		STRIDER_MEAT = COMMON_BUILDER.comment("Enable Strider Meat?").define("enableStriderMeat", true);
		TRADER_LLAMA_MEAT = COMMON_BUILDER.comment("Enable Llama Meat from Trader Llamas?").define("enableTraderLlamasMeat", true);
		TURTLE_MEAT = COMMON_BUILDER.comment("Enable Turtle Meat?").define("enableTurtleMeat", true);
		VILLAGER_MEAT = COMMON_BUILDER.comment("Enable Villager Meat from Villagers? (Also affects noses)").define("enableVillagerMeat", true);
		WANDERING_TRADER_MEAT = COMMON_BUILDER.comment("Enable Villager Meat from Wandering Traders? (Also affects noses)").define("enableWanderingTraderMeat", true);
		WOLF_MEAT = COMMON_BUILDER.comment("Enable Wolf Meat?").define("enableWolfMeat", true);
		COMMON_BUILDER.pop();
		
		COMMON_BUILDER.comment("Enable/Disable Butcher Trades").push(CATEGORY_TRADES);
		BEAR_TRADE = COMMON_BUILDER.comment("Enable Bear Meat Trades? (Default: True)").define("enableBearMeatTrades", true);
		FOX_TRADE = COMMON_BUILDER.comment("Enable Fox Meat Trades? (Default: True)").define("enableFoxMeatTrades", true);
		GOAT_TRADE = COMMON_BUILDER.comment("Enable Goat Meat Trades? (Default: True)").define("enableGoatMeatTrades", true);
		HORSE_TRADE = COMMON_BUILDER.comment("Enable Horse Meat Trades? (Default: True)").define("enableHorseMeatTrades", true);
		LLAMA_TRADE = COMMON_BUILDER.comment("Enable Llama Meat Trades? (Default: True)").define("enableLlamaMeatTrades", true);
		SQUID_TRADE = COMMON_BUILDER.comment("Enable Squid Meat Trades? (Default: True)").define("enableSquidMeatTrades", true);
		WOLF_TRADE = COMMON_BUILDER.comment("Enable Wolf Meat Trades? (Default: True)").define("enableWolfMeatTrades", true);
		AXOLOTL_TRADE = COMMON_BUILDER.comment("Enable Axolotl Meat Trades? (Default: False)").define("enableAxolotlMeatTrades", false);
		BAT_TRADE = COMMON_BUILDER.comment("Enable Bat Meat Trades? (Default: False)").define("enableBatMeatTrades", false);
		BEE_TRADE = COMMON_BUILDER.comment("Enable Bee Meat Trades? (Default: False)").define("enableBeeMeatTrades", false);
		CAT_TRADE = COMMON_BUILDER.comment("Enable Cat Meat Trades? (Default: False)").define("enableCatMeatTrades", false);
		DOLPHIN_TRADE = COMMON_BUILDER.comment("Enable Dolphin Meat Trades? (Default: False)").define("enableDolphinMeatTrades", false);
		IRON_GOLEM_TRADE = COMMON_BUILDER.comment("Enable Iron Golem Meat Trades? (Default: False)").define("enableIronGolemMeatTrades", false);
		PARROT_TRADE = COMMON_BUILDER.comment("Enable Parrot Meat Trades? (Default: False)").define("enableParrotMeatTrades", false);
		PIGLIN_TRADE = COMMON_BUILDER.comment("Enable Piglin Porkchop Trades? (Default: False)").define("enablePiglinPorkchopTrades", false);
		STRIDER_TRADE = COMMON_BUILDER.comment("Enable Strider Meat Trades? (Default: False)").define("enableStriderMeatTrades", false);
		TURTLE_TRADE = COMMON_BUILDER.comment("Enable Turtle Meat Trades? (Default: False)").define("enableTurtleMeatTrades", false);
		VILLAGER_TRADE = COMMON_BUILDER.comment("Enable Villager Meat Trades? (Default: False)").define("enableVillagerMeatTrades", false);
		COMMON_BUILDER.pop();
		
		COMMON_CONFIG = COMMON_BUILDER.build();
	}
}
