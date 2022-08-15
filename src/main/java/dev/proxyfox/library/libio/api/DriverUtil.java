package dev.proxyfox.library.libio.api;

import dev.proxyfox.library.libio.api.audio.AudioDriver;
import dev.proxyfox.library.libio.api.display.DisplayDriver;
import dev.proxyfox.library.libio.api.input.InputDriver;
import dev.proxyfox.library.libio.impl.DriverUtilImpl;
import dev.proxyfox.library.libio.impl.audio.NopAudioDriver;
import dev.proxyfox.library.libio.impl.display.NopDisplayDriver;
import dev.proxyfox.library.libio.impl.input.NopInputDriver;

/**
 * The main class for fetching drivers from programs that provide such drivers
 * @see AudioDriver
 * @see DisplayDriver
 * @see InputDriver
 *
 * @author Oliver-makes-code
 * */
public class DriverUtil {
    /**
     * Fetches the first registered Audio driver, if none is found, it defaults to {@link NopAudioDriver}
     * @see AudioDriver
     * */
    public static AudioDriver fetchAudioDriver() {
        return DriverUtilImpl.fetchAudioDriver();
    }

    /**
     * Fetches the first registered Display driver, if none is found, it defaults to {@link NopDisplayDriver}
     * @see DisplayDriver
     * */
    public static DisplayDriver fetchDisplayDriver() {
        return DriverUtilImpl.fetchDisplayDriver();
    }

    /**
     * Fetches the first registered Input driver, if none is found, it defaults to {@link NopInputDriver}
     * @see InputDriver
     * */
    public static InputDriver fetchInputDriver() {
        return DriverUtilImpl.fetchInputDriver();
    }
}
