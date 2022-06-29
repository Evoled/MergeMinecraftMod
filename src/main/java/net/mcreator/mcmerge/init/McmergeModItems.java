
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

import net.mcreator.mcmerge.item.WrenchItem;
import net.mcreator.mcmerge.item.SugarcaneseedItem;
import net.mcreator.mcmerge.item.StrawberryseedsItem;
import net.mcreator.mcmerge.item.StrawberryItem;
import net.mcreator.mcmerge.item.SeedgrassItem;
import net.mcreator.mcmerge.item.ScrewdriverItem;
import net.mcreator.mcmerge.item.SawItem;
import net.mcreator.mcmerge.item.PotatospudsItem;
import net.mcreator.mcmerge.item.PlumsaplingItem;
import net.mcreator.mcmerge.item.PliersItem;
import net.mcreator.mcmerge.item.PepperseedsItem;
import net.mcreator.mcmerge.item.PepperItem;
import net.mcreator.mcmerge.item.PearsaplingItem;
import net.mcreator.mcmerge.item.PeachsaplingItem;
import net.mcreator.mcmerge.item.OrangesaplingItem;
import net.mcreator.mcmerge.item.OliveseedsItem;
import net.mcreator.mcmerge.item.OliveItem;
import net.mcreator.mcmerge.item.NailgunItem;
import net.mcreator.mcmerge.item.MalletItem;
import net.mcreator.mcmerge.item.LettuceseedsItem;
import net.mcreator.mcmerge.item.LettuceItem;
import net.mcreator.mcmerge.item.HandsawItem;
import net.mcreator.mcmerge.item.HammerItem;
import net.mcreator.mcmerge.item.GrapeseedItem;
import net.mcreator.mcmerge.item.GrapeItem;
import net.mcreator.mcmerge.item.EmptyseedItem;
import net.mcreator.mcmerge.item.DrillItem;
import net.mcreator.mcmerge.item.CucumberseedsItem;
import net.mcreator.mcmerge.item.CucumberItem;
import net.mcreator.mcmerge.item.CornseedItem;
import net.mcreator.mcmerge.item.CornItem;
import net.mcreator.mcmerge.item.ChiselItem;
import net.mcreator.mcmerge.item.CherryseedsItem;
import net.mcreator.mcmerge.item.CherrysaplingItem;
import net.mcreator.mcmerge.item.CherryItem;
import net.mcreator.mcmerge.item.CauliflowerseedsItem;
import net.mcreator.mcmerge.item.CauliflowerItem;
import net.mcreator.mcmerge.item.CarrotseedsItem;
import net.mcreator.mcmerge.item.AvacodoseedsItem;
import net.mcreator.mcmerge.item.AvacadoItem;
import net.mcreator.mcmerge.McmergeMod;

public class McmergeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, McmergeMod.MODID);
	public static final RegistryObject<Item> EMPTYSEED = REGISTRY.register("emptyseed", () -> new EmptyseedItem());
	public static final RegistryObject<Item> SEEDGRASS = REGISTRY.register("seedgrass", () -> new SeedgrassItem());
	public static final RegistryObject<Item> CARROTSEEDS = REGISTRY.register("carrotseeds", () -> new CarrotseedsItem());
	public static final RegistryObject<Item> LETTUCESEEDS = REGISTRY.register("lettuceseeds", () -> new LettuceseedsItem());
	public static final RegistryObject<Item> CUCUMBERSEEDS = REGISTRY.register("cucumberseeds", () -> new CucumberseedsItem());
	public static final RegistryObject<Item> CORNSEEDS = REGISTRY.register("cornseeds", () -> new CornseedItem());
	public static final RegistryObject<Item> CAULIFLOWERSEEDS = REGISTRY.register("cauliflowerseeds", () -> new CauliflowerseedsItem());
	public static final RegistryObject<Item> AVACODOSEEDS = REGISTRY.register("avacodoseeds", () -> new AvacodoseedsItem());
	public static final RegistryObject<Item> OLIVESEEDS = REGISTRY.register("oliveseeds", () -> new OliveseedsItem());
	public static final RegistryObject<Item> PEPPERSEEDS = REGISTRY.register("pepperseeds", () -> new PepperseedsItem());
	public static final RegistryObject<Item> POTATOSPUDS = REGISTRY.register("potatospuds", () -> new PotatospudsItem());
	public static final RegistryObject<Item> CUCUMBER = REGISTRY.register("cucumber", () -> new CucumberItem());
	public static final RegistryObject<Item> CAULIFLOWER = REGISTRY.register("cauliflower", () -> new CauliflowerItem());
	public static final RegistryObject<Item> MERGEGRASSPLANT = block(McmergeModBlocks.MERGEGRASSPLANT, McmergeModTabs.TAB_MCMERGE);
	public static final RegistryObject<Item> CORN = REGISTRY.register("corn", () -> new CornItem());
	public static final RegistryObject<Item> LETTUCE = REGISTRY.register("lettuce", () -> new LettuceItem());
	public static final RegistryObject<Item> PEPPER = REGISTRY.register("pepper", () -> new PepperItem());
	public static final RegistryObject<Item> OLIVE = REGISTRY.register("olive", () -> new OliveItem());
	public static final RegistryObject<Item> GRAPE = REGISTRY.register("grape", () -> new GrapeItem());
	public static final RegistryObject<Item> GRAPESEED = REGISTRY.register("grapeseed", () -> new GrapeseedItem());
	public static final RegistryObject<Item> SUGARCANESEED = REGISTRY.register("sugarcaneseed", () -> new SugarcaneseedItem());
	public static final RegistryObject<Item> AVACADO = REGISTRY.register("avacado", () -> new AvacadoItem());
	public static final RegistryObject<Item> STRAWBERRY = REGISTRY.register("strawberry", () -> new StrawberryItem());
	public static final RegistryObject<Item> CHERRY = REGISTRY.register("cherry", () -> new CherryItem());
	public static final RegistryObject<Item> CHERRYSEEDS = REGISTRY.register("cherryseeds", () -> new CherryseedsItem());
	public static final RegistryObject<Item> STRAWBERRYSEEDS = REGISTRY.register("strawberryseeds", () -> new StrawberryseedsItem());
	public static final RegistryObject<Item> WRENCH = REGISTRY.register("wrench", () -> new WrenchItem());
	public static final RegistryObject<Item> CONSTRUCTIONTABLE = block(McmergeModBlocks.CONSTRUCTIONTABLE, McmergeModTabs.TAB_MCMERGE);
	public static final RegistryObject<Item> DRILL = REGISTRY.register("drill", () -> new DrillItem());
	public static final RegistryObject<Item> PLIERS = REGISTRY.register("pliers", () -> new PliersItem());
	public static final RegistryObject<Item> HAMMER = REGISTRY.register("hammer", () -> new HammerItem());
	public static final RegistryObject<Item> MALLET = REGISTRY.register("mallet", () -> new MalletItem());
	public static final RegistryObject<Item> NAILGUN = REGISTRY.register("nailgun", () -> new NailgunItem());
	public static final RegistryObject<Item> CHISEL = REGISTRY.register("chisel", () -> new ChiselItem());
	public static final RegistryObject<Item> CIRCULARSAW = REGISTRY.register("circularsaw", () -> new HandsawItem());
	public static final RegistryObject<Item> SAW = REGISTRY.register("saw", () -> new SawItem());
	public static final RegistryObject<Item> SCREWDRIVER = REGISTRY.register("screwdriver", () -> new ScrewdriverItem());
	public static final RegistryObject<Item> CHERRYSAPLING = REGISTRY.register("cherrysapling", () -> new CherrysaplingItem());
	public static final RegistryObject<Item> ORANGESAPLING = REGISTRY.register("orangesapling", () -> new OrangesaplingItem());
	public static final RegistryObject<Item> PLUMSAPLING = REGISTRY.register("plumsapling", () -> new PlumsaplingItem());
	public static final RegistryObject<Item> PEARSAPLING = REGISTRY.register("pearsapling", () -> new PearsaplingItem());
	public static final RegistryObject<Item> PEACHSAPLING = REGISTRY.register("peachsapling", () -> new PeachsaplingItem());
	public static final RegistryObject<Item> CHERRYPLANT = block(McmergeModBlocks.CHERRYPLANT, McmergeModTabs.TAB_MCMERGE);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
