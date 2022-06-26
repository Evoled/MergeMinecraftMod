
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mcmerge.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class McmergeModTabs {
	public static CreativeModeTab TAB_MCMERGE;

	public static void load() {
		TAB_MCMERGE = new CreativeModeTab("tabmcmerge") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.AMETHYST_CLUSTER);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
