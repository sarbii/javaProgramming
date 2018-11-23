import java.util.Scanner;
 
public class Ex1 {
    public static void main(String[] args) {
        reserve_system();
            
    }
    public static void charBar(){
        for(int i=1;i<21;i++)
            System.out.print("*");
        System.out.println();
    }
    public static void reserve_system(){
        Scanner sc = new Scanner(System.in);
        
        int size;
        char yn=0;
        String str;
        int reserve;
        System.out.print("�¼��� ũ�� �Է� : ");
        size=sc.nextInt();
        
        int[] seats = new int[size];//�ڵ����� �迭�� �ʱ�ȭ-->�迭�� �������̹Ƿ� 0�� �ʱⰪ���� ����,�Ҽ����̸� 0.0�� �ʱⰪ
        while(true){
            System.out.print("�����Ͻðڽ��ϱ�?");
            str=sc.next();
            yn =str.charAt(0); 
            
            
            if(yn == 'y'){
               charBar();
                seatDisplay(seats);
                charBar();
                System.out.println("���°�¼��� �����Ͻðڽ��ϱ�? : ");
                reserve = sc.nextInt();
                if(reserve>seats.length){
                    System.out.println("���� �¼���ȣ�Դϴ�.1~"+size+"������ ���� �Է��ϼ���");
                    continue;
                }
                if(seats[reserve-1] == 0){
                    seats[reserve-1] = 1;
                    System.out.println("����Ǿ����ϴ�.");
                    charBar();
                    seatDisplay(seats);
                    charBar();
                }
                else if(seats[reserve-1] == 1){
                    System.out.print("�̹� ����� �¼��Դϴ�.");
                }
                
                
                
            }else if(yn == 'n'){
                charBar();
                System.out.println("���� �ý��� ����");
                charBar();
                System.exit(0);//break;
            }
            else{
                System.out.println("�����Ϸ��� y �����Ͻ÷���n�� �Է����ּ���");
            }
        }
    }
    public static void seatDisplay(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.printf(" %d",i+1);
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.printf(" %d",arr[i]);
        }
        System.out.println();
    }
 
}


