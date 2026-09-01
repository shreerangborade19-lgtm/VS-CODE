import java.util.Scanner;
public class Character{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character");
        char ch = sc.next().charAt(0);
        if(Character.isdigit){
            System.out.println("Charcter is Digit");
        } else{
            if(Character.isLetter(ch)) {
                char lower = Character.toLowerCase(ch);
                if (lower == 'a' || lower == 'e' || lower == 'i' ||
                lower == 'o' || lower == 'u') {
                System.out.println("Vowel");
                        }
                    else{
                        System.out.println("Consonant");
                    }
                } else {
                    System.out.println("Special Character");
                    }
            }
            sc.close();
            }
        }
        
