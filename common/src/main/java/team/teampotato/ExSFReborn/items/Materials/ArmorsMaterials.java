package team.teampotato.ExSFReborn.items.Materials;


import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.ArmorMaterial;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.entity.EquipmentSlot;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum ArmorsMaterials implements ArmorMaterial {

    AMETHYST("amethyst", 25, new int[]{2, 5, 6, 2}, 20, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, () -> Ingredient.of(Items.AMETHYST_SHARD)),
    COPPER("copper", 25, new int[]{2, 5, 6, 2}, 10, SoundEvents.ARMOR_EQUIP_IRON, 3.0F, 0.1F, () -> Ingredient.of(Items.COPPER_INGOT)),
    ExSF("exsf", 37, new int[]{3, 6, 8, 3}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> Ingredient.of(Items.NETHERITE_INGOT))
    ;

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private ArmorsMaterials(String Name, int DurabilityMultiplier, int[] SlotProtections, int EnchantmentValue, SoundEvent Sound, float Toughness, float KnockbackResistance, Supplier<Ingredient>  supplier) {
        this.name = Name;
        this.durabilityMultiplier = DurabilityMultiplier;
        this.slotProtections = SlotProtections;
        this.enchantmentValue = EnchantmentValue;
        this.sound = Sound;
        this.toughness = Toughness;
        this.knockbackResistance = KnockbackResistance;
        this.repairIngredient = new LazyLoadedValue(supplier);
    }

    public int getDurabilityForSlot(EquipmentSlot equipmentSlot) {
        return HEALTH_PER_SLOT[equipmentSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot equipmentSlot) {
        return this.slotProtections[equipmentSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public @NotNull SoundEvent getEquipSound() {
        return this.sound;
    }

    public @NotNull Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }

    public @NotNull String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
