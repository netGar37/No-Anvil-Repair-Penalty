package me.tmshader.noRepairPenalty;

//MOD_ID modified by netGar

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoRepairPenalty implements ModInitializer {
    public static final String MOD_ID = "no-anvil-repair-penalty";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Anvil repair penalties have been removed!");
    }
}
