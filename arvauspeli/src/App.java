import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        String vastaus = "Emma";
        String arvaus;
        int arvaukset = 1;
        Scanner in = new Scanner(System.in);

        do
        {
            System.out.println("Arvaa nimi");
            arvaus = in.nextLine();

            if(arvaus.equals(vastaus))
            {
                System.out.println("Oikein");
                System.out.println("Arvasit " + arvaukset + " kertaa.");
            }
            
            else
            {
                arvaukset++;
                System.out.println("hävisit");
            }
            
        }
        while(!arvaus.equals(vastaus));        
        
    }
}
