package net.xDrix0.slimescience.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.xDrix0.slimescience.SlimeScience;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SlimeScience.MODID);

    public static final DeferredItem<Item> SLIMEGUN = ITEMS.register("gun",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
