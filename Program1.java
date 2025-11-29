

public class Program1 {
    private int x ,y ;
    Program1() {
        this.x = -1;
        this.y = -1;
    }

    // void deplacer(int x, int y) {
    //     Program1 p = new Program1();
    //     p.x += x;
    //     p.y += y;
    // }
    //  ici la valeur ne change pas acouse de on a instence un nouvelle object et l’objet d’origine p n’a jamais ete modifie.

    void deplacer(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}


