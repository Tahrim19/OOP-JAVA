import java.util.ArrayList;

public class Member {
    private String name;
    private int memberId;
    private ArrayList<LibraryItem> borrowedItems;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedItems = new ArrayList<>();
        System.out.println("Member created: " + memberId + ": " + name);
    }

    public void borrowItem(LibraryItem item) {
        if (item instanceof Borrowable) {
            Borrowable borrowableItem = (Borrowable) item;
            borrowableItem.borrowItem();
            borrowedItems.add(item);
        } else {
            System.out.println("This item cannot be borrowed.");
        }
    }

    public void returnItem(LibraryItem item) {
        if (borrowedItems.contains(item)) {
            ((Borrowable) item).returnItem();
            borrowedItems.remove(item);
        } else {
            System.out.println("This item was not borrowed by this member.");
        }
    }

    public void showBorrowedItems() {
        System.out.println(name + "'s Borrowed Items:");
        for (LibraryItem item : borrowedItems) {
            item.displayInfo();
        }
    }
}
