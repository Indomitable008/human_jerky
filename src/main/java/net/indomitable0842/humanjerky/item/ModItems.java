package net.indomitable0842.humanjerky.item;

import net.indomitable0842.humanjerky.HumanJerky;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HumanJerky.MOD_ID);
    public static final RegistryObject<Item> HUMANJERKY = ITEMS.register("humanjerky",
            () -> new Item(new Item.Properties().food(ModFoods.HUMANJERKY)));
    public static final RegistryObject<Item> RAW_HUMANJERKY = ITEMS.register("raw_humanjerky",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_HUMANJERKY)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
