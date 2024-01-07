package com.morallenplay.dropthemeat.init;

import com.morallenplay.dropthemeat.DropTheMeat;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabRegistry {
	
	public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DropTheMeat.MOD_ID);
	
	public static final RegistryObject<CreativeModeTab> TAB_DROP_THE_MEAT = CREATIVE_TABS.register(DropTheMeat.MOD_ID,
			() -> CreativeModeTab.builder()
					.title(Component.translatable("itemGroup.dropthemeat"))
				    .icon(() -> new ItemStack(ItemInit.RAW_BEAR.get()))
				    .displayItems((params, output) -> {
				    	output.accept(ItemInit.RAW_ALLAY.get());
				    	output.accept(ItemInit.RAW_AXOLOTL.get());
				    	output.accept(ItemInit.RAW_BAT.get());
				    	output.accept(ItemInit.RAW_BEAR.get());
				    	output.accept(ItemInit.RAW_BEE.get());
				    	output.accept(ItemInit.RAW_CAMEL.get());
				    	output.accept(ItemInit.RAW_CAT.get());
				    	output.accept(ItemInit.RAW_DOLPHIN.get());
				    	output.accept(ItemInit.RAW_FOX.get());
				    	output.accept(ItemInit.RAW_FROG.get());
				    	output.accept(ItemInit.RAW_GOAT.get());
				    	output.accept(ItemInit.RAW_HORSE.get());
				    	output.accept(ItemInit.RAW_IRON_GOLEM.get());
				    	output.accept(ItemInit.RAW_LLAMA.get());
				    	output.accept(ItemInit.RAW_PARROT.get());
				    	output.accept(ItemInit.RAW_SNIFFER.get());
				    	output.accept(ItemInit.RAW_SQUID.get());
				    	output.accept(ItemInit.RAW_STRIDER.get());
				    	output.accept(ItemInit.RAW_TURTLE.get());
				    	output.accept(ItemInit.RAW_VILLAGER.get());
				    	output.accept(ItemInit.RAW_WOLF.get());
				    	output.accept(ItemInit.PIGLIN_PORKCHOP.get());
				    	output.accept(ItemInit.VILLAGER_NOSE.get());
				    	output.accept(ItemInit.COOKED_ALLAY.get());
				    	output.accept(ItemInit.COOKED_AXOLOTL.get());
				    	output.accept(ItemInit.COOKED_BAT.get());
				    	output.accept(ItemInit.COOKED_BEAR.get());
				    	output.accept(ItemInit.COOKED_BEE.get());
				    	output.accept(ItemInit.COOKED_CAMEL.get());
				    	output.accept(ItemInit.COOKED_CAT.get());
				    	output.accept(ItemInit.COOKED_DOLPHIN.get());
				    	output.accept(ItemInit.COOKED_FOX.get());
				    	output.accept(ItemInit.COOKED_FROG.get());
				    	output.accept(ItemInit.COOKED_GOAT.get());
				    	output.accept(ItemInit.COOKED_HORSE.get());
				    	output.accept(ItemInit.COOKED_IRON_GOLEM.get());
				    	output.accept(ItemInit.COOKED_LLAMA.get());
				    	output.accept(ItemInit.COOKED_PARROT.get());
				    	output.accept(ItemInit.COOKED_SNIFFER.get());
				    	output.accept(ItemInit.COOKED_SQUID.get());
				    	output.accept(ItemInit.COOKED_STRIDER.get());
				    	output.accept(ItemInit.COOKED_TURTLE.get());
				    	output.accept(ItemInit.COOKED_VILLAGER.get());
				    	output.accept(ItemInit.COOKED_WOLF.get());
				    	output.accept(ItemInit.COOKED_PIGLIN_PORKCHOP.get());
				    	output.accept(ItemInit.RAW_RED_MEAT.get());
				    	output.accept(ItemInit.RAW_WHITE_MEAT.get());
				    	output.accept(ItemInit.RAW_MONSTER_MEAT.get());
				    	output.accept(ItemInit.COOKED_RED_MEAT.get());
				    	output.accept(ItemInit.COOKED_WHITE_MEAT.get());
				    	output.accept(ItemInit.COOKED_MONSTER_MEAT.get());
				    })
					.build());
}