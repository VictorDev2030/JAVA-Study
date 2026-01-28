package net.paiazin.huntercraft.item;

import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class GonFishingRodItem extends SwordItem {

    public GonFishingRodItem(
            ToolMaterial material,
            int attackDamage,
            float attackSpeed,
            Settings settings
    ) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public void appendTooltip(
            ItemStack stack,
            World world,
            List<Text> tooltip,
            TooltipContext context
    ) {
        tooltip.add(
                Text.translatable("item.huntercraft.gon_fishing_rod.tooltip")
                        .formatted(Formatting.GRAY, Formatting.ITALIC)
        );
    }
}
