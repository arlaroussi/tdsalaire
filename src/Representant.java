/* **********************************************************************
 *  La classe Représentant
 * **********************************************************************/
class Representant extends Commercial implements ARisque{
    private final static double POURCENT_REPRESENTANT = 0.2;
    private final static int BONUS_REPRESENTANT = 800;

    public Representant(String prenom, String nom, int age, String date, double chiffreAffaires) {
        super(prenom, nom, age, date, chiffreAffaires);
    }

    public double calculerSalaire() {
        return (POURCENT_REPRESENTANT * getChiffreAffaires()) + BONUS_REPRESENTANT;
    }

    public String getTitre()   {
        return "Le représentant ";
    }
}