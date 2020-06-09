package io.github.boogiemonster1o1.tutorial;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Init implements ModInitializer{

    public static final FoodComponent EGGPLANT_FOOD = new FoodComponent.Builder().hunger(1).saturationModifier(5).snack().build();

    public static final Item EGGPLANT = new Item(new Item.Settings().group(ItemGroup.FOOD));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("tutorial","eggplant"), EGGPLANT);
    }

}