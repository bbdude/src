package com.iigniteus.test.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Jacob on 7/18/2016.
 */
public final class ModItems {

    public static Item darkEssence;

    public static void createItems() {
        GameRegistry.registerItem(darkEssence = new BasicItem("Dark Essence"), "dark_essence");
    }
}
