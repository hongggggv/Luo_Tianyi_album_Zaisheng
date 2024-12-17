package com.luotianyi.zaisheng.sounds;

import com.luotianyi.zaisheng.LuoTianyiZaisheng;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public interface ModJukeboxSongs {
    RegistryKey<JukeboxSong> HUDIE = of("hudie");
    RegistryKey<JukeboxSong> ZAISHENGRECALLCN = of("zaishengrecallcn");
    RegistryKey<JukeboxSong> ZUIWANMEIDEXIATIAN = of("zuiwanmeidexiatian");
    RegistryKey<JukeboxSong> SANYUEYU = of("sanyueyu");
    RegistryKey<JukeboxSong> ZAISHENGRECALLJP = of("zaishengrecalljp");
    RegistryKey<JukeboxSong> ALOUD = of("aloud");
    RegistryKey<JukeboxSong> CHUNRIPINGXINGXIAN = of("chunripingxingxian");
    RegistryKey<JukeboxSong> WAIWAI = of("waiwai");
    private static RegistryKey<JukeboxSong> of(String id) {
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(LuoTianyiZaisheng.MOD_ID, id));
    }
    private static void register(Registerable<JukeboxSong> registry, RegistryKey<JukeboxSong> key, RegistryEntry.Reference<SoundEvent> soundEvent, int lengthInSeconds, int comparatorOutput) {
        registry.register(key, new JukeboxSong(soundEvent, Text.translatable(Util.createTranslationKey("jukebox_song", key.getValue())), lengthInSeconds, comparatorOutput));
    }
    static void bootstrap(Registerable<JukeboxSong> registry) {
        register(registry, HUDIE, ModSoundEvents.MUSIC_DISC_HUDIE, 217, 2);
        register(registry, ZAISHENGRECALLCN, ModSoundEvents.MUSIC_DISC_ZAISHENGRECALLCN, 224, 1);
        register(registry, ZUIWANMEIDEXIATIAN, ModSoundEvents.MUSIC_DISC_ZUIWANMEIDEXIATIAN, 220, 12);
        register(registry, SANYUEYU, ModSoundEvents.MUSIC_DISC_SANYUEYU, 257, 9);
        register(registry, ZAISHENGRECALLJP, ModSoundEvents.MUSIC_DISC_ZAISHENGRECALLJP, 224, 1);
        register(registry, ALOUD, ModSoundEvents.MUSIC_DISC_ALOUD, 185, 10);
        register(registry, CHUNRIPINGXINGXIAN, ModSoundEvents.MUSIC_DISC_CHUNRIPINGXINGXIAN, 238, 11);
        register(registry, WAIWAI, ModSoundEvents.MUSIC_DISC_WAIWAI, 273, 5);
        LuoTianyiZaisheng.LOGGER.info("歌曲已載入！一起和我共鳴吧！");
    }
}
