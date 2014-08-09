package net.ultrawarmod.mod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.ultrawarmod.mod.blocks.BauxiteBlock;
import net.ultrawarmod.mod.blocks.BauxiteOre;
import net.ultrawarmod.mod.blocks.CopperBlock;
import net.ultrawarmod.mod.blocks.CopperOre;
import net.ultrawarmod.mod.blocks.GraphiteBlock;
import net.ultrawarmod.mod.blocks.GraphiteOre;
import net.ultrawarmod.mod.blocks.LeadBlock;
import net.ultrawarmod.mod.blocks.LeadOre;
import net.ultrawarmod.mod.blocks.MicrowaveOven;
import net.ultrawarmod.mod.blocks.SapphireBlock;
import net.ultrawarmod.mod.blocks.SapphireOre;
import net.ultrawarmod.mod.blocks.TinBlock;
import net.ultrawarmod.mod.blocks.TinOre;
import net.ultrawarmod.mod.blocks.TitaniumBlock;
import net.ultrawarmod.mod.blocks.TitaniumOre;
import net.ultrawarmod.mod.blocks.UraniumBlock;
import net.ultrawarmod.mod.blocks.UraniumOre;
import net.ultrawarmod.mod.blocks.ZincBlock;
import net.ultrawarmod.mod.blocks.ZincOre;
import net.ultrawarmod.mod.handler.GuiHandler;
import net.ultrawarmod.mod.items.CopperAxe;
import net.ultrawarmod.mod.items.CopperHoe;
import net.ultrawarmod.mod.items.CopperPickaxe;
import net.ultrawarmod.mod.items.CopperShovel;
import net.ultrawarmod.mod.items.CopperSword;
import net.ultrawarmod.mod.items.Handsaw;
import net.ultrawarmod.mod.items.HandsawHandle;
import net.ultrawarmod.mod.items.HandsawPanel;
import net.ultrawarmod.mod.items.SapphireAxe;
import net.ultrawarmod.mod.items.SapphireHoe;
import net.ultrawarmod.mod.items.SapphirePickaxe;
import net.ultrawarmod.mod.items.SapphireShovel;
import net.ultrawarmod.mod.items.SapphireSword;
import net.ultrawarmod.mod.items.SawTeeth;
import net.ultrawarmod.mod.items.TinAxe;
import net.ultrawarmod.mod.items.TinHoe;
import net.ultrawarmod.mod.items.TinPickaxe;
import net.ultrawarmod.mod.items.TinShovel;
import net.ultrawarmod.mod.items.TinSword;
import net.ultrawarmod.mod.items.UWMItems;
import net.ultrawarmod.mod.tileentity.TileEntityMicrowaveOven;
import net.ultrawarmod.mod.worldgen.UWMWorldGen;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;



@Mod(modid = UltraWarMod.modid, version = UltraWarMod.version)
public class UltraWarMod 
{
	public static final String modid = "UltraWarMod";
	public static final String version = "Alpha 1.0";
	
	UWMWorldGen eventWorldGen = new UWMWorldGen();
	
	public static CreativeTabs ultrawarmodBlocksTab;
	public static CreativeTabs ultrawarmodItemsTab;
	public static CreativeTabs ultrawarmodToolsTab;
	public static CreativeTabs ultrawarmodWeaponsTab;
	public static CreativeTabs ultrawarmodMachinesTab;
	
	public static ToolMaterial CopperMaterial = EnumHelper.addToolMaterial("CopperMaterial", 1, 145, 4.5F, 1.5F, 7);
	public static ToolMaterial TinMaterial = EnumHelper.addToolMaterial("TinMaterial", 2, 450, 6.2F, 2.5F, 16);
	public static ToolMaterial SapphireMaterial = EnumHelper.addToolMaterial("SapphireMaterial", 2, 625, 8.5F, 3.0F, 18);
	public static ToolMaterial BrassMaterial = EnumHelper.addToolMaterial("BrassMaterial", 2, 650, 8.0F, 3.0F, 18);
	
	@Instance(modid)
	public static UltraWarMod instance;
	
	public static Item itemUraniumIngot;
	public static Item itemCopperIngot;
	public static Item itemTinIngot;
	public static Item itemSapphireGem;
	public static Item itemLeadIngot;
	public static Item itemBauxiteIngot;
	public static Item itemZincIngot;
	public static Item itemTitaniumIngot;
	public static Item itemGraphiteIngot;
	public static Item itemBrass;
	
	public static Item sawHandsawHandle;
	public static Item sawSawTeeth;
	public static Item sawHandsawPanel;
	public static Item sawHandsaw;
	
	public static Block oreUraniumOre;
	public static Block oreCopperOre;
	public static Block oreTinOre;
	public static Block oreSapphireOre;
	public static Block oreLeadOre;
	public static Block oreBauxiteOre;
	public static Block oreZincOre;
	public static Block oreTitaniumOre;
	public static Block oreGraphiteOre;
	
	public static Block blockUraniumBlock;
	public static Block blockCopperBlock;
	public static Block blockTinBlock;
	public static Block blockSapphireBlock;
	public static Block blockLeadBlock;
	public static Block blockBauxiteBlock;
	public static Block blockZincBlock;
	public static Block blockTitaniumBlock;
	public static Block blockGraphiteBlock;
	
	public static Block blockMicrowaveOvenIdle;
	public static Block blockMicrowaveOvenActive;
	public static final int GuiIDMicrowaveOven = 0;
	
	public static Item itemCopperSword;
	public static Item itemCopperPickaxe;
	public static Item itemCopperAxe;
	public static Item itemCopperShovel;
	public static Item itemCopperHoe;
	public static Item itemSapphireSword;
	public static Item itemSapphirePickaxe;
	public static Item itemSapphireAxe;
	public static Item itemSapphireShovel;
	public static Item itemSapphireHoe;
	public static Item itemTinSword;
	public static Item itemTinPickaxe;
	public static Item itemTinAxe;
	public static Item itemTinShovel;
	public static Item itemTinHoe;
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent preEvent)
	{
		
		ultrawarmodBlocksTab = new CreativeTabs("tabBlocks")
		{
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem()
			{
				return Item.getItemFromBlock(UltraWarMod.oreUraniumOre);
			}
			
		};
		
		ultrawarmodItemsTab = new CreativeTabs("tabItems")
		{
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem() 
			{
		        return itemUraniumIngot;
		    }
			
		};
		
		ultrawarmodToolsTab = new CreativeTabs("tabTools")
		{
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem() 
			{
		        return sawHandsaw;
		    }
			
		};
		
		ultrawarmodWeaponsTab = new CreativeTabs("tabWeapons")
		{
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem() 
			{
		        return itemSapphireSword;
		    }
			
		};
		
		ultrawarmodMachinesTab = new CreativeTabs("tabMachines")
		{
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem() 
			{
				return Item.getItemFromBlock(blockMicrowaveOvenIdle);
		    }
		};
		
		//Items
		itemUraniumIngot = new UWMItems().setUnlocalizedName("UraniumIngot");
		GameRegistry.registerItem(itemUraniumIngot, "UraniumIngot");
		
		itemCopperIngot = new UWMItems().setUnlocalizedName("CopperIngot");
		GameRegistry.registerItem(itemCopperIngot, "CopperIngot");
		
		itemTinIngot = new UWMItems().setUnlocalizedName("TinIngot");
		GameRegistry.registerItem(itemTinIngot, "TinIngot");
		
		itemSapphireGem = new UWMItems().setUnlocalizedName("SapphireGem");
		GameRegistry.registerItem(itemSapphireGem, "SapphireGem");
		
		itemLeadIngot = new UWMItems().setUnlocalizedName("LeadIngot");
		GameRegistry.registerItem(itemLeadIngot, "LeadIngot");
		
		itemBauxiteIngot = new UWMItems().setUnlocalizedName("BauxiteIngot");
		GameRegistry.registerItem(itemBauxiteIngot, "BauxiteIngot");
		
		itemZincIngot = new UWMItems().setUnlocalizedName("ZincIngot");
		GameRegistry.registerItem(itemZincIngot, "ZincIngot");
		
		itemTitaniumIngot = new UWMItems().setUnlocalizedName("TitaniumIngot");
		GameRegistry.registerItem(itemTitaniumIngot, "TitaniumIngot");
		
		itemGraphiteIngot = new UWMItems().setUnlocalizedName("GraphiteIngot");
		GameRegistry.registerItem(itemGraphiteIngot, "GraphiteIngot");
		
		itemBrass = new UWMItems().setUnlocalizedName("Brass");
		GameRegistry.registerItem(itemBrass, "Brass");
		
		
		//Ores
		oreUraniumOre = new UraniumOre(Material.iron).setBlockName("UraniumOre");
		GameRegistry.registerBlock(oreUraniumOre, "UraniumOre");
		
		oreCopperOre = new CopperOre(Material.iron).setBlockName("CopperOre");
		GameRegistry.registerBlock(oreCopperOre, "CopperOre");
		
		oreTinOre = new TinOre(Material.iron).setBlockName("TinOre");
		GameRegistry.registerBlock(oreTinOre, "TinOre");
		
		oreSapphireOre = new SapphireOre(Material.iron).setBlockName("SapphireOre");
		GameRegistry.registerBlock(oreSapphireOre, "SapphireOre");
		
		oreLeadOre = new LeadOre(Material.iron).setBlockName("LeadOre");
		GameRegistry.registerBlock(oreLeadOre, "LeadOre");
		
		oreBauxiteOre = new BauxiteOre(Material.iron).setBlockName("BauxiteOre");
		GameRegistry.registerBlock(oreBauxiteOre, "BauxiteOre");
		
		oreZincOre = new ZincOre(Material.iron).setBlockName("ZincOre");
		GameRegistry.registerBlock(oreZincOre, "ZincOre");
		
		oreTitaniumOre = new TitaniumOre(Material.iron).setBlockName("TitaniumOre");
		GameRegistry.registerBlock(oreTitaniumOre, "TitaniumOre");
		
		oreGraphiteOre = new GraphiteOre(Material.iron).setBlockName("GraphiteOre");
		GameRegistry.registerBlock(oreGraphiteOre, "GraphiteOre");
		
		
		//Blocks
		blockUraniumBlock = new UraniumBlock(Material.iron).setBlockName("UraniumBlock");
		GameRegistry.registerBlock(blockUraniumBlock, "UraniumBlock");
		
		blockCopperBlock = new CopperBlock(Material.iron).setBlockName("CopperBlock");
		GameRegistry.registerBlock(blockCopperBlock, "CopperBlock");
		
		blockTinBlock = new TinBlock(Material.iron).setBlockName("TinBlock");
		GameRegistry.registerBlock(blockTinBlock, "TinBlock");
		
		blockSapphireBlock = new SapphireBlock(Material.iron).setBlockName("SapphireBlock");
		GameRegistry.registerBlock(blockSapphireBlock, "SapphireBlock");
		
		blockLeadBlock = new LeadBlock(Material.iron).setBlockName("LeadBlock");
		GameRegistry.registerBlock(blockLeadBlock, "LeadBlock");
		
		blockBauxiteBlock = new BauxiteBlock(Material.iron).setBlockName("BauxiteBlock");
		GameRegistry.registerBlock(blockBauxiteBlock, "BauxiteBlock");
		
		blockZincBlock = new ZincBlock(Material.iron).setBlockName("ZincBlock");
		GameRegistry.registerBlock(blockZincBlock, "ZincBlock");
		
		blockTitaniumBlock = new TitaniumBlock(Material.iron).setBlockName("TitaniumBlock");
		GameRegistry.registerBlock(blockTitaniumBlock, "TitaniumBlock");
		
		blockGraphiteBlock = new GraphiteBlock(Material.iron).setBlockName("GraphiteBlock");
		GameRegistry.registerBlock(blockGraphiteBlock, "GraphiteBlock");
		
		//Machines
		blockMicrowaveOvenIdle = new MicrowaveOven(false).setBlockName("MicrowaveOvenIdle").setCreativeTab(ultrawarmodMachinesTab);
		GameRegistry.registerBlock(blockMicrowaveOvenIdle, "MicrowaveOvenIdle");
		
		blockMicrowaveOvenActive = new MicrowaveOven(true).setBlockName("MicrowaveOvenActive").setLightLevel(13.0F);
		GameRegistry.registerBlock(blockMicrowaveOvenActive, "MicrowaveOvenActive");
		
		//Tools
		sawHandsawHandle = new HandsawHandle().setUnlocalizedName("HandsawHandle");
		GameRegistry.registerItem(sawHandsawHandle, "HandsawHandle");
		
		sawSawTeeth = new SawTeeth().setUnlocalizedName("SawTeeth");
		GameRegistry.registerItem(sawSawTeeth, "SawTeeth");
		
		sawHandsawPanel = new HandsawPanel().setUnlocalizedName("HandsawPanel");
		GameRegistry.registerItem(sawHandsawPanel, "HandsawPanel");
		
		sawHandsaw = new Handsaw(BrassMaterial).setUnlocalizedName("Handsaw");
		GameRegistry.registerItem(sawHandsaw, "Handsaw");
		
		itemCopperPickaxe = new CopperPickaxe(CopperMaterial).setUnlocalizedName("CopperPickaxe");
		GameRegistry.registerItem(itemCopperPickaxe, "CopperPickaxe");
		
		itemCopperAxe = new CopperAxe(CopperMaterial).setUnlocalizedName("CopperAxe");
		GameRegistry.registerItem(itemCopperAxe, "CopperAxe");
		
		itemCopperShovel = new CopperShovel(CopperMaterial).setUnlocalizedName("CopperShovel");
		GameRegistry.registerItem(itemCopperShovel, "CopperShovel");
		
		itemCopperHoe = new CopperHoe(CopperMaterial).setUnlocalizedName("CopperHoe");
		GameRegistry.registerItem(itemCopperHoe, "CopperHoe");
		
		itemTinPickaxe = new TinPickaxe(TinMaterial).setUnlocalizedName("TinPickaxe");
		GameRegistry.registerItem(itemTinPickaxe, "TinPickaxe");
		
		itemTinAxe = new TinAxe(TinMaterial).setUnlocalizedName("TinAxe");
		GameRegistry.registerItem(itemTinAxe, "TinAxe");
		
		itemTinShovel = new TinShovel(TinMaterial).setUnlocalizedName("TinShovel");
		GameRegistry.registerItem(itemTinShovel, "TinShovel");
		
		itemTinHoe = new TinHoe(TinMaterial).setUnlocalizedName("TinHoe");
		GameRegistry.registerItem(itemTinHoe, "TinHoe");
		
		itemSapphirePickaxe = new SapphirePickaxe(SapphireMaterial).setUnlocalizedName("SapphirePickaxe");
		GameRegistry.registerItem(itemSapphirePickaxe, "SapphirePickaxe");
		
		itemSapphireAxe = new SapphireAxe(SapphireMaterial).setUnlocalizedName("SapphireAxe");
		GameRegistry.registerItem(itemSapphireAxe, "SapphireAxe");
		
		itemSapphireShovel = new SapphireShovel(SapphireMaterial).setUnlocalizedName("SapphireShovel");
		GameRegistry.registerItem(itemSapphireShovel, "SapphireShovel");
		
		itemSapphireHoe = new SapphireHoe(SapphireMaterial).setUnlocalizedName("SapphireHoe");
		GameRegistry.registerItem(itemSapphireHoe, "SapphireHoe");
		
		//Melee Weapons
		itemCopperSword = new CopperSword(CopperMaterial).setUnlocalizedName("CopperSword");
		GameRegistry.registerItem(itemCopperSword, "CopperSword");
		
		itemTinSword = new TinSword(TinMaterial).setUnlocalizedName("TinSword");
		GameRegistry.registerItem(itemTinSword, "TinSword");
		
		itemSapphireSword = new SapphireSword(SapphireMaterial).setUnlocalizedName("SapphireSword");
		GameRegistry.registerItem(itemSapphireSword, "SapphireSword");
		
		
		//Spawn
		GameRegistry.registerWorldGenerator(eventWorldGen, 0);
		
		
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		
		//Tile Entities
		GameRegistry.registerTileEntity(TileEntityMicrowaveOven.class, "MicrowaveOven");
		
		//Recipes
		GameRegistry.addRecipe(new ItemStack(blockUraniumBlock), new Object[]{"UUU", "UUU", "UUU", 'U', itemUraniumIngot});
		GameRegistry.addRecipe(new ItemStack(blockCopperBlock), new Object[]{"CCC", "CCC", "CCC", 'C', itemCopperIngot});
		GameRegistry.addRecipe(new ItemStack(blockTinBlock), new Object[]{"TTT", "TTT", "TTT", 'T', itemTinIngot});
		GameRegistry.addRecipe(new ItemStack(blockSapphireBlock), new Object[]{"SSS", "SSS", "SSS", 'S', itemSapphireGem});
		GameRegistry.addRecipe(new ItemStack(blockLeadBlock), new Object[]{"LLL", "LLL", "LLL", 'L', itemLeadIngot});
		GameRegistry.addRecipe(new ItemStack(blockBauxiteBlock), new Object[]{"BBB", "BBB", "BBB", 'B', itemBauxiteIngot});
		GameRegistry.addRecipe(new ItemStack(blockZincBlock), new Object[]{"ZZZ", "ZZZ", "ZZZ", 'Z', itemZincIngot});
		GameRegistry.addRecipe(new ItemStack(blockTitaniumBlock), new Object[]{"TTT", "TTT", "TTT", 'T', itemTitaniumIngot});
		GameRegistry.addRecipe(new ItemStack(blockGraphiteBlock), new Object[]{"GGG", "GGG", "GGG", 'G', itemGraphiteIngot});
		GameRegistry.addRecipe(new ItemStack(sawSawTeeth), new Object[]{"   ", "C C", " C ", 'C', itemCopperIngot});
		GameRegistry.addRecipe(new ItemStack(sawHandsawHandle), new Object[]{" SS", "S  ", " SS", 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(sawHandsawPanel), new Object[]{"BBB", " BB", "  B", 'B', itemBrass});
		GameRegistry.addShapelessRecipe(new ItemStack(itemBrass), new Object[]{itemCopperIngot, itemZincIngot});
		GameRegistry.addRecipe(new ItemStack(sawHandsaw), new Object[]{"TT ", "PPH", "TT ", 'T', sawSawTeeth, 'P', sawHandsawPanel, 'H', sawHandsawHandle});
		
		//Smelting
		GameRegistry.addSmelting(oreUraniumOre, new ItemStack(itemUraniumIngot), 1.5F);
		GameRegistry.addSmelting(oreCopperOre, new ItemStack(itemCopperIngot), 0);
		GameRegistry.addSmelting(oreTinOre, new ItemStack(itemTinIngot), 0.1F);
		GameRegistry.addSmelting(oreSapphireOre, new ItemStack(itemSapphireGem), 0.4F);
		GameRegistry.addSmelting(oreLeadOre, new ItemStack(itemLeadIngot), 0.6F);
		GameRegistry.addSmelting(oreBauxiteOre, new ItemStack(itemBauxiteIngot), 0.5F);
		GameRegistry.addSmelting(oreZincOre, new ItemStack(itemZincIngot), 0.2F);
		GameRegistry.addSmelting(oreTitaniumOre, new ItemStack(itemTitaniumIngot), 0.7F);
		GameRegistry.addSmelting(oreGraphiteOre, new ItemStack(itemGraphiteIngot), 0.3F);
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent postEvent)
	{
		
	}
}
