public class Table {

    private String tableTitle;


    public Table(String tableTitle){
        this.tableTitle=tableTitle;
    }

    public void print() {
        System.out.println("Table with title: "+this.tableTitle);
    }

}
