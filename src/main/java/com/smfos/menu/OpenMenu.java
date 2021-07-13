package com.smfos.menu;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class OpenMenu implements CommandExecutor {

    public Inventory menu;

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(label.equalsIgnoreCase("menu") || label.equalsIgnoreCase("메뉴")){
            if(!(sender instanceof Player)){
                sender.sendMessage("콘솔에서는 이 메시지를 사용 할 수 없습니다.");
                return true;
            }
            Player player = (Player) sender;
            player.sendMessage("메뉴가 열렸습니다.");
            return true;
        }
        return false;
    }

    public void createMenu(){
        menu = Bukkit.createInventory(null, 9, ChatColor.BOLD + "메뉴");

        ItemStack item = new ItemStack(Material.GRASS_BLOCK);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("유저 정보");
        menu.setItem(9, item);
    }
}
