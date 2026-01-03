# Discord Bot - Java

Basit bir Discord botu Java ve JDA kullanarak geliştirildi.

## Özellikler

- ✅ Embed mesajlar ile güzel görünüm
- ✅ Emoji tepkileri ve otomatik yanıtlar
- ✅ Kullanıcı profil bilgileri
- ✅ Sunucu istatistikleri
- ✅ Matematik hesaplayıcı
- ✅ Rastgele renk üretici
- ✅ Zar atma oyunu
- ✅ Şans hesaplayıcı
- ✅ Avatar gösterici
- ✅ Ping ölçümü
- ✅ Mesaj loglaması
- ✅ Komut yönetim sistemi

## Kurulum

### 1. Gereksinimler
- Java 17+
- Maven 3.6+
- Discord Bot Token

### 2. Bot Token Alma
1. [Discord Developer Portal](https://discord.com/developers/applications)'a git
2. "New Application" ile yeni uygulama oluştur
3. "Bot" sekmesine git ve "Add Bot" tıkla
4. Token'ı kopyala (gizli tut!)

### 3. Projeyi Çalıştırma

```bash
# Dependencies yükle
mvn clean install

# Environment variable ayarla (Windows)
set DISCORD_BOT_TOKEN=your_bot_token_here

# Environment variable ayarla (Linux/Mac)
export DISCORD_BOT_TOKEN=your_bot_token_here

# Botu çalıştır
mvn exec:java -Dexec.mainClass="DiscordBot"
```

### 4. JAR Dosyası Oluşturma

```bash
mvn clean package
java -jar target/discord-bot-1.0.0.jar
```

## Komutlar

| Komut | Açıklama |
|-------|----------|
| `!ping` | Bot'un ping değerini gösterir |
| `!merhaba` | Kullanıcıyı selamlar |
| `!yardım` | Komut listesini gösterir |
| `!zaman` | Şu anki zamanı gösterir |
| `!zar` | 1-6 arası rastgele zar atar |
| `!şans` | Rastgele şans yüzdesi verir |
| `!profil` | Kullanıcı profil bilgilerini gösterir |
| `!hesapla [işlem]` | Basit matematik işlemi yapar |
| `!renk` | Rastgele renk kodu üretir |
| `!sunucu` | Sunucu bilgilerini gösterir |
| `!avatar [@kullanıcı]` | Avatar resmini gösterir |
| `!davet` | Bot davet linkini verir |

## Deployment

### Railway (Ücretsiz)
1. [Railway](https://railway.app)'e kayıt ol
2. GitHub repo'yu bağla
3. Environment variable ekle: `DISCORD_BOT_TOKEN`
4. Deploy et

### DigitalOcean ($5/ay)
1. Droplet oluştur (Ubuntu)
2. Java 17 yükle
3. JAR dosyasını upload et
4. Systemd service oluştur

## Geliştirme

Yeni komut eklemek için `onMessageReceived` metoduna yeni `if` bloğu ekle:

```java
if (message.startsWith("!yenikomut")) {
    event.getChannel().sendMessage("Yeni komut çalışıyor!").queue();
}
```

## Güvenlik

- ⚠️ Bot token'ını asla kodda hardcode etme
- ✅ Environment variable kullan
- ✅ .env dosyasını .gitignore'a ekle