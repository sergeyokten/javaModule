package demo39_set_treeSet;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User implements Comparable<User>  {
    private int id;
    private String name;


    // o1 -> this o2->o
    @Override
    public int compareTo(User o) {
        return this.id - o.id;
    }
}
