public class Rabbit implements Prototype<Rabbit> {
    private String name;
    private int age;
    private Person owner; // Bài 5b: mutable object

    public Rabbit(String name, int age) {
        this.name = name;
        this.age = age;
        this.owner = null;
    }

    public Rabbit(String name, int age, Person owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    // COPY CONSTRUCTOR: Cách làm của bài mẫu Git
    // Giúp thực hiện Deep Copy sạch sẽ hơn dùng super.clone()
    private Rabbit(Rabbit other) {
        this.name = other.name;
        this.age = other.age;
        // Thực hiện Deep Copy cho Person owner nếu có
        if (other.owner != null) {
            this.owner = new Person(other.owner); 
        }
    }

    @Override
    public Rabbit clone() {
        return new Rabbit(this); // Gọi copy constructor
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Rabbit [name=" + name + ", age=" + age +
                (owner != null ? ", owner=" + owner : "") + "]";
    }
}
