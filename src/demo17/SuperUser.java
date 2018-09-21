package demo17;

public class SuperUser extends User {


    private String role;
    private int wallet;


    public SuperUser() {
        super();

    }

    public SuperUser(int id, String name, String surname, String email, String password, boolean status, String role, int wallet) {
        super(id, name, surname, email, password, status);
        this.role = role;
        this.wallet = wallet;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }


    @Override
    public void greeting() {
        super.greeting();
    }
}
