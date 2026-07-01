package com.potato328.betterarbored.mixin;

import com.potato328.betterarbored.block.ModBlocks;
import net.minecraft.block.Block;
import net.portalmod.core.init.TileEntityTypeInit;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Set;

@Mixin(TileEntityTypeInit.class)
public class TileEntityTypeInitMixin {
    @Inject(method="getChamberDoorBlocks", at=@At("HEAD"), remap = false)
    private static void addArboredCamberDoorBlock(Set<Block> blocks, CallbackInfoReturnable<Set<Block>> cir) {
        blocks.add(ModBlocks.ARBORED_CHAMBER_DOOR.get());
    }
}
