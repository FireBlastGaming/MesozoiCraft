package io.github.fireblastgaming.mesozoicraft;

import net.minecraftforge.common.ForgeConfigSpec;

public class ServerConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> TRIASSIC_PERIOD;
    public static final ForgeConfigSpec.ConfigValue<Boolean> JURASSIC_PERIOD;
    public static final ForgeConfigSpec.ConfigValue<Boolean> CRETACEOUS_PERIOD;

    static {
        BUILDER.push("MesozoiCraft Configs");

        TRIASSIC_PERIOD = BUILDER
                .comment("This is the toggle to enable the Triassic Period")
                .define("Triassic Period", true);

        JURASSIC_PERIOD = BUILDER
                .comment("This is the toggle to enable the Jurassic Period")
                .define("Jurassic Period", true);

        CRETACEOUS_PERIOD = BUILDER
                .comment("This is the toggle to enable the Cretaceous Period")
                .define("Cretaceous Period", true);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
