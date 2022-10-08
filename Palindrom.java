/***
Name: Tlatso Tsebe
Student ID: 202004312
Prgram: Given a palindrom
 */
 import java.util.Scanner;
 public class Palindrom{

    public static String Pal(String string){
        String reverse = "";
        String reverse2 = "";
        String new_string = "";
        String final_string = "";
        String s;
          StringBuilder sb = new StringBuilder();
         for(int i = string.length()-1; i >0; i--){
            reverse = reverse + string.charAt(i); //take the charaters of the string
        }

        if(reverse.equals(string)){ //check if the characters are equal from start to end
                System.out.printf("Palindrom found\n");
                System.out.println(reverse);
            }
         else {
            for(int i = 0; i < string.length()-1; i++){
               //  StringBuilder str = new StringBuilder();
  //String string = "Hello, kaam karo!"
 
                char b= reverse.charAt(i);   

                 sb.append(b);
                 new_string  = sb.toString();
                  System.out.println("new here:" +new_string);

                
                final_string = new_string + string; 
               System.out.println("here:" + final_string);

                 for(int j =  final_string.length()-1; j > 0; j--){
                   reverse2 = reverse2 +  final_string.charAt(j); //take the charaters of the string
               }

            if(reverse2.equals(final_string)){ //check if the characters are equal from start to end
                System.out.printf("Palindrom found\n");
                System.out.println(reverse2);

            }
            }
         }
        return string;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter String: ");
        String str = in.nextLine();
        Pal(str);
    }
 }
 