/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.purejosh.purediscslofi.init;

import net.purejosh.purediscslofi.item.MusicDiscRelicLofiItem;
import net.purejosh.purediscslofi.item.MusicDiscEchoInTheWindLofiItem;
import net.purejosh.purediscslofi.item.MusicDiscCrescentDunesLofiItem;
import net.purejosh.purediscslofi.item.MusicDiscBromeliadLofiItem;
import net.purejosh.purediscslofi.item.MusicDiscAFamiliarRoomLofiItem;
import net.purejosh.purediscslofi.PurediscslofiMod;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class PurediscslofiModItems {
	public static Item MUSIC_DISC_A_FAMILIAR_ROOM_LOFI;
	public static Item MUSIC_DISC_BROMELIAD_LOFI;
	public static Item MUSIC_DISC_CRESCENT_DUNES_LOFI;
	public static Item MUSIC_DISC_ECHO_IN_THE_WIND_LOFI;
	public static Item MUSIC_DISC_RELIC_LOFI;

	public static void load() {
		MUSIC_DISC_A_FAMILIAR_ROOM_LOFI = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PurediscslofiMod.MODID, "music_disc_a_familiar_room_lofi"), new MusicDiscAFamiliarRoomLofiItem());
		MUSIC_DISC_BROMELIAD_LOFI = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PurediscslofiMod.MODID, "music_disc_bromeliad_lofi"), new MusicDiscBromeliadLofiItem());
		MUSIC_DISC_CRESCENT_DUNES_LOFI = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PurediscslofiMod.MODID, "music_disc_crescent_dunes_lofi"), new MusicDiscCrescentDunesLofiItem());
		MUSIC_DISC_ECHO_IN_THE_WIND_LOFI = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PurediscslofiMod.MODID, "music_disc_echo_in_the_wind_lofi"), new MusicDiscEchoInTheWindLofiItem());
		MUSIC_DISC_RELIC_LOFI = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PurediscslofiMod.MODID, "music_disc_relic_lofi"), new MusicDiscRelicLofiItem());
	}

	public static void clientLoad() {
	}
}
