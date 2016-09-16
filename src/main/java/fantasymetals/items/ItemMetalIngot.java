package fantasymetals.items;

import fantasymetals.init.Achievements;
import fantasymetals.init.Materials;
import cyano.basemetals.material.MetalMaterial;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Ingots
 *
 * @author Jasmine Iwanek
 *
 */
public class ItemMetalIngot extends cyano.basemetals.items.ItemMetalIngot {

	/**
	 * 
	 * @param metal
	 */
	public ItemMetalIngot(MetalMaterial metal) {
		super(metal);
	}

	@Override
	public void onCreated(final ItemStack item, final World world, final EntityPlayer crafter) {
		super.onCreated(item, world, entityPlayer);
		entityPlayer.addStat(cyano.basemetals.init.Achievements.this_is_new, 1);

		if(this.getMetalMaterial() == Materials.template)
			entityPlayer.addStat(Achievements.template_maker, 1);
	}
}
