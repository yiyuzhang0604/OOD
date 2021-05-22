public class Author {
    private String name;
    private String email;
    private String address;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public Author(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }
}
