import java.sql.SQLOutput;
import java.util.Scanner;

public class LearnMethods {
    int age;
    static int newAge;

    //non return type without parameter method
    public void todayDate() {
        int a = 4;
        int b = 5;
        int sum = a + b;
        System.out.println("My Some is " + sum);
        System.out.println("todays date is 14 july");
    }

    //non return with parameter method
    public void summerActivity(int x, int y) {

//        System.out.println(city + " is most tourist Visting place in" + " " + Country);
//        System.out.println("Raza ");
//        int a = 4;
//        int b = 5;
        int sum = x + y;
        System.out.println("My Sum is " + sum);

    }
    //Return type without parameter

    public int doRemainder() {
        int a = 200;
        int b = 3;
        int myRemainder = a % b;
//        System.out.println("My Remainder Value is");
//        System.out.println("My Remainder Value is");
        return myRemainder;


    }
    //Return Type with parameter

    public int doDiv(int x,int y){
        int myDiv = x/y;
       System.out.println("Mu Division is "+myDiv);
        return myDiv;
    }



    public static void main(String[] args) {
        LearnMethods obj = new LearnMethods();
        obj.todayDate();
        obj.summerActivity(10, 200);
        int x = obj.doRemainder();
        System.out.println(x);
        int xyz=obj.doDiv(20,5);

       System.out.println(xyz);


    }
}
