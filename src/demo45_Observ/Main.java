package demo45_Observ;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MeteoStation meteoStation = new MeteoStation();
        meteoStation.changeTempAndDoNotifySubscribers(10);



    }
}

@Getter
@Setter
@EqualsAndHashCode
@ToString
class User {
    private int id;
    private String name;
    private String typeOfShoe;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void wichShoeChoose(int temp) {
        if (temp <= 0) {
            this.typeOfShoe = "winter shoe";
            System.out.println(this);
        } else if (temp > 0 && temp < 17) {
            this.typeOfShoe = "autumn shoe";
            System.out.println(this);
        } else {
            this.typeOfShoe = "summer shoe";
            System.out.println(this);
        }
    }

}

class MeteoStation {
    private int temp;
    private List<User> subscribers;

    public MeteoStation() {
        subscribers = new ArrayList<>();
        subscribers.add(new User(2, "kokos"));
        subscribers.add(new User(1, "ananas"));
        subscribers.add(new User(3, "banan"));
        subscribers.add(new User(5, "tomat"));
        subscribers.add(new User(4, "potatos"));
        subscribers.add(new User(6, "mango"));
    }

    public MeteoStation(int temp, List<User> subscribers) {
        this.temp = temp;
        this.subscribers = subscribers;
    }

    public void addSubscriber(User user) {
        subscribers.add(user);
    }

    public void removeSubscriber(User user) {
        subscribers.remove(user);
    }


    public void changeTempAndDoNotifySubscribers(int newTemp) {
        this.temp = newTemp;
        for (User subscriber : subscribers) {
            subscriber.wichShoeChoose(temp);
        }
    }

}

