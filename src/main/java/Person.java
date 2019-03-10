public class Person implements Identify {

    private String name;
    private int age;

    @Override
    public void getInfo() {

    }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
