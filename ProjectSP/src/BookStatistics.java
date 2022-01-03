public class BookStatistics implements Visitor{

    private int imagesCounter=0;
    private int tablesCounter=0;
    private int paragraphCounter=0;

    public BookStatistics() {

    }


    @Override
    public void visit(Book book) {

    }

    @Override
    public void visit(Section section) {

    }

    @Override
    public void visit(TableOfContent tableOfContent) {

    }

    @Override
    public void visit(Paragraph paragraph) {
        this.paragraphCounter++;
    }

    @Override
    public void visit(ImageProxy imageProxy) {
        this.imagesCounter++;
    }

    @Override
    public void visit(Image image) {
        this.imagesCounter++;

    }

    @Override
    public void visit(Table table) {
        this.tablesCounter++;
    }


    public void printStatistics(){
        System.out.println("Book Statistics: ");
        System.out.println("Number of images:"+this.imagesCounter);
        System.out.println("Number of tables:"+this.tablesCounter);
        System.out.println("Number of paragraphs:"+this.paragraphCounter);
    }
}