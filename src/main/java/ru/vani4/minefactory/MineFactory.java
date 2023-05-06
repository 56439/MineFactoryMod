package ru.vani4.minefactory;

import net.fabricmc.api.ModInitializer;
import ru.vani4.minefactory.item.ModItems;

public class MineFactory implements ModInitializer {

    public static final String MOD_ID = "mine_factory";

    @Override
    public void onInitialize() {
        ModItems.register();
    }
}