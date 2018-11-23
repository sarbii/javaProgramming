import java.util.Scanner;
 
class Alpabet{
    String str;
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 :");
        str = sc.nextLine();
        
    }
    public void alpacount(){
        int vowel=0, consonant=0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            switch(c){
            case 'a': case 'e': case 'i': case 'o': case 'u': 
            case 'A': case 'E': case 'I': case 'O': case 'U':
                
                vowel++; break;
            case ' ':
                break;
            default:
                consonant++; break;
            }
        }
        System.out.println("모음의 개수는 :"+vowel+" 자음의 개수는 :"+consonant);
        
    }
}
public class AlpabetTest {
    public static void main(String[] args) {
        Alpabet al = new Alpabet();
        al.input();
        al.alpacount();
        
    }
}

