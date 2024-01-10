package hibi.blahaj;

import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod(Common.MOD_ID)
public class Common {
	public static final String MOD_ID = "blahaj";

	public Common() {
		DeferredRegister<Item> items = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

		registerCuddlyItem(items, "blue_shark", "item.blahaj.blue_shark.tooltip");
		registerCuddlyItem(items, "bread", null);
		registerCuddlyItem(items, "gray_shark", "item.blahaj.gray_shark.tooltip");
		registerCuddlyItem(items, "blue_whale", "item.blahaj.blue_whale.tooltip");
		registerCuddlyItem(items, "pink_shark", "item.blahaj.pink_shark.tooltip");

		items.register(FMLJavaModLoadingContext.get().getModEventBus());
	}

	private static void registerCuddlyItem(DeferredRegister<Item> items, String name, String tooltip) {
		items.register(name, () -> new CuddlyItem(new Item.Properties().stacksTo(1),
				tooltip));
	}

	// Need to implement smth so the items are in a blahaj tab in creative mode. But
	// noo idea how
}
