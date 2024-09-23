import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.NamespacedKey;
import org.bukkit.persistence.PersistentDataType;

public class PlayerData {
	public static PersistentDataContainer getContainer(Player player) {
		return player.getPersistentDataContainer();
	}

	public static NamespacedKey key(Enum<?> key) {
		return new NamespacedKey(new YourPluginMainClass(), key.toString().toLowercase());
	}

	@SuppressWarnings("all")
	public static String getString(Player player, Enum<?> key) {
		return getContainer(player).get(key(key), PersistentDataType.STRING);
	}

	@SuppressWarnings("all")
	public static void setString(Player player, Enum<?> key, String data) {
		getContainer(player).set(key(key), PersistentDataType.STRING, data);
	}

	@SuppressWarnings("all")
	public static double getDouble(Player player, Enum<?> key) {
		return getContainer(player).get(key(key), PersistentDataType.DOUBLE);
	}

	@SuppressWarnings("all")
	public static void setDouble(Player player, Enum<?> key, Double data) {
		getContainer(player).set(key(key), PersistentDataType.DOUBLE, data);
	}

	@SuppressWarnings("all")
	public static boolean getBoolean(Player player, Enum<?> key) {
		return getContainer(player).get(key(key), PersistentDataType.BOOLEAN);
	}

	@SuppressWarnings("all")
	public static void setBoolean(Player player, Enum<?> key, boolean data) {
		getContainer(player).set(key(key), PersistentDataType.BOOLEAN, data);
	}

	public static void initiate(Player player) {
		PlayerData.setDouble(player, ExampleEnumClass.CASH, 999);
	}
}
