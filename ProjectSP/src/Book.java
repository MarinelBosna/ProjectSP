import java.util.ArrayList;
import java.util.List;

public class Book {

    private String bookTitle;
    private List<Author> bookAuthors = new ArrayList<Author>();
    private List<Chapter> bookChapters = new ArrayList<Chapter>();
    private List<Image> bookImages=new ArrayList<Image>();
    private List<Paragraph> bookParagraphs=new ArrayList<Paragraph>();
    private List<Table> bookTables = new ArrayList<Table>();

    public Book(String bookTitle){
        this.bookTitle=bookTitle;
    }

    public void createNewImage(String imageName){
        Image image = new Image(  imageName );
        this.bookImages.add(image);
    }
    public void createNewTable(String tableName){
        Table table = new Table(tableName);
        this.bookTables.add(table);
    }

    public void createNewParagraph(String paragraphName){
        Paragraph paragraph = new Paragraph(  paragraphName );
        this.bookParagraphs.add(paragraph);
    }

    public void print(){
        System.out.println("Subchapter: "+this.bookTitle);

        for(Paragraph paragraph : this.bookParagraphs){
            paragraph.print();
        }
        for(Image image : this.bookImages){
            image.print();
        }
        for(Table table : this.bookTables){
            table.print();
        }
    }
}
