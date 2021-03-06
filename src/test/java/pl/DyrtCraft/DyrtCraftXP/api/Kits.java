package pl.DyrtCraft.DyrtCraftXP.api;

import java.util.Arrays;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import pl.DyrtCraft.DyrtCraftXP.DyrtCraftXP;

public class Kits {
	
	DyrtCraftXP plugin;
	
	public Kits(DyrtCraftXP dyrtCraftXP) {
		plugin = dyrtCraftXP;
	}
	
	/**
	 * Kompas do wybrania serwera DyrtCraft Network
	 * 
	 * @author TheMolkaPL
	 * @since Alpha 1.6
	 * 
	 * @return ItemStack Kompas (COMPASS)
	 */
	public static ItemStack compass() {
		ItemStack i = new ItemStack(Material.COMPASS, 1);
		ItemMeta iMeta = i.getItemMeta();
		iMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Serwery DyrtCraft Network");
		iMeta.setLore(Arrays.asList(ChatColor.DARK_GREEN + "Kliknij, aby wybrac serwer!"));
		i.setItemMeta(iMeta);
		return i;
	}
	
	/**
	 * Ucieczka do serwera Lobby DyrtCraft Network
	 * 
	 * @author TheMolkaPL
	 * @since Alpha 1.6
	 * 
	 * @return ItemStack Ucieczka (EYE_OF_ENDER)
	 */
	public static ItemStack lobby() {
		ItemStack i = new ItemStack(Material.EYE_OF_ENDER, 1);
		ItemMeta iMeta = i.getItemMeta();
		iMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Powr�t na serwer Lobby");
		iMeta.setLore(Arrays.asList(ChatColor.DARK_GREEN + "Kliknij, aby przejsc do Lobby!"));
		i.setItemMeta(iMeta);
		return i;
	}
	
}
