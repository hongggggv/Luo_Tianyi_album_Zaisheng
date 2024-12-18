package com.luotianyi.zaisheng;

import com.luotianyi.zaisheng.item.ModItemGroups;
import com.luotianyi.zaisheng.item.ModItems;
import com.luotianyi.zaisheng.sounds.ModSoundEvents;
import com.luotianyi.zaisheng.tags.ModItemTags;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LuoTianyiZaisheng implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "luotianyizaisheng";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItems.registerModItems();
		ModItemGroups.registerModItemGroups();
		ModItemTags.registerModItemTags();
		ModSoundEvents.registerSounds();
		LOGGER.info("成功載入模組！盡情地享受我的歌聲吧！天依會一直陪伴著你喲！華風夏韻，洛水天依！");

//		// 使用Fabric API注册燃料，当然你可以使用Mixin
//		FuelRegistry.INSTANCE.add(ModItems.ANTHRACITE, 1600);

//		// 获取冷却时间
//		int itemUseCooldown = ((MinecraftClientAccessor) MinecraftClient.getInstance()).getItemUseCooldown();
//        LOGGER.info("Item use cooldown: {}", itemUseCooldown);
//
//		// 设置冷却时间，当然，这个例子并不会起作用，因为方法中还有其他代码会重置冷却时间
//		((MinecraftClientAccessor) MinecraftClient.getInstance()).setItemUseCooldown(1000);
//        LOGGER.info("Item use cooldown: {}", ((MinecraftClientAccessor) MinecraftClient.getInstance()).getItemUseCooldown());
//
//		// 获取草块颜色数组的长度
//		int[] colorMap = GrassColorsAccessor.getColorMap();
//		LOGGER.info("Grass color map length: {}", colorMap.length);
//
//		// 设置草块颜色数组长度，实际上它也不会起作用，因为在GrassColors类中，setColorMap方法将改变colorMap的引用
//		int[] newColorMap = new int[2];
//		GrassColorsAccessor.setColorMap(newColorMap);
//		LOGGER.info("Grass color map length: {}", GrassColorsAccessor.getColorMap().length);
//
//		// 以下代码如果需要使用，需自行设置enderman的值
////		EndermanEntity enderman = ...;
////		((EndermanEntityInvoker) enderman).invokeTeleportTo(0, 70, 0);
//
//		ItemsInvoker.register("test", new Item(new Item.Settings()));
	}
}