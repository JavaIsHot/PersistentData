package your.package.here;

import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.NamespacedKey;
import org.bukkit.persistence.PersistentDataType;

public class PlayerData {
    public static PersistentDataContainer getContainer(Player player) {
        return player.getPersistentDataContainer();
    }

    public static NamespacedKey key(String key) {
        return new NamespacedKey(new YourPluginsMainClass(), key.toLowercase());
    }

    @SuppressWarnings("all")
    public static double getDouble(Player player, String data) {
        return getContainer(player).get(key(data), PersistentDataType.DOUBLE);
    }

    @SuppressWarnings("all")
    public static String getString(Player player, String data) {
        return getContainer(player).get(key(data), PersistentDataType.STRING);
    }

    @SuppressWarnings("all")
    public static void setDouble(Player player, String key, Double data) {
        getContainer(player).set(key(key), PersistentDataType.DOUBLE, data);
    }

    @SuppressWarnings("all")
    public static void setString(Player player, String key, String data) {
        getContainer(player).set(key(key), PersistentDataType.STRING, data);
    }

    public static void initiate(Player player) {
        PlayerData.setDouble(player, "exampleData", 0.0);
    }
}
