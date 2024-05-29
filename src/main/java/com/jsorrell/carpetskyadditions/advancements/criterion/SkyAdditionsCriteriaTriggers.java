package com.jsorrell.carpetskyadditions.advancements.criterion;

import net.minecraft.advancements.CriteriaTriggers;

public class SkyAdditionsCriteriaTriggers {
    public static final GenerateGeodeTrigger GENERATE_GEODE = new GenerateGeodeTrigger();
    public static final ConvertSpiderTrigger CONVERT_SPIDER = new ConvertSpiderTrigger();
    public static final AllayVexTrigger ALLAY_VEX = new AllayVexTrigger();

    public static void registerAll() {
        CriteriaTriggers.register("carpetskyadditions:generate_geode", GENERATE_GEODE);
        CriteriaTriggers.register("carpetskyadditions:convert_spider", CONVERT_SPIDER);
        CriteriaTriggers.register("carpetskyadditions:allay_vex", ALLAY_VEX);
    }
}
