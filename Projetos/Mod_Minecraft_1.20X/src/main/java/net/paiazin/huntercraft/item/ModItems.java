package net.paiazin.huntercraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.paiazin.huntercraft.HunterCraft;

public class ModItems {
    public static final Item HUNTER_LICENSE = registerItem("hunter_license",
            new Item(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item HUNTER_LICENSE_RED = registerItem("hunter_license_red",
            new Item(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item HUNTER_LICENSE_GRAY = registerItem("hunter_license_gray",
            new Item(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item HUNTER_LICENSE_GREEN = registerItem("hunter_license_green",
            new Item(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item HUNTER_LICENSE_PURPLE = registerItem("hunter_license_purple",
            new Item(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item HUNTER_LICENSE_PINK = registerItem("hunter_license_pink",
            new Item(new FabricItemSettings().maxCount(1).fireproof()));

    public static final Item GON_FISHING_ROD = registerItem("gon_fishing_rod",
            new Item(new FabricItemSettings().maxCount(1)));

    private static void addItemsToIngredientTabGroup(FabricItemGroupEntries entries){

    }
    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(HunterCraft.MOD_ID, name), item);

    }

    public static void registerModItems(){
        HunterCraft.LOGGER.info("Registering Mod items for"+HunterCraft.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabGroup);
    }
}
