package com.luotianyi.zaisheng.sounds;

import com.luotianyi.zaisheng.LuoTianyiZaisheng;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSoundEvents {
    // 注册声音事件
    public static final SoundEvent PROSPECTOR_FOUND_ORE = register("prospector_found_ore");

    // 同样的，我们可以注册更多的声音事件，用于组成声音组，给方块使用
    // 不过要注意，声音组的声音事件是有顺序的，分别是破坏、踩踏、放置、击打、掉落




    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_HUDIE = registerReference("music_disc.hudie");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_ZAISHENGRECALLCN = registerReference("music_disc.zaishengrecallcn");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_ZUIWANMEIDEXIATIAN = registerReference("music_disc.zuiwanmeidexiatian");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_SANYUEYU = registerReference("music_disc.sanyueyu");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_ZAISHENGRECALLJP = registerReference("music_disc.zaishengrecalljp");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_ALOUD = registerReference("music_disc.aloud");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_CHUNRIPINGXINGXIAN = registerReference("music_disc.chunripingxingxian");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_WAIWAI = registerReference("music_disc.waiwai");
    // 由原版改编的注册方法 
    // 原版中有多种声音事件，这个注册方法是最普通的
    // 像特定生物群系的声音事件，是由另外的方法注册的（山羊角发出的声音也是单独的）
    private static SoundEvent register(String name) {
        Identifier id = Identifier.of(LuoTianyiZaisheng.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
    // 注册音乐唱片需要的方法
    private static RegistryEntry.Reference<SoundEvent> registerReference(String name) {
        Identifier id = Identifier.of(LuoTianyiZaisheng.MOD_ID, name);
        return Registry.registerReference(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
    public static void registerSounds() {
    }
}
