package com.folgar.minedustry.block;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.world.storage.loot.functions.Smelt;

public class BlockBronzeOre extends BlockMinedustry
{
    public BlockBronzeOre()
    {
        super();
        setUnlocalizedName("bronze_ore");
        setHarvestLevel("pickaxe", 2);
        setHardness(3.0F);
    }

}
