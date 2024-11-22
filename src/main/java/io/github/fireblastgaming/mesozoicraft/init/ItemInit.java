package io.github.fireblastgaming.mesozoicraft.init;

import io.github.fireblastgaming.mesozoicraft.MesozoiCraft;
import net.minecraft.world.item.BrushItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MesozoiCraft.MODID);

    public static final RegistryObject<Item> EXCAVATION_BRUSH = ITEMS.register("excavation_brush",
            () -> new BrushItem(new Item.Properties()
                    .stacksTo(1)
                    .durability(100)
                    .rarity(Rarity.COMMON)
            ));

}
