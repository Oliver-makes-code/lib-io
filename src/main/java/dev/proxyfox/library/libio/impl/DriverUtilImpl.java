package dev.proxyfox.library.libio.impl;

import dev.proxyfox.library.libio.api.audio.AudioDriver;
import dev.proxyfox.library.libio.api.display.DisplayDriver;
import dev.proxyfox.library.libio.api.input.InputDriver;
import dev.proxyfox.library.libio.impl.audio.NopAudioDriver;
import dev.proxyfox.library.libio.impl.display.NopDisplayDriver;
import dev.proxyfox.library.libio.impl.input.NopInputDriver;

public class DriverUtilImpl {
    public static AudioDriver nopAudio = new NopAudioDriver();
    public static DisplayDriver nopDisplay = new NopDisplayDriver();
    public static InputDriver nopInput = new NopInputDriver();

    public static AudioDriver fetchAudioDriver() {
        return nopAudio;
    }

    public static DisplayDriver fetchDisplayDriver() {
        return nopDisplay;
    }

    public static InputDriver fetchInputDriver() {
        return nopInput;
    }
}
