import java.util.concurrent.TimeUnit;

public class Image extends Element{

    private String url;
    private PicturecContent content=new PicturecContent();

    private String imageName;

    public String getImageName() {
        return imageName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Image(String name) {
        imageName = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    public void print() {
        System.out.println("Image with name: "+this.getImageName());
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
