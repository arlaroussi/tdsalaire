import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        //Définition d'un format pour les réels
        DecimalFormat df = new DecimalFormat("0.00");

        Entreprise p = new Entreprise();
        p.ajouterEmploye(new Vendeur("Pierre", "Laverdure", 45, "1995", 30000));
        p.ajouterEmploye(new Representant("Léon", "Hilton", 25, "2001", 20000));
        p.ajouterEmploye(new Technicien("Yves", "Ramyes", 28, "1998", 1000));
        p.ajouterEmploye(new Manutentionnaire("Jeanne", "Pape Dame", 32, "1998", 45));
        p.ajouterEmploye(new TechARisque("Lesly", "Picard", 28, "2000", 1000));
        p.ajouterEmploye(new ManutARisque("Nassim", "Benali", 30, "2001", 45));

        p.afficherSalaires();

        System.out.println("Le salaire moyen dans l'entreprise est de "
                + df.format(p.salaireMoyen()) + " €");

   }
}