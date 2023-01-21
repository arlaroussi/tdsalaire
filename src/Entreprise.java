import java.util.ArrayList;

/* **********************************************************************
 *  La classe Entreprise
 * **********************************************************************/
class Entreprise {
    private ArrayList<Employe> staff;
    private int nbreEmploye;

    public Entreprise(ArrayList staff) {
        this.staff = staff;
        this.nbreEmploye = 0;
    }

    public ArrayList<Employe> getStaff() {
        return staff;
    }

    public boolean isNotPresent(Employe e) {
        for (Employe p : this.getStaff()) {
            if (e.getNom().equals(p.getNom()))
                return false;
        }
        return true;
    }

    public void ajouterEmploye(Employe e) {
        ++nbreEmploye;
        if (this.isNotPresent(e)){
            this.staff.add(e);
        } else {
            System.out.println(e.getNom() + " Employé déjà inscrit");
        }
    }

    public double salaireMoyen() {
        double somme = 0.0;
        for (Employe e : staff) {
            somme += e.calculerSalaire();
        }
        return somme / nbreEmploye;
    }

    public void afficherSalaires() {
        for (Employe e : this.staff) {
            System.out.println(e.getNom() + " gagne " + e.calculerSalaire() + " €");
        }
    }
}