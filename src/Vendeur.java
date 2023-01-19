/* **********************************************************************
 *  La classe Vendeur
 * **********************************************************************/

class Vendeur extends Commercial {
        private final static double POURCENT_VENDEUR = 0.2;
        private final static int BONUS_VENDEUR = 400;

        public Vendeur(String nom, String prenom, int age, String date,double chiffreAffaires) {
            super(nom, prenom, age, date, chiffreAffaires);
        }

        public double calculerSalaire() {
            return (POURCENT_VENDEUR * getChiffreAffaires()) + BONUS_VENDEUR;
        }

        public String getTitre()
        {
            return "Le vendeur ";
        }

    }
