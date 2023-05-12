package net.fireblastg.mesozoicraft.init.block;

import net.fireblastg.mesozoicraft.MesozoiCraft;
import net.fireblastg.mesozoicraft.init.Tabs;
import net.fireblastg.mesozoicraft.init.item.ItemInit;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MesozoiCraft.MOD_ID);

    public static final RegistryObject<GlassBlock> COMPACT_GLASS = registerBlock("compact_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.of(Material.GLASS).strength(0.6F).explosionResistance(0.6F).requiresCorrectToolForDrops().sound(SoundType.GLASS).noOcclusion()), Tabs.MESOZOICRAFT_TAB);

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);

        return  toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
