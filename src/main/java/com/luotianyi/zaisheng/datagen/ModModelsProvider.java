package com.luotianyi.zaisheng.datagen;

//import com.luotianyi.zaisheng.block.ModBlockFamilies;
//import com.luotianyi.zaisheng.block.ModBlocks;
//import com.luotianyi.zaisheng.block.custom.CornCropBlock;
import com.luotianyi.zaisheng.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // 参考原版的写法，使用BlockFamily
//        ModBlockFamilies.getFamilies().filter(BlockFamily::shouldGenerateModels).forEach(
//                family -> blockStateModelGenerator.registerCubeAllModelTexturePool(family.getBaseBlock())
//                        .family((BlockFamily)family));
//
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ICE_ETHER_ORE);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_ICE_ETHER_BLOCK);
//        // 作物的模型生成，罗列出所有的生长阶段
//        blockStateModelGenerator.registerCrop(ModBlocks.STRAWBERRY_CROP, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
//        // 按照十字交叉的方式生成作物的模型，参考浆果作物
//        blockStateModelGenerator.blockStateCollector.accept(
//                VariantsBlockStateSupplier.create(ModBlocks.CORN_CROP)
//                        .coordinate(BlockStateVariantMap.create(CornCropBlock.AGE)
//                                .register(stage -> BlockStateVariant.create()
//                                        .put(VariantSettings.MODEL, blockStateModelGenerator.createSubModel(ModBlocks.CORN_CROP, "_stage" + stage,
//                                                Models.CROSS, TextureMap::cross)))));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.HUDIE_MUSIC_DISC, Models.TEMPLATE_MUSIC_DISC);
        itemModelGenerator.register(ModItems.ZAISHENGRECALLCN_MUSIC_DISC, Models.TEMPLATE_MUSIC_DISC);
        itemModelGenerator.register(ModItems.ZUIWANMEIDEXIATIAN_MUSIC_DISC, Models.TEMPLATE_MUSIC_DISC);
        itemModelGenerator.register(ModItems.SANYUEYU_MUSIC_DISC, Models.TEMPLATE_MUSIC_DISC);
        itemModelGenerator.register(ModItems.ZAISHENGRECALLJP_MUSIC_DISC, Models.TEMPLATE_MUSIC_DISC);
        itemModelGenerator.register(ModItems.ALOUD_MUSIC_DISC, Models.TEMPLATE_MUSIC_DISC);
        itemModelGenerator.register(ModItems.CHUNRIPINGXINGXIAN_MUSIC_DISC, Models.TEMPLATE_MUSIC_DISC);
        itemModelGenerator.register(ModItems.WAIWAI_MUSIC_DISC, Models.TEMPLATE_MUSIC_DISC);
        itemModelGenerator.register(ModItems.XUBABAI_MUSIC_DISC, Models.TEMPLATE_MUSIC_DISC);
    }
}
