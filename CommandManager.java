import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import java.util.HashMap;
import java.util.Map;

public class CommandManager {
    
    private Map<String, Long> userCooldowns = new HashMap<>();
    
    public boolean isOnCooldown(String userId, String command) {
        String key = userId + ":" + command;
        Long lastUsed = userCooldowns.get(key);
        
        if (lastUsed == null) {
            return false;
        }
        
        long currentTime = System.currentTimeMillis();
        long timeDiff = currentTime - lastUsed;
        
        return timeDiff < BotConfig.COMMAND_COOLDOWN;
    }
    
    public void setCooldown(String userId, String command) {
        String key = userId + ":" + command;
        userCooldowns.put(key, System.currentTimeMillis());
    }
    
    public long getRemainingCooldown(String userId, String command) {
        String key = userId + ":" + command;
        Long lastUsed = userCooldowns.get(key);
        
        if (lastUsed == null) {
            return 0;
        }
        
        long currentTime = System.currentTimeMillis();
        long timeDiff = currentTime - lastUsed;
        long remaining = BotConfig.COMMAND_COOLDOWN - timeDiff;
        
        return Math.max(0, remaining);
    }
    
    public boolean hasPermission(MessageReceivedEvent event, String command) {
        // Basit yetki kontrolü - geliştirilebilir
        // Şu an için herkes tüm komutları kullanabilir
        return true;
    }
    
    public String extractCommand(String message) {
        if (!message.startsWith(BotConfig.BOT_PREFIX)) {
            return null;
        }
        
        String[] parts = message.substring(1).split(" ");
        return parts[0].toLowerCase();
    }
    
    public String[] extractArgs(String message) {
        if (!message.startsWith(BotConfig.BOT_PREFIX)) {
            return new String[0];
        }
        
        String[] parts = message.substring(1).split(" ");
        if (parts.length <= 1) {
            return new String[0];
        }
        
        String[] args = new String[parts.length - 1];
        System.arraycopy(parts, 1, args, 0, args.length);
        return args;
    }
    
    public boolean isValidCommand(String command) {
        String[] validCommands = {
            "ping", "merhaba", "yardım", "help", "zaman", 
            "zar", "şans", "profil", "hesapla", "renk",
            "sunucu", "avatar", "davet"
        };
        
        for (String validCommand : validCommands) {
            if (validCommand.equals(command)) {
                return true;
            }
        }
        
        return false;
    }
}