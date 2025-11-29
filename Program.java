
public class Program {
     public static void main(String[] args) {

        Salarie s1 = new Salarie();
        
        s1.setMatricule(101);
        s1.setNom("TDL Youssef");
        s1.setAge(30);
        s1.setSalaire(2000);

        System.out.println("Matricule : " + s1.getMatricule());
        System.out.println("Nom       : " + s1.getNom());
        System.out.println("Âge       : " + s1.getAge());
        System.out.println("Salaire   : " + s1.getSalaire());

        System.out.println("\nVia toString() :");
        System.out.println(s1);

        System.out.println("\n Test des regles de gestion ");
        s1.setAge(-5);      
        s1.setSalaire(0);  
       
        System.out.println("\n Creation d'un deuxieme salarie ");
        Salarie s2 = new Salarie(202, "BH Mouad", 70, -1000);

        System.out.println(s2);
    }
    
}
