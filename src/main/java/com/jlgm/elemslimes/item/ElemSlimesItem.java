package com.jlgm.elemslimes.item;

import com.jlgm.elemslimes.lib.ElemSlimesConstants;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;

public class ElemSlimesItem {
	
	public static Item elemSlimesEgg_Item;
	public static Item plort_Item;
	
	public static void registerItems(RegistryEvent.Register<Item> event){
		elemSlimesEgg_Item = new ItemElemSlimesEgg().setUnlocalizedName("elemslimesegg");
		event.getRegistry().register(elemSlimesEgg_Item.setRegistryName("elemslimesegg"));
		
		plort_Item = new ItemPlort().setUnlocalizedName("plort").setCreativeTab(CreativeTabs.MISC);
		event.getRegistry().register(plort_Item.setRegistryName("plort_Item"));
	}
	
	public static void renderItem(){
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		
		renderItem.getItemModelMesher().register(elemSlimesEgg_Item, 0,
				new ModelResourceLocation(ElemSlimesConstants.MODID + ":" + "elemslimesegg", "inventory"));
		
		renderItem.getItemModelMesher().register(plort_Item, 0,
				new ModelResourceLocation(ElemSlimesConstants.MODID + ":" + "plort", "inventory"));
		
	}
}
