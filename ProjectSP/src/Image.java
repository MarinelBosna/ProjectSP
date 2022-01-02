import java.util.concurrent.TimeUnit;

public class Image extends Element{

    private String imageName;

    public String getImageName() {
        return imageName;
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
}
