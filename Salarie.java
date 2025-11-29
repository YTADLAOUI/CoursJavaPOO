public class Salarie {

    private int matricule;
    private String nom;
    private int age;
    private double salaire;
    public Salarie() {
      
        this.matricule = 0;
        this.nom = "Inconnu";
        setAge(18);         
        setSalaire(1);      
    }

    public Salarie(int matricule, String nom, int age, double salaire) {
        this.matricule = matricule;
        this.nom = nom;
        setAge(age);         
        setSalaire(salaire); 
    }


    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 65) {
            this.age = age;
        } else {
            System.out.println("age invalide.");
        }
    }

    public double getSalaire() {
        return salaire;
    }


    public void setSalaire(double salaire) {
        if (salaire > 0) {
            this.salaire = salaire;
        } else {
            System.out.println("Salaire invalide.");
        }
    }
     @Override
    public String toString() {
        return "Salarie : [Matricule=" + matricule +
               ", Nom=" + nom +
               ", Âge=" + age +
               ", Salaire=" + salaire + "]";
    }
}