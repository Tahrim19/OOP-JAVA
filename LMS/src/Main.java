public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho", 101);
        b1.displayInfo();
        b1.borrowItem();
        b1.displayInfo();
        b1.returnItem();
        b1.displayInfo();
        System.out.println("Total library items: " + LibraryItem.getItem());

        Member m1 = new Member("Alice", 1);
        m1.borrowItem(b1);
        m1.showBorrowedItems();
        m1.returnItem(b1);
        m1.showBorrowedItems();
        m1.showBorrowedItems();
        Library.removeItemById(101);
        Library.showAllItems();

    }
}


