package com.morallenplay.dropthemeat;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;
import com.morallenplay.dropthemeat.registry.ConditionRegistry;
import com.morallenplay.dropthemeat.registry.CreativeTabRegistry;
import com.morallenplay.dropthemeat.registry.ItemRegistry;
import com.morallenplay.dropthemeat.setup.Config;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(DropTheMeat.MODID)
public class DropTheMeat
{
	
    public static final String MODID = "dropthemeat";
    
    @SuppressWarnings("unused")
	private static final Logger LOGGER = LogUtils.getLogger();
    
    public DropTheMeat(IEventBus modEventBus, ModContainer modContainer)
    {
    	modEventBus.addListener(this::commonSetup);
		
        ItemRegistry.ITEMS.register(modEventBus);
        CreativeTabRegistry.CREATIVE_MODE_TABS.register(modEventBus);
        ConditionRegistry.LOOT_CONDITION_TYPES.register(modEventBus);
        
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.COMMON_CONFIG);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }
}