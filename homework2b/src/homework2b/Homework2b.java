package homework2b;

import java.util.Scanner;

public class Homework2b {

    public static void main(String[] args) 
    {
        System.out.println("type frist intiger and hit enter");
        Scanner first = new Scanner(System.in);
        double a = first.nextInt();
        System.out.println("type second intiger and hit enter");
        Scanner  second= new Scanner(System.in);
        double b = second.nextInt();
        
        if (a==b){
            System.out.println((a+b)*2);
        }
        else if (a>b){
            System.out.println(a+b);
        }
        else if (b>a){
            System.out.println(a+b);
        }
    }
} 