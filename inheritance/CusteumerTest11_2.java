class Person{
    private String name,addr,phone;
    public Person() {
        
    }
    public Person(String name, String addr, String phone){
        this.name = name;
        this.addr = addr;
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddr() {
        return addr;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}
class Customer extends Person{
    String custom_num;
    int mileage;
    
    public Customer() {
        
    }
    public Customer(String custom_num,int mileage){
        super();
        this.custom_num = custom_num;
        this.mileage = mileage;
    }
}
 
 





public class CusteumerTest {
    public static void main(String[] args) {
        Person p1 = new Person("김씨", "김주소"    , "010-3232-0322");
        Customer c1 = new Customer("1번고객", 2323);
        
        System.out.println("이름 : "+p1.getName());
        System.out.println("주소 : "+p1.getAddr());
        System.out.println("전화번호 : "+p1.getPhone());
        System.out.println("고객번호 : "+c1.custom_num);
        //private와 public의 차이를 보기위하여 p1,c1의 차이를 두었다.
        System.out.println("마일리지 : "+c1.mileage);
        
    }
    
}