package net.azureflames.bestiary.item;

import net.azureflames.bestiary.Bestiary;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Bestiary.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab BESTIARY_TAB;

    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        BESTIARY_TAB = event.registerCreativeModeTab(new ResourceLocation(Bestiary.MOD_ID, "bestiary_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.BLACK_OPAL.get()))
                        .title(Component.translatable("creativemodetab.bestiary_tab")));
    }
}
