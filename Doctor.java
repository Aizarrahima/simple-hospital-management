public class Doctor {
    String name;
    int age;
    String specialist;

    public Doctor(String name, int age, String specialist) {
        this.name = name;
        this.age = age;
        this.specialist = specialist;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", specialist='" + specialist + '\'' +
                '}';
    }
}
