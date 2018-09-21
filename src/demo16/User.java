package demo16;

public class User implements Singer, Runner {
    private int id;
    private String name;
    private double runTime;

    public User() {
    }

    public User(int id, String name, double runTime) {
        this.id = id;
        this.name = name;
        this.runTime = runTime;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public double getRunTime() {
        return runTime;
    }

    public void setRunTime(double runTime) {
        this.runTime = runTime;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (getId() != user.getId()) return false;
        return getName().equals(user.getName());
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getName().hashCode();
        return result;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void sing() {
        System.out.println("lalalallalalalala");

    }

    @Override
    public double run() {
        return runTime;
    }
}
