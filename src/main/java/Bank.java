import java.util.List;

public class Bank {

    String bankName;
    Address address;
    private List<Person> personList;

    public Bank(){
        this("null");
    }
    public Bank(String bankName){
        this(bankName,null);
    }
    public Bank(String bankName, Address address){
        this(bankName,address,null);
    }

    public Bank(String bankName, Address address, List<Person> personList) {
        this.bankName = bankName;
        this.address = address;
        this.personList = personList;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", address=" + address +
                ", personList=" + personList +
                '}';
    }
}
