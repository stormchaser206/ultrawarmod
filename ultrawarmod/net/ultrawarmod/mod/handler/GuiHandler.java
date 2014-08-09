package net.ultrawarmod.mod.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.ultrawarmod.mod.UltraWarMod;
import net.ultrawarmod.mod.tileentity.TileEntityMicrowaveOven;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null)
		{
			switch(ID)
			{
			case UltraWarMod.GuiIDMicrowaveOven:
				if(entity instanceof TileEntityMicrowaveOven)
				{
					return new ContainerMicrowaveOven(player.inventory, (TileEntityMicrowaveOven) entity);
				}
				return null;
			}
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null)
		{
			switch(ID)
			{
			case UltraWarMod.GuiIDMicrowaveOven:
				if(entity instanceof TileEntityMicrowaveOven)
				{
					return new GuiMicrowaveOven(player.inventory, (TileEntityMicrowaveOven) entity);
				}
				return null;
			}
		}
		return null;
	}
	
}
