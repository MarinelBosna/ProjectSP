import java.util.ArrayList;
import java.util.List;

public class SubChapter {

    private String name;
    private List<Image> bookImages=new ArrayList<Image>();
    private List<Paragraph> bookParagraphs=new ArrayList<Paragraph>();
    private List<Table> bookTables = new ArrayList<Table>();

    SubChapter(String name) {
        this.name = name;
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
        System.out.println("Subchapter: "+this.name);

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
