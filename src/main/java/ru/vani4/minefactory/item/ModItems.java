package ru.vani4.minefactory.item;

import lombok.extern.slf4j.Slf4j;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import ru.vani4.minefactory.item.base.BaseItem;
import ru.vani4.minefactory.item.services.ModItemsService;

@Slf4j
public class ModItems {

    public static final Item SILVER_INGOT = BaseItem.register("silver_ingot");
    public static final Item SILVER_NUGGET = BaseItem.register("silver_nugget");

    private static void addItemsToGroups() {
        ModItemsService.addToGroups(SILVER_INGOT, ItemGroups.INGREDIENTS, ModItemGroups.MINE_FACTORY);
        ModItemsService.addToGroups(SILVER_NUGGET, ItemGroups.INGREDIENTS, ModItemGroups.MINE_FACTORY);
    }

    public static void register() {
        addItemsToGroups();
        log.info("Registered all items!");
    }
}