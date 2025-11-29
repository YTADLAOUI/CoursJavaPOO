
public class Program {
    public static void main(String[] args) {

        Salarie s1 = new Salarie(1, 20000, "Youssef", "TDL");
        Salarie s2 = new Salarie(2, 30000, "Mouad", "BH");

        System.out.println("--- Méthodes d'instance ---");
        s1.afficherInfos();
        s1.augmenterSalaire(10);
        s1.afficherInfos();

        System.out.println("\n--- Méthodes static de Salarie ---");
        Salarie.printNombreSalaries();
        Salarie.afficherDetail(s2);

        System.out.println("\n--- Méthodes static de SalarieManagement ---");
        SalarieManagement.afficherInfos(s1);
        SalarieManagement.augmenterSalaire(s1, 5);
        SalarieManagement.afficherInfos(s1);
        SalarieManagement.printNombreSalaries();
        afficherDetail(s1);
    }

    
    public static void afficherDetail(Salarie s) {
        System.out.println("=== Détail salarié (Program) ===");
        s.afficherInfos();
    }
    
}
