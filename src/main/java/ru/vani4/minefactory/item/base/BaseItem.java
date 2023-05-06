package ru.vani4.minefactory.item.base;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import ru.vani4.minefactory.MineFactory;

public class BaseItem {

    private BaseItem(){}

    public static Item register(String name) {
        return Registry.register(Registries.ITEM, new Identifier(MineFactory.MOD_ID, name),
                new Item(new FabricItemSettings()));
    }
}
