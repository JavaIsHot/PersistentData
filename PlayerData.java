import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.NamespacedKey;
import org.bukkit.persistence.PersistentDataType;

public class PlayerData {
    public static PersistentDataContainer getContainer(Player player) {
        return player.getPersistentDataContainer();
    }

    public static NamespacedKey key(Enum<?> key) {
        return new NamespacedKey(new MyPluginMainClass(), key.toString().toLowercase());
    }

    @SuppressWarnings("all")
    public static String getString(Player player, String data) {
        return getContainer(player).get(key(data), PersistentDataType.STRING);
    }

    @SuppressWarnings("all")
    public static void setString(Player player, Enum<?> key, String data) {
        getContainer(player).set(key(key), PersistentDataType.STRING, data);
    }
    
    @SuppressWarnings("all")
    public static double getDouble(Player player, String data) {
        return getContainer(player).get(key(data), PersistentDataType.DOUBLE);
    }
    
    @SuppressWarnings("all")
    public static void setDouble(Player player, Enum<?> key, Double data) {
        getContainer(player).set(key(key), PersistentDataType.DOUBLE, data);
    }
    
    @SuppressWarnings("all")
    public static boolean getBoolean(Player player, String data) {
        return getContainer(player).get(key(data), PersistentDataType.DOUBLE);
    }
    
    @SuppressWarnings("all")
    public static void setBoolean(Player player, Enum<?> key, Double data) {
        getContainer(player).set(key(key), PersistentDataType.DOUBLE, data);
    }

    public static void initiate(Player player) {
        PlayerData.setDouble(player, ExampleEnum.CASH, 999);
    }
}
