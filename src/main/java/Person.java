import java.util.Optional;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected Integer age;
    protected String city;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surname)
                .setAge(0)
                .setAddress(city);
    }

    public boolean hasAge(int age) {
        if (age == 0) {
            return false;
        } else return true;

    }

    public boolean hasAddress() {
        if (city == null) {
            return false;
        } else return true;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public Optional<Integer> getAge() {

        return Optional.ofNullable(age);
    }


    public String getAddress() {
        return city;
    }

    public void setAddress(String city) {
        this.city = city;
    }

    public void happyBirthday(Person person) {
        if (person.hasAge(age)) {
            age++;
            System.out.println(person.getName() + " " + person.getSurname() + " Happy Birthday!");
        }
    }

    @Override
    public String toString() {
        return "Person{ " + "\n Name " + name
                + "\n Surname " + surname
                + "\n Age " + age
                + "\n Address " + city
                + "}";
    }

    @Override
    public int hashCode() {
        int total = 15;
        total = total * 15 + name.hashCode();
        total = total * 15 + surname.hashCode();
        total = total * 15 + age.hashCode();
        total = total * 15 + city.hashCode();
        return total;
    }
}
