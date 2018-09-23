package demo26;

import lombok.*;

public class Main {
    public static void main(String[] args) {

//        User kokos = User.builder().age(21).name("kokos").status(true).build();

//        new User();
    }
}


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
class User {
    @NonNull
    private int id;
    private String name;
    private String surname;
    private int age;
    private boolean status;
    private String asgfdg1;
    private String asgfdg2;
    private String asgfdg3;
    private String asgfdg4;


}
