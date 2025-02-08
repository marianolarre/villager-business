package net.marum.villagebusiness.config;

import net.marum.villagebusiness.config.SimpleConfig.DefaultConfig;

public class VillageBusinessPricesConfigProvider implements DefaultConfig {

    @Override
    public String get(String namespace) {
        return "idk what this does";
    }

    static String empty(String namespace) {
        return """
request_price_multiplier=2
request_cooldown_multiplier=2

# Price list
# item_id = price , amount , sellChance , requestChance, cooldown
# (price is in emerald nuggets, 9 is an emerald, 81 is an emerald block)
# (amount is how many of the product gets sold in a single transaction)
# (sellChance is a number from 0 to 100, how likely are villagers to buy your product)
# (requestChance is a number from 0 to 100, how likely are villagers to fulfill your request)
# (cooldown is how many seconds the villager will wait before trying to buy again)

mod:minecraft
acacia_boat=9,1,10,2,600
acacia_button=1,2,25,5,60
acacia_chest_boat=9,1,10,2,600
acacia_door=1,1,50,10,60
acacia_fence=9,18,75,10,60
acacia_leaves=1,6,50,10,60
acacia_log=9,8,75,20,20
acacia_planks=9,32,75,20,20
acacia_pressure_plate=1,2,25,5,60
acacia_sapling=1,4,50,10,60
acacia_slab=9,18,50,10,60
acacia_stairs=9,24,75,10,60
acacia_wood=9,8,75,10,20
allium=1,4,50,10,30
amethyst_block=9,8,25,5,120
amethyst_shard=9,2,50,10,120
ancient_debris=144,1,75,10,60
andesite=9,32,50,10,60
angler_pottery_sherd=432,1,25,1,120
apple=9,16,50,15,30
archer_pottery_sherd=432,1,25,1,120
arms_up_pottery_sherd=432,1,25,1,120
axolotl_bucket=144,1,50,10,480
azalea=1,4,50,10,60
azalea_leaves=1,6,50,10,60
azure_bluet=1,4,50,10,30
bamboo=9,48,50,10,60
bamboo_button=1,2,25,5,60
bamboo_chest_raft=9,1,10,2,600
bamboo_door=1,1,50,10,60
bamboo_fence=9,18,75,10,60
bamboo_planks=9,32,75,20,20
bamboo_pressure_plate=1,2,25,5,60
bamboo_raft=9,1,10,2,600
bamboo_slab=9,18,50,10,60
bamboo_stairs=9,24,75,10,60
basalt=13,32,50,10,60
bee_nest=72,1,10,2,480
beef=9,10,50,10,30
beehive=45,1,25,5,480
beetroot=9,24,25,5,30
beetroot_seeds=1,16,50,10,60
bell=144,1,90,10,240
big_dripleaf=4,1,50,10,120
birch_boat=9,1,10,2,600
birch_button=1,2,25,5,60
birch_chest_boat=9,1,10,2,600
birch_door=1,1,50,10,60
birch_fence=9,18,75,10,60
birch_leaves=1,6,50,10,60
birch_log=9,8,75,20,20
birch_planks=9,32,75,20,20
birch_pressure_plate=1,2,25,5,60
birch_sapling=1,4,50,10,60
birch_slab=9,18,50,10,60
birch_stairs=9,24,75,10,60
birch_wood=9,8,75,10,20
black_carpet=9,10,75,10,60
black_concrete=9,16,50,10,60
black_dye=11,8,75,10,20
black_shulker_box=162,1,50,10,60
black_terracotta=9,32,50,10,60
black_wool=9,20,75,20,60
blackstone=18,32,50,10,60
blade_pottery_sherd=432,1,25,1,120
blaze_rod=9,2,75,1,90
blue_carpet=9,10,75,10,60
blue_concrete=9,16,50,10,60
blue_dye=11,8,75,10,20
blue_orchid=1,4,50,10,30
blue_shulker_box=162,1,50,10,60
blue_terracotta=9,32,50,10,60
blue_wool=9,20,75,20,60
bone=9,32,25,5,60
brain_coral=9,4,50,5,240
brain_coral_block=9,4,50,5,240
brain_coral_fan=9,4,50,5,240
brewer_pottery_sherd=432,1,25,1,120
brick=432,1,25,5,120
brown_carpet=9,10,75,10,60
brown_concrete=9,16,50,10,60
brown_dye=11,8,75,10,20
brown_mushroom=9,32,50,10,60
brown_mushroom_block=9,16,50,10,60
brown_shulker_box=162,1,50,10,60
brown_terracotta=9,32,50,10,60
brown_wool=9,20,75,20,60
bubble_coral=9,4,50,5,240
bubble_coral_block=9,4,50,5,240
bubble_coral_fan=9,4,50,5,240
bundle=5,1,50,10,240
burn_pottery_sherd=432,1,25,1,120
cactus=1,16,50,10,90
calcite=9,16,35,7,120
carrot=9,32,50,10,30
carved_pumpkin=9,1,50,10,240
chainmail_boots=36,1,25,5,240
chainmail_chestplate=72,1,25,5,240
chainmail_helmet=45,1,25,5,240
chainmail_leggings=63,1,25,5,240
charcoal=9,24,75,10,60
cherry_boat=9,1,10,2,600
cherry_button=1,2,25,5,60
cherry_chest_boat=9,1,10,2,600
cherry_door=1,1,50,10,60
cherry_fence=9,18,75,10,60
cherry_leaves=1,4,50,10,30
cherry_log=9,8,75,20,20
cherry_planks=9,32,75,20,20
cherry_pressure_plate=1,2,25,5,60
cherry_sapling=1,4,50,10,60
cherry_slab=9,18,50,10,60
cherry_stairs=9,24,75,10,60
cherry_wood=9,8,75,10,20
chicken=9,16,50,10,30
chipped_anvil=180,1,25,5,240
chorus_flower=2,8,50,0,60
chorus_fruit=2,8,50,0,60
chorus_plant=2,8,50,0,60
clay=9,32,50,10,60
clay_ball=2,32,75,10,60
coal=9,16,75,10,60
coal_block=81,16,75,10,60
coal_ore=9,8,75,10,60
coast_armor_trim_smithing_template=1296,1,75,1,600
cobbled_deepslate=36,64,50,10,60
cobblestone=9,64,50,10,60
cobweb=1,2,25,5,60
cocoa_beans=9,8,75,10,30
cod=9,16,50,10,30
cod_bucket=9,1,50,10,30
copper_block=9,1,75,10,60
copper_ingot=1,1,75,10,60
copper_ore=9,8,50,10,60
cornflower=1,4,50,10,30
creeper_head=288,1,10,2,240
crimson_button=1,2,25,1,60
crimson_door=1,1,50,1,60
crimson_fence=9,18,75,1,60
crimson_fungus=9,6,50,1,60
crimson_hyphae=9,8,75,1,20
crimson_nylium=9,32,50,1,120
crimson_planks=9,32,75,1,20
crimson_pressure_plate=1,2,25,1,60
crimson_roots=2,1,25,1,120
crimson_slab=9,18,50,1,60
crimson_stairs=9,24,75,1,60
crimson_stem=9,8,75,1,20
crying_obsidian=36,4,25,5,240
cyan_carpet=9,10,75,10,60
cyan_concrete=9,16,50,10,60
cyan_dye=11,8,75,10,20
cyan_shulker_box=162,1,50,10,60
cyan_terracotta=9,32,50,10,60
cyan_wool=9,20,75,20,60
damaged_anvil=144,1,10,2,120
dandelion=1,4,50,10,30
danger_pottery_sherd=432,1,25,1,120
dark_oak_boat=9,1,10,2,600
dark_oak_button=1,2,25,5,60
dark_oak_chest_boat=9,1,10,2,600
dark_oak_door=1,1,50,10,60
dark_oak_fence=9,18,75,10,60
dark_oak_leaves=1,6,50,10,60
dark_oak_log=9,8,75,20,20
dark_oak_planks=9,32,75,20,20
dark_oak_pressure_plate=1,2,25,5,60
dark_oak_sapling=1,4,50,10,60
dark_oak_slab=9,18,50,10,60
dark_oak_stairs=9,24,75,10,60
dark_oak_wood=9,8,75,10,20
dead_brain_coral=9,6,255,480,0
dead_brain_coral_block=9,6,255,480,0
dead_brain_coral_fan=9,6,255,480,0
dead_bubble_coral=9,6,255,480,0
dead_bubble_coral_block=9,6,255,480,0
dead_bubble_coral_fan=9,6,255,480,0
dead_bush=3,2,25,5,120
dead_fire_coral=9,6,255,480,0
dead_fire_coral_block=9,6,255,480,0
dead_fire_coral_fan=9,6,255,480,0
dead_horn_coral=9,6,255,480,0
dead_horn_coral_block=9,6,255,480,0
dead_horn_coral_fan=9,6,255,480,0
dead_tube_coral=9,6,255,480,0
dead_tube_coral_block=9,6,255,480,0
dead_tube_coral_fan=9,6,255,480,0
deepslate=36,64,50,10,60
deepslate_coal_ore=11,8,75,1,60
deepslate_copper_ore=11,4,50,1,60
deepslate_diamond_ore=29,1,75,1,60
deepslate_emerald_ore=36,1,25,1,480
deepslate_gold_ore=11,3,75,1,60
deepslate_iron_ore=11,4,75,1,60
deepslate_lapis_ore=11,2,75,1,60
deepslate_redstone_ore=11,3,75,1,60
diamond=18,1,75,5,15
diamond_block=162,1,75,2,15
diamond_horse_armor=144,1,25,1,240
diamond_ore=27,1,75,1,60
diorite=9,32,25,5,60
dirt=1,64,25,5,120
dragon_breath=9,1,75,0,120
dragon_egg=3456,1,90,0,600
dragon_head=1728,1,90,0,600
dripstone_block=36,64,50,10,60
dune_armor_trim_smithing_template=1296,1,75,1,600
echo_shard=288,1,50,1,240
egg=4,16,75,10,30
elytra=2880,1,90,0,600
emerald=9,1,0,0,480
emerald_block=81,1,0,0,480
emerald_ore=18,1,25,1,240
enchanted_book=45,1,50,10,60
enchanted_golden_apple=288,1,50,10,120
end_stone=36,32,50,0,120
ender_pearl=9,1,25,2,60
experience_bottle=18,1,50,10,60
explorer_pottery_sherd=432,1,25,1,120
exposed_copper=27,1,75,10,60
eye_armor_trim_smithing_template=1296,1,75,1,600
feather=9,32,75,10,30
fern=1,1,25,5,120
filled_map=14,1,50,0,60
fire_coral=9,4,50,5,240
fire_coral_block=9,4,50,5,240
fire_coral_fan=9,4,50,5,240
firework_star=5,1,25,5,60
flint=3,32,50,10,60
flowering_azalea=1,4,50,10,30
flowering_azalea_leaves=1,4,50,10,30
friend_pottery_sherd=432,1,25,1,120
frogspawn=9,4,25,0,480
ghast_tear=36,1,75,1,90
gilded_blackstone=9,4,50,1,60
globe_banner_pattern=144,1,75,1,600
glow_berries=9,16,50,10,60
glow_ink_sac=9,2,50,10,60
glow_lichen=2,4,25,5,120
glowstone=18,8,75,5,60
glowstone_dust=18,32,75,5,60
goat_horn=432,1,25,5,120
gold_ingot=3,1,75,10,30
gold_nugget=3,9,75,10,30
gold_ore=9,3,75,10,60
golden_horse_armor=72,1,25,5,240
granite=9,32,50,10,60
grass=1,6,25,5,120
grass_block=9,64,25,5,120
gravel=5,64,25,5,120
gray_carpet=9,10,75,10,60
gray_concrete=9,16,50,10,60
gray_dye=11,8,75,10,20
gray_shulker_box=162,1,50,10,60
gray_terracotta=9,32,50,10,60
gray_wool=9,20,75,20,60
green_carpet=9,10,75,10,60
green_concrete=9,16,50,10,60
green_dye=11,8,75,10,20
green_shulker_box=162,1,50,10,60
green_terracotta=9,32,50,10,60
green_wool=9,20,75,20,60
gunpowder=9,4,50,5,60
hanging_roots=1,1,25,5,120
heart_of_the_sea=432,1,90,0,240
heart_pottery_sherd=432,1,25,1,120
heartbreak_pottery_sherd=432,1,25,1,120
honey_bottle=9,4,50,5,60
honeycomb=9,4,50,5,60
horn_coral=9,4,50,5,240
horn_coral_block=9,4,50,5,240
horn_coral_fan=9,4,50,5,240
host_armor_trim_smithing_template=1296,1,75,1,600
howl_pottery_sherd=432,1,25,1,120
ice=9,32,50,10,20
ink_sac=9,8,50,10,60
iron_horse_armor=36,1,25,5,240
iron_ingot=2,1,75,10,30
iron_nugget=2,9,75,10,30
iron_ore=9,4,75,10,60
jungle_boat=9,1,10,2,600
jungle_button=1,2,25,5,60
jungle_chest_boat=9,1,10,2,600
jungle_door=1,1,50,10,60
jungle_fence=9,18,75,10,60
jungle_leaves=1,6,50,10,60
jungle_log=9,8,75,20,20
jungle_planks=9,32,75,20,20
jungle_pressure_plate=1,2,25,5,60
jungle_sapling=1,4,50,10,60
jungle_slab=9,18,50,10,60
jungle_stairs=9,24,75,10,60
jungle_wood=9,8,75,10,20
kelp=9,64,50,10,30
lapis_block=162,8,75,10,90
lapis_lazuli=18,8,75,10,90
lapis_ore=9,2,75,10,60
large_fern=2,1,25,5,120
lava_bucket=18,1,50,5,60
leather=9,8,75,10,60
leather_horse_armor=9,1,25,5,240
light_blue_carpet=9,10,75,10,60
light_blue_concrete=9,16,50,10,60
light_blue_dye=11,8,75,10,20
light_blue_shulker_box=162,1,50,10,60
light_blue_terracotta=9,32,50,10,60
light_blue_wool=9,20,75,20,60
light_gray_carpet=9,10,75,10,60
light_gray_concrete=9,16,50,10,60
light_gray_dye=11,8,75,10,20
light_gray_shulker_box=162,1,50,10,60
light_gray_terracotta=9,32,50,10,60
light_gray_wool=9,20,75,20,60
lilac=1,4,50,10,30
lily_of_the_valley=1,4,50,10,30
lily_pad=4,4,50,10,60
lime_carpet=9,10,75,10,60
lime_concrete=9,16,50,10,60
lime_dye=11,8,75,10,20
lime_shulker_box=162,1,50,10,60
lime_terracotta=9,32,50,10,60
lime_wool=9,20,75,20,60
lingering_potion=54,1,50,10,60
magenta_carpet=9,10,75,10,60
magenta_concrete=9,16,50,10,60
magenta_dye=11,8,75,10,20
magenta_shulker_box=162,1,50,10,60
magenta_terracotta=9,32,50,10,60
magenta_wool=9,20,75,20,60
mangrove_boat=9,1,10,2,600
mangrove_button=1,2,25,5,60
mangrove_chest_boat=9,1,10,2,600
mangrove_door=1,1,50,10,60
mangrove_fence=9,18,75,10,60
mangrove_leaves=1,6,50,10,60
mangrove_log=9,8,75,20,20
mangrove_planks=9,32,75,20,20
mangrove_pressure_plate=1,2,25,5,60
mangrove_propagule=1,4,50,10,30
mangrove_roots=9,16,25,5,120
mangrove_slab=9,18,50,10,60
mangrove_stairs=9,24,75,10,60
mangrove_wood=9,8,75,10,20
melon=9,12,50,10,30
melon_seeds=1,16,50,10,60
melon_slice=1,12,50,10,30
milk_bucket=11,1,75,10,30
miner_pottery_sherd=432,1,25,1,120
moss_block=1,16,50,10,90
mourner_pottery_sherd=432,1,25,1,120
mud=2,64,25,5,120
mushroom_stem=9,16,50,10,60
music_disc_11=288,1,75,10,60
music_disc_13=288,1,75,10,60
music_disc_5=288,1,75,10,60
music_disc_blocks=288,1,75,10,60
music_disc_cat=288,1,75,10,60
music_disc_chirp=288,1,75,10,60
music_disc_far=288,1,75,10,60
music_disc_mall=288,1,75,10,60
music_disc_mellohi=288,1,75,10,60
music_disc_otherside=288,1,75,10,60
music_disc_pigstep=288,1,75,10,60
music_disc_relic=288,1,75,10,60
music_disc_stal=288,1,75,10,60
music_disc_strad=288,1,75,10,60
music_disc_wait=288,1,75,10,60
music_disc_ward=288,1,75,10,60
mutton=9,8,50,10,30
mycelium=9,64,15,3,120
name_tag=72,1,50,10,120
nautilus_shell=288,1,90,10,240
nether_gold_ore=9,8,50,1,60
nether_quartz_ore=9,2,50,1,60
nether_sprouts=1,1,25,5,120
nether_star=2880,1,50,1,600
nether_wart=9,24,50,10,60
netherite_axe=2754,1,25,1,600
netherite_boots=2772,1,25,1,600
netherite_chestplate=2844,1,25,1,600
netherite_helmet=2790,1,25,1,600
netherite_hoe=2736,1,25,15,600
netherite_ingot=630,1,75,1,60
netherite_leggings=2826,1,25,1,600
netherite_pickaxe=2754,1,25,1,600
netherite_scrap=144,1,75,1,60
netherite_shovel=2718,1,25,1,600
netherite_sword=2736,1,25,1,600
netherite_upgrade_smithing_template=2592,1,75,11200,0
netherrack=9,64,50,5,120
oak_boat=9,1,10,2,600
oak_button=1,2,25,5,60
oak_chest_boat=9,1,10,2,600
oak_door=1,1,50,10,60
oak_fence=9,18,75,10,60
oak_leaves=1,6,50,10,60
oak_log=9,8,75,20,20
oak_planks=9,32,75,20,20
oak_pressure_plate=1,2,25,5,60
oak_sapling=1,4,50,10,60
oak_slab=9,18,50,10,60
oak_stairs=9,24,75,10,60
oak_wood=9,8,75,10,20
obsidian=9,4,25,5,60
ochre_froglight=9,4,50,10,120
orange_carpet=9,10,75,10,60
orange_concrete=9,16,50,10,60
orange_dye=11,8,75,10,20
orange_shulker_box=162,1,50,10,60
orange_terracotta=9,32,50,10,60
orange_tulip=1,4,50,10,30
orange_wool=9,20,75,20,60
oxeye_daisy=1,4,50,10,30
oxidized_copper=54,1,75,10,60
pearlescent_froglight=9,4,50,10,120
peony=1,4,50,10,30
phantom_membrane=9,1,25,5,240
piglin_banner_pattern=144,1,75,1,600
piglin_head=288,1,10,1,240
pink_carpet=9,10,75,10,60
pink_concrete=9,16,50,10,60
pink_dye=11,8,75,10,20
pink_petals=1,4,50,10,30
pink_shulker_box=162,1,50,10,60
pink_terracotta=9,32,50,10,60
pink_tulip=1,4,50,10,30
pink_wool=9,20,75,20,60
pitcher_plant=36,1,50,10,60
pitcher_pod=9,1,50,10,60
player_head=9,1,10,2,240
plenty_pottery_sherd=432,1,25,1,120
podzol=9,64,15,3,120
pointed_dripstone=9,16,50,10,240
poisonous_potato=1,1,1,10,60
poppy=1,4,50,10,30
porkchop=9,8,50,10,30
potato=9,32,50,20,30
potion=45,1,50,10,60
powder_snow_bucket=11,1,50,5,60
prismarine_crystals=72,8,75,2,60
prismarine_shard=36,8,50,2,60
prize_pottery_sherd=432,1,25,1,120
pufferfish=9,4,50,20,30
pufferfish_bucket=18,1,50,10,30
pumpkin=9,16,50,10,30
pumpkin_seeds=1,16,50,10,60
purple_carpet=9,10,75,10,60
purple_concrete=9,16,50,10,60
purple_dye=11,8,75,10,20
purple_shulker_box=162,1,50,10,60
purple_terracotta=9,32,50,10,60
purple_wool=9,20,75,20,60
quartz=9,4,50,2,60
rabbit=9,4,50,10,30
rabbit_foot=72,1,50,10,240
rabbit_hide=9,10,50,10,60
raiser_armor_trim_smithing_template=1296,1,75,1,600
raw_copper=1,1,75,10,60
raw_copper_block=9,1,75,10,60
raw_gold=3,1,75,10,90
raw_gold_block=27,1,75,10,90
raw_iron=2,1,75,10,90
raw_iron_block=18,1,75,10,90
red_carpet=9,10,75,10,60
red_concrete=9,16,50,10,60
red_dye=11,8,75,10,20
red_mushroom=9,32,50,10,60
red_mushroom_block=9,16,50,10,60
red_sand=6,64,25,5,120
red_sandstone=6,16,50,10,60
red_shulker_box=162,1,50,10,60
red_terracotta=9,32,50,10,60
red_tulip=1,4,50,10,30
red_wool=9,20,75,20,60
redstone=9,9,50,10,60
redstone_ore=9,3,75,10,60
rib_armor_trim_smithing_template=1296,1,75,1,600
rooted_dirt=1,1,10,2,120
rose_bush=1,4,50,10,30
rotten_flesh=1,32,10,2,120
saddle=72,1,50,10,120
salmon=9,8,50,10,30
salmon_bucket=14,1,50,10,30
sand=5,64,25,5,120
sandstone=5,16,50,10,60
sculk=36,16,25,5,240
sculk_catalyst=36,1,25,5,240
sculk_sensor=36,1,25,5,240
sculk_shrieker=36,1,25,5,240
sculk_vein=9,8,10,2,240
scute=9,1,50,10,60
sea_pickle=2,8,50,10,90
seagrass=1,6,25,5,120
sentry_armor_trim_smithing_template=1296,1,75,1,600
shaper_armor_trim_smithing_template=1296,1,75,1,600
sheaf_pottery_sherd=432,1,25,1,120
shelter_pottery_sherd=432,1,25,1,120
shroomlight=9,6,50,10,120
shulker_box=162,1,50,10,60
shulker_shell=144,2,50,10,60
silence_armor_trim_smithing_template=1296,1,75,1,600
skeleton_skull=180,1,10,2,240
skull_pottery_sherd=432,1,25,1,120
slime_ball=9,32,25,5,120
small_dripleaf=3,1,50,10,120
sniffer_egg=144,1,25,5,180
snort_pottery_sherd=432,1,25,1,120
snout_armor_trim_smithing_template=1296,1,75,1,600
snowball=1,16,50,10,60
soul_sand=9,32,25,5,120
soul_soil=9,32,25,5,120
spider_eye=9,6,50,10,60
spire_armor_trim_smithing_template=1296,1,75,1,600
splash_potion=48,1,50,10,60
sponge=144,1,75,10,60
spore_blossom=9,1,50,5,120
spruce_boat=9,1,10,2,600
spruce_button=1,2,25,5,60
spruce_chest_boat=9,1,10,2,600
spruce_door=1,1,50,10,60
spruce_fence=9,18,75,10,60
spruce_leaves=1,6,50,10,60
spruce_log=9,8,75,20,20
spruce_planks=9,32,75,20,20
spruce_pressure_plate=1,2,25,5,60
spruce_sapling=1,4,50,10,60
spruce_slab=9,18,50,10,60
spruce_stairs=9,24,75,10,60
spruce_wood=9,8,75,10,20
stick=1,4,50,25,30
stone=11,64,50,10,60
string=9,20,50,10,60
stripped_acacia_log=11,8,75,10,20
stripped_acacia_wood=11,8,75,10,20
stripped_bamboo_block=11,8,75,10,20
stripped_birch_log=11,8,75,10,20
stripped_birch_wood=11,8,75,10,20
stripped_cherry_log=11,8,75,10,20
stripped_cherry_wood=11,8,75,10,20
stripped_crimson_hyphae=11,8,75,10,20
stripped_crimson_stem=11,8,75,10,20
stripped_dark_oak_log=11,8,75,10,20
stripped_dark_oak_wood=11,8,75,10,20
stripped_jungle_log=11,8,75,10,20
stripped_jungle_wood=11,8,75,10,20
stripped_mangrove_log=11,8,75,10,20
stripped_mangrove_wood=11,8,75,10,20
stripped_oak_log=11,8,75,10,20
stripped_oak_wood=11,8,75,10,20
stripped_spruce_log=11,8,75,10,20
stripped_spruce_wood=11,8,75,10,20
stripped_warped_hyphae=11,8,75,10,20
stripped_warped_stem=11,8,75,10,20
sugar_cane=9,32,50,10,30
sunflower=1,4,50,10,30
suspicious_stew=4,1,25,0,120
sweet_berries=9,32,50,10,60
tadpole_bucket=9,1,25,2,240
tall_grass=1,6,25,5,120
terracotta=9,32,50,10,60
tide_armor_trim_smithing_template=1296,1,75,1,600
tipped_arrow=9,1,50,10,60
torchflower=36,1,50,1,60
torchflower_seeds=9,1,50,1,60
totem_of_undying=1152,1,90,1,600
trident=288,1,10,1,480
tropical_fish=18,1,50,15,30
tropical_fish_bucket=18,1,50,10,30
tube_coral=9,4,50,5,240
tube_coral_block=9,4,50,5,240
tube_coral_fan=9,4,50,5,240
tuff=9,32,25,5,60
turtle_egg=18,16,50,10,90
twisting_vines=2,8,50,1,60
verdant_froglight=9,4,50,10,120
vex_armor_trim_smithing_template=1296,1,75,1,600
vine=1,8,50,10,60
ward_armor_trim_smithing_template=1296,1,75,1,600
warped_button=1,2,25,1,60
warped_door=1,1,50,1,60
warped_fence=9,18,75,1,60
warped_fungus=9,6,50,1,60
warped_hyphae=9,8,75,1,20
warped_nylium=9,32,50,1,120
warped_planks=9,32,75,1,20
warped_pressure_plate=1,2,25,1,60
warped_roots=2,1,25,1,120
warped_slab=9,18,50,1,60
warped_stairs=9,24,75,1,60
warped_stem=9,8,75,1,20
warped_wart_block=9,32,50,1,120
water_bucket=9,1,75,10,30
wayfinder_armor_trim_smithing_template=1296,1,75,1,600
weathered_copper=36,1,75,10,60
weeping_vines=2,8,50,1,60
wet_sponge=144,1,25,5,60
wheat=9,32,50,20,30
wheat_seeds=1,16,50,20,60
white_carpet=9,10,75,10,60
white_concrete=9,16,50,10,60
white_dye=11,8,75,10,22
white_shulker_box=162,1,50,10,60
white_terracotta=9,32,50,10,60
white_tulip=1,4,50,10,30
white_wool=9,20,75,20,60
wild_armor_trim_smithing_template=1296,1,75,1,600
wither_rose=36,1,25,5,180
wither_skeleton_skull=432,1,10,2,240
written_book=9,1,50,0,60
yellow_carpet=9,10,75,10,60
yellow_concrete=9,16,50,10,60
yellow_dye=11,8,75,10,2
yellow_shulker_box=162,1,50,10,60
yellow_terracotta=9,32,50,10,60
yellow_wool=9,20,75,20,60
zombie_head=144,1,10,1,240

# 1.21
armadillo_scute=9,4,50,10,60
bolt_armor_trim_smithing_template=1296,1,75,1,600
breeze_rod=9,3,50,1,60
chiseled_copper=9,1,75,10,60
copper_bulb=36,4,75,10,60
copper_door=18,1,75,10,60
copper_grate=36,4,75,10,60
copper_trapdoor=24,1,75,10,60
cut_copper=36,4,75,10,60
cut_copper_slab=36,8,75,10,60
cut_copper_stairs=36,4,75,10,60
flow_armor_trim_smithing_template=1296,1,75,1,600
flow_banner_pattern=144,1,75,1,600
flow_pottery_sherd=432,1,25,1,120
guster_banner_pattern=144,1,75,1,600
guster_pottery_sherd=432,1,25,1,120
heavy_core=1152,1,50,1,600
exposed_chiseled_copper=11,1,50,10,60
exposed_copper=10,1,50,10,60
exposed_copper_bulb=38,4,50,10,60
exposed_copper_door=20,1,50,10,60
exposed_copper_grate=40,4,50,10,60
exposed_copper_trapdoor=26,1,50,10,60
exposed_cut_copper=38,4,50,10,60
exposed_cut_copper_slab=38,8,50,10,60
exposed_cut_copper_stairs=38,4,50,10,60
weathered_chiseled_copper=13,1,40,10,60
weathered_copper=12,1,40,10,60
weathered_copper_bulb=40,4,40,10,60
weathered_copper_door=22,1,40,10,60
weathered_copper_grate=44,4,40,10,60
weathered_copper_trapdoor=28,1,40,10,60
weathered_cut_copper=40,4,40,10,60
weathered_cut_copper_slab=40,8,40,10,60
weathered_cut_copper_stairs=40,4,40,10,60
oxidized_chiseled_copper=15,1,30,10,60
oxidized_copper=13,1,30,10,60
oxidized_copper_bulb=42,4,30,10,60
oxidized_copper_door=24,1,30,10,60
oxidized_copper_grate=48,4,30,10,60
oxidized_copper_trapdoor=30,1,30,10,60
oxidized_cut_copper=42,4,30,10,60
oxidized_cut_copper_slab=42,8,30,10,60
oxidized_cut_copper_stairs=42,4,30,10,60
waxed_chiseled_copper=38,4,75,10,60
waxed_copper_block=10,1,75,10,60
waxed_copper_bulb=44,4,75,10,60
waxed_copper_door=20,1,75,10,60
waxed_copper_grate=40,4,75,10,60
waxed_copper_trapdoor=24,1,75,10,60
waxed_cut_copper=38,4,75,10,60
waxed_cut_copper_slab=38,8,75,10,60
waxed_cut_copper_stairs=38,4,75,10,60
waxed_exposed_chiseled_copper=40,4,75,10,60
waxed_exposed_copper=11,1,75,10,60
waxed_exposed_copper_bulb=46,4,75,10,60
waxed_exposed_copper_door=22,1,75,10,60
waxed_exposed_copper_grate=44,4,75,10,60
waxed_exposed_copper_trapdoor=26,1,75,10,60
waxed_exposed_cut_copper=40,4,75,10,60
waxed_exposed_cut_copper_slab=40,8,75,10,60
waxed_exposed_cut_copper_stairs=40,4,75,10,60
waxed_weathered_chiseled_copper=42,4,75,10,60
waxed_weathered_copper=11,1,75,10,60
waxed_weathered_copper_bulb=48,4,75,10,60
waxed_weathered_copper_door=24,1,75,10,60
waxed_weathered_copper_grate=48,4,75,10,60
waxed_weathered_copper_trapdoor=28,1,75,10,60
waxed_weathered_cut_copper=42,4,75,10,60
waxed_weathered_cut_copper_slab=42,8,75,10,60
waxed_weathered_cut_copper_stairs=42,4,75,10,60
waxed_oxidized_chiseled_copper=44,4,75,10,60
waxed_oxidized_copper=12,1,75,10,60
waxed_oxidized_copper_bulb=50,4,75,10,60
waxed_oxidized_copper_door=26,1,75,10,60
waxed_oxidized_copper_grate=52,4,75,10,60
waxed_oxidized_copper_trapdoor=30,1,75,10,60
waxed_oxidized_cut_copper=44,4,75,10,60
waxed_oxidized_cut_copper_slab=44,8,75,10,60
waxed_oxidized_cut_copper_stairs=44,4,75,10,60

mod:villagerbusiness
emerald_nugget=1,1,0,0,480

mod:create
raw_zinc=2,1,75,10,90
zinc_ingot=2,1,75,10,60
zinc_nugget=2,9,75,5,60
brass_ingot=3,1,75,5,60
brass_nugget=3,9,75,3,60
bar_of_chocolate=9,2,75,10,30
blaze_cake=9,1,10,1,120
brass_sheet=8,2,50,5,60
builders_tea=9,1,50,5,90
dough=11,32,50,20,30
chocolate_bucket=20,1,75,10,30
chocolate_glazed_berries=9,8,75,10,30
cinder_flour=11,64,25,3,120
copper_sheet=3,2,50,2,60
crushed_copper_ore=5,4,50,2,60
crushed_gold_ore=13,4,50,2,90
crushed_iron_ore=9,4,50,2,90
crushed_zinc_ore=9,4,50,2,90
extendo_grip=32,1,50,1,600
golden_sheet=8,2,50,2,60
honey_bucket=9,1,50,5,60
honeyed_apple=9,8,75,10,30
iron_sheet=6,2,50,2,60
netherite_backtank=2472,1,25,1,600
netherite_diving_boots=2472,1,25,1,600
netherite_diving_helmet=2490,1,25,1,600
experience_nugget=4,1,50,10,60
polished_rose_quartz=9,2,35,2,90
potato_cannon=24,1,25,1,600
powdered_obsidian=1,1,25,1,60
precision_mechanism=9,1,50,10,120
sweet_roll=4,2,75,5,30
wheat_flour=9,32,50,20,30
""";
    }
}
