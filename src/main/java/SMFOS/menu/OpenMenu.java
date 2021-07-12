package SMFOS.menu;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class OpenMenu implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(label.equalsIgnoreCase("menu") || label.equalsIgnoreCase("메뉴")){
            if(sender instanceof Player){
                Player player = (Player) sender;
                player.sendMessage("메뉴가 열렸습니다.");
                return true;
            }else{
                sender.sendMessage("콘솔에서는 이 메시지를 사용 할 수 없습니다.");
                return true;
            }
        }
        return false;
    }
}
