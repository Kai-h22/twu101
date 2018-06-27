import java.util.Scanner;

/**
 * Created by Kai on 6/26/2018.
 */
public class IntroExercises {

    public IntroExercises(){
        asterisk();
        horizontalLine();
        verticalLine();
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
}

