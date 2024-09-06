import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        String vastaus = "Emma";
        String arvaus;
        int arvaukset = 1;
        Scanner in = new Scanner(System.in);

        do
        {
            System.out.println("Arvaa nimi (kirjoita loppu lopettaaksesi)");
            arvaus = in.nextLine();

            if(arvaus.equals(vastaus))
            {
                System.out.println("Oikein!");
                System.out.println("Arvasit " + arvaukset + " kertaa.");
            }

            else if(arvaus.equals("loppu"))
            {
                System.exit(0);
            }
            
            else
            {
                System.out.println("Väärin. Vihje:");
                System.out.println(vastaus.substring(0, arvaukset));
                arvaukset++;
            }
            
        }
        while(!arvaus.equals(vastaus));        
        
    }
}
