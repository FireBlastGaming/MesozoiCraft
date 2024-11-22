package io.github.fireblastgaming.mesozoicraft;

import io.github.fireblastgaming.mesozoicraft.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MesozoiCraft.MODID)
public class MesozoiCraft {
    public static final String MODID = "mesozoicraft";

    public MesozoiCraft(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, ServerConfig.SPEC, "mesozoicraft-server.toml");
    }

}
