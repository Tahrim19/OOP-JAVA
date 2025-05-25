class Book extends LibraryItem implements Borrowable {
    private boolean isBorrowed;

    Book(String title, String author, int id){
        super(title, author, id);
        this.isBorrowed = false;
    }

    @Override
    public void borrowItem(){
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("Book borrowed.");
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    @Override
    public void returnItem(){
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("Book returned.");
        } else {
            System.out.println("Book was not borrowed.");
        }
    }

    @Override
    void displayInfo(){
        System.out.println("Title: " + getTitle() +
                ", Author: " + getAuthor() +
                ", ID: " + getId() +
                ", Borrowed: " + isBorrowed);
    }
}
