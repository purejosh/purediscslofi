package net.purejosh.purediscslofi.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;

public class ModItemGroups {

    public static void init() {
        // Discs
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                Items.MUSIC_DISC_PIGSTEP.getDefaultStack(), ModItems.MUSIC_DISC_A_FAMILIAR_ROOM_LOFI.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
            ModItems.MUSIC_DISC_A_FAMILIAR_ROOM_LOFI.getDefaultStack(), ModItems.MUSIC_DISC_BROMELIAD_LOFI.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
            ModItems.MUSIC_DISC_BROMELIAD_LOFI.getDefaultStack(), ModItems.MUSIC_DISC_CRESCENT_DUNES_LOFI.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
            ModItems.MUSIC_DISC_CRESCENT_DUNES_LOFI.getDefaultStack(), ModItems.MUSIC_DISC_ECHO_IN_THE_WIND_LOFI.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
            ModItems.MUSIC_DISC_ECHO_IN_THE_WIND_LOFI.getDefaultStack(), ModItems.MUSIC_DISC_RELIC_LOFI.getDefaultStack()));
    }
}
