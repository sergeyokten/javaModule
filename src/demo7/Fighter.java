package demo7;

public class Fighter {
    String name;
    int power;

    public Fighter() {
    }

    public Fighter(String name, int power) {
        this.name = name;
        this.power = power;
    }


    @Override
    public String toString() {
        return "Fighter{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }
}
