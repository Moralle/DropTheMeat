package com.morallenplay.dropthemeat.setup;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.morallenplay.dropthemeat.registry.ConditionRegistry;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemConditionType;

public record LootConfigCondition(String config) implements LootItemCondition {
   
    public static final MapCodec<LootConfigCondition> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
            Codec.STRING.fieldOf("config").forGetter(LootConfigCondition::config)
    ).apply(inst, LootConfigCondition::new));
    
    @Override
    public boolean test(LootContext context) {
    	if (Config.conditionKeys.get(config).get() != null) return Config.conditionKeys.get(config).get(); else return false;
    }
    
    @Override
	public LootItemConditionType getType() {
		return ConditionRegistry.LOOT_CONFIG.get();
	}
}