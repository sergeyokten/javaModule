package demo23;

public class Engine {


    private String engineModel;
    private double engineVolume;
    private int horsePower;

    public Engine() {
    }

    public Engine(String engineModel, double engineVolume, int horsePower) {
        this.engineModel = engineModel;
        this.engineVolume = engineVolume;
        this.horsePower = horsePower;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Engine)) return false;

        Engine engine = (Engine) o;

        if (Double.compare(engine.getEngineVolume(), getEngineVolume()) != 0) return false;
        if (getHorsePower() != engine.getHorsePower()) return false;
        return getEngineModel() != null ? getEngineModel().equals(engine.getEngineModel()) : engine.getEngineModel() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getEngineModel() != null ? getEngineModel().hashCode() : 0;
        temp = Double.doubleToLongBits(getEngineVolume());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getHorsePower();
        return result;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineModel='" + engineModel + '\'' +
                ", engineVolume=" + engineVolume +
                ", horsePower=" + horsePower +
                '}';
    }

    public void start(int time) {
        if(time>2) System.out.println("engine work");
        else System.out.println("engine not work");
    }

}
