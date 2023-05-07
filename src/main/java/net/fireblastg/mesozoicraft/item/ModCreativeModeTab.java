package net.fireblastg.mesozoicraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MESOZOICRAFT_TAB = new CreativeModeTab("mesozoicraft_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.TEST_TUBE.get());
        }
    };
}
