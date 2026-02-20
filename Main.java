public class Main {

    private static ArrayList<Livre> livres = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choix;

        do {
            afficherMenu();
            choix = scanner.nextInt();
            scanner.nextLine(); // vider le buffer

            switch (choix) {
                case 1:
                    listerLivres();
                    break;
                case 2:
                    ajouterLivre();
                    break;
                case 3:
                    modifierLivre();
                    break;
                case 4:
                    supprimerLivre();
                    break;
                case 0:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide.");
            }

        } while (choix != 0);
    }

    private static void afficherMenu() {
        System.out.println("\n=== LIBRAIRIE ===");
        System.out.println("1 - Lister les livres");
        System.out.println("2 - Ajouter un livre");
        System.out.println("3 - Modifier un livre");
        System.out.println("4 - Supprimer un livre");
        System.out.println("0 - Quitter");
        System.out.print("Votre choix : ");
    }
}