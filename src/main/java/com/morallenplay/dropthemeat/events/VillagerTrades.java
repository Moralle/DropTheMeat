package com.morallenplay.dropthemeat.events;

import com.morallenplay.dropthemeat.DropTheMeat;
import com.morallenplay.dropthemeat.init.ItemInit;
import com.morallenplay.dropthemeat.setup.Config;

import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.BasicItemListing;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = DropTheMeat.MOD_ID, bus = Bus.FORGE)
public class VillagerTrades {
	@SubscribeEvent
    public static void onVillagersTradesEvent(VillagerTradesEvent event) {
		if(event.getType() == VillagerProfession.BUTCHER) {
			if (Config.SQUID_TRADE.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(ItemInit.RAW_SQUID.get(), 3), new ItemStack(Items.EMERALD, 1), 16, 4, 0.05f));
			}
			if (Config.WOLF_TRADE.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(ItemInit.RAW_WOLF.get(), 6), new ItemStack(Items.EMERALD, 1), 16, 4, 0.05f));
			}
			if (Config.FOX_TRADE.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(ItemInit.RAW_FOX.get(), 6), new ItemStack(Items.EMERALD, 1), 16, 4, 0.05f));
			}
			if (Config.HORSE_TRADE.get()) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(ItemInit.RAW_HORSE.get(), 10), new ItemStack(Items.EMERALD, 1), 16, 20, 0.05f));
			}
			if (Config.LLAMA_TRADE.get()) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(ItemInit.RAW_LLAMA.get(), 10), new ItemStack(Items.EMERALD, 1), 16, 20, 0.05f));
			}
			if (Config.BEAR_TRADE.get()) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(ItemInit.RAW_BEAR.get(), 4), new ItemStack(Items.EMERALD, 1), 16, 25, 0.05f));
			}
			if (Config.GOAT_TRADE.get()) {
				event.getTrades().get(5).add(new BasicItemListing(new ItemStack(ItemInit.RAW_GOAT.get(), 10), new ItemStack(Items.EMERALD, 1), 16, 20, 0.05f));
			}
			//----
			if (Config.PARROT_TRADE.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(ItemInit.RAW_PARROT.get(), 6), new ItemStack(Items.EMERALD, 1), 16, 2, 0.05f));
			}
			if (Config.BAT_TRADE.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(ItemInit.RAW_BAT.get(), 6), new ItemStack(Items.EMERALD, 1), 16, 2, 0.05f));
			}
			if (Config.BEE_TRADE.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(ItemInit.RAW_BEE.get(), 4), new ItemStack(Items.EMERALD, 1), 16, 2, 0.05f));
			}
			if (Config.CAT_TRADE.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(ItemInit.RAW_CAT.get(), 6), new ItemStack(Items.EMERALD, 1), 16, 4, 0.05f));
			}
			if (Config.STRIDER_TRADE.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(ItemInit.RAW_STRIDER.get(), 4), new ItemStack(Items.EMERALD, 1), 16, 10, 0.05f));
			}
			if (Config.TURTLE_TRADE.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(ItemInit.RAW_TURTLE.get(), 4), new ItemStack(Items.EMERALD, 1), 16, 6, 0.05f));
			}
			if (Config.DOLPHIN_TRADE.get()) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(ItemInit.RAW_DOLPHIN.get(), 7), new ItemStack(Items.EMERALD, 1), 16, 20, 0.05f));
			}
			if (Config.IRON_GOLEM_TRADE.get()) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(ItemInit.RAW_IRON_GOLEM.get(), 4), new ItemStack(Items.EMERALD, 1), 16, 30, 0.05f));
			}
			if (Config.PIGLIN_TRADE.get()) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(ItemInit.PIGLIN_PORKCHOP.get(), 7), new ItemStack(Items.EMERALD, 1), 16, 25, 0.05f));
			}
			if (Config.VILLAGER_TRADE.get()) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(ItemInit.RAW_VILLAGER.get(), 4), new ItemStack(Items.EMERALD, 1), 16, 20, 0.05f));
			}
			if (Config.AXOLOTL_TRADE.get()) {
				event.getTrades().get(2).add(new BasicItemListing(new ItemStack(ItemInit.RAW_AXOLOTL.get(), 4), new ItemStack(Items.EMERALD, 1), 16, 2, 0.05f));
			}
		}
	}
}
