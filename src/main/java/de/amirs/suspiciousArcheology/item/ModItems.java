package de.amirs.suspiciousArcheology.item;

import de.amirs.suspiciousArcheology.SuspiciousArcheologyMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SuspiciousArcheologyMod.MOD_ID);

    public static final RegistryObject<Item> SHANOR = ITEMS.register("shanor",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHANOR_CRUMBS = ITEMS.register("shanor_crumbs",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
