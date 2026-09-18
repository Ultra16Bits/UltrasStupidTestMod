package ultra.testmod.net.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.item.Item;
import ultra.testmod.net.TestMod;

import java.util.function.Function;

public class ModItems {
    public static final Item SALTS = registerItem("salts", Item::new, new Item.Settings());

    public static Item registerItem(String path, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of("salts", TestMod.MOD_ID));
        return Items.register(registryKey,factory,settings);
    }

    public static void registerModItems() {
        TestMod.LOGGER.info("Registering Mod Items for" + TestMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(SALTS);
        });
    }
}