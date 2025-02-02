package net.rayandev.italianfood.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class MozzarellaItem extends Item{
    public MozzarellaItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("itemTooltip.italianfood.mozzarella").formatted(Formatting.GOLD));
        super.appendTooltip(stack, context, tooltip, type);
    }}
