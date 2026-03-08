public class Rabbit implements Cloneable {
    private String name;
    private int age;
    private Person owner; // Bài 5b: mutable object

    // Constructor bài 5a (không có owner)
    public Rabbit(String name, int age) {
        this.name = name;
        this.age = age;
        this.owner = null;
    }

    // Constructor bài 5b (có owner)
    public Rabbit(String name, int age, Person owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    // Deep clone: tạo bản sao mới cho cả Person owner
    @Override
    public Rabbit clone() {
        try {
            Rabbit cloned = (Rabbit) super.clone();
            // Deep copy: tạo Person mới để tránh shallow copy
            if (this.owner != null) {
                cloned.owner = new Person(this.owner);
            }
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
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
