import java.util.ArrayList;

public class Library {
    private static ArrayList<LibraryItem> items = new ArrayList<>();

    public static void addItem(LibraryItem item) {
        items.add(item);
        System.out.println("Item added to library: " + item.getTitle());
    }

    public static void removeItemById(int id) {
        LibraryItem itemToRemove = null;
        for (LibraryItem item : items) {
            if (item.getId() == id) {
                itemToRemove = item;
                break;
            }
        }
        if (itemToRemove != null) {
            items.remove(itemToRemove);
            System.out.println("Item removed: " + itemToRemove.getTitle());
        } else {
            System.out.println("Item with ID " + id + " not found.");
        }
    }

    public static void showAllItems() {
        if (items.isEmpty()) {
            System.out.println("No items in the library.");
            return;
        }
        System.out.println("Library Items:");
        for (LibraryItem item : items) {
            item.displayInfo();
        }
    }

    public static LibraryItem findItemById(int id) {
        for (LibraryItem item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        System.out.println("Item with ID " + id + " not found.");
        return null;
    }
}
