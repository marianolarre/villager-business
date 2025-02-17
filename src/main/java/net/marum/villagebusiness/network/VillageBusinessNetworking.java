package net.marum.villagebusiness.network;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.marum.villagebusiness.VillageBusiness;
import net.marum.villagebusiness.block.entity.RequestStandBlockEntity;
import net.marum.villagebusiness.block.entity.SalesStandBlockEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public class VillageBusinessNetworking {
    public static final Identifier PRICE_SETTING_PACKET = VillageBusiness.id("price_setting");
    public static final Identifier REQUEST_PACKET = VillageBusiness.id("request");

    public static void registerServerHandlers() {
        ServerPlayNetworking.registerGlobalReceiver(PRICE_SETTING_PACKET, (server, player, handler, buf, responseSender) -> {
            BlockPos pos = buf.readBlockPos();
            int value = buf.readInt();

            server.execute(() -> {
                if (player.getWorld().getBlockEntity(pos) instanceof SalesStandBlockEntity blockEntity) {
                    blockEntity.serverSetPriceSetting(value);
                    blockEntity.updateListeners();
                }
            });
        });

        ServerPlayNetworking.registerGlobalReceiver(REQUEST_PACKET, (server, player, handler, buf, responseSender) -> {
            BlockPos pos = buf.readBlockPos();
            ItemStack value = buf.readItemStack();

            server.execute(() -> {
                if (player.getWorld().getBlockEntity(pos) instanceof RequestStandBlockEntity blockEntity) {
                    blockEntity.setFilterItem(value);
                    blockEntity.updateListeners();
                }
            });
        });
    }
}
