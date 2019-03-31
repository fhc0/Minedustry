package com.folgar.minedustry.block;

        import com.folgar.minedustry.reference.Reference;
        import net.minecraft.block.Block;
        import net.minecraft.block.material.Material;
        import net.minecraft.item.ItemStack;

public class BlockMinedustry extends Block
{
    BlockMinedustry(Material material)
    {
        super(material);
    }

    BlockMinedustry()
    {
        this(Material.ROCK);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
}
}