public class Table extends Element{

    private String tableTitle;

    public Table(String tableTitle){
        this.tableTitle=tableTitle;
    }

    public String getTitle() {
        return tableTitle;
    }

    public void setTitle(String tableTitle) {
        this.tableTitle = tableTitle;
    }

    public void print() {
        System.out.println("Table with title: "+this.tableTitle);
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
