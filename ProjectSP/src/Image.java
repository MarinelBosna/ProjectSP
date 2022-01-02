public class Image extends Element{

    private String imageName;

    public Image(String imageName){
        this.imageName=imageName;
    }

    public String getImageName() {
        return imageName;
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
