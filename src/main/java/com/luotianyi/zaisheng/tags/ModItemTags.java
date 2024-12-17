package com.luotianyi.zaisheng.tags;

import com.luotianyi.zaisheng.LuoTianyiZaisheng;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {
    // 注册物品标签
    public static final TagKey<Item> SUGAR_TAG = of("sugar_tag");
    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(LuoTianyiZaisheng.MOD_ID, id));
    }
    // 初始化方法
    public static void registerModItemTags(){
        LuoTianyiZaisheng.LOGGER.info("Registering Item Tags");
    }
}
