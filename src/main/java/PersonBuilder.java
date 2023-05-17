public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String city;


    public PersonBuilder setName(final String name) throws IllegalStateException {
        if (name != null) {
            this.name = name;
            return this;
        } else {
            throw new IllegalStateException("Name parameter missing");
        }
    }

    public PersonBuilder setSurname(final String surname) throws IllegalStateException {
        if (surname != null) {
            this.surname = surname;
            return this;
        } else {
            throw new IllegalStateException("Surname parameter missing");
        }
    }

    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age >= 0) {
            this.age = age;
            return this;
        } else {
            throw new IllegalArgumentException("Incorrect age!");
        }
    }

    public PersonBuilder setAddress(String city) {
        this.city = city;
        return this;
    }

    public Person build() throws IllegalStateException, IllegalArgumentException {

        return new Person(this);
    }

}

