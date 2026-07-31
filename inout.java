import java.util.*;
class inout{
    public static void main(String a[]){
        // System.out.print("Good Morning\n");
        // System.out.print("Good Morning\n");
        // System.out.print("Good Morning");
        // int abhi = 20
        // int x = 10,b = 5;  /** instead of a x is given bcz a is already used in String a[] **/
        // int b = 20;
        // int result = ((x*b) / (x - b));
        // System.out.print("Enter the name : ");
        // System.out.println(name);       
        // System.out.print(result);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter values of a1 and b1 : " );
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int sum = a1 + b1;
        System.out.print("Sum of both " + a1 + " and " + b1 + " is " + sum );
    }
}