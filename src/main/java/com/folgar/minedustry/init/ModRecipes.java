package com.folgar.minedustry.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static void init() {
        GameRegistry.addSmelting(ModBlocks.bronzeore, new ItemStack(ModItems.bronzeingot, 1), 0.7f);
    }
}