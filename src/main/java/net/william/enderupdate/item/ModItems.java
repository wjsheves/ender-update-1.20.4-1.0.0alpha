package net.william.enderupdate.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.william.enderupdate.EnderUpdate;

public class ModItems {

    public static final Item TEMP = registerItem("temp", new Item(new FabricItemSettings()));

    private static void addItemsToIngredintTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(TEMP );
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EnderUpdate.MOD_ID, name), item);
    }
    public static void registerModItems() {
        EnderUpdate.LOGGER.info("Registering Items For " + EnderUpdate.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModItems::addItemsToIngredintTabItemGroup);
    }

}
