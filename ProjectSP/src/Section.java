import java.util.ArrayList;
import java.util.List;

public class Section extends Element {


    private String sectionTitle;
    private List<Element> layerElement=new ArrayList<Element>();


    public Section(String sectionTitle){
        this.sectionTitle=sectionTitle;
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
}
