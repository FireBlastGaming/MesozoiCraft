package net.fireblastg.mesozoicraft.item;

import net.fireblastg.mesozoicraft.MesozoiCraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MesozoiCraft.MOD_ID);

    public static final RegistryObject<Item> TEST_TUBE = ITEMS.register("test_tube",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MESOZOICRAFT_TAB).stacksTo(16)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
