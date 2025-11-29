

class Salarie{

    public int matricule;
    public int salaire;
    public String nom;
    public String prenom;
    public static int nombreSalaries=0;

    public Salarie(int matricule, int salarie, String nom, String prenom) {
            this.matricule=matricule;
            this.salaire=salarie;
            this.nom=nom;
            this.prenom=prenom;
            nombreSalaries++;
    }

    public void afficherInfos() {
        System.out.println("Matricule : " + matricule);
        System.out.println("Nom       : " + nom);
        System.out.println("Prénom    : " + prenom);
        System.out.println("Salaire   : " + salaire );
    }

     public void augmenterSalaire(double taux) {
        salaire += salaire * taux / 100.0;
    }
    
   public static void printNombreSalaries() {
        System.out.println("Nombre total de salariés : " + nombreSalaries);
    }

    public static void afficherDetail(Salarie s) {
        System.out.println("=== Détail salarié (Program) ===");
        s.afficherInfos();
    }

  




}