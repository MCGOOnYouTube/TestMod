package io.github.hhservers.hennyhex.init;

import io.github.hhservers.hennyhex.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block BLOCK_HENNY = new BlockBase("block_henny", Material.IRON);
}
