package com.morallenplay.dropthemeat.registry;

import java.util.function.Supplier;

import com.morallenplay.dropthemeat.DropTheMeat;
import com.morallenplay.dropthemeat.setup.LootConfigCondition;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.storage.loot.predicates.LootItemConditionType;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ConditionRegistry {
	public static final DeferredRegister<LootItemConditionType> LOOT_CONDITION_TYPES =
	        DeferredRegister.create(Registries.LOOT_CONDITION_TYPE, DropTheMeat.MODID);

	public static final Supplier<LootItemConditionType> LOOT_CONFIG =
	        LOOT_CONDITION_TYPES.register("loot_config", () -> new LootItemConditionType(LootConfigCondition.CODEC));
}
