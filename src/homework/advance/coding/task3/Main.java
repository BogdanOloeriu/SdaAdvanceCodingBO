package homework.advance.coding.task3;

public class Main {

    public static void main(String[] args) {

        BookRepository library = new BookRepository();
        Book book1 = new Book(1,"Ursul pacalit de vulpe","Ion Creanga",1980);
        Book book2 = new Book(2,"Tesla","Tesla",2010);
        Book book3 = new Book(3,"title3","Author3",2020);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println(library.getBookAfterName("Tesla"));

        library.removeBookById(3);

        for(Book book : library.getBookList()){
            System.out.println(book);
        }
    }





}
