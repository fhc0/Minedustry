package com.folgar.minedustry.init;

import com.folgar.minedustry.item.ItemMinedustry;
import com.folgar.minedustry.item.ItemWrench;
import com.folgar.minedustry.reference.Reference;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class ModItems
{
    public static final ItemMinedustry wrench = new ItemWrench();

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        System.out.println("Initializing Items");
        wrench.setRegistryName("wrench");
        event.getRegistry().register(wrench);
    }
}
