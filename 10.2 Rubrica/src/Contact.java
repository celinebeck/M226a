public class Contact {
    //parametri
    private String id;
    private String name;
    private String surname;
    private String phone;
    private String email;
    //costruttore
    public Contact(String id, String name, String surname, String phone, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
    }
    //getter setter
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }

}
