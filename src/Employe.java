/* **********************************************************************
 *  La classe Employe
 * **********************************************************************/
class Employe {
    private String nom;
    private String prenom;
    private int age;
    private String date;


    public Employe(String prenom, String nom, int age, String date) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.date = date;
    }

    public double calculerSalaire() {
        return 0.0;
    };

    public String getTitre(){
        return "L'employé " ;
    }

    public String getNom() {
        return getTitre() + prenom + " " + nom;
    }

    public int getAge() {
        return age;
    }

    public String getDate() {
        return date;
    }

    public void afficherCategorieSalarie() {
        System.out.println("Catégorie employé : "+this.getClass());
    }
}
