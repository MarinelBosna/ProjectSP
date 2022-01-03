public class GenerateToC implements Visitor {

    private TableOfContent tableOfContent=new TableOfContent("Table of Contents");
    private int sectionNumber=0;
    private int paragraphNumber=0;



    public TableOfContent getToC(){
        return this.tableOfContent;
    }



    @Override
    public void visit(Book book) {

    }

    @Override
    public void visit(Section section) {
        sectionNumber++;
        paragraphNumber=0;
        section.setTitle(section.getTitle()+" "+this.sectionNumber);
        tableOfContent.add(section);
    }

    @Override
    public void visit(TableOfContent tableOfContent) {

    }

    @Override
    public void visit(Paragraph paragraph) {
        paragraphNumber++;
        paragraph.setText(paragraph.getText()+" "+this.paragraphNumber);
        tableOfContent.add(paragraph);
    }

    @Override
    public void visit(ImageProxy imageProxy) {

        paragraphNumber++;

        imageProxy.setUrl(imageProxy.getUrl()+this.paragraphNumber);
        tableOfContent.add(imageProxy);

    }

    @Override
    public void visit(Image image) {
        paragraphNumber++;

        image.setUrl(image.getUrl()+" "+this.paragraphNumber);
        tableOfContent.add(image);
    }

    @Override
    public void visit(Table table) {
        paragraphNumber++;

        table.setTitle(table.getTitle()+" "+this.paragraphNumber);
        tableOfContent.add(table);
    }
}