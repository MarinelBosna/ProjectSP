import java.util.ArrayList;
import java.util.List;

public class Chapter {

    private String chapterName;
    private List<SubChapter> subChaptersList =new ArrayList<SubChapter>();


    public Chapter(String chapterName){
        this.chapterName=chapterName;
    }

    public int createSubChapter(String subChapterName){
        SubChapter subChapter = new SubChapter(subChapterName);
        this.subChaptersList.add(subChapter);
        return this.subChaptersList.size()-1;
    }

    public SubChapter getSubChapter(Integer index){
        return this.subChaptersList.get(index);
    }

}
