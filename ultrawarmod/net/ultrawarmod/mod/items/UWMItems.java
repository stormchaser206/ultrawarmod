package net.ultrawarmod.mod.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.ultrawarmod.mod.UltraWarMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class UWMItems extends Item 
{
	public UWMItems()
	{
		this.setCreativeTab(UltraWarMod.ultrawarmodItemsTab);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		this.itemIcon = iconRegister.registerIcon(UltraWarMod.modid + ":" + this.getUnlocalizedName().substring(5));
	}
	
}