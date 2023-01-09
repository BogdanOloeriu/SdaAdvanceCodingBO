package homework.advance.coding.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookRepository {

    private final List<Book> bookList = new ArrayList<>();

    public List<Book> getBookList(){
        return new ArrayList<>(bookList);
    }

    public void addBook(Book book){
        if(!bookList.contains(book)){
            bookList.add(book);
        }else{
            System.out.println("Book already exist in the list!");
        }
    }

    public void removeBook(Book book){
        if(bookList.contains(book)){
            bookList.remove(book);
        }else{
            throw new NoBookFoundException("Book does not exist in the Library!");
        }
    }

    public List<Book> getBookAfterName(String name){
        return bookList.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    public List<Book> getBookById(int id){
        return bookList.stream()
                .filter(book -> book.getId() == id)
                .collect(Collectors.toList());
    }

    public void removeBookById(int id){
        bookList.remove(getBookById(id));

    }
}
