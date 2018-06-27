import java.util.Scanner;

/**
 * Created by Kai on 6/26/2018.
 */
public class IntroExercises {

    public IntroExercises(){
        asterisk();
        horizontalLine();
        verticalLine();
        rightTriangle();
    }
    private void asterisk(){
        System.out.print("Asterisk: \n");
        System.out.print("\t*\n");
    }

    private void horizontalLine(){
        System.out.print("Horizontal Line: \n");
        System.out.print("\tInput Line Length:");
        Scanner userIn = new Scanner(System.in);
        int n = userIn.nextInt();
        for (int i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    private void verticalLine(){
        System.out.print("Vertical Line: \n");
        System.out.print("\tInput Line height:");
        Scanner userIn = new Scanner(System.in);
        int n = userIn.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("*");
        }
    }

    private void rightTriangle(){
        System.out.print("Right Triangle: \n");
        System.out.print("\tInput triangle height:");
        Scanner userIn = new Scanner(System.in);
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
}


