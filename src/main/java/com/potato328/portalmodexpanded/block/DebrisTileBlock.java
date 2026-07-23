package com.potato328.portalmodexpanded.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.portalmod.common.items.WrenchItem;
import net.portalmod.core.util.ModUtil;

import javax.annotation.Nullable;
import java.util.List;

import static net.portalmod.core.util.ModUtil.TOOLTIP_STYLE;

public class DebrisTileBlock extends Block {

    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final IntegerProperty SIZE = IntegerProperty.create("size", 0, 1);

    public static final IntegerProperty TILE = IntegerProperty.create("tile", 0, 5);

    private static final VoxelShape hitbox = Block.box(0, 0, 0, 16, 1, 16);
    public DebrisTileBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(SIZE, 0));
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
        return hitbox;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
        return hitbox;
    }

    @Override
    public VoxelShape getVisualShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
        return hitbox;
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
        builder.add(SIZE);
        builder.add(TILE);
    }

    @Override
    public ActionResultType use(BlockState blockState, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult result) {

        if (player.getItemInHand(hand).getItem() instanceof WrenchItem && !player.isShiftKeyDown()) {
            BlockState cycle = blockState.cycle(TILE);
            world.setBlockAndUpdate(pos, cycle);
            WrenchItem.playUseSound(world, result.getLocation());
            return ActionResultType.SUCCESS;
        }

        if (player.getItemInHand(hand).getItem() instanceof WrenchItem && player.isShiftKeyDown()) {
            BlockState cycle = blockState.cycle(SIZE);
            world.setBlockAndUpdate(pos, cycle);
            WrenchItem.playUseSound(world, result.getLocation());
            return ActionResultType.SUCCESS;
        }
        return ActionResultType.PASS;
    }
    private static String getModifierKeyName() {
        return Util.getPlatform() == Util.OS.OSX
                ? "Command"
                : "Ctrl";
    }

    public static IFormattableTextComponent tooltipComponent(String key, Object... args) {
        return new TranslationTextComponent(key, args).setStyle(TOOLTIP_STYLE);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable IBlockReader blockReader, List<ITextComponent> list, ITooltipFlag flag) {
        if (!Screen.hasControlDown()) {
            list.add(tooltipComponent("tooltip.portalmod.hold_control", getModifierKeyName()));
            return;
        }

        list.add(tooltipComponent("tooltip.portalmodexpanded.tile_debris_1"));
        list.add(tooltipComponent("tooltip.portalmodexpanded.tile_debris_2"));
    }
}
