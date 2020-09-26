package io.github.hhservers.hennyhex.init;

import io.github.hhservers.hennyhex.world.biomes.BiomeHenny;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BiomeInit {

    public static final Biome HENNY = new BiomeHenny();

    public static void registerBiomes(){
        initBiome(HENNY, "Henny", BiomeManager.BiomeType.DESERT, BiomeDictionary.Type.DRY, BiomeDictionary.Type.HOT, BiomeDictionary.Type.MAGICAL);
    }

    private static Biome initBiome(Biome biome, String name, BiomeManager.BiomeType biomeType, BiomeDictionary.Type... types){
        biome.setRegistryName(name);
        ForgeRegistries.BIOMES.register(biome);
        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addBiome(biomeType, new BiomeManager.BiomeEntry(biome, 10));
        BiomeManager.addSpawnBiome(biome);
        return biome;
    }
}
