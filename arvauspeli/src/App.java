import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        String vastaus = "Emma";
        String arvaus;
        Scanner in = new Scanner(System.in);

        System.out.println("Arvaa nimi");
        arvaus = in.nextLine();

        if(arvaus.equals(arvaus))
        {
            System.out.println("Voitit");
        }

        else
        {
            System.out.println("hävisit");
        }
    }
}
