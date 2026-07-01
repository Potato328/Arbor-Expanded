package com.potato328.betterarbored;

import com.potato328.betterarbored.block.ModBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.eventbus.api.IEventBus;

@Mod("betterarbored")
public class BetterArbored {
    private static final Logger LOGGER = LogManager.getLogger();

    public BetterArbored() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        MinecraftForge.EVENT_BUS.register(this);
        eventBus.register(new ColorHandler());
        ModBlocks.register(eventBus);


    }

    private void setup(final FMLCommonSetupEvent event) {

    }
    private void doClientStuff(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            RenderTypeLookup.setRenderLayer(ModBlocks.ARBORED_BLACKPLATE_1.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.ARBORED_BLACKPLATE_SLAB_1.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.ARBORED_BLACKPLATE_2.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.ARBORED_BLACKPLATE_SLAB_2.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.ARBORED_BLACKPLATE_3.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.ARBORED_BLACKPLATE_SLAB_3.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.ARBORED_BLACKPLATE_4.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.ARBORED_BLACKPLATE_SLAB_4.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.ARBORED_BLACKPLATE_5.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.ARBORED_BLACKPLATE_SLAB_5.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.ARBORED_BLACKPLATE_6.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.ARBORED_BLACKPLATE_SLAB_6.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.ARBORED_BLACKPLATE_7.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.ARBORED_BLACKPLATE_SLAB_7.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.ARBORED_BLACKPLATE_8.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.ARBORED_BLACKPLATE_SLAB_8.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.ARBORED_BLACKPLATE_9.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.ARBORED_BLACKPLATE_SLAB_9.get(), RenderType.cutout());

            RenderTypeLookup.setRenderLayer(ModBlocks.ARBORED_SUPER_BUTTON.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.ARBORED_SUPER_BUTTON2.get(), RenderType.cutout());
            //RenderTypeLookup.setRenderLayer(ModBlocks.ARBORED_CUBE_DROPPER.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.ARBORED_STANDING_BUTTON.get(), RenderType.cutout());


        });
    }
    private void enqueueIMC(final InterModEnqueueEvent event) {

    }
    private void processIMC(final InterModProcessEvent event) {

    }


}
