package demo11;

public class User {
    private int id;

//    public int getId(String pass) {
//        if (pass.equals("1111")) {
//            return this.id;
//        } else {
//            return -999;
//        }
//    }
//
//    public void setId(int id) {
//        if (id < 0) {
//            System.out.println("error!");
//        } else {
//            this.id = id;
//        }
//
//    }


    private String name;

    public User() {

    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }


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


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
