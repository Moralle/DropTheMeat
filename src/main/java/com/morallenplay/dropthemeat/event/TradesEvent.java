package com.morallenplay.dropthemeat.event;

import com.morallenplay.dropthemeat.DropTheMeat;
import com.morallenplay.dropthemeat.registry.ItemRegistry;
import com.morallenplay.dropthemeat.setup.Config;

import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;

@EventBusSubscriber(modid = DropTheMeat.MODID)
public class TradesEvent {
	@SubscribeEvent
    public static void onVillagersTradesEvent(VillagerTradesEvent event) {
		if(event.getType() == VillagerProfession.BUTCHER) {
			if (Config.SQUID_TRADE.get()) {
			event.getTrades().get(2).add(new BasicItemListing((new ItemStack(ItemRegistry.RAW_SQUID.get(), 3)), (new ItemStack(Items.EMERALD, 1)), 16, 4, 0.05f));
			}
			if (Config.WOLF_TRADE.get()) {
			event.getTrades().get(3).add(new BasicItemListing((new ItemStack(ItemRegistry.RAW_WOLF.get(), 6)), (new ItemStack(Items.EMERALD, 1)), 16, 4, 0.05f));
			}
			if (Config.FOX_TRADE.get()) {
			event.getTrades().get(3).add(new BasicItemListing((new ItemStack(ItemRegistry.RAW_FOX.get(), 6)), (new ItemStack(Items.EMERALD, 1)), 16, 4, 0.05f));
			}
			if (Config.FROG_TRADE.get()) {
				event.getTrades().get(3).add(new BasicItemListing((new ItemStack(ItemRegistry.RAW_FROG.get(), 6)), (new ItemStack(Items.EMERALD, 1)), 16, 4, 0.05f));
			}
			if (Config.HORSE_TRADE.get()) {
			event.getTrades().get(5).add(new BasicItemListing((new ItemStack(ItemRegistry.RAW_HORSE.get(), 10)), (new ItemStack(Items.EMERALD, 1)), 16, 20, 0.05f));
			}
			if (Config.LLAMA_TRADE.get()) {
			event.getTrades().get(5).add(new BasicItemListing((new ItemStack(ItemRegistry.RAW_LLAMA.get(), 10)), (new ItemStack(Items.EMERALD, 1)), 16, 20, 0.05f));
			}
			if (Config.BEAR_TRADE.get()) {
			event.getTrades().get(5).add(new BasicItemListing((new ItemStack(ItemRegistry.RAW_BEAR.get(), 4)), (new ItemStack(Items.EMERALD, 1)), 16, 25, 0.05f));
			}
			if (Config.GOAT_TRADE.get()) {
				event.getTrades().get(5).add(new BasicItemListing((new ItemStack(ItemRegistry.RAW_GOAT.get(), 10)), (new ItemStack(Items.EMERALD, 1)), 16, 20, 0.05f));
			}
			if (Config.CAMEL_TRADE.get()) {
				event.getTrades().get(5).add(new BasicItemListing((new ItemStack(ItemRegistry.RAW_CAMEL.get(), 10)), (new ItemStack(Items.EMERALD, 1)), 16, 20, 0.05f));
			}
			//----
			if (Config.PARROT_TRADE.get()) {
			event.getTrades().get(1).add(new BasicItemListing((new ItemStack(ItemRegistry.RAW_PARROT.get(), 6)), (new ItemStack(Items.EMERALD, 1)), 16, 2, 0.05f));
			}
			if (Config.BAT_TRADE.get()) {
			event.getTrades().get(2).add(new BasicItemListing((new ItemStack(ItemRegistry.RAW_BAT.get(), 6)), (new ItemStack(Items.EMERALD, 1)), 16, 2, 0.05f));
			}
			if (Config.BEE_TRADE.get()) {
			event.getTrades().get(2).add(new BasicItemListing((new ItemStack(ItemRegistry.RAW_BEE.get(), 4)), (new ItemStack(Items.EMERALD, 1)), 16, 2, 0.05f));
			}
			if (Config.CAT_TRADE.get()) {
			event.getTrades().get(3).add(new BasicItemListing((new ItemStack(ItemRegistry.RAW_CAT.get(), 6)), (new ItemStack(Items.EMERALD, 1)), 16, 4, 0.05f));
			}
			if (Config.STRIDER_TRADE.get()) {
			event.getTrades().get(3).add(new BasicItemListing((new ItemStack(ItemRegistry.RAW_STRIDER.get(), 4)), (new ItemStack(Items.EMERALD, 1)), 16, 10, 0.05f));
			}
			if (Config.TURTLE_TRADE.get()) {
			event.getTrades().get(3).add(new BasicItemListing((new ItemStack(ItemRegistry.RAW_TURTLE.get(), 4)), (new ItemStack(Items.EMERALD, 1)), 16, 6, 0.05f));
			}
			if (Config.DOLPHIN_TRADE.get()) {
			event.getTrades().get(5).add(new BasicItemListing((new ItemStack(ItemRegistry.RAW_DOLPHIN.get(), 7)), (new ItemStack(Items.EMERALD, 1)), 16, 20, 0.05f));
			}
			if (Config.IRON_GOLEM_TRADE.get()) {
			event.getTrades().get(5).add(new BasicItemListing((new ItemStack(ItemRegistry.RAW_IRON_GOLEM.get(), 4)), (new ItemStack(Items.EMERALD, 1)), 16, 30, 0.05f));
			}
			if (Config.PIGLIN_TRADE.get()) {
			event.getTrades().get(5).add(new BasicItemListing((new ItemStack(ItemRegistry.PIGLIN_PORKCHOP.get(), 7)), (new ItemStack(Items.EMERALD, 1)), 16, 25, 0.05f));
			}
			if (Config.VILLAGER_TRADE.get()) {
			event.getTrades().get(5).add(new BasicItemListing((new ItemStack(ItemRegistry.RAW_VILLAGER.get(), 4)), (new ItemStack(Items.EMERALD, 1)), 16, 20, 0.05f));
			}
			if (Config.AXOLOTL_TRADE.get()) {
				event.getTrades().get(2).add(new BasicItemListing((new ItemStack(ItemRegistry.RAW_AXOLOTL.get(), 4)), (new ItemStack(Items.EMERALD, 1)), 16, 2, 0.05f));
			}
			if (Config.ALLAY_TRADE.get()) {
				event.getTrades().get(5).add(new BasicItemListing((new ItemStack(ItemRegistry.RAW_ALLAY.get(), 4)), (new ItemStack(Items.EMERALD, 1)), 16, 30, 0.05f));
			}
			if (Config.SNIFFER_TRADE.get()) {
				event.getTrades().get(5).add(new BasicItemListing((new ItemStack(ItemRegistry.RAW_SNIFFER.get(), 4)), (new ItemStack(Items.EMERALD, 1)), 16, 30, 0.05f));
			}
			if (Config.SNOW_GOLEM_TRADE.get()) {
				event.getTrades().get(5).add(new BasicItemListing((new ItemStack(ItemRegistry.FROZEN_GOLEM_NUGGET.get(), 4)), (new ItemStack(Items.EMERALD, 1)), 16, 4, 0.05f));
			}
			if (Config.ARMADILLO_TRADE.get()) {
				event.getTrades().get(2).add(new BasicItemListing((new ItemStack(ItemRegistry.RAW_ARMADILLO.get(), 4)), (new ItemStack(Items.EMERALD, 1)), 16, 2, 0.05f));
			}
		}
	}
}
