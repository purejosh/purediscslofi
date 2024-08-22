package net.purejosh.purediscslofi.sound;

import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.purejosh.purediscslofi.PureDiscsLofi;

public interface ModJukeboxSongs {

    RegistryKey<JukeboxSong> A_FAMILIAR_ROOM_LOFI = of("a_familiar_room_lofi");
    RegistryKey<JukeboxSong> BROMELIAD_LOFI = of("bromeliad_lofi");
    RegistryKey<JukeboxSong> CRESCENT_DUNES_LOFI = of("crescent_dunes_lofi");
    RegistryKey<JukeboxSong> ECHO_IN_THE_WIND_LOFI = of("echo_in_the_wind_lofi");
    RegistryKey<JukeboxSong> RELIC_LOFI = of("relic_lofi");

    private static RegistryKey<JukeboxSong> of(String id) {
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(PureDiscsLofi.MOD_ID, id));
    }
}
