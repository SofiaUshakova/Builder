public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String city;

    //    public Person(final String surname, final String name) {
//        this.surname = surname;
//        this.name = name;
//    }
//
//    public Person(final String name, final String surname, int age) {
//        this.name = name;
//        this.surname = surname;
//        this.age = age;
//    }
//    Person(final String name, final String surname, int age, String city){
//        this.name = name;
//        this.surname = surname;
//        this.age = age;
//        this.city = city;
//    }
    Person(final PersonBuilder personBuilder) {
        this.name = personBuilder.name;
        this.surname = personBuilder.surname;
        this.age = personBuilder.age;
        this.city = personBuilder.city;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surname)
                .setAge(0)
                .setAddress(city);
    }

    public boolean hasAge(int age) {
        if (Integer.valueOf(age) == null) {
            return false;
        } else return true;

    }

    public boolean hasAddress() {
        if (city.equals(null)) {
            return false;
        } else return true;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return city;
    }

    public void setAddress(String city) {
        if (hasAddress()) this.city = city;
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
        total = total * 15 + Integer.valueOf(age).hashCode();
        total = total * 15 + city.hashCode();
        return total;
    }
}
