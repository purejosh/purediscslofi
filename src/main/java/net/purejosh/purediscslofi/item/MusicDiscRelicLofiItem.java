
package net.purejosh.purediscslofi.item;

import net.purejosh.purediscslofi.init.PurediscslofiModSounds;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.network.chat.Component;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import java.util.List;

public class MusicDiscRelicLofiItem extends RecordItem {
	public MusicDiscRelicLofiItem() {
		super(0, PurediscslofiModSounds.RELIC_LOFI, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5462);
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(content -> content.accept(this));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A77Remix by: Monolism"));
	}
}
