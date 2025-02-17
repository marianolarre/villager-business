package net.marum.villagebusiness.pricing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.marum.villagebusiness.VillageBusiness;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeManager;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import static net.marum.villagebusiness.VillageBusiness.SERVER;

public class ItemPrices {
  public static Map<Item, ItemPrice> priceList = createPriceList();

  static final int NUGGET = 1;
  static final int EMERALD = 9;
  static final int BLOCK = 81;

  public static Map<Item, ItemPrice> createPriceList() {

    /*Map<Item, ItemPrice> map = Maps.<Item, ItemPrice>newLinkedHashMap();
      // Wood
      addPrice(map, Items.STICK, 1*NUGGET, 4, 50, 60);
      addPrice(map, ItemTags.PLANKS, 1*EMERALD, 32, 75, 45);
      addPrice(map, ItemTags.LOGS, 1*EMERALD, 8, 75, 45);
      addPriceBulk(map, new ArrayList<>(Arrays.asList(
        Items.STRIPPED_ACACIA_LOG,
        Items.STRIPPED_ACACIA_WOOD,
        Items.STRIPPED_BAMBOO_BLOCK,
        Items.STRIPPED_BIRCH_LOG,
        Items.STRIPPED_BIRCH_WOOD,
        Items.STRIPPED_CHERRY_LOG,
        Items.STRIPPED_CHERRY_WOOD,
        Items.STRIPPED_CRIMSON_HYPHAE,
        Items.STRIPPED_CRIMSON_STEM,
        Items.STRIPPED_DARK_OAK_LOG,
        Items.STRIPPED_DARK_OAK_WOOD,
        Items.STRIPPED_JUNGLE_LOG,
        Items.STRIPPED_JUNGLE_WOOD,
        Items.STRIPPED_MANGROVE_LOG,
        Items.STRIPPED_MANGROVE_WOOD,
        Items.STRIPPED_OAK_LOG,
        Items.STRIPPED_OAK_WOOD,
        Items.STRIPPED_SPRUCE_LOG,
        Items.STRIPPED_SPRUCE_WOOD,
        Items.STRIPPED_WARPED_HYPHAE,
        Items.STRIPPED_WARPED_STEM
      )),  2*NUGGET+1*EMERALD, 8, 75, 45);
      addPrice(map, ItemTags.WOODEN_BUTTONS, 1*NUGGET, 2, 25, 120);
      addPrice(map, ItemTags.WOODEN_DOORS, 1*NUGGET, 1, 50, 120);
      addPrice(map, ItemTags.WOODEN_SLABS, 1*EMERALD, 18, 50, 120);
      addPrice(map, ItemTags.WOODEN_STAIRS, 1*EMERALD, 24, 75, 120);
      addPrice(map, ItemTags.WOODEN_FENCES, 1*EMERALD, 18, 75, 120);
      addPrice(map, ItemTags.WOODEN_PRESSURE_PLATES, 1*NUGGET, 2, 25, 120);
      addPrice(map, ItemTags.BOATS, 1*EMERALD, 1, 10, 1200);
      addPrice(map, Items.MANGROVE_ROOTS, 1*EMERALD, 16, 25, 240);
      addPrice(map, Items.AZALEA, 1*EMERALD, 4, 50);

      // Farm Animals
      addPrice(map, Items.EGG, 4*NUGGET, 16, 75, 60);
      addPrice(map, Items.FEATHER, 1*EMERALD, 32, 75, 60);
      addPrice(map, Items.TURTLE_EGG, 2*EMERALD, 16, 50, 180);
      addPrice(map, Items.SNIFFER_EGG, 16*EMERALD, 1, 25, 360);
      addPrice(map, ItemTags.WOOL, 1*EMERALD, 20, 75, 120);
      addPrice(map, ItemTags.WOOL_CARPETS, 1*EMERALD, 10, 75, 120);
      addPrice(map, Items.LEATHER, 1*EMERALD, 8, 75);
      addPrice(map, Items.RABBIT_HIDE, 1*EMERALD, 10, 50);
      addPrice(map, Items.RABBIT_FOOT, 8*EMERALD, 1, 50, 480);

      // Dirts
      addPrice(map, Items.DIRT, 1*NUGGET, 64, 25, 240);
      addPrice(map, Items.MUD, 2*NUGGET, 64, 25, 240);
      addPrice(map, Items.GRAVEL, 5*NUGGET, 64, 25, 240);
      addPrice(map, Items.SAND, 5*NUGGET, 64, 25, 240);
      addPrice(map, Items.RED_SAND, 6*NUGGET, 64, 25, 240);
      addPrice(map, Items.GRASS_BLOCK, 1*EMERALD, 64, 25, 240);
      addPrice(map, Items.PODZOL, 1*EMERALD, 64, 15, 240);
      addPrice(map, Items.MYCELIUM, 1*EMERALD, 64, 15, 240);
      addPrice(map, Items.CLAY, 1*EMERALD, 32, 50);
      addPrice(map, Items.CLAY_BALL, 2*NUGGET, 32, 75);
      addPrice(map, Items.SOUL_SAND, 1*EMERALD, 32, 25, 240);
      addPrice(map, Items.SOUL_SOIL, 1*EMERALD, 32, 25, 240);

      // Stones
      addPrice(map, Items.STONE, 2*NUGGET+1*EMERALD, 64, 50);
      addPrice(map, Items.ANDESITE, 1*EMERALD, 32, 50);
      addPrice(map, Items.GRANITE, 1*EMERALD, 32, 50);
      addPrice(map, Items.DIORITE, 1*EMERALD, 32, 25);
      addPrice(map, Items.TUFF, 1*EMERALD, 32, 25);
      addPrice(map, Items.COBBLESTONE, 1*EMERALD, 64, 50);
      addPrice(map, Items.OBSIDIAN, 1*EMERALD, 4, 25);
      addPrice(map, Items.CRYING_OBSIDIAN, 4*EMERALD, 4, 25, 480);
      addPrice(map, Items.DEEPSLATE, 4*EMERALD, 64, 50);
      addPrice(map, Items.DRIPSTONE_BLOCK, 4*EMERALD, 64, 50);
      addPrice(map, Items.POINTED_DRIPSTONE, 1*EMERALD, 16, 50, 480);
      addPrice(map, Items.COBBLED_DEEPSLATE, 4*EMERALD, 64, 50);
      addPrice(map, Items.SANDSTONE, 5*NUGGET, 16, 50);
      addPrice(map, Items.RED_SANDSTONE, 6*NUGGET, 16, 50);

      addPrice(map, Items.GLOWSTONE, 2*EMERALD, 8, 75);
      addPrice(map, Items.GLOWSTONE_DUST, 2*EMERALD, 32, 75);
      addPrice(map, Items.END_STONE, 4*EMERALD, 32, 50, 240);
      addPrice(map, Items.NETHERRACK, 1*EMERALD, 64, 50, 240);
      addPrice(map, Items.WARPED_NYLIUM, 1*EMERALD, 32, 50, 240);
      addPrice(map, Items.CRIMSON_NYLIUM, 1*EMERALD, 32, 50, 240);
      addPrice(map, Items.WARPED_WART_BLOCK, 1*EMERALD, 32, 50, 240);
      addPrice(map, Items.BASALT, 4*NUGGET+1*EMERALD, 32, 50);
      addPrice(map, Items.BLACKSTONE, 2*EMERALD, 32, 50);
      addPrice(map, Items.GILDED_BLACKSTONE, 1*EMERALD, 4, 50);

      addPrice(map, ItemTags.TERRACOTTA, 1*EMERALD, 32, 50, 120);

      // Ores
      addPrice(map, Items.COPPER_ORE, 1*EMERALD, 4, 50);
      addPrice(map, Items.DEEPSLATE_COPPER_ORE, 2*NUGGET+1*EMERALD, 4, 50);
      addPrice(map, Items.IRON_ORE, 1*EMERALD, 4, 75);
      addPrice(map, Items.DEEPSLATE_IRON_ORE, 2*NUGGET+1*EMERALD, 4, 75);
      addPrice(map, Items.GOLD_ORE, 1*EMERALD, 3, 75);
      addPrice(map, Items.NETHER_GOLD_ORE, 1*EMERALD, 8, 50);
      addPrice(map, Items.DEEPSLATE_GOLD_ORE, 2*NUGGET+1*EMERALD, 3, 75);
      addPrice(map, Items.DIAMOND_ORE, 3*EMERALD, 1, 75);
      addPrice(map, Items.DEEPSLATE_DIAMOND_ORE, 2*NUGGET+3*EMERALD, 1, 75);
      addPrice(map, Items.COAL_ORE, 1*EMERALD, 8, 75);
      addPrice(map, Items.DEEPSLATE_COAL_ORE, 2*NUGGET+1*EMERALD, 8, 75);
      addPrice(map, Items.LAPIS_ORE, 1*EMERALD, 2, 75);
      addPrice(map, Items.DEEPSLATE_LAPIS_ORE, 2*NUGGET+1*EMERALD, 2, 75);
      addPrice(map, Items.ANCIENT_DEBRIS, 16*EMERALD, 1, 75);
      addPrice(map, Items.EMERALD_ORE, 2*EMERALD, 1, 25, 480);
      addPrice(map, Items.DEEPSLATE_EMERALD_ORE, 4*EMERALD, 1, 25, 960);
      addPrice(map, Items.REDSTONE_ORE, 1*EMERALD, 3, 75);
      addPrice(map, Items.DEEPSLATE_REDSTONE_ORE, 2*NUGGET+1*EMERALD, 3, 75);

      addPrice(map, Items.AMETHYST_SHARD, 1*EMERALD, 2, 50, 240);
      addPrice(map, Items.AMETHYST_BLOCK, 1*EMERALD, 8, 25, 240);
      addPrice(map, Items.CALCITE, 1*EMERALD, 16, 35, 240);

      addPrice(map, Items.NETHER_QUARTZ_ORE, 1*EMERALD, 2, 50);

      addPrice(map, Items.RAW_COPPER, 1*NUGGET, 1, 75);
      addPrice(map, Items.RAW_COPPER_BLOCK, 1*EMERALD, 1, 75);
      addPrice(map, Items.COPPER_INGOT, 2*NUGGET, 1, 75);
      addPrice(map, Items.COPPER_BLOCK, 2*EMERALD, 1, 75);
      addPrice(map, Items.EXPOSED_COPPER, 3*EMERALD, 1, 75);
      addPrice(map, Items.WEATHERED_COPPER, 4*EMERALD, 1, 75);
      addPrice(map, Items.OXIDIZED_COPPER, 6*EMERALD, 1, 75);

      addPrice(map, Items.LAPIS_LAZULI, 2*EMERALD, 8, 75, 180);
      addPrice(map, Items.LAPIS_BLOCK, 2*BLOCK, 8, 75, 180);

      addPrice(map, Items.RAW_IRON, 2*NUGGET, 1, 75, 180);
      addPrice(map, Items.RAW_IRON_BLOCK, 2*EMERALD, 1, 75, 180);
      addPrice(map, Items.IRON_INGOT, 2*NUGGET, 1, 75, 60);
      addPrice(map, Items.IRON_NUGGET, 2*NUGGET, 9, 75, 60);
      
      addPrice(map, Items.RAW_GOLD, 3*NUGGET, 1, 75, 180);
      addPrice(map, Items.RAW_GOLD_BLOCK, 3*EMERALD, 1, 75, 180);
      addPrice(map, Items.GOLD_INGOT, 3*NUGGET, 1, 75, 60);
      addPrice(map, Items.GOLD_NUGGET, 3*NUGGET, 9, 75, 60);
      
      addPrice(map, Items.DIAMOND, 2*EMERALD, 1, 75, 30);
      addPrice(map, Items.DIAMOND_BLOCK, 2*BLOCK, 1, 75, 30);

      addPrice(map, Items.COAL, 1*EMERALD, 16, 75);
      addPrice(map, Items.COAL_BLOCK, 1*BLOCK, 16, 75);
      addPrice(map, Items.REDSTONE, 1*EMERALD, 960);
      addPrice(map, Items.QUARTZ, 1*EMERALD, 960);
      addPrice(map, Items.NETHERITE_SCRAP, 16*EMERALD, 1, 75);
      addPrice(map, Items.NETHERITE_INGOT, 70*EMERALD, 1, 75);

      // Plants
      addPrice(map, ItemTags.SAPLINGS, 1*NUGGET, 4, 50, 120);
      addPrice(map, ItemTags.LEAVES, 1*NUGGET, 6, 50, 120);
      addPrice(map, Items.GRASS, 1*NUGGET, 6, 25, 240);
      addPrice(map, Items.SEAGRASS, 1*NUGGET, 6, 25, 240);
      addPrice(map, Items.TALL_GRASS, 1*NUGGET, 6, 25, 240);
      addPrice(map, Items.LARGE_FERN, 2*NUGGET, 1, 25, 240);
      addPrice(map, Items.FERN, 1*NUGGET, 1, 25, 240);
      addPrice(map, Items.NETHER_SPROUTS, 1*NUGGET, 1, 25, 240);
      addPrice(map, Items.SMALL_DRIPLEAF, 3*NUGGET, 1, 50, 240);
      addPrice(map, Items.BIG_DRIPLEAF, 4*NUGGET, 1, 50, 240);
      addPrice(map, Items.SPORE_BLOSSOM, 1*EMERALD, 1, 50, 240);
      addPrice(map, Items.GLOW_LICHEN, 2*NUGGET, 4, 25, 240);
      addPrice(map, Items.HANGING_ROOTS, 1*NUGGET, 1, 25, 240);
      addPrice(map, Items.ROOTED_DIRT, 1*NUGGET, 1, 10, 240);
      addPrice(map, Items.CRIMSON_ROOTS, 2*NUGGET, 1, 25, 240);
      addPrice(map, Items.WARPED_ROOTS, 2*NUGGET, 1, 25, 240);
      addPrice(map, Items.DEAD_BUSH, 3*NUGGET, 2, 25, 240);
      addPrice(map, ItemTags.FLOWERS, 1*NUGGET, 4, 50, 60);
      addPrice(map, Items.RED_MUSHROOM, 1*EMERALD, 32, 50);
      addPrice(map, Items.BROWN_MUSHROOM, 1*EMERALD, 32, 50);
      addPrice(map, Items.MUSHROOM_STEM, 1*EMERALD, 16, 50);
      addPrice(map, Items.RED_MUSHROOM_BLOCK, 1*EMERALD, 16, 50);
      addPrice(map, Items.BROWN_MUSHROOM_BLOCK, 1*EMERALD, 16, 50);
      addPrice(map, Items.VINE, 1*NUGGET, 8, 50);
      addPrice(map, Items.LILY_PAD, 4*NUGGET, 4, 50);
      addPrice(map, Items.WEEPING_VINES, 2*NUGGET, 8, 50);
      addPrice(map, Items.TWISTING_VINES, 2*NUGGET, 8, 50);
      addPrice(map, Items.SEA_PICKLE, 2*NUGGET, 8, 50, 180);
      addPrice(map, Items.CACTUS, 1*NUGGET, 16, 50, 180);
      addPrice(map, Items.MOSS_BLOCK, 1*NUGGET, 16, 50, 180);
      addPrice(map, Items.CHORUS_FRUIT, 2*NUGGET, 8, 50);
      addPrice(map, Items.CHORUS_PLANT, 2*NUGGET, 8, 50);
      addPrice(map, Items.CHORUS_FLOWER, 2*NUGGET, 8, 50);
      addPrice(map, Items.WITHER_ROSE, 4*EMERALD, 1, 25, 360);

      // Crops
      addPrice(map, Items.WHEAT, 1*EMERALD, 32, 50, 60);
      addPrice(map, Items.POTATO, 1*EMERALD, 32, 50, 60);
      addPrice(map, Items.POISONOUS_POTATO, 1*NUGGET, 1, 1, 5);
      addPrice(map, Items.CARROT, 1*EMERALD, 32, 50, 60);
      addPrice(map, Items.BEETROOT, 1*EMERALD, 24, 25, 60);
      addPrice(map, Items.PUMPKIN, 1*EMERALD, 16, 50, 60);
      addPrice(map, Items.CARVED_PUMPKIN, 1*EMERALD, 1, 50, 480);
      addPrice(map, Items.MELON, 1*EMERALD, 12, 50, 60);
      addPrice(map, Items.MELON_SLICE, 1*NUGGET, 12, 50, 60);
      addPrice(map, Items.KELP, 1*EMERALD, 64, 50, 60);
      addPrice(map, Items.SUGAR_CANE, 1*EMERALD, 32, 50, 60);
      addPrice(map, Items.APPLE, 1*EMERALD, 16, 50, 60);
      addPrice(map, Items.SUSPICIOUS_STEW, 4*NUGGET, 1, 25, 240);
      addPrice(map, Items.NETHER_WART, 1*EMERALD, 24, 50);
      addPrice(map, Items.BAMBOO, 1*EMERALD, 48, 50);
      addPrice(map, Items.SWEET_BERRIES, 1*EMERALD, 32, 50);
      addPrice(map, Items.GLOW_BERRIES, 1*EMERALD, 16, 50);

      addPrice(map, Items.WARPED_FUNGUS, 1*EMERALD, 6, 50);
      addPrice(map, Items.CRIMSON_FUNGUS, 1*EMERALD, 6, 50);
      
      addPrice(map, Items.COCOA_BEANS, 1*EMERALD, 8, 75, 60);
      addPrice(map, Items.WHEAT_SEEDS, 1*NUGGET, 16, 50);
      addPrice(map, Items.BEETROOT_SEEDS, 1*NUGGET, 16, 50);
      addPrice(map, Items.PUMPKIN_SEEDS, 1*NUGGET, 16, 50);
      addPrice(map, Items.MELON_SEEDS, 1*NUGGET, 16, 50);
      addPrice(map, Items.TORCHFLOWER, 4*EMERALD, 1, 50);
      addPrice(map, Items.TORCHFLOWER_SEEDS, 1*EMERALD, 1, 50);
      addPrice(map, Items.PITCHER_PLANT, 4*EMERALD, 1, 50);
      addPrice(map, Items.PITCHER_POD, 1*EMERALD, 1, 50);

      // Meats
      addPrice(map, Items.CHICKEN, 1*EMERALD, 16, 50, 60);
      addPrice(map, Items.RABBIT, 1*EMERALD, 4, 50, 60);
      addPrice(map, Items.PORKCHOP, 1*EMERALD, 8, 50, 60);
      addPrice(map, Items.BEEF, 1*EMERALD, 10, 50, 60);
      addPrice(map, Items.MUTTON, 1*EMERALD, 8, 50, 60);
      addPrice(map, Items.COD, 1*EMERALD, 16, 50, 60);
      addPrice(map, Items.SALMON, 1*EMERALD, 8, 50, 60);
      addPrice(map, Items.SALMON_BUCKET, 5*NUGGET+1*EMERALD, 1, 50, 60);
      addPrice(map, Items.TADPOLE_BUCKET, 1*EMERALD, 1, 25, 480);
      addPrice(map, Items.COD_BUCKET, 1*EMERALD, 1, 50, 60);

      // Misc
      addPrice(map, Items.COBWEB, 1*NUGGET, 2, 25);
      addPrice(map, Items.HONEYCOMB, 1*EMERALD, 480);
      addPrice(map, Items.HONEY_BOTTLE, 1*EMERALD, 480);
      addPrice(map, ItemTags.MUSIC_DISCS, 32*EMERALD, 1, 75, 120);
      addPrice(map, Items.ICE, 1*EMERALD, 32, 50, 45);
      addPrice(map, ItemTags.TRIM_TEMPLATES, 16*BLOCK, 1, 75, 1200);
      addPrice(map, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, 32*BLOCK, 1, 75, 1200);
      addPrice(map, Items.NETHER_STAR, 32*BLOCK, 1, 75, 1200);
      addPrice(map, Items.SPONGE, 16*EMERALD, 1, 75);
      addPrice(map, Items.WET_SPONGE, 16*EMERALD, 1, 25);
      addPrice(map, Items.CHARCOAL, 1*EMERALD, 24, 75);
      addPrice(map, Items.FLINT, 3*NUGGET, 32, 50);
      addPrice(map, Items.SADDLE, 8*EMERALD, 1, 50, 240);
      addPrice(map, Items.NAME_TAG, 8*EMERALD, 1, 50, 240);
      addPrice(map, Items.SNOWBALL, 1*NUGGET, 16, 50);
      addPrice(map, Items.WATER_BUCKET, 1*EMERALD, 1, 75, 60);
      addPrice(map, Items.LAVA_BUCKET, 2*EMERALD, 1, 50);
      addPrice(map, Items.MILK_BUCKET, 2*NUGGET+1*EMERALD, 1, 75, 60);
      addPrice(map, Items.POWDER_SNOW_BUCKET, 2*NUGGET+1*EMERALD, 1, 50);
      addPrice(map, Items.EMERALD, 1*EMERALD, 1, 0, 960);
      addPrice(map, VillagerBusinessItemInit.EMERALD_NUGGET, 1*NUGGET, 1, 0, 960);
      addPrice(map, Items.EMERALD_BLOCK, 1*BLOCK, 1, 0, 960);
      addPrice(map, Items.ECHO_SHARD, 32*EMERALD, 1, 50, 480);
      addPrice(map, Items.NAUTILUS_SHELL, 32*EMERALD, 1, 90, 480);
      addPrice(map, Items.HEART_OF_THE_SEA, 48*EMERALD, 1, 90, 480);
      addPrice(map, Items.ENCHANTED_GOLDEN_APPLE, 32*EMERALD, 1, 50, 240);
      addPrice(map, Items.TOTEM_OF_UNDYING, 2*64*EMERALD, 1, 90, 1200);
      addPrice(map, Items.DRAGON_HEAD, 3*64*EMERALD, 1, 90, 1200);
      addPrice(map, Items.BELL, 16*EMERALD, 1, 90, 480);
      addPrice(map, Items.DRAGON_EGG, 6*64*EMERALD, 1, 90, 1200);
      addPrice(map, Items.DRAGON_BREATH, 1*EMERALD, 1, 75, 240);
      addPrice(map, Items.ELYTRA, 5*64*EMERALD, 1, 90, 1200);
      addPrice(map, ItemTags.DECORATED_POT_INGREDIENTS, 48*EMERALD, 1, 25, 240);
      addPrice(map, Items.GOAT_HORN, 48*EMERALD, 1, 25, 240);
      addPrice(map, Items.FIREWORK_STAR, 5*NUGGET, 1, 25);

      addPrice(map, Items.CHIPPED_ANVIL, 20*EMERALD, 1, 25, 480);
      addPrice(map, Items.DAMAGED_ANVIL, 16*EMERALD, 1, 10, 240);

      // Mob drops
      addPrice(map, Items.STRING, 1*EMERALD, 20, 50);
      addPrice(map, Items.ROTTEN_FLESH, 1*NUGGET, 32, 10, 240);
      addPrice(map, Items.BONE, 1*EMERALD, 32, 25);
      addPrice(map, Items.ENDER_PEARL, 1*EMERALD, 1, 25);
      addPrice(map, Items.GUNPOWDER, 1*EMERALD, 4, 50);
      addPrice(map, Items.SLIME_BALL, 1*EMERALD, 32, 25, 240);
      addPrice(map, Items.BLAZE_ROD, 1*EMERALD, 2, 75, 180);
      addPrice(map, Items.GHAST_TEAR, 4*EMERALD, 1, 75, 180);
      addPrice(map, Items.SHULKER_SHELL, 16*EMERALD, 2, 50);
      addPrice(map, Items.PRISMARINE_CRYSTALS, 8*EMERALD, 8, 75);
      addPrice(map, Items.PRISMARINE_SHARD, 4*EMERALD, 8, 50);
      addPrice(map, Items.SCUTE, 1*EMERALD, 1, 50);
      addPrice(map, Items.SPIDER_EYE, 1*EMERALD, 6, 50);
      addPrice(map, Items.WITHER_SKELETON_SKULL, 48*EMERALD, 1, 10, 480);
      addPrice(map, Items.SKELETON_SKULL, 20*EMERALD, 1, 10, 480);
      addPrice(map, Items.ZOMBIE_HEAD, 16*EMERALD, 1, 10, 480);
      addPrice(map, Items.CREEPER_HEAD, 32*EMERALD, 1, 10, 480);
      addPrice(map, Items.PIGLIN_HEAD, 32*EMERALD, 1, 10, 480);
      addPrice(map, Items.PLAYER_HEAD, 1*EMERALD, 1, 10, 480);
      addPrice(map, Items.LEATHER_HORSE_ARMOR, 1*EMERALD, 1, 25, 480);
      addPrice(map, Items.IRON_HORSE_ARMOR, 4*EMERALD, 1, 25, 480);
      addPrice(map, Items.GOLDEN_HORSE_ARMOR, 8*EMERALD, 1, 25, 480);
      addPrice(map, Items.DIAMOND_HORSE_ARMOR, 16*EMERALD, 1, 25, 480);
      addPrice(map, Items.DIAMOND_HORSE_ARMOR, 16*EMERALD, 1, 25, 480);
      addPrice(map, Items.FROGSPAWN, 1*EMERALD, 4, 25, 960);
      addPrice(map, Items.PHANTOM_MEMBRANE, 1*EMERALD, 1, 25, 480);

      addPrice(map, Items.GLOW_INK_SAC, 1*EMERALD, 2, 50);
      addPrice(map, Items.INK_SAC, 1*EMERALD, 8, 50);
      addPrice(map, Items.PEARLESCENT_FROGLIGHT, 1*EMERALD, 4, 50, 240);
      addPrice(map, Items.VERDANT_FROGLIGHT, 1*EMERALD, 4, 50, 240);
      addPrice(map, Items.OCHRE_FROGLIGHT, 1*EMERALD, 4, 50, 240);
      addPrice(map, Items.SHROOMLIGHT, 1*EMERALD, 6, 50, 240);
      addPrice(map, Items.NETHER_STAR, 320*EMERALD, 1, 50, 1200);

      addPrice(map, Items.CHAINMAIL_BOOTS, 4*EMERALD, 1, 25, 480);
      addPrice(map, Items.CHAINMAIL_LEGGINGS, 7*EMERALD, 1, 25, 480);
      addPrice(map, Items.CHAINMAIL_CHESTPLATE, 8*EMERALD, 1, 25, 480);
      addPrice(map, Items.CHAINMAIL_HELMET, 5*EMERALD, 1, 25, 480);

      addPrice(map, Items.BEEHIVE, 5*EMERALD, 1, 25, 960);
      addPrice(map, Items.BEE_NEST, 8*EMERALD, 1, 10, 960);

      addPrice(map, Items.TRIDENT, 32*EMERALD, 1, 10, 960);

      addPrice(map, Items.EXPERIENCE_BOTTLE, 2*EMERALD, 1, 50);
      addPrice(map, Items.FILLED_MAP, 14*NUGGET, 1, 50);

      // Sculk
      addPrice(map,Items.SCULK, 4*EMERALD, 16, 25, 480);
      addPrice(map,Items.SCULK_SENSOR, 4*EMERALD, 1, 25, 480);
      addPrice(map,Items.SCULK_CATALYST, 4*EMERALD, 1, 25, 480);
      addPrice(map,Items.SCULK_SHRIEKER, 4*EMERALD, 1, 25, 480);
      addPrice(map,Items.SCULK_VEIN, 1*EMERALD, 8, 10, 480);

      // Colors
      addPriceBulk(map, new ArrayList<>(Arrays.asList(
        Items.RED_DYE, Items.ORANGE_DYE, Items.YELLOW_DYE, Items.LIME_DYE, Items.GREEN_DYE, Items.CYAN_DYE, Items.BLUE_DYE, Items.LIGHT_BLUE_DYE, Items.PURPLE_DYE, Items.MAGENTA_DYE, Items.WHITE_DYE, Items.LIGHT_GRAY_DYE, Items.GRAY_DYE, Items.BLACK_DYE, Items.PINK_DYE, Items.BROWN_DYE
      )), 2*NUGGET+1*EMERALD, 8, 75, 45);
      addPriceBulk(map, new ArrayList<>(Arrays.asList(
        Items.SHULKER_BOX, Items.RED_SHULKER_BOX, Items.ORANGE_SHULKER_BOX, Items.YELLOW_SHULKER_BOX, Items.LIME_SHULKER_BOX, Items.GREEN_SHULKER_BOX, Items.CYAN_SHULKER_BOX, Items.BLUE_SHULKER_BOX, Items.LIGHT_BLUE_SHULKER_BOX, Items.PURPLE_SHULKER_BOX, Items.MAGENTA_SHULKER_BOX, Items.WHITE_SHULKER_BOX, Items.LIGHT_GRAY_SHULKER_BOX, Items.GRAY_SHULKER_BOX, Items.BLACK_SHULKER_BOX, Items.PINK_SHULKER_BOX, Items.BROWN_SHULKER_BOX
      )), 18*EMERALD, 1, 50, 120);
      addPriceBulk(map, new ArrayList<>(Arrays.asList(
        Items.RED_CONCRETE, Items.ORANGE_CONCRETE, Items.YELLOW_CONCRETE, Items.LIME_CONCRETE, Items.GREEN_CONCRETE, Items.CYAN_CONCRETE, Items.BLUE_CONCRETE, Items.LIGHT_BLUE_CONCRETE, Items.PURPLE_CONCRETE, Items.MAGENTA_CONCRETE, Items.WHITE_CONCRETE, Items.LIGHT_GRAY_CONCRETE, Items.GRAY_CONCRETE, Items.BLACK_CONCRETE, Items.PINK_CONCRETE, Items.BROWN_CONCRETE
      )), 1*EMERALD, 16, 50, 120);

      // Coral
      addPriceBulk(map, new ArrayList<>(Arrays.asList(
        Items.BUBBLE_CORAL, Items.TUBE_CORAL, Items.BRAIN_CORAL, Items.FIRE_CORAL, Items.HORN_CORAL
      )), 1*EMERALD, 4, 50, 480);
      addPriceBulk(map, new ArrayList<>(Arrays.asList(
        Items.DEAD_BUBBLE_CORAL, Items.DEAD_TUBE_CORAL, Items.DEAD_BRAIN_CORAL, Items.DEAD_FIRE_CORAL, Items.DEAD_HORN_CORAL
      )), 1*EMERALD, 6, 25, 480);
      addPriceBulk(map, new ArrayList<>(Arrays.asList(
        Items.BUBBLE_CORAL_BLOCK, Items.TUBE_CORAL_BLOCK, Items.BRAIN_CORAL_BLOCK, Items.FIRE_CORAL_BLOCK, Items.HORN_CORAL_BLOCK
      )), 1*EMERALD, 4, 50, 480);
      addPriceBulk(map, new ArrayList<>(Arrays.asList(
        Items.DEAD_BUBBLE_CORAL_BLOCK, Items.DEAD_TUBE_CORAL_BLOCK, Items.DEAD_BRAIN_CORAL_BLOCK, Items.DEAD_FIRE_CORAL_BLOCK, Items.DEAD_HORN_CORAL_BLOCK
      )), 1*EMERALD, 6, 25, 480);
      addPriceBulk(map, new ArrayList<>(Arrays.asList(
        Items.BUBBLE_CORAL_FAN, Items.TUBE_CORAL_FAN, Items.BRAIN_CORAL_FAN, Items.FIRE_CORAL_FAN, Items.HORN_CORAL_FAN
      )), 1*EMERALD, 4, 50, 480);
      addPriceBulk(map, new ArrayList<>(Arrays.asList(
        Items.DEAD_BUBBLE_CORAL_FAN, Items.DEAD_TUBE_CORAL_FAN, Items.DEAD_BRAIN_CORAL_FAN, Items.DEAD_FIRE_CORAL_FAN, Items.DEAD_HORN_CORAL_FAN
      )), 1*EMERALD, 6, 25, 480);

      addPriceBulk(map, new ArrayList<>(Arrays.asList(
        Items.PIGLIN_BANNER_PATTERN, Items.GLOBE_BANNER_PATTERN
      )), 16*EMERALD, 1, 75, 1200);

      // Feesh
      addPrice(map, Items.PUFFERFISH, 1*EMERALD, 4, 50, 60);
      addPrice(map, Items.PUFFERFISH_BUCKET, 2*EMERALD, 1, 50, 60);
      addPrice(map, Items.TROPICAL_FISH, 2*EMERALD, 1, 50, 60);
      addPrice(map, Items.TROPICAL_FISH_BUCKET, 2*EMERALD, 1, 50, 60);
      addPrice(map, Items.AXOLOTL_BUCKET, 16*EMERALD, 1, 50, 960);

      // Netherite
      addPrice(map, Items.NETHERITE_AXE, 306*EMERALD, 1, 25, 1200);
      addPrice(map, Items.NETHERITE_BOOTS, 308*EMERALD, 1, 25, 1200);
      addPrice(map, Items.NETHERITE_CHESTPLATE, 316*EMERALD, 1, 25, 1200);
      addPrice(map, Items.NETHERITE_HELMET, 310*EMERALD, 1, 25, 1200);
      addPrice(map, Items.NETHERITE_HOE, 304*EMERALD, 1, 25, 1200);
      addPrice(map, Items.NETHERITE_LEGGINGS, 314*EMERALD, 1, 25, 1200);
      addPrice(map, Items.NETHERITE_PICKAXE, 306*EMERALD, 1, 25, 1200);
      addPrice(map, Items.NETHERITE_SHOVEL, 302*EMERALD, 1, 25, 1200);
      addPrice(map, Items.NETHERITE_SWORD, 304*EMERALD, 1, 25, 1200);

      // Needs further pricing
      addPrice(map, Items.WRITTEN_BOOK, 1*EMERALD, 1, 50);
      addPrice(map, Items.TIPPED_ARROW, 1*EMERALD, 1, 50);
      addPrice(map, Items.POTION, 5*EMERALD, 1, 50);
      addPrice(map, Items.SPLASH_POTION, 3*NUGGET+5*EMERALD, 1, 50);
      addPrice(map, Items.LINGERING_POTION, 6*EMERALD, 1, 50);
      addPrice(map, Items.ENCHANTED_BOOK, 5*EMERALD, 1, 50);
      addPrice(map, Items.BUNDLE, 5*NUGGET, 1, 50, 480);

      // Debug
      HashMap<String, String> entries = new HashMap<String,String>();
      for (Map.Entry<Item, ItemPrice> entry : map.entrySet()) {
        ItemPrice value = entry.getValue();
        int requestChance = value.getSaleChance(1);
        requestChance = Math.max(1, Math.min(requestChance/5, 10));
        entries.put(entry.getKey().toString(), value.getPrice(1)+","+value.getSellAmount(1)+","+value.getSaleChance(1)+","+requestChance+","+value.getCooldown(1));
      }
      
       String content = entries.toString();
        Path filePath = Path.of("output.txt");

        try {
            Files.write(filePath, content.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("File written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }*/

      Map<Item, ItemPrice> map = new HashMap<Item, ItemPrice>();

      for (String key : VillageBusiness.CONFIG.getKeySet()) {
        String value = VillageBusiness.CONFIG.getOrDefault(key, "");
        String[] parts = value.split(",", 5);
        if (parts.length == 5) {
          int price = Integer.parseInt(parts[0]);
          int amount = Integer.parseInt(parts[1]);
          int saleChance = Integer.parseInt(parts[2]);
          int requestChance = Integer.parseInt(parts[3]);
          int cooldown = Integer.parseInt(parts[4]);
          addPrice(map, Registries.ITEM.get(new Identifier(key)), price, amount, saleChance, requestChance, cooldown);
        }
      }

      // Procedurally generate missing craftable item's prices
      getAllRecipes(map);

      return map;
  }

  private static void addPrice(Map<Item, ItemPrice> prices, TagKey<Item> tag, int price, int sellAmount,  int saleChance, int requestChance, int cooldown) {
    for (RegistryEntry<Item> registryEntry : Registries.ITEM.iterateEntries(tag)) {
      prices.put(registryEntry.value(), new ItemPrice((Item)registryEntry.value(), price, sellAmount, saleChance, requestChance, cooldown));
    }
  }

  private static void addPrice(Map<Item, ItemPrice> prices, ItemConvertible item, int price) {
    Item item2 = item.asItem();
        prices.put(item2, new ItemPrice((Item)item, price));
  }

  private static void addPrice(Map<Item, ItemPrice> prices, ItemConvertible item, int price, int sellAmount) {
    Item item2 = item.asItem();
        prices.put(item2, new ItemPrice((Item)item, price, sellAmount));
  }

  private static void addPrice(Map<Item, ItemPrice> prices, ItemConvertible item, int price, int sellAmount, int saleChance) {
    Item item2 = item.asItem();
        prices.put(item2, new ItemPrice((Item)item, price, sellAmount, saleChance));
  }

  private static void addPrice(Map<Item, ItemPrice> prices, ItemConvertible item, int price, int sellAmount,  int saleChance, int requestChance, int cooldown) {
    Item item2 = item.asItem();
        prices.put(item2, new ItemPrice((Item)item, price, sellAmount, saleChance, requestChance, cooldown));
  }

  private static void addPriceBulk(Map<Item, ItemPrice> prices, List<ItemConvertible> items, int price, int sellAmount,  int saleChance, int requestChance, int cooldown) {
    for (ItemConvertible item : items) {
      Item item2 = item.asItem();
        prices.put(item2, new ItemPrice((Item)item, price, sellAmount, saleChance, requestChance, cooldown));
    }
  }

  private static void getAllRecipes(Map<Item, ItemPrice> map) {
    if (SERVER == null) return;
    DynamicRegistryManager registryManager = SERVER.getRegistryManager();

    List<String> itemsWithoutPrice = new ArrayList<String>();
    for (Identifier id : Registries.ITEM.getIds()) {
      itemsWithoutPrice.add(id.toString());
    }

    Map<Item, ItemPrice> primeProducts = new HashMap<Item, ItemPrice>();
    for (Map.Entry<Item, ItemPrice> entry : map.entrySet()) {
      primeProducts.put(entry.getKey(), entry.getValue());
      String id = Registries.ITEM.getId(entry.getKey()).toString();
      if (itemsWithoutPrice.contains(id)) {
        itemsWithoutPrice.remove(id);
      }
    }

    RecipeManager recipeManager = SERVER.getRecipeManager();
    
    boolean stillNeedRecipes = true;
    int safety = 0;

    while (stillNeedRecipes && safety < 5) {
      stillNeedRecipes = false;
      for (Recipe<?> recipe : recipeManager.values()) {
        ItemStack output = recipe.getOutput(registryManager);
        if (map.containsKey(output.getItem())) {
          continue;
        }

        Item outputItem = output.getItem();

        if (primeProducts.containsKey(outputItem)) {
          // Skip prime product
          continue;
        }

        int outputCount = output.getCount();
        float totalIngredientCost = 0f;
        int minIngredientSaleChance = 100;
        int minIngredientRequestChance = 100;
        int maxIngredientCooldown = 0;
        boolean allIngredientsHavePrices = true;
        for (Ingredient ingredient : recipe.getIngredients()) {
          boolean ingredientHasPrice = false;
          float cheapestIngredient = 99999999;
          if (!ingredient.isEmpty()) {
            for (ItemStack stack : ingredient.getMatchingStacks()) {
              if (map.containsKey(stack.getItem())) {
                ItemPrice itemPrice = map.get(stack.getItem());
                float ingredientCost = 1.0f*itemPrice.getPrice(1)/itemPrice.getSellAmount(1);
                if (ingredientCost != 0) {
                  ingredientHasPrice = true;
                  if (ingredientCost < cheapestIngredient) {
                    cheapestIngredient = ingredientCost;
                  }
                  if (itemPrice.getSaleChance(1) < minIngredientSaleChance) {
                    minIngredientSaleChance = itemPrice.getSaleChance(1);
                  }
                  if (itemPrice.getRequestChance() < minIngredientRequestChance) {
                    minIngredientRequestChance = itemPrice.getRequestChance();
                  }
                  if (itemPrice.getCooldown(1) > maxIngredientCooldown) {
                    maxIngredientCooldown = itemPrice.getCooldown(1);
                  }
                }
              }
            }
            if (!ingredientHasPrice) {
              allIngredientsHavePrices = false;
              stillNeedRecipes = true;
              break;
            }
            totalIngredientCost += cheapestIngredient;
          }
        }
        if (allIngredientsHavePrices) {
          totalIngredientCost /= outputCount;
          int sellAmount = 1;
          if (totalIngredientCost > 0) {
            while (totalIngredientCost < 1) {
              sellAmount *= 2;
              totalIngredientCost *= 2;
            }
            if (!map.containsKey(outputItem) || (Math.round(totalIngredientCost) < map.get(outputItem).getPrice(1)/map.get(outputItem).getSellAmount(1))) {
              map.put(outputItem, new ItemPrice(outputItem, Math.round(totalIngredientCost), sellAmount, minIngredientSaleChance, minIngredientRequestChance, maxIngredientCooldown));
              String id = Registries.ITEM.getId(outputItem).toString();
              if (itemsWithoutPrice.contains(id)) {
                itemsWithoutPrice.remove(id);
              }
            }
          }
        }
      }
      safety += 1;
    }
  }
}
