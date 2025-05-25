abstract class LibraryItem {
    private String title;
    private String author;
    private int id;
    static int item;

    LibraryItem(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
        item++;
        System.out.println("Title: " + title + " , Author: " + author + " , ID: " + id);
    }

    abstract void displayInfo();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static int getItem() {
        return item;
    }

    public static void setItem(int item) {
        LibraryItem.item = item;
    }
}
