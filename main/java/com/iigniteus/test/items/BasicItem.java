package com.iigniteus.test.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Jacob on 7/18/2016.
 */
public class BasicItem extends Item{
    public BasicItem(String unlocalizedName) {
        super();

        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }
}
