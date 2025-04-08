package geVernova.constructors.accessmodifiers.bookLibrarySystem;

class EBook extends Book {
    private String format;

    public EBook(int ISBN, String title, String format) {
        super(ISBN, title);// Call parent constructor
        this.format = format;
    }

    public void displayDetails() {
        System.out.println("EBook ISBN: " + ISBN);
        System.out.println("EBook Title: " + title);
        System.out.println("Format: " + format);
        System.out.println("Author: " + get());
    }

}
