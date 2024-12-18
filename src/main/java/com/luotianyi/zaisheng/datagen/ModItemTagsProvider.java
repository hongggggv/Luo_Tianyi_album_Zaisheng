package com.luotianyi.zaisheng.datagen;

import com.luotianyi.zaisheng.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        // 同样我们可以使用getOrCreateTagBuilder方法来创建标签
        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.ZAISHENGRECALLCN_MUSIC_DISC);
        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.HUDIE_MUSIC_DISC);
        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.ZUIWANMEIDEXIATIAN_MUSIC_DISC);
        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.SANYUEYU_MUSIC_DISC);
        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.ZAISHENGRECALLJP_MUSIC_DISC);
        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.ALOUD_MUSIC_DISC);
        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.CHUNRIPINGXINGXIAN_MUSIC_DISC);
        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.WAIWAI_MUSIC_DISC);
        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.XUBABAI_MUSIC_DISC);
    }
}
