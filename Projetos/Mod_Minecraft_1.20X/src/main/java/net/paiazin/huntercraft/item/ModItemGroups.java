package net.paiazin.huntercraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.paiazin.huntercraft.HunterCraft;

public class ModItemGroups {
        public static final ItemGroup HUNTER_GROUP = Registry.register(
                Registries.ITEM_GROUP,
                new Identifier(HunterCraft.MOD_ID, "hunter"),
                FabricItemGroup.builder()
                        .displayName(Text.translatable("itemgroup.hunter"))
                        .icon(() -> new ItemStack(ModItems.HUNTER_LICENSE))
                        .entries((displayContext, entries) -> {
                            entries.add(ModItems.HUNTER_LICENSE);
                            entries.add(ModItems.HUNTER_LICENSE_RED);
                            entries.add(ModItems.HUNTER_LICENSE_GRAY);
                            entries.add(ModItems.HUNTER_LICENSE_GREEN);
                            entries.add(ModItems.HUNTER_LICENSE_PURPLE);
                            entries.add(ModItems.HUNTER_LICENSE_PINK);
                            entries.add(ModItems.GON_FISHING_ROD);

                        })
                        .build()
        );

    public static void registerItemGroups(){
        HunterCraft.LOGGER.info("Registering item Groups for " +HunterCraft.MOD_ID);
    }
}
