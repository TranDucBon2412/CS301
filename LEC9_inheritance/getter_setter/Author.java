package LEC9_inheritance.getter_setter;

public class Author {

    private String authorID;
    private String name;

    public Author(String AuthorID, String name) {
        this.authorID = AuthorID;
        this.name = name;
    }

    public Author() {
    }

    public String getAuthorID() {
        return authorID;
    }

    public void setAuthorID(String authorID) {
        this.authorID = authorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
    return "Author{" +
            "authorID='" + authorID + '\'' +
            ", name='" + name + '\'' +
            '}';
}
}
