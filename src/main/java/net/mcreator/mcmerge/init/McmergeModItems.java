
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
import net.mcreator.mcmerge.item.PotatospudsItem;
import net.mcreator.mcmerge.item.PepperseedsItem;
import net.mcreator.mcmerge.item.OliveseedsItem;
import net.mcreator.mcmerge.item.LettuceseedsItem;
import net.mcreator.mcmerge.item.EmptyseedItem;
import net.mcreator.mcmerge.item.CucumberseedsItem;
import net.mcreator.mcmerge.item.CucumberItem;
import net.mcreator.mcmerge.item.CornseedItem;
import net.mcreator.mcmerge.item.CauliflowerseedsItem;
import net.mcreator.mcmerge.item.CauliflowerItem;
import net.mcreator.mcmerge.item.CarrotseedsItem;
import net.mcreator.mcmerge.item.AvacodoseedsItem;
import net.mcreator.mcmerge.McmergeMod;

public class McmergeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, McmergeMod.MODID);
	public static final RegistryObject<Item> EMPTYSEED = REGISTRY.register("emptyseed", () -> new EmptyseedItem());
	public static final RegistryObject<Item> SEEDGRASS = REGISTRY.register("seedgrass", () -> new SeedgrassItem());
	public static final RegistryObject<Item> CARROTSEEDS = REGISTRY.register("carrotseeds", () -> new CarrotseedsItem());
	public static final RegistryObject<Item> LETTUCESEEDS = REGISTRY.register("lettuceseeds", () -> new LettuceseedsItem());
	public static final RegistryObject<Item> CUCUMBERSEEDS = REGISTRY.register("cucumberseeds", () -> new CucumberseedsItem());
	public static final RegistryObject<Item> CORNSEED = REGISTRY.register("cornseed", () -> new CornseedItem());
	public static final RegistryObject<Item> CAULIFLOWERSEEDS = REGISTRY.register("cauliflowerseeds", () -> new CauliflowerseedsItem());
	public static final RegistryObject<Item> AVACODOSEEDS = REGISTRY.register("avacodoseeds", () -> new AvacodoseedsItem());
	public static final RegistryObject<Item> OLIVESEEDS = REGISTRY.register("oliveseeds", () -> new OliveseedsItem());
	public static final RegistryObject<Item> PEPPERSEEDS = REGISTRY.register("pepperseeds", () -> new PepperseedsItem());
	public static final RegistryObject<Item> POTATOSPUDS = REGISTRY.register("potatospuds", () -> new PotatospudsItem());
	public static final RegistryObject<Item> CUCUMBER = REGISTRY.register("cucumber", () -> new CucumberItem());
	public static final RegistryObject<Item> CAULIFLOWER = REGISTRY.register("cauliflower", () -> new CauliflowerItem());
	public static final RegistryObject<Item> MERGEGRASSPLANT = block(McmergeModBlocks.MERGEGRASSPLANT, McmergeModTabs.TAB_MCMERGE);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
