package net.marum.villagebusiness;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.marum.villagebusiness.config.SimpleConfig;
import net.marum.villagebusiness.init.VillageBusinessBlockEntityTypeInit;
import net.marum.villagebusiness.init.VillagerBusinessBlockInit;
import net.marum.villagebusiness.init.VillagerBusinessItemInit;
import net.marum.villagebusiness.network.VillageBusinessNetworking;
import net.marum.villagebusiness.screen.VillageBusinessScreenHandlers;
import net.minecraft.entity.ai.brain.MemoryModuleType;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.Identifier;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mojang.serialization.Codec;

public class VillageBusiness implements ModInitializer {
	public static final String MOD_ID = "village_business";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final MemoryModuleType<Long> WONT_PURCHASE_UNTIL = Registry.register(Registries.MEMORY_MODULE_TYPE, id("last_purchased"), new MemoryModuleType<>(Optional.of(Codec.LONG)));

	public static final SimpleConfig CONFIG = SimpleConfig.of( "villagebusiness" ).request();
	public static MinecraftServer SERVER;

	@Override
	public void onInitialize() {
		ServerLifecycleEvents.SERVER_STARTING.register(s -> SERVER = s);
		VillagerBusinessItemInit.load();
		VillagerBusinessBlockInit.load();
		VillageBusinessBlockEntityTypeInit.load();
		VillageBusinessScreenHandlers.load();
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> entries.add(VillagerBusinessBlockInit.SALES_STAND_BLOCK));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> entries.add(VillagerBusinessBlockInit.REQUEST_STAND_BLOCK));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> entries.add(VillagerBusinessItemInit.EMERALD_NUGGET));
		VillageBusinessNetworking.registerServerHandlers();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}