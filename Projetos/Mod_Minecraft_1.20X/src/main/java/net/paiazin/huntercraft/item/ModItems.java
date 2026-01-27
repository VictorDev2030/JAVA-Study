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
    public static final Item HUNTERLICENSE = registerItem("hunterlicense", new Item(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item HUNTERLICENSE1STAR = registerItem("hunterlicense1star", new Item(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item HUNTERLICENSE2STAR = registerItem("hunterlicense2star", new Item(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item HUNTERLICENSE3STAR = registerItem("hunterlicense3star", new Item(new FabricItemSettings().maxCount(1).fireproof()));


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
