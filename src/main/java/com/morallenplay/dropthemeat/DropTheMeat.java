package com.morallenplay.dropthemeat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.morallenplay.dropthemeat.init.ItemInit;
import com.morallenplay.dropthemeat.setup.Config;

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
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@SuppressWarnings("unused")
@Mod("dropthemeat")
public class DropTheMeat
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "dropthemeat";
    public static final CreativeModeTab ITEM_GROUP = new DMItemGroup(DropTheMeat.MOD_ID);
    public static DropTheMeat instance;

    public DropTheMeat() {
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    	modEventBus.addListener(this::setup);
    	modEventBus.addListener(this::doClientStuff);
    	
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
    
    public static class DMItemGroup extends CreativeModeTab {

		public DMItemGroup(String label) {
			super(label);
		}

		@Override
		public ItemStack makeIcon() {
			return ItemInit.RAW_LLAMA.get().getDefaultInstance();
		}
	}
}
