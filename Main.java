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

    private static void ajouterLivre() {
        System.out.print("Entrez le titre du livre : ");
        String titre = scanner.nextLine();
        livres.add(new Livre(titre));
        System.out.println("Livre ajouté avec succès.");
    }

    private static void supprimerLivre() {
        listerLivres();
        if (!livres.isEmpty()) {
            System.out.print("Numéro du livre à supprimer : ");
            int index = scanner.nextInt() - 1;

        if (index >= 0 && index < livres.size()) {
            livres.remove(index);
            System.out.println("Livre supprimé avec succès.");
        } else {
            System.out.println("Numéro invalide.");
        }
        }
    }

    private static void listerLivres() {
        if (livres.isEmpty()) {
            System.out.println("Aucun livre disponible.");
        } else {
            System.out.println("Liste des livres :");
            for (int i = 0; i < livres.size(); i++) {
                System.out.println((i + 1) + " - " + livres.get(i));
            }
        }
    }
}
