package ru.vani4.minefactory.item.services;

import lombok.extern.slf4j.Slf4j;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

@Slf4j
public class ModItemsService {

    public static void addToGroups(Item item, ItemGroup... groups) {
        for (ItemGroup group : groups) {
            ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        }
        log.info("Item " + item.getName() + " added to groups");
    }
}
