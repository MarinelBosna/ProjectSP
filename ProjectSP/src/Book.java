import java.util.ArrayList;
import java.util.List;

public class Book {

    private String bookTitle;
    private List<Author> bookAuthors = new ArrayList<Author>();
    private List<Element> bookContents=new ArrayList<Element>();


    public Book(String bookTitle){
        this.bookTitle=bookTitle;
    }

    public void addAuthor(Author author){
        this.bookAuthors.add(author);
    }

    public void addContent(Element content){
        this.bookContents.add(content);
    }

    public void print(){
        System.out.println("Book:"+this.bookTitle);
        System.out.println("Authors: ");
        for(Author a:bookAuthors){
            System.out.println("Author: "+a.getAuthorName()+" ");
        }
        for(Element e:bookContents){
            e.print();
        }
    }
}
