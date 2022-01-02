import java.util.ArrayList;
import java.util.List;

public class Chapter {

    private String chapterName;
    private List<SubChapter> subChaptersList =new ArrayList<SubChapter>();


    public Chapter(String chapterName){
        this.chapterName=chapterName;
    }

    public String getChapterName() {
        return chapterName;
    }

    public int createSubChapter(String subChapterName){
        SubChapter subChapter = new SubChapter(subChapterName);
        this.subChaptersList.add(subChapter);
        return this.subChaptersList.size()-1;
    }

    public SubChapter getSubChapter(Integer index){
        return this.subChaptersList.get(index);
    }

    public void print(){
        System.out.println("Chapter name: "+this.getChapterName());
        System.out.println(this.subChaptersList);
    }
}
