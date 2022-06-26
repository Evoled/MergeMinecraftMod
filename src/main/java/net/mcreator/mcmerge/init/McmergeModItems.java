
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mcmerge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mcmerge.item.SeedgrassItem;
import net.mcreator.mcmerge.item.EmptyseedItem;
import net.mcreator.mcmerge.McmergeMod;

public class McmergeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, McmergeMod.MODID);
	public static final RegistryObject<Item> EMPTYSEED = REGISTRY.register("emptyseed", () -> new EmptyseedItem());
	public static final RegistryObject<Item> SEEDGRASS = REGISTRY.register("seedgrass", () -> new SeedgrassItem());
	public static final RegistryObject<Item> MERGE_GRASS_PLANT = block(McmergeModBlocks.MERGE_GRASS_PLANT, McmergeModTabs.TAB_MCMERGE);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
