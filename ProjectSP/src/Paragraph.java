public class Paragraph extends Element{

    private String text;
    private AlignStrategy textAlignment;

    public Paragraph(String text){

        this.text=text;
        this.textAlignment = textAlignment;
    }

    public void setAlignStrategy(AlignStrategy strategy){
        this.textAlignment=strategy;
    }

    public void print() {
        if(this.text != null && this.textAlignment != null) {
            this.textAlignment.render(this.text);
        }
    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element get(Integer e) {
        return null;
    }
}
