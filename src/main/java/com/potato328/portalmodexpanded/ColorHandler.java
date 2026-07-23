package com.potato328.portalmodexpanded;

import com.potato328.portalmodexpanded.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.item.BlockItem;
import net.minecraft.world.GrassColors;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.portalmod.client.render.BlockColorHandler;

public class ColorHandler extends BlockColorHandler {
    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public void registerBlockColor(final ColorHandlerEvent.Block event) {
        final IBlockColor blockColor = (state, blockAccess, pos, tintIndex) -> {
            if (blockAccess != null && pos != null) {
                return BiomeColors.getAverageFoliageColor(blockAccess, pos);
            }
            return GrassColors.get(.5D, 1D);
        };
        event.getBlockColors().register(blockColor, ModBlocks.ARBORED_BLACKPLATE_1.get());
        event.getBlockColors().register(blockColor, ModBlocks.ARBORED_BLACKPLATE_SLAB_1.get());
        event.getBlockColors().register(blockColor, ModBlocks.ARBORED_BLACKPLATE_2.get());
        event.getBlockColors().register(blockColor, ModBlocks.ARBORED_BLACKPLATE_SLAB_2.get());
        event.getBlockColors().register(blockColor, ModBlocks.ARBORED_BLACKPLATE_3.get());
        event.getBlockColors().register(blockColor, ModBlocks.ARBORED_BLACKPLATE_SLAB_3.get());
        event.getBlockColors().register(blockColor, ModBlocks.ARBORED_BLACKPLATE_4.get());
        event.getBlockColors().register(blockColor, ModBlocks.ARBORED_BLACKPLATE_SLAB_4.get());
        event.getBlockColors().register(blockColor, ModBlocks.ARBORED_BLACKPLATE_5.get());
        event.getBlockColors().register(blockColor, ModBlocks.ARBORED_BLACKPLATE_SLAB_5.get());
        event.getBlockColors().register(blockColor, ModBlocks.ARBORED_BLACKPLATE_6.get());
        event.getBlockColors().register(blockColor, ModBlocks.ARBORED_BLACKPLATE_SLAB_6.get());
        event.getBlockColors().register(blockColor, ModBlocks.ARBORED_BLACKPLATE_7.get());
        event.getBlockColors().register(blockColor, ModBlocks.ARBORED_BLACKPLATE_SLAB_7.get());
        event.getBlockColors().register(blockColor, ModBlocks.ARBORED_BLACKPLATE_8.get());
        event.getBlockColors().register(blockColor, ModBlocks.ARBORED_BLACKPLATE_SLAB_8.get());
        event.getBlockColors().register(blockColor, ModBlocks.ARBORED_BLACKPLATE_9.get());
        event.getBlockColors().register(blockColor, ModBlocks.ARBORED_BLACKPLATE_SLAB_9.get());

        event.getBlockColors().register(blockColor, ModBlocks.DIRTY_BLACKPLATE_1.get());
        event.getBlockColors().register(blockColor, ModBlocks.DIRTY_BLACKPLATE_2.get());
        event.getBlockColors().register(blockColor, ModBlocks.DIRTY_BLACKPLATE_3.get());

        event.getBlockColors().register(blockColor, ModBlocks.ARBORED_BLACKPLATE_PLATFORM_1.get());
        event.getBlockColors().register(blockColor, ModBlocks.ARBORED_BLACKPLATE_PLATFORM_2.get());
        event.getBlockColors().register(blockColor, ModBlocks.ARBORED_BLACKPLATE_PLATFORM_3.get());
        event.getBlockColors().register(blockColor, ModBlocks.ARBORED_BLACKPLATE_PLATFORM_4.get());
        event.getBlockColors().register(blockColor, ModBlocks.ARBORED_BLACKPLATE_PLATFORM_5.get());
        event.getBlockColors().register(blockColor, ModBlocks.ARBORED_BLACKPLATE_PLATFORM_6.get());
        event.getBlockColors().register(blockColor, ModBlocks.ARBORED_BLACKPLATE_PLATFORM_7.get());
        event.getBlockColors().register(blockColor, ModBlocks.ARBORED_BLACKPLATE_PLATFORM_8.get());
        event.getBlockColors().register(blockColor, ModBlocks.ARBORED_BLACKPLATE_PLATFORM_9.get());
    }

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public void registerItemColor(final ColorHandlerEvent.Item event) {
        final IItemColor blockItemColor = (stack, tintIndex) -> {
            BlockState blockState = ((BlockItem) stack.getItem()).getBlock().defaultBlockState();
            return event.getBlockColors().getColor(blockState, null, null, tintIndex);
        };
        event.getItemColors().register(blockItemColor, ModBlocks.ARBORED_BLACKPLATE_1.get());
        event.getItemColors().register(blockItemColor, ModBlocks.ARBORED_BLACKPLATE_SLAB_1.get());
        event.getItemColors().register(blockItemColor, ModBlocks.ARBORED_BLACKPLATE_2.get());
        event.getItemColors().register(blockItemColor, ModBlocks.ARBORED_BLACKPLATE_SLAB_2.get());
        event.getItemColors().register(blockItemColor, ModBlocks.ARBORED_BLACKPLATE_3.get());
        event.getItemColors().register(blockItemColor, ModBlocks.ARBORED_BLACKPLATE_SLAB_3.get());
        event.getItemColors().register(blockItemColor, ModBlocks.ARBORED_BLACKPLATE_4.get());
        event.getItemColors().register(blockItemColor, ModBlocks.ARBORED_BLACKPLATE_SLAB_4.get());
        event.getItemColors().register(blockItemColor, ModBlocks.ARBORED_BLACKPLATE_5.get());
        event.getItemColors().register(blockItemColor, ModBlocks.ARBORED_BLACKPLATE_SLAB_5.get());
        event.getItemColors().register(blockItemColor, ModBlocks.ARBORED_BLACKPLATE_6.get());
        event.getItemColors().register(blockItemColor, ModBlocks.ARBORED_BLACKPLATE_SLAB_6.get());
        event.getItemColors().register(blockItemColor, ModBlocks.ARBORED_BLACKPLATE_7.get());
        event.getItemColors().register(blockItemColor, ModBlocks.ARBORED_BLACKPLATE_SLAB_7.get());
        event.getItemColors().register(blockItemColor, ModBlocks.ARBORED_BLACKPLATE_8.get());
        event.getItemColors().register(blockItemColor, ModBlocks.ARBORED_BLACKPLATE_SLAB_8.get());
        event.getItemColors().register(blockItemColor, ModBlocks.ARBORED_BLACKPLATE_9.get());
        event.getItemColors().register(blockItemColor, ModBlocks.ARBORED_BLACKPLATE_SLAB_9.get());

        event.getItemColors().register(blockItemColor, ModBlocks.ARBORED_BLACKPLATE_PLATFORM_1.get());
        event.getItemColors().register(blockItemColor, ModBlocks.ARBORED_BLACKPLATE_PLATFORM_2.get());
        event.getItemColors().register(blockItemColor, ModBlocks.ARBORED_BLACKPLATE_PLATFORM_3.get());
        event.getItemColors().register(blockItemColor, ModBlocks.ARBORED_BLACKPLATE_PLATFORM_4.get());
        event.getItemColors().register(blockItemColor, ModBlocks.ARBORED_BLACKPLATE_PLATFORM_5.get());
        event.getItemColors().register(blockItemColor, ModBlocks.ARBORED_BLACKPLATE_PLATFORM_6.get());
        event.getItemColors().register(blockItemColor, ModBlocks.ARBORED_BLACKPLATE_PLATFORM_7.get());
        event.getItemColors().register(blockItemColor, ModBlocks.ARBORED_BLACKPLATE_PLATFORM_8.get());
        event.getItemColors().register(blockItemColor, ModBlocks.ARBORED_BLACKPLATE_PLATFORM_9.get());

        event.getItemColors().register(blockItemColor, ModBlocks.DIRTY_BLACKPLATE_1.get());
        event.getItemColors().register(blockItemColor, ModBlocks.DIRTY_BLACKPLATE_2.get());
        event.getItemColors().register(blockItemColor, ModBlocks.DIRTY_BLACKPLATE_3.get());
    }
}
