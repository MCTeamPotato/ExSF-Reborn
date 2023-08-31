package team.teampotato.ExSFReborn.items.Materials;

import net.minecraft.tags.ItemTags;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;
import team.teampotato.ExSFReborn.items.ExSFRebornItem;


import java.util.function.Supplier;

public enum ToolsMaterials implements Tier {
    AMETHYST(2, 300, 6.0F, 0.0F, 20, () -> Ingredient.of(Items.AMETHYST_SHARD)),
    COPPER(2, 250, 6.0F, 2.0F, 14, () -> Ingredient.of(Items.COPPER_INGOT)),
    ExSFItem(4, 8192, 50.0F, 4.0F, 15, () -> Ingredient.of(ExSFRebornItem.food_nether_stick.get().asItem()));

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ToolsMaterials(int Level, int Durability, float Speed, float Damage, int EnchantmentValue, Supplier<Ingredient> supplier) {
        this.level = Level;
        this.uses = Durability;
        this.speed = Speed;
        this.damage = Damage;
        this.enchantmentValue = EnchantmentValue;
        this.repairIngredient = new LazyLoadedValue<>(supplier);
    }

    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public int getLevel() {
        return this.level;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public @NotNull Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
