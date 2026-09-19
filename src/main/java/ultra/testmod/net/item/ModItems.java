package ultra.testmod.net.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.item.Item;
import ultra.testmod.net.TestMod;
import net.minecraft.component.type.ConsumableComponent;

public class ModItems {
    public static final Item BATH_SALTS = registerItem("bath_salts", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(TestMod.MOD_ID,"bath_salts"))).food(ModFoodComponents.BATH_SALTS,ModConsumableComponents.BATH_SALTS)));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TestMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TestMod.LOGGER.info("Registering Mod Items for" + TestMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(BATH_SALTS);
        });
    }
}