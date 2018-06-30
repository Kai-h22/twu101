import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Kai on 6/26/2018.
 */
public class IntroExercises {
    private Scanner userIn = new Scanner(System.in);

    public IntroExercises(int n){
        start(n);
    }
    public void start(int n){
        generate(n);
        asterisk();
        horizontalLine();
        verticalLine();
        rightTriangle();
        isoTriangle();
        diamond();
        nameDiamond();
        fizzBuzz();

    }

    private void asterisk(){
        System.out.print("Asterisk: \n");
        System.out.print("\t*\n");
    }

    private void horizontalLine(){
        System.out.print("Horizontal Line: \n");
        System.out.print("\tInput Line Length:");
        int n = userIn.nextInt();
        for (int i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    private void verticalLine(){
        System.out.print("Vertical Line: \n");
        System.out.print("\tInput Line height:");
        int n = userIn.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("*");
        }
    }

    private void rightTriangle(){
        System.out.print("Right Triangle: \n");
        System.out.print("\tInput triangle height:");
        int n = userIn.nextInt();
        int count = 1;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < count; j++){
                System.out.print("*");
            }
            System.out.println();
            count++;
        }
    }

    private void isoTriangle(){
        System.out.print("Isosceles Triangle: \n");
        System.out.print("\tInput triangle height:");
        int n = userIn.nextInt();
        int count = 1;
        int spaces = n;

        for (int i = 0; i < n; i++){
            for (int k = 0; k <= spaces; k++){
                System.out.print(" ");

            }
            for (int j = 0; j < count; j++){
                System.out.print("*");
            }
            System.out.println();
            spaces--;
            count += 2;
        }
    }

    private void diamond(){
        System.out.print("Diamond: \n");
        System.out.print("\tInput triangle height:");
        int n = userIn.nextInt();
        int count = 1;
        int spaces = n;
        int line = 1;

        for (int i = 0; i < n + (n-1); i++){
            for (int k = 0; k <= spaces; k++){
                System.out.print(" ");

            }
            for (int j = 0; j < count; j++){
                System.out.print("*");
            }
            System.out.println();


            if (line >= n){
                spaces++;
                count -=2;
            }
            else{
                spaces--;
                count += 2;
            }
            line++;


        }
    }

    private void nameDiamond(){
        System.out.print("Diamond: \n");
        System.out.print("\tInput triangle height:");
        int n = userIn.nextInt();
        int count = 1;
        int spaces = n;
        int line = 1;

        for (int i = 0; i < n + (n-1); i++){
            for (int k = 0; k <= spaces; k++){
                System.out.print(" ");

            }
            if (line == n){
                System.out.print("Kai");
            }
            else{
                for (int j = 0; j < count; j++){
                    System.out.print("*");
                }
            }

            System.out.println();


            if (line >= n){
                spaces++;
                count -=2;
            }
            else{
                spaces--;
                count += 2;
            }
            line++;


        }
    }

    private void fizzBuzz(){
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0){
                System.out.println("Fizz");
            }
            else if (i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }

    private void generate(int n){
        ArrayList<Integer> factors = new ArrayList<Integer>();
        //check numbers below value
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                if (factors.size() == 0){
                    factors.add(i);
                }
                else{
                    boolean flag = false;
                    //Check to see if number is prime
                    for (int fac : factors){
                        if (i % fac == 0){
                            flag = true;
                        }
                    }
                    if (!flag){
                        factors.add(i);
                    }
                }

            }
        }
        System.out.println("Prime Factors:");
        factors.forEach(x -> {System.out.print(x); System.out.print(" ");});
        System.out.println();

    }
}


