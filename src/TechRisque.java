/* **********************************************************************
 *  Une première sous-classe d'employé à risque
 * **********************************************************************/
class TechARisque extends Technicien {

    public TechARisque(String prenom, String nom, int age, String date, int unites) {
        super(prenom, nom, age, date, unites);
    }

    public double calculerSalaire() {

        return super.calculerSalaire() + 200;
    }

    public void afficherCategorieSalarie() {
        System.out.println(this.getNom().getClass());
    }
}