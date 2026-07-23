package com.potato328.portalmodexpanded.tileentity;

import com.potato328.portalmodexpanded.block.CameraP2Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;


public class CameraP2TileEntity extends TileEntity implements ITickableTileEntity {

    public int time;

    public float xRot;
    public float oXRot;
    public float tXRot;

    public float yRot;
    public float oYRot;
    public float tYRot;


    public CameraP2TileEntity() {
        super(ModTileEntities.CAMERA_P2.get());
    }

    @Override
    public void tick() {
        this.oXRot = this.xRot;
        this.oYRot = this.yRot;

        PlayerEntity player = this.level.getNearestPlayer((double) this.worldPosition.getX() + 0.5D, (double) this.worldPosition.getY() + 0.5D, (double) this.worldPosition.getZ() + 0.5D, 30.0D, false);


        if (player !=null) {
            double d0 = player.getX() - ((double)this.worldPosition.getX() + 0.5D);
            double d1 = player.getZ() - ((double)this.worldPosition.getZ() + 0.5D);
            double d2 = player.getY() + player.getEyeHeight() - ((double)this.worldPosition.getY() + 0.5D);


            this.tXRot = (float) MathHelper.atan2(d1, d0);
            //System.out.println("[portalmodexpanded] Xrot: " + tXRot);
            double xz = Math.sqrt(d0 * d0 + d1 * d1);
            this.tYRot = (float) MathHelper.atan2(d2, xz);
            //System.out.println("[portalmodexpanded] YRot: " + tYRot);

        } else {
            this.tXRot = 0.0F;
            this.tYRot = -(float)Math.PI /2;
        }

        while(this.xRot > (float)Math.PI) {
            this.xRot -= (float)Math.PI * 2F;
        }
        while(this.xRot < -(float)Math.PI) {
            this.xRot += (float)Math.PI / 2F;
        }
        while(this.tXRot > (float)Math.PI) {
            this.tXRot -= (float)Math.PI / 2F;
        }
        while(this.tXRot < -(float)Math.PI) {
            this.tXRot += (float)Math.PI / 2F;
        }

        while(this.yRot > (float)Math.PI) {
            this.yRot -= (float)Math.PI * 2F;
        }
        while(this.yRot < -(float)Math.PI) {
            this.yRot += (float)Math.PI * 2F;
        }
        while(this.tYRot > (float)Math.PI) {
            this.tYRot -= (float)Math.PI * 2F;
        }
        while(this.tYRot < -(float)Math.PI) {
            this.tYRot += (float)Math.PI * 2F;
        }
    }
}
