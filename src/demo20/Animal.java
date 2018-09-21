package demo20;

public abstract class Animal {

    private int eyes;
    private int legs;

    public Animal() {
    }

    public Animal(int eyes, int legs) {
        this.eyes = eyes;
        this.legs = legs;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Animal)) return false;

        Animal animal = (Animal) o;

        if (getEyes() != animal.getEyes()) return false;
        return getLegs() == animal.getLegs();
    }

    @Override
    public int hashCode() {
        int result = getEyes();
        result = 31 * result + getLegs();
        return result;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "eyes=" + eyes +
                ", legs=" + legs +
                '}';
    }


    public abstract void run();
}

