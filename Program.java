import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<String> etudiants = new ArrayList<>();

        etudiants.add("Karim");
        etudiants.add("Amine");
        etudiants.add("Sofia");
        etudiants.add("Youssef");
        etudiants.add("Zineb");
        etudiants.add("Omar");

        System.out.println("Avant tri :");
        System.out.println(etudiants);

        Collections.sort(etudiants);

        System.out.println("\nApres tri :");
        System.out.println(etudiants);
    }
}
