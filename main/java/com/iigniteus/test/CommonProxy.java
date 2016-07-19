package com.iigniteus.test;

import com.iigniteus.test.client.render.items.ItemRenderRegister;
import com.iigniteus.test.items.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
        ModItems.createItems();
    }

    /*public void init(FMLInitializationEvent e) {

    }*/

    public void postInit(FMLPostInitializationEvent e) {

    }

    public void init(FMLInitializationEvent e) {
        //super.init(e);
        ItemRenderRegister.registerItemRenderer();
    }
}