package net.ultrawarmod.mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.ultrawarmod.mod.UltraWarMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class LeadBlock extends Block
{

	public LeadBlock(Material material) 
	{
		super(material);
		
		this.setHardness(8.0F);
		this.setResistance(25.0F);
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(UltraWarMod.ultrawarmodBlocksTab);
		this.setHarvestLevel("pickaxe", 2);
		
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		this.blockIcon = iconRegister.registerIcon(UltraWarMod.modid + ":" + this.getUnlocalizedName().substring(5));
	}
	
}
