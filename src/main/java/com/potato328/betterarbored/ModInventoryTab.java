package com.potato328.betterarbored;

import com.potato328.betterarbored.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.RegistryObject;

public class ModInventoryTab extends ItemGroup {
    public static final ItemGroup itemTab = new ModInventoryTab();

    private ModInventoryTab() {
        super("betterarbored");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ModBlocks.ARBORED_BLACKPLATE_1.get());
    }
}
