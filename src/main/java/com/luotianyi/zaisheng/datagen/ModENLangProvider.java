package com.luotianyi.zaisheng.datagen;

//import com.luotianyi.zaisheng.block.ModBlocks;
import com.luotianyi.zaisheng.item.ModItemGroups;
import com.luotianyi.zaisheng.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.entry.RegistryEntry;

import java.util.concurrent.CompletableFuture;

public class ModENLangProvider extends FabricLanguageProvider {
    public ModENLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        // languageCode默认是en_us，也可以是其他语言，比如zh_cn
        super(dataOutput, "en_us", registryLookup);

    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.HUDIE_MUSIC_DISC, "Hudie");
        translationBuilder.add(ModItems.ZAISHENGRECALLCN_MUSIC_DISC,"Zaisheng Recall CN");
        translationBuilder.add(ModItems.ZUIWANMEIDEXIATIAN_MUSIC_DISC, "Zuiwanmeidexiatian");
        translationBuilder.add(ModItems.SANYUEYU_MUSIC_DISC, "Sanyueyu");
        translationBuilder.add(ModItems.ZAISHENGRECALLJP_MUSIC_DISC,"Zaisheng Recall JP");
        translationBuilder.add(ModItems.ALOUD_MUSIC_DISC, "Aloud");
        translationBuilder.add(ModItems.CHUNRIPINGXINGXIAN_MUSIC_DISC, "Chunripingxingxian");
        translationBuilder.add(ModItems.WAIWAI_MUSIC_DISC, "Waiwai? feat.Chinese Football");
        translationBuilder.add(ModItems.XUBABAI_MUSIC_DISC, "Xubabai");
        translationBuilder.add("jukebox_song.luotianyizaisheng.hudie", "Luo Tianyi - Hudie");
        translationBuilder.add("jukebox_song.luotianyizaisheng.zaishengrecallcn", "Luo Tianyi - Zaisheng Recall");
        translationBuilder.add("jukebox_song.luotianyizaisheng.zuiwanmeidexiatian", "Luo Tianyi - Zuiwanmeidexiatian");
        translationBuilder.add("jukebox_song.luotianyizaisheng.sanyueyu", "Luo Tianyi - Sanyueyu");
        translationBuilder.add("jukebox_song.luotianyizaisheng.zaishengrecalljp", "Luo Tianyi - Zaisheng Recall JP");
        translationBuilder.add("jukebox_song.luotianyizaisheng.aloud", "Luo Tianyi - Aloud");
        translationBuilder.add("jukebox_song.luotianyizaisheng.waiwai", "Luo Tianyi - Waiwai? feat.Chinese Football");
        translationBuilder.add("jukebox_song.luotianyizaisheng.xubabai", "Luo Tianyi - Xubabai");
    }

}
