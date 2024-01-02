package com.morallenplay.dropthemeat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.morallenplay.dropthemeat.init.ItemInit;
import com.morallenplay.dropthemeat.setup.Config;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@SuppressWarnings("unused")
@Mod("dropthemeat")
public class DropTheMeat
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "dropthemeat";
    public static DropTheMeat instance;

    public DropTheMeat() {
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    	modEventBus.addListener(this::setup);
    	modEventBus.addListener(this::doClientStuff);
    	
    	modEventBus.addListener(this::buildContents);
    	
    	ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_CONFIG);
    	
    	ItemInit.ITEMS.register(modEventBus);
    	
    	instance = this;
    	
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    	
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }

    
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    	
    }
    
    public static CreativeModeTab DROP_THE_MEAT_TAB;
	
	@SubscribeEvent
	public void buildContents(CreativeModeTabEvent.Register event) {
		DROP_THE_MEAT_TAB = event.registerCreativeModeTab(new ResourceLocation(DropTheMeat.MOD_ID, "dropthemeat"), builder ->
	    
	    builder.title(Component.translatable("itemGroup.dropthemeat"))
	    .icon(() -> new ItemStack(ItemInit.RAW_BEAR.get()))
	    .displayItems((enabledFlags, populator, hasPermissions) -> {
	    	populator.accept(ItemInit.RAW_ALLAY.get());
	    	populator.accept(ItemInit.RAW_AXOLOTL.get());
	    	populator.accept(ItemInit.RAW_BAT.get());
	    	populator.accept(ItemInit.RAW_BEAR.get());
	    	populator.accept(ItemInit.RAW_BEE.get());
	    	populator.accept(ItemInit.RAW_CAT.get());
	    	populator.accept(ItemInit.RAW_DOLPHIN.get());
	    	populator.accept(ItemInit.RAW_FOX.get());
	    	populator.accept(ItemInit.RAW_FROG.get());
	    	populator.accept(ItemInit.RAW_GOAT.get());
	    	populator.accept(ItemInit.RAW_HORSE.get());
	    	populator.accept(ItemInit.RAW_IRON_GOLEM.get());
	    	populator.accept(ItemInit.RAW_LLAMA.get());
	    	populator.accept(ItemInit.RAW_PARROT.get());
	    	populator.accept(ItemInit.RAW_SQUID.get());
	    	populator.accept(ItemInit.RAW_TURTLE.get());
	    	populator.accept(ItemInit.RAW_TURTLE.get());
	    	populator.accept(ItemInit.RAW_VILLAGER.get());
	    	populator.accept(ItemInit.RAW_WOLF.get());
	    	populator.accept(ItemInit.RAW_STRIDER.get());
	    	populator.accept(ItemInit.PIGLIN_PORKCHOP.get());
	    	populator.accept(ItemInit.VILLAGER_NOSE.get());
	    	populator.accept(ItemInit.COOKED_ALLAY.get());
	    	populator.accept(ItemInit.COOKED_AXOLOTL.get());
	    	populator.accept(ItemInit.COOKED_BAT.get());
	    	populator.accept(ItemInit.COOKED_BEAR.get());
	    	populator.accept(ItemInit.COOKED_BEE.get());
	    	populator.accept(ItemInit.COOKED_CAT.get());
	    	populator.accept(ItemInit.COOKED_DOLPHIN.get());
	    	populator.accept(ItemInit.COOKED_FOX.get());
	    	populator.accept(ItemInit.COOKED_FROG.get());
	    	populator.accept(ItemInit.COOKED_GOAT.get());
	    	populator.accept(ItemInit.COOKED_HORSE.get());
	    	populator.accept(ItemInit.COOKED_IRON_GOLEM.get());
	    	populator.accept(ItemInit.COOKED_LLAMA.get());
	    	populator.accept(ItemInit.COOKED_PARROT.get());
	    	populator.accept(ItemInit.COOKED_SQUID.get());
	    	populator.accept(ItemInit.COOKED_TURTLE.get());
	    	populator.accept(ItemInit.COOKED_TURTLE.get());
	    	populator.accept(ItemInit.COOKED_VILLAGER.get());
	    	populator.accept(ItemInit.COOKED_WOLF.get());
	    	populator.accept(ItemInit.COOKED_STRIDER.get());
	    	populator.accept(ItemInit.COOKED_PIGLIN_PORKCHOP.get());
	    })
		.build()
		);
	}
}
