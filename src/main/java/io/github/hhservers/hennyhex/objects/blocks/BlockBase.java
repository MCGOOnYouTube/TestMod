package io.github.hhservers.hennyhex.objects.blocks;

import io.github.hhservers.hennyhex.Main;
import io.github.hhservers.hennyhex.init.BlockInit;
import io.github.hhservers.hennyhex.init.ItemInit;
import io.github.hhservers.hennyhex.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

    public BlockBase(String name, Material material){
        super(material);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));

    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }

}
