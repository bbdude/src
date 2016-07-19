package com.iigniteus.test.client.render.items;

import com.iigniteus.test.Main;
import com.iigniteus.test.items.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * Created by Jacob on 7/18/2016.
 */
public final class ItemRenderRegister {
    public static void registerItemRenderer() {
        //reg(ModItems.darkEssence);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.darkEssence, 0, new ModelResourceLocation(modid + ":" + ModItems.darkEssence.getUnlocalizedName().substring(5), "inventory"));
    }
    public static String modid = Main.MODID;

    public static void reg(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
        //System.out.println(modid + ":" + item.getUnlocalizedName().substring(5));
    }
}
