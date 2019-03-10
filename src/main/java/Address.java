public class Address {
   private int num;
   private String street;

    public int getNum() {
        return num;
    }

    public Address(){
    this(0);
    }
    public Address(int num){
        this(num,"null");
    }

    public Address(int num, String street) {
        this.num = num;
        this.street = street;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "num=" + num +
                ", street='" + street + '\'' +
                '}';
    }
}
