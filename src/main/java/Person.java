public class Person implements Identify {

    private String name;
    private int age;
    private Address address;


    @Override
    public void getInfo() {

    }

    public Person(){
        this("null");
    }
    public Person(String name){
        this(name, 0);
    }

    public Person(String name,int age){
        this(name,age, null);
    }

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
