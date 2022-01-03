public class ImageProxy extends Element {

    private String url;
    private Dimension dim;
    private Image realImgage;

    public ImageProxy(String imageOne) {
        super();
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

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

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}