
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mcmerge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.mcmerge.block.MergegrassplantBlock;
import net.mcreator.mcmerge.block.ConstructiontableBlock;
import net.mcreator.mcmerge.block.CherryplantBlock;
import net.mcreator.mcmerge.McmergeMod;

public class McmergeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, McmergeMod.MODID);
	public static final RegistryObject<Block> MERGEGRASSPLANT = REGISTRY.register("mergegrassplant", () -> new MergegrassplantBlock());
	public static final RegistryObject<Block> CONSTRUCTIONTABLE = REGISTRY.register("constructiontable", () -> new ConstructiontableBlock());
	public static final RegistryObject<Block> CHERRYPLANT = REGISTRY.register("cherryplant", () -> new CherryplantBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			MergegrassplantBlock.registerRenderLayer();
			CherryplantBlock.registerRenderLayer();
		}
	}
}
