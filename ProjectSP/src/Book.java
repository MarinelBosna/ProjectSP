import java.util.ArrayList;
import java.util.List;

public class Book implements Visite{

    private String bookTitle;
    private List<Author> bookAuthors = new ArrayList<Author>();
    private List<Image> bookImages=new ArrayList<Image>();
    private List<Paragraph> bookParagraphs=new ArrayList<Paragraph>();
    private List<Table> bookTables = new ArrayList<Table>();
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

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

        for(Element content : bookContents){
            content.accept(visitor);
        }
    }
}
