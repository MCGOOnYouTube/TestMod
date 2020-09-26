package io.github.hhservers.hennyhex.objects.items;

import io.github.hhservers.hennyhex.Main;
import io.github.hhservers.hennyhex.init.ItemInit;
import io.github.hhservers.hennyhex.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
    public ItemBase(String name){
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
