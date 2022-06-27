
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mcmerge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.mcmerge.block.entity.ConstructiontableBlockEntity;
import net.mcreator.mcmerge.McmergeMod;

public class McmergeModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, McmergeMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> CONSTRUCTIONTABLE = register("constructiontable", McmergeModBlocks.CONSTRUCTIONTABLE,
			ConstructiontableBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
