/* **********************************************************************
 *  Une autre sous-classe d'employé à risque
 * **********************************************************************/
class ManutARisque extends Manutentionnaire {

    public ManutARisque(String prenom, String nom, int age, String date, int heures) {
        super(prenom, nom, age, date, heures);
    }

    public double calculerSalaire() {
        return super.calculerSalaire() + PRIME;
    }
}
