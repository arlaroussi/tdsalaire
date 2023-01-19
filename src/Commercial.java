
/* **********************************************************************
 *  La classe Commercial (regroupe Vendeur et Représentant)
 * **********************************************************************/

class Commercial extends Employe implements ARisque {
        private double chiffreAffaires;

        public Commercial(String prenom, String nom, int age, String date,double chiffreAffaires) {
            super(nom, prenom, age, date);
            this.chiffreAffaires = chiffreAffaires;
        }

        public double getChiffreAffaires() {
            return 0;
        }

        public double calculerSalaire() {
            return 0;
        }

    @Override
    public void afficherCategorieSalarie() {
        System.out.println("Catégorie employé : "+this.getNom());
    }
}

