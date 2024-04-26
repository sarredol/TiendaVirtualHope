package users;

public class User {

    // Atributos encapsulados con el modificador private
    private int id;
    private String name;
    private String lastName;
    private String phone;
    private String mail;
    private String password;



    // Constructor de la clase

    // Un constructor es el metodo de la clase, que permite instanciar el objecto  enicilizar los atributos deacuerdo a la logica de negocio
    public User(){

    }

    // Getter and Setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
