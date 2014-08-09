package net.ultrawarmod.mod.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.ultrawarmod.mod.tileentity.TileEntityMicrowaveOven;

public class GuiMicrowaveOven extends GuiContainer
{

	public TileEntityMicrowaveOven microwaveOven;
	
	
	
	public GuiMicrowaveOven(InventoryPlayer inventoryPlayer, TileEntityMicrowaveOven entity) 
	{
		super(ContainerMicrowaveOven(inventoryPlayer, entity));
		
		this.microwaveOven = entity;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) 
	{
		
	}
	
}
