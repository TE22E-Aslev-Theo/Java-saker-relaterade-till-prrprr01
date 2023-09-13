import java.util.Scanner;
public class program {

    public static void main(String[] args) {
        
        Scanner tangetbord = new Scanner(System.in);
        System.out.println("Divisions program");
        String tal1 = tangetbord.nextLine();
        System.out.println("tal1: " + tal1);
        String tal2 = tangetbord.nextLine();
        System.out.println(tal2);
        double answer = Double.parseDouble(tal1) / Double.parseDouble(tal2);
        System.out.println(answer);

        tangetbord.close();


    }
}