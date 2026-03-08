public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    // Copy constructor (dùng cho deep copy)
    public Person(Person other) {
        this.name = other.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }
}
