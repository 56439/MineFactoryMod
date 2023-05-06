package ru.vani4.minefactory.item;

import lombok.extern.slf4j.Slf4j;
import net.minecraft.item.ItemGroup;
import ru.vani4.minefactory.item.base.BaseItemGroup;

@Slf4j
public class ModItemGroups {

    public static final ItemGroup MINE_FACTORY = BaseItemGroup.register("mine_factory", ModItems.SILVER_INGOT);

}