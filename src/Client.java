import java.util.UUID;

public class Client {
    private String ID = UUID.randomUUID().toString().toUpperCase().substring(0, 6);
    private String name;
    private String gender;

    public Client() {
    }

    public Client(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {

        this.ID = ID;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getGender() {

        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


public void showClient(Client c) {
    System.out.println("CLIENTE: " + c.getName() + " sexo: " + c.getGender());
}

    }