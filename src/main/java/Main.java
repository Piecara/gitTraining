import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        list.stream().forEach(System.out::println);

        Person person = new Person("Karol",52,new Address(14,"Debowa"));
        Person person1 = new Person("Marek",21,new Address(42,"Malinowa"));
        Person person2 = new Person("Arek",43,new Address(33,"Klonowa"));


        List<Person> personList = new ArrayList<>();

        personList.add(person);
        personList.add(person1);
        personList.add(person2);


        Bank bank = new Bank("bank",new Address(2,"Malinowa"),personList);
        System.out.println(bank.toString());
        System.out.println(bank.findPersonInBank(person));
    }
}
