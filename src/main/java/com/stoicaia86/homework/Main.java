public class Main {
    public static void main(String[] args) {
        // Creăm o instanță de UserRepository
        UserRepository repo = new UserRepository();

        // 1️⃣ User valid
        try {
            User user1 = new User("testuser", 25);
            repo.addUser(user1);
        } catch (InvalidUserDataException e) {
            System.out.println("⚠️ Eroare la adăugarea utilizatorului valid: " + e.getMessage());
        }

        // 2️⃣ AdminUser valid
        try {
            AdminUser admin = new AdminUser("admin", 30, "full_access");
            repo.addUser(admin);
        } catch (InvalidUserDataException e) {
            System.out.println("⚠️ Eroare la adăugarea adminului: " + e.getMessage());
        }

        // 3️⃣ User cu username prea scurt
        try {
            User userInvalid1 = new User("ab", 22);
            repo.addUser(userInvalid1);
        } catch (InvalidUserDataException e) {
            System.out.println("⚠️ Eroare: Username-ul este prea scurt → " + e.getMessage());
        }

        // 4️⃣ User cu vârstă negativă
        try {
            User userInvalid2 = new User("baduser", -5);
            repo.addUser(userInvalid2);
        } catch (InvalidUserDataException e) {
            System.out.println("⚠️ Eroare: Vârsta este invalidă → " + e.getMessage());
        }

        // 5️⃣ User null
        try {
            repo.addUser(null);
        } catch (InvalidUserDataException e) {
            System.out.println("⚠️ Eroare: Utilizator null → " + e.getMessage());
        }

        // ✅ La final, afișăm toți utilizatorii validați
        System.out.println("\n===== UTILIZATORI VALIZI ADAUGAȚI =====");
        repo.printAllUsers();
    }
}
