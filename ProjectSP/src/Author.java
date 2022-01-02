public class Author {

    private String authorName;

    public Author(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void print(){
        System.out.println("Author name: "+this.authorName);
    }
}
