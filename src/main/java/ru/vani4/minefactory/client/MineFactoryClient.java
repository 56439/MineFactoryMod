package ru.vani4.minefactory.client;

import lombok.extern.slf4j.Slf4j;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Slf4j
@Environment(EnvType.CLIENT)
public class MineFactoryClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        log.warn("MineFactoryClient initializer");
    }
}
