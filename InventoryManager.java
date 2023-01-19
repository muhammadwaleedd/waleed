
import java.util.ArrayList;

public class InventoryManager {

    private ArrayList<Integer> inventory;

    public InventoryManager() {
        inventory = new ArrayList<Integer>();
    }

    public synchronized void addItem(int item) {
        inventory.add(item);
    }

    public synchronized void removeItem(int item) {
        inventory.remove(item);
    }

    public synchronized int getInventorySize() {
        return inventory.size();
    }
}
