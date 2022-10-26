import java.util.Scanner;

public class Brawo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("jak masz na imie?");
        String imie=sc.next();

        for (int i = 0; i < 5; i++) {
            System.out.println("Brawo  " + imie);

        }
    }
}
