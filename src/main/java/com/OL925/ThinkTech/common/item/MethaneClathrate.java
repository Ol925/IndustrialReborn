package com.OL925.ThinkTech.common.item;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MethaneClathrate extends Item {

    public MethaneClathrate() {
        super();
        this.setUnlocalizedName("methaneClathrate");
        this.setTextureName("thinktech:Methane_clathrate");
        GameRegistry.registerItem(this, "methaneClathrate");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(final ItemStack itemStack, final EntityPlayer player, final List toolTip,
        final boolean advancedToolTips) {
        toolTip.add("CH4·H2O");
    }
}
