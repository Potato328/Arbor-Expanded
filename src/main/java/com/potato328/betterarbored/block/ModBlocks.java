package com.potato328.betterarbored.block;

import com.potato328.betterarbored.ModInventoryTab;
import net.minecraft.block.*;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.portalmod.common.sorted.button.StandingButtonBlock;
import net.portalmod.common.sorted.button.SuperButtonBlock;
import net.portalmod.common.sorted.cubedropper.CubeDropperBlock;
import net.portalmod.common.sorted.door.ChamberDoorBlock;
import net.portalmod.common.sorted.panel.PanelBlock;

import javax.naming.directory.ModificationItem;
import java.util.function.Supplier;

import static net.portalmod.core.init.BlockInit.stoneCopy;

public class ModBlocks {

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "betterarbored");
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "betterarbored");

    //Blocks
    public static final RegistryObject<Block> ARBORED_BLACKPLATE_1 = registerBlock("arbored_blackplate_1", () -> new PanelBlock(AbstractBlock.Properties.copy(Blocks.BLACK_CONCRETE)));
    public static final RegistryObject<Block> ARBORED_BLACKPLATE_SLAB_1 = registerBlock("arbored_blackplate_slab_1", () -> new SlabBlock(AbstractBlock.Properties.copy(Blocks.BLACK_CONCRETE)));
    public static final RegistryObject<Block> ARBORED_BLACKPLATE_2 = registerBlock("arbored_blackplate_2", () -> new PanelBlock(AbstractBlock.Properties.copy(Blocks.BLACK_CONCRETE)));
    public static final RegistryObject<Block> ARBORED_BLACKPLATE_SLAB_2 = registerBlock("arbored_blackplate_slab_2", () -> new SlabBlock(AbstractBlock.Properties.copy(Blocks.BLACK_CONCRETE)));
    public static final RegistryObject<Block> ARBORED_BLACKPLATE_3 = registerBlock("arbored_blackplate_3", () -> new PanelBlock(AbstractBlock.Properties.copy(Blocks.BLACK_CONCRETE)));
    public static final RegistryObject<Block> ARBORED_BLACKPLATE_SLAB_3 = registerBlock("arbored_blackplate_slab_3", () -> new SlabBlock(AbstractBlock.Properties.copy(Blocks.BLACK_CONCRETE)));
    public static final RegistryObject<Block> ARBORED_BLACKPLATE_4 = registerBlock("arbored_blackplate_4", () -> new PanelBlock(AbstractBlock.Properties.copy(Blocks.BLACK_CONCRETE)));
    public static final RegistryObject<Block> ARBORED_BLACKPLATE_SLAB_4 = registerBlock("arbored_blackplate_slab_4", () -> new SlabBlock(AbstractBlock.Properties.copy(Blocks.BLACK_CONCRETE)));
    public static final RegistryObject<Block> ARBORED_BLACKPLATE_5 = registerBlock("arbored_blackplate_5", () -> new PanelBlock(AbstractBlock.Properties.copy(Blocks.BLACK_CONCRETE)));
    public static final RegistryObject<Block> ARBORED_BLACKPLATE_SLAB_5 = registerBlock("arbored_blackplate_slab_5", () -> new SlabBlock(AbstractBlock.Properties.copy(Blocks.BLACK_CONCRETE)));
    public static final RegistryObject<Block> ARBORED_BLACKPLATE_6 = registerBlock("arbored_blackplate_6", () -> new PanelBlock(AbstractBlock.Properties.copy(Blocks.BLACK_CONCRETE)));
    public static final RegistryObject<Block> ARBORED_BLACKPLATE_SLAB_6 = registerBlock("arbored_blackplate_slab_6", () -> new SlabBlock(AbstractBlock.Properties.copy(Blocks.BLACK_CONCRETE)));
    public static final RegistryObject<Block> ARBORED_BLACKPLATE_7 = registerBlock("arbored_blackplate_7", () -> new PanelBlock(AbstractBlock.Properties.copy(Blocks.BLACK_CONCRETE)));
    public static final RegistryObject<Block> ARBORED_BLACKPLATE_SLAB_7 = registerBlock("arbored_blackplate_slab_7", () -> new SlabBlock(AbstractBlock.Properties.copy(Blocks.BLACK_CONCRETE)));
    public static final RegistryObject<Block> ARBORED_BLACKPLATE_8 = registerBlock("arbored_blackplate_8", () -> new PanelBlock(AbstractBlock.Properties.copy(Blocks.BLACK_CONCRETE)));
    public static final RegistryObject<Block> ARBORED_BLACKPLATE_SLAB_8 = registerBlock("arbored_blackplate_slab_8", () -> new SlabBlock(AbstractBlock.Properties.copy(Blocks.BLACK_CONCRETE)));
    public static final RegistryObject<Block> ARBORED_BLACKPLATE_9 = registerBlock("arbored_blackplate_9", () -> new PanelBlock(AbstractBlock.Properties.copy(Blocks.BLACK_CONCRETE)));
    public static final RegistryObject<Block> ARBORED_BLACKPLATE_SLAB_9 = registerBlock("arbored_blackplate_slab_9", () -> new SlabBlock(AbstractBlock.Properties.copy(Blocks.BLACK_CONCRETE)));

    //Testing Elements
    //public static final RegistryObject<Block> ARBORED_CUBE_DROPPER = registerBlock("arbored_cube_dropper", () -> new CubeDropperBlock(AbstractBlock.Properties.copy(Blocks.STONE).noOcclusion()));
    //public static final RegistryObject<Block> ARBORED_CHAMBER_DOOR = registerBlock("arbored_chamber_door", () -> new ChamberDoorBlock(stoneCopy(MaterialColor.COLOR_BLACK).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> ARBORED_SUPER_BUTTON = registerBlock("arbored_super_button", () -> new SuperButtonBlock(stoneCopy(MaterialColor.COLOR_RED).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> ARBORED_STANDING_BUTTON = registerBlock("arbored_standing_button", () -> new StandingButtonBlock(stoneCopy(MaterialColor.COLOR_RED).sound(SoundType.STONE).noOcclusion()));

    //Registers blocks
    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> registeredBlock = BLOCKS.register(name, block);
        registerBlockItem(name, registeredBlock);
        return registeredBlock;
    }

    //Registers block items
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ITEMS.register(name, ()-> new BlockItem(block.get(), properties()));
    }

    public static Item.Properties properties() {
        return new Item.Properties().tab(ModInventoryTab.itemTab);
    }
}
