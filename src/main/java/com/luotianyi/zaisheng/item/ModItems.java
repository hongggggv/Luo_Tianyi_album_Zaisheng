package com.luotianyi.zaisheng.item;

import com.luotianyi.zaisheng.LuoTianyiZaisheng;
import com.luotianyi.zaisheng.sounds.ModJukeboxSongs;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    // 注册物品
    public static final Item HUDIE_MUSIC_DISC = registerItems("hudie_music_disc",
            new Item(new Item.Settings().maxCount(99).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.HUDIE)));
    public static final Item ZAISHENGRECALLCN_MUSIC_DISC = registerItems("zaishengrecallcn_music_disc",
            new Item(new Item.Settings().maxCount(99).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ZAISHENGRECALLCN)));
    public static final Item ZUIWANMEIDEXIATIAN_MUSIC_DISC = registerItems("zuiwanmeidexiatian_music_disc",
            new Item(new Item.Settings().maxCount(99).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ZUIWANMEIDEXIATIAN)));
    public static final Item SANYUEYU_MUSIC_DISC = registerItems("sanyueyu_music_disc",
            new Item(new Item.Settings().maxCount(99).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.SANYUEYU)));
    public static final Item ZAISHENGRECALLJP_MUSIC_DISC = registerItems("zaishengrecalljp_music_disc",
            new Item(new Item.Settings().maxCount(99).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ZAISHENGRECALLJP)));
    public static final Item ALOUD_MUSIC_DISC = registerItems("aloud_music_disc",
            new Item(new Item.Settings().maxCount(99).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ALOUD)));
    public static final Item CHUNRIPINGXINGXIAN_MUSIC_DISC = registerItems("chunripingxingxian_music_disc",
            new Item(new Item.Settings().maxCount(99).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.CHUNRIPINGXINGXIAN)));
    public static final Item WAIWAI_MUSIC_DISC = registerItems("waiwai_music_disc",
            new Item(new Item.Settings().maxCount(99).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.WAIWAI)));
    // 注册方法，由原版改编（一堆方法整合）
    private static Item registerItems(String name, Item item) {
        // 由原版整合的方法
//        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(ReTutorial.MOD_ID, name)), item);
        // 采用register的另一个方法
        return Registry.register(Registries.ITEM, Identifier.of(LuoTianyiZaisheng.MOD_ID, name), item);
    }
    // 初始化方法
    public static void registerModItems() {
        LuoTianyiZaisheng.LOGGER.info("物品已載入！");
    }
}
