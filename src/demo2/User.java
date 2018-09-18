package demo2;

public class User {
    public long id = 0;
    public String login = null;
    public String password = null;
    public int age = 0;
    public String sex = null;
    public float weight = 0.0F;
    public double height = 0.0;
    public boolean isActive = false;
    public char specialSymbol = ' ';

    public User() {
        System.out.println("user created");
        System.out.println(this);
    }


    public User(long id,
                String login,
                String password,
                byte age,
                String sex,
                float weight,
                double height,
                boolean isActive,
                char specialSymbol) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
        this.isActive = isActive;
        this.specialSymbol = specialSymbol;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", isActive=" + isActive +
                ", specialSymbol=" + specialSymbol +
                '}';
    }
}
