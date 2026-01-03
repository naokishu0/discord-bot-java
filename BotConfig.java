public class BotConfig {
    
    // Bot ayarları
    public static final String BOT_PREFIX = "!";
    public static final String BOT_VERSION = "1.0.0";
    public static final String BOT_AUTHOR = "Naoki";
    
    // Mesaj limitleri
    public static final int MAX_MESSAGE_LENGTH = 2000;
    public static final int EMBED_FIELD_LIMIT = 25;
    
    // Cooldown süreleri (milisaniye)
    public static final long COMMAND_COOLDOWN = 2000; // 2 saniye
    public static final long SPAM_PROTECTION = 1000;  // 1 saniye
    
    // Bot durumu mesajları
    public static final String[] STATUS_MESSAGES = {
        "Java ile kodlama!",
        "Discord sunucularını yönetiyor",
        "Komutları dinliyor...",
        "Kullanıcılara yardım ediyor",
        "24/7 aktif!"
    };
    
    // Eğlenceli yanıtlar
    public static final String[] GREETING_RESPONSES = {
        "Merhaba! 👋",
        "Selam! 😊",
        "Hey! Nasılsın? 🙂",
        "Hoş geldin! ✨",
        "Merhaba dostum! 🤗"
    };
    
    public static final String[] GOODBYE_RESPONSES = {
        "Görüşürüz! 👋",
        "Hoşça kal! 😊",
        "Kendine iyi bak! 🤗",
        "Tekrar görüşmek üzere! ✨",
        "Bay bay! 👋"
    };
    
    // Hata mesajları
    public static final String ERROR_NO_PERMISSION = "❌ Bu komutu kullanmak için yetkiniz yok!";
    public static final String ERROR_INVALID_COMMAND = "❌ Geçersiz komut! `!yardım` yazarak komutları görebilirsin.";
    public static final String ERROR_COOLDOWN = "⏰ Bu komutu çok sık kullanıyorsun! Biraz bekle.";
    public static final String ERROR_GENERAL = "❌ Bir hata oluştu! Lütfen tekrar dene.";
    
    // Başarı mesajları
    public static final String SUCCESS_COMMAND = "✅ Komut başarıyla çalıştırıldı!";
    public static final String SUCCESS_SETUP = "✅ Bot başarıyla kuruldu!";
    
    // Embed renkleri (hex formatında)
    public static final int COLOR_SUCCESS = 0x00FF00;  // Yeşil
    public static final int COLOR_ERROR = 0xFF0000;    // Kırmızı
    public static final int COLOR_INFO = 0x0099FF;     // Mavi
    public static final int COLOR_WARNING = 0xFFAA00;  // Turuncu
    public static final int COLOR_DEFAULT = 0x7289DA;  // Discord mavi
}