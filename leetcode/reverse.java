import java.util.Scanner;

public class reverse{

    public static Scanner scn  = new Scanner(System.in);
    public static void main(String[] args){   
    //  number = -number; making a number postive and negative
       int number = scn.nextInt();
      
      
           int a = num(number);
           System.out.println(a);
      
             
    }
    public static int num(int number){
        int n1=0,res=0;
    
       while(number!=0){
           res = number%10;
           n1 = (n1*10) + res;
           number/=10;

       }
       return n1;
    }
}