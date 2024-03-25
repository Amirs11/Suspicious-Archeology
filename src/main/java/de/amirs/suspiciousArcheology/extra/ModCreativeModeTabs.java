package de.amirs.suspiciousArcheology.extra;

import de.amirs.suspiciousArcheology.SuspiciousArcheologyMod;
import de.amirs.suspiciousArcheology.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SuspiciousArcheologyMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ARCHEOLOGY_TAB = CREATIVE_MODE_TABS.register("archeology_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SHANOR.get()))
                    .title(Component.translatable("creativetab.archeology_tab"))
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SHANOR.get());
                        pOutput.accept(ModItems.SHANOR_CRUMBS.get());
                    }))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
