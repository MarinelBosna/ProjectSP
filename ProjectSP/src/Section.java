import java.util.ArrayList;
import java.util.List;

public class Section extends Element {


    private String sectionTitle;
    private List<Element> layerElement=new ArrayList<Element>();


    public Section(String sectionTitle){
        this.sectionTitle=sectionTitle;
    }

    public void setTitle(String sectionTitle){
        this.sectionTitle=sectionTitle;
    }

    public String getTitle()
    {
        return this.sectionTitle;
    }



    @Override
    public void print() {
        System.out.println(this.sectionTitle);
        for(Element e:layerElement){
            e.print();
        }
    }

    @Override
    public void add(Element e) {
        this.layerElement.add(e);
    }

    @Override
    public void remove(Element e) {
        this.layerElement.remove(e);
    }

    @Override
    public Element get(Integer e) {
        return this.layerElement.get(e);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

        for(Element child:layerElement){
            child.accept(visitor);
        }
    }
}
