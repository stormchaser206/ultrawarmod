package net.ultrawarmod.mod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.ultrawarmod.mod.UltraWarMod;

public class CopperShovel extends ItemSpade
{

	public CopperShovel(ToolMaterial p_i45356_1_) 
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
