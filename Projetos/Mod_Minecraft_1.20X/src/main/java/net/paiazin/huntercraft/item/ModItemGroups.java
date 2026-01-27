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
                        .icon(() -> new ItemStack(ModItems.HUNTERLICENSE))
                        .entries((displayContext, entries) -> {
                            entries.add(ModItems.HUNTERLICENSE);
                            entries.add(ModItems.HUNTERLICENSE1STAR);
                            entries.add(ModItems.HUNTERLICENSE2STAR);
                            entries.add(ModItems.HUNTERLICENSE3STAR);
                        })
                        .build()
        );

    public static void registerItemGroups(){
        HunterCraft.LOGGER.info("Registering item Groups for " +HunterCraft.MOD_ID);
    }
}
