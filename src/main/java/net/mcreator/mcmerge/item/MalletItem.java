
package net.mcreator.mcmerge.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.mcmerge.init.McmergeModTabs;

public class MalletItem extends Item {
	public MalletItem() {
		super(new Item.Properties().tab(McmergeModTabs.TAB_MCMERGE).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
