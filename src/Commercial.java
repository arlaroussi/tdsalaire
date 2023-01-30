
/* **********************************************************************
 *  La classe Commercial (regroupe Vendeur et Représentant)
 * **********************************************************************/

class Commercial extends Employe {
        private double chiffreAffaires;

        public Commercial(String prenom, String nom, int age, String date,double chiffreAffaires) {
            super(prenom, nom, age, date);
            this.chiffreAffaires = chiffreAffaires;
        }

        public double getChiffreAffaires() {
            return chiffreAffaires;
        }

        public double calculerSalaire() {
            return 0.0;
        }
}

