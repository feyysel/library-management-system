public class Author {
    private int authorId;
    private String name;

    public Author(int authorId, String name) {
        this.authorId = authorId;
        this.name = name;
    }

    public void getAuthorInfo() {
        System.out.println("Author ID: " + authorId);
        System.out.println("Name: " + name);
    }
}
