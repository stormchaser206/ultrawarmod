package net.ultrawarmod.mod.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;
import net.ultrawarmod.mod.UltraWarMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CopperHoe extends ItemHoe
{

	public CopperHoe(ToolMaterial p_i45356_1_) 
	{
		
		super(p_i45356_1_);
		this.setCreativeTab(UltraWarMod.ultrawarmodToolsTab);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		this.itemIcon = iconRegister.registerIcon(UltraWarMod.modid + ":" + this.getUnlocalizedName().substring(5));
	}
}
