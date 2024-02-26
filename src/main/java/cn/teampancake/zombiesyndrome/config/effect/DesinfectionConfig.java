package cn.teampancake.zombiesyndrome.config.effect;

import net.minecraftforge.common.ForgeConfigSpec;

public class DesinfectionConfig {
    public static final ForgeConfigSpec DESINFECTION_CONFIG;
    public static final ForgeConfigSpec.IntValue DURATION;
    public static final ForgeConfigSpec.BooleanValue VISIBLE, SHOW_ICON;

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
        builder.push("DesinfectionProperties");
        DURATION = builder.defineInRange("TicksDurationOfDesinfectionEffect", 6000, 0, Integer.MAX_VALUE);
        VISIBLE = builder.define("WhetherThisEffectWillRenderAmbientParticles", true);
        SHOW_ICON = builder.define("WhetherTheEffectIconWillBeRenderedInGuis", true);
        builder.pop();
        DESINFECTION_CONFIG = builder.build();
    }
}