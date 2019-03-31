package com.folgar.minedustry.init;

import com.folgar.minedustry.item.ItemBronzeIngot;
import com.folgar.minedustry.item.ItemMinedustry;
import com.folgar.minedustry.item.ItemMinedustryPickaxe;
import com.folgar.minedustry.item.ItemWrench;
import com.folgar.minedustry.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class ModItems
{
    public static final ItemMinedustry wrench = new ItemWrench();
    public static final ItemMinedustry bronzeingot = new ItemBronzeIngot();
    public static final ItemMinedustryPickaxe bronzePickaxe = new ItemMinedustryPickaxe(Item.ToolMaterial.IRON);

    @SubscribeEvent
    public static void  registerItems(RegistryEvent.Register<Item> event)
    {
        System.out.println("Initializing Items");
        wrench.setRegistryName("wrench");
        bronzeingot.setRegistryName("bronze_ingot");
        bronzePickaxe.setRegistryName("bronze_pickaxe");
        bronzePickaxe.setUnlocalizedName("bronze_pickaxe");
        event.getRegistry().registerAll(wrench, bronzePickaxe, bronzeingot);
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event)
    {
        registerRender(wrench);
        registerRender(bronzeingot);
        registerRender(bronzePickaxe);
    }

    private static void registerRender(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
    }

}
