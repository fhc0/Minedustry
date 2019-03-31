package com.folgar.minedustry;

import com.folgar.minedustry.init.ModRecipes;
import com.folgar.minedustry.proxy.IProxy;
import com.folgar.minedustry.reference.Reference;
import com.folgar.minedustry.worldgen.OreGen;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Minedustry
{
    @Mod.Instance(Reference.MOD_ID)
    public static Minedustry instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static IProxy proxy;


    @Mod.EventHandler()
    public void preInit(FMLPreInitializationEvent event)
    {
        System.out.println("PreInitialization");
    }

    @Mod.EventHandler()
    public void Init(FMLInitializationEvent event)
    {
        System.out.println("Initialization");
        GameRegistry.registerWorldGenerator(new OreGen(), 0);
        ModRecipes.init();
    }

    @Mod.EventHandler()
    public void postInit(FMLPostInitializationEvent event)
    {
        System.out.println("PostInitialization");
    }
}

