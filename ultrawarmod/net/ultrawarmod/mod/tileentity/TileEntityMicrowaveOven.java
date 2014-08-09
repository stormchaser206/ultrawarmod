package net.ultrawarmod.mod.tileentity;

import net.minecraft.tileentity.TileEntity;

public class TileEntityMicrowaveOven extends TileEntity
{

	private String localizedName;
	
	public void setGuiDisplayName(String displayName) 
	{
		this.localizedName = displayName;
	}
	
}
