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
        Person p1 = new Person("�达", "���ּ�"    , "010-3232-0322");
        Customer c1 = new Customer("1����", 2323);
        
        System.out.println("�̸� : "+p1.getName());
        System.out.println("�ּ� : "+p1.getAddr());
        System.out.println("��ȭ��ȣ : "+p1.getPhone());
        System.out.println("����ȣ : "+c1.custom_num);
        //private�� public�� ���̸� �������Ͽ� p1,c1�� ���̸� �ξ���.
        System.out.println("���ϸ��� : "+c1.mileage);
        
    }
    
}