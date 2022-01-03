public interface Visitor {

    public void visit(Book book);
    public void visit(Section section);
    public void visit(TableOfContent tableOfContent);
    public void visit(Paragraph paragraph);
    public void visit(ImageProxy imageProxy);
    public void visit(Image image);
    public void visit(Table table);
}
