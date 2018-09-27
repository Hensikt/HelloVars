import javax.swing.plaf.synth.SynthMenuBarUI;
import java.util.Scanner;

public class HelloVars {
    public static void main (String[] args) {
        String name = "Hensikt";
        String lastname = "Jergenson";
        int studyyear = 1;
        double number = 2.2;

        System.out.println(name + " " + lastname);
        System.out.println(studyyear);

        System.out.println("Hello Variables");

        Scanner scan = new Scanner(System.in);
        name = scan.next();
        System.out.println(name);
    }
}
