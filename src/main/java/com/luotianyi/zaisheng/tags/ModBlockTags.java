package com.luotianyi.zaisheng.tags;

import com.luotianyi.zaisheng.LuoTianyiZaisheng;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {
    // 注册标签
    public static final TagKey<Block> PROSPECTOR_ORE = of("prospector_ore");
    // 原版的方法，改一下Identifier（见BlockTags）
    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(LuoTianyiZaisheng.MOD_ID, id));
    }
    // 初始化方法
    public static void registerModBlockTags() {
        LuoTianyiZaisheng.LOGGER.info("Registering Block Tags");
    }
}
