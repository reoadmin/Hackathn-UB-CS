/**
*Name: tlatso tsebe
Program: List of integers from 1 till n
Id: 202004312 */
import java.util.Arrays;
public class List{

    public static void List_Integers(int[] Answers){
        for(int i = 0; i < Answers.length-1; i++){
            if(Answers[i]%3 == 0){
                System.out.printf("Fizz\n");
            }
            else if(Answers[i]%5 == 0){
                System.out.printf("Buzz\n");
            }
            else{
                System.out.println(Answers[i]);
            }
            if(Answers[i]%3 == 0 && Answers[i]%5 == 0){
                System.out.printf("FizzBuzz\n");
            }
        }
    }
        public static void main(String[] args){
            int n = 20;
            int[] Answers = new int[n];
            for(int i = 0; i < Answers.length; i++){
                Answers[i] = i;
            }
               System.out.println(Arrays.toString(Answers));
               System.out.printf("********* \n");
               List_Integers(Answers);
               System.out.printf("********* ");
            
        }   
    }