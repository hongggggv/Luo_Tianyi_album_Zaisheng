package com.luotianyi.zaisheng.mixin;

//import com.luotianyi.zaisheng.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderLayers;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;

@Mixin(RenderLayers.class)
public abstract class RenderLayersMixin {
    @Shadow @Final private static Map<Block, RenderLayer> BLOCKS;

    // 注入代码，实现对门和活板门的渲染层级设置
    // 这里的代码是在RenderLayers的静态初始化方法执行完毕后执行
    @Inject(method = "<clinit>", at = @At("RETURN"))
    private static void onBlocksInit(CallbackInfo ci) {
//        BLOCKS.put(ModBlocks.ICE_ETHER_DOOR, RenderLayer.getCutout());
//        BLOCKS.put(ModBlocks.ICE_ETHER_TRAPDOOR, RenderLayer.getCutout());
//        BLOCKS.put(ModBlocks.STRAWBERRY_CROP, RenderLayer.getCutout());
//        BLOCKS.put(ModBlocks.CORN_CROP, RenderLayer.getCutout());
    }
}
