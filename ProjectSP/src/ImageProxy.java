public class ImageProxy extends Element {

    private String url;
    private Dimension dim;
    private Image realImgage;

    private  Image loadImage(){
        if(this.realImgage==null){
            this.realImgage=new Image(url);
        }
        return this.realImgage;
    }


    @Override
    public void print() {

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