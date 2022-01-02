import java.util.ArrayList;
import java.util.List;

public class Book {

    private String bookTitle;
    private List<Author> bookAuthors = new ArrayList<Author>();
    private List<Chapter> bookChapters = new ArrayList<Chapter>();


    public Book(String bookTitle){
        this.bookTitle=bookTitle;
    }

    public void addAuthor(Author author){
        this.bookAuthors.add(author);
    }

    public int createChapter(String chapterName){
        Chapter chapter = new Chapter( chapterName );
        this.bookChapters.add(chapter);
        return this.bookChapters.size()-1;
    }

    public Chapter getChapter(Integer index){
        return this.bookChapters.get(index);
    }


}
