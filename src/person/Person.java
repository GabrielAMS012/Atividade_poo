package person;

public class Person {

    private String name;
    private String dateOfBirth;
    private int age;

    public Person(String name, String dateOfBirth, int age) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
    }

    public Person() {
    }

    public Person(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
