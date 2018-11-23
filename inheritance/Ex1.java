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
        System.out.print("좌석의 크기 입력 : ");
        size=sc.nextInt();
        
        int[] seats = new int[size];//자동으로 배열이 초기화-->배열이 정수형이므로 0을 초기값으로 가짐,소수형이면 0.0이 초기값
        while(true){
            System.out.print("예약하시겠습니까?");
            str=sc.next();
            yn =str.charAt(0); 
            
            
            if(yn == 'y'){
               charBar();
                seatDisplay(seats);
                charBar();
                System.out.println("몇번째좌석을 예약하시겠습니까? : ");
                reserve = sc.nextInt();
                if(reserve>seats.length){
                    System.out.println("없는 좌석번호입니다.1~"+size+"사이의 수를 입력하세요");
                    continue;
                }
                if(seats[reserve-1] == 0){
                    seats[reserve-1] = 1;
                    System.out.println("예약되었습니다.");
                    charBar();
                    seatDisplay(seats);
                    charBar();
                }
                else if(seats[reserve-1] == 1){
                    System.out.print("이미 예약된 좌석입니다.");
                }
                
                
                
            }else if(yn == 'n'){
                charBar();
                System.out.println("예약 시스템 종료");
                charBar();
                System.exit(0);//break;
            }
            else{
                System.out.println("예약하려면 y 종료하시려면n을 입력해주세요");
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


