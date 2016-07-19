package com.iigniteus.test;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
/**
 * Created by Jacob on 7/18/2016.
 */
@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {

    public static final String MODID = "test";
    public static final String MODNAME = "The Night";
    public static final String VERSION = "1.0.0";

    @Instance
    public static Main instance = new Main();

    @SidedProxy(clientSide="com.iigniteus.test.CommonProxy", serverSide="com.iigniteus.test.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        System.out.println("Called method: [preInit]");
        this.proxy.preInit(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        System.out.println("Called method: [init]");
        this.proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        System.out.println("Called method: [postInit]");
        this.proxy.postInit(e);
    }
}
