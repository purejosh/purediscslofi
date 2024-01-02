
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.purejosh.purediscslofi.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class PurediscslofiModSounds {
	public static SoundEvent A_FAMILIAR_ROOM_LOFI = SoundEvent.createVariableRangeEvent(new ResourceLocation("purediscslofi", "a_familiar_room_lofi"));
	public static SoundEvent BROMELIAD_LOFI = SoundEvent.createVariableRangeEvent(new ResourceLocation("purediscslofi", "bromeliad_lofi"));
	public static SoundEvent CRESCENT_DUNES_LOFI = SoundEvent.createVariableRangeEvent(new ResourceLocation("purediscslofi", "crescent_dunes_lofi"));
	public static SoundEvent ECHO_IN_THE_WIND_LOFI = SoundEvent.createVariableRangeEvent(new ResourceLocation("purediscslofi", "echo_in_the_wind_lofi"));
	public static SoundEvent RELIC_LOFI = SoundEvent.createVariableRangeEvent(new ResourceLocation("purediscslofi", "relic_lofi"));

	public static void load() {
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("purediscslofi", "a_familiar_room_lofi"), A_FAMILIAR_ROOM_LOFI);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("purediscslofi", "bromeliad_lofi"), BROMELIAD_LOFI);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("purediscslofi", "crescent_dunes_lofi"), CRESCENT_DUNES_LOFI);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("purediscslofi", "echo_in_the_wind_lofi"), ECHO_IN_THE_WIND_LOFI);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("purediscslofi", "relic_lofi"), RELIC_LOFI);
	}
}
