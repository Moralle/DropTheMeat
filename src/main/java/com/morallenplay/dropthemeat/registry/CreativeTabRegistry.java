package com.morallenplay.dropthemeat.registry;

import com.morallenplay.dropthemeat.DropTheMeat;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CreativeTabRegistry {
		public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DropTheMeat.MODID);
			
			public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TAB_DROP_THE_MEAT = CREATIVE_MODE_TABS.register(DropTheMeat.MODID,
					() -> CreativeModeTab.builder()
							.title(Component.translatable("itemGroup.dropthemeat"))
						    .icon(() -> new ItemStack(ItemRegistry.RAW_BEAR.get()))
						    .displayItems((params, output) -> {
						    	output.accept(ItemRegistry.RAW_ALLAY.get());
						    	output.accept(ItemRegistry.RAW_ARMADILLO.get());
						    	output.accept(ItemRegistry.RAW_AXOLOTL.get());
						    	output.accept(ItemRegistry.RAW_BAT.get());
						    	output.accept(ItemRegistry.RAW_BEAR.get());
						    	output.accept(ItemRegistry.RAW_BEE.get());
						    	output.accept(ItemRegistry.RAW_CAMEL.get());
						    	output.accept(ItemRegistry.RAW_CAT.get());
						    	output.accept(ItemRegistry.RAW_DOLPHIN.get());
						    	output.accept(ItemRegistry.RAW_FOX.get());
						    	output.accept(ItemRegistry.RAW_FROG.get());
						    	output.accept(ItemRegistry.RAW_GOAT.get());
						    	output.accept(ItemRegistry.RAW_HORSE.get());
						    	output.accept(ItemRegistry.RAW_LLAMA.get());
						    	output.accept(ItemRegistry.RAW_PARROT.get());
						    	output.accept(ItemRegistry.RAW_SNIFFER.get());
						    	output.accept(ItemRegistry.RAW_SQUID.get());
						    	output.accept(ItemRegistry.RAW_TURTLE.get());
						    	output.accept(ItemRegistry.RAW_VILLAGER.get());
						    	output.accept(ItemRegistry.RAW_WOLF.get());
						    	output.accept(ItemRegistry.RAW_STRIDER.get());
						    	output.accept(ItemRegistry.RAW_IRON_GOLEM.get());
						    	output.accept(ItemRegistry.FROZEN_GOLEM_NUGGET.get());
						    	output.accept(ItemRegistry.PIGLIN_PORKCHOP.get());
						    	output.accept(ItemRegistry.VILLAGER_NOSE.get());
						    	output.accept(ItemRegistry.COOKED_ALLAY.get());
						    	output.accept(ItemRegistry.COOKED_ARMADILLO.get());
						    	output.accept(ItemRegistry.COOKED_AXOLOTL.get());
						    	output.accept(ItemRegistry.COOKED_BAT.get());
						    	output.accept(ItemRegistry.COOKED_BEAR.get());
						    	output.accept(ItemRegistry.COOKED_BEE.get());
						    	output.accept(ItemRegistry.COOKED_CAMEL.get());
						    	output.accept(ItemRegistry.COOKED_CAT.get());
						    	output.accept(ItemRegistry.COOKED_DOLPHIN.get());
						    	output.accept(ItemRegistry.COOKED_FOX.get());
						    	output.accept(ItemRegistry.COOKED_FROG.get());
						    	output.accept(ItemRegistry.COOKED_GOAT.get());
						    	output.accept(ItemRegistry.COOKED_HORSE.get());
						    	output.accept(ItemRegistry.COOKED_LLAMA.get());
						    	output.accept(ItemRegistry.COOKED_PARROT.get());
						    	output.accept(ItemRegistry.COOKED_SNIFFER.get());
						    	output.accept(ItemRegistry.COOKED_SQUID.get());
						    	output.accept(ItemRegistry.COOKED_TURTLE.get());
						    	output.accept(ItemRegistry.COOKED_VILLAGER.get());
						    	output.accept(ItemRegistry.COOKED_WOLF.get());
						    	output.accept(ItemRegistry.COOKED_STRIDER.get());
						    	output.accept(ItemRegistry.COOKED_IRON_GOLEM.get());
						    	output.accept(ItemRegistry.COOKED_GOLEM_NUGGET.get());
						    	output.accept(ItemRegistry.COOKED_PIGLIN_PORKCHOP.get());
						    	output.accept(ItemRegistry.RAW_RED_MEAT.get());
						    	output.accept(ItemRegistry.RAW_WHITE_MEAT.get());
						    	output.accept(ItemRegistry.RAW_MONSTER_MEAT.get());
						    	output.accept(ItemRegistry.COOKED_RED_MEAT.get());
						    	output.accept(ItemRegistry.COOKED_WHITE_MEAT.get());
						    	output.accept(ItemRegistry.COOKED_MONSTER_MEAT.get());
						      })
							.build());
}
