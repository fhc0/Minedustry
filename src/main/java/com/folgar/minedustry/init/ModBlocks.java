package com.folgar.minedustry.init;

import com.folgar.minedustry.block.BlockBronze;
import com.folgar.minedustry.block.BlockBronzeOre;
import com.folgar.minedustry.block.BlockMinedustry;
import com.folgar.minedustry.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockMinedustry bronzeblock = new BlockBronze();
    public static final BlockMinedustry bronzeore = new BlockBronzeOre();

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        System.out.println("Initializing Blocks");
        bronzeblock.setRegistryName("bronze_block");
        bronzeore.setRegistryName("bronze_ore");
        event.getRegistry().registerAll(bronzeblock,bronzeore);


    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event)
    {
        System.out.println("Initializing Block Items");
        event.getRegistry().registerAll(new ItemBlock(bronzeblock).setRegistryName("bronze_block"));
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event)
    {
        registerRender(Item.getItemFromBlock(bronzeblock));
    }

    private static void registerRender(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
    }
}
