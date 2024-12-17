package com.luotianyi.zaisheng.item;

import com.luotianyi.zaisheng.LuoTianyiZaisheng;
//import com.luotianyi.zaisheng.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
//    // 基于原版的方法
//    // 先写一个key
//    public static final RegistryKey<ItemGroup> RETUTORIAL_GROUP = register("retutorial_group");
//    // 再写一个注册方法
//    private static RegistryKey<ItemGroup> register(String name) {
//        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(ReTutorial.MOD_ID, name));
//    }
//    // 初始化方法
//    public static void registerModItemGroups() {
//        Registry.register(Registries.ITEM_GROUP, RETUTORIAL_GROUP,
//                ItemGroup.create(ItemGroup.Row.TOP, 7).displayName(Text.translatable("itemGroup.retutorial_group"))
//                        .icon(() -> new ItemStack(ModItems.ICE_ETHER)).entries((displayContext, entries) -> {
//                            entries.add(ModItems.ICE_ETHER);
//                        }).build());
//        ReTutorial.LOGGER.info("Registering Item Groups");
//    }
    // 简化的方法，利用返回值是ItemGroup这个特性
    public static final ItemGroup LUOTIANYIZAISHENG_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(LuoTianyiZaisheng.MOD_ID, "luotianyizaisheng_group"),
            ItemGroup.create(null, -1).displayName(Text.translatable("Luo Tianyi <Zaisheng>"))
                    .icon(() -> new ItemStack(ModItems.ZAISHENGRECALLCN_MUSIC_DISC)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ZAISHENGRECALLCN_MUSIC_DISC);
                        entries.add(ModItems.ZAISHENGRECALLJP_MUSIC_DISC);
                        entries.add(ModItems.HUDIE_MUSIC_DISC);
                        entries.add(ModItems.WAIWAI_MUSIC_DISC);
                        entries.add(ModItems.SANYUEYU_MUSIC_DISC);
                        entries.add(ModItems.ALOUD_MUSIC_DISC);
                        entries.add(ModItems.CHUNRIPINGXINGXIAN_MUSIC_DISC);
                        entries.add(ModItems.ZUIWANMEIDEXIATIAN_MUSIC_DISC);
            }).build());


    public static void registerModItemGroups() {
        LuoTianyiZaisheng.LOGGER.info("物品欄已載入！");
    }
}
