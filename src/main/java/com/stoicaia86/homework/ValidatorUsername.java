import java.util.Scanner;

public class ValidatorUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user;
        boolean valid;

        do {
            System.out.print("Introdu un username: ");
            user = scanner.nextLine();
            valid = true; // presupunem că e valid la început

            // Verificare dacă are spații
            if (user.contains(" ")) {
                System.out.println("Eroare: Username-ul nu poate contine spatii.");
                valid = false;
                // Nu mai verificăm celelalte reguli pentru acest input
                continue;
            }

            // Verificare lungime (între 6 și 12 caractere)
            if (user.length() < 6 || user.length() > 12) {
                System.out.println("Eroare: Username-ul trebuie sa aiba intre 6 si 12 caractere.");
                valid = false;
            }

            //  Verificare existență cel puțin a unei cifre
            boolean Cifra = false;
            for (int i = 0; i < user.length(); i++) {
                if (Character.isDigit(user.charAt(i))) {
                    Cifra = true;
                    break;
                }
            }

            if (!Cifra) {
                System.out.println("Eroare: Username-ul trebuie sa contina cel putin o cifra(0-9).");
                valid = false;
            }

            if (!valid) {
                System.out.println("Te rog sa încerci din nou.\n");
            }

        } while (!valid);

        System.out.println("Username acceptat: " + user);
        scanner.close();
    }
}