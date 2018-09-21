package demo16;

public class Student implements Singer, Runner {
    private String name;
    private double time;

    private String group;

    public Student() {
    }

    public Student(String name, double time, String group) {
        this.name = name;
        this.time = time;
        this.group = group;
    }

    public Student(String name, String group) {
        this.name = name;
        this.group = group;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public Student(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (!getName().equals(student.getName())) return false;
        return getGroup().equals(student.getGroup());
    }


    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getGroup().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                '}';
    }


    public void sing() {
        System.out.println("tralalalalal");
    }

    @Override
    public double run() {
        return time;
    }
}
