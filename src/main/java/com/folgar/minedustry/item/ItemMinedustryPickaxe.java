package com.folgar.minedustry.item;

import com.folgar.minedustry.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class ItemMinedustryPickaxe extends ItemToolBase
{
    public ItemMinedustryPickaxe(ToolMaterial material)
    {
        super(material, PICKAXE_EFFECTIVE, 1.0f, -2.9f);
    }

    @Override
    public boolean canHarvestBlock(IBlockState blockState)
    {
        Block block = blockState.getBlock();
        Material material = blockState.getMaterial();
        if(block == Blocks.OBSIDIAN)
            return this.toolMaterial.getHarvestLevel() == 3;
        else if(material == Material.ROCK || material == Material.IRON || material == Material.ANVIL)
            return true;
        else
            return this.toolMaterial.getHarvestLevel() >= 2;
    }

    @Override
    public float getDestroySpeed(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        if((material != Material.IRON) && (material != Material.ANVIL) && (material!=Material.ROCK))
            return super.getDestroySpeed(stack, state);
        return this.efficiency;
    }
}
