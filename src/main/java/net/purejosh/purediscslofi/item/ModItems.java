package net.purejosh.purediscslofi.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.purejosh.purediscslofi.PureDiscsLofi;
import net.purejosh.purediscslofi.sound.ModJukeboxSongs;

public class ModItems {
    // Discs
	public static final Item MUSIC_DISC_A_FAMILIAR_ROOM_LOFI = register("music_disc_a_familiar_room_lofi", new Item(new Item.Settings()
			.maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.A_FAMILIAR_ROOM_LOFI)));
	public static final Item MUSIC_DISC_BROMELIAD_LOFI = register("music_disc_bromeliad_lofi", new Item(new Item.Settings()
			.maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.BROMELIAD_LOFI)));
	public static final Item MUSIC_DISC_CRESCENT_DUNES_LOFI = register("music_disc_crescent_dunes_lofi", new Item(new Item.Settings()
			.maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.CRESCENT_DUNES_LOFI)));
	public static final Item MUSIC_DISC_ECHO_IN_THE_WIND_LOFI = register("music_disc_echo_in_the_wind_lofi", new Item(new Item.Settings()
			.maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ECHO_IN_THE_WIND_LOFI)));
	public static final Item MUSIC_DISC_RELIC_LOFI = register("music_disc_relic_lofi", new Item(new Item.Settings()
			.maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.RELIC_LOFI)));

	// Helper method for registering an item.
	public static Item register(String id, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(PureDiscsLofi.MOD_ID, id), item);
	}

	// Class initializer called from the entrypoint.
	public static void init() {
	}
}