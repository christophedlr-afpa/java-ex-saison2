import static java.lang.System.out;
import static java.lang.System.console;

public class Main {
    public static void main(String[] args) {
        double artHT = 0;
        double countArt = 0;
        double tTVA = 0;
        double result = 0;

        out.println("Algorithme PrixTTC");

        out.print("Prix hors taxe de l'article : ");
        artHT = Double.parseDouble(console().readLine());

        out.print("Nombre d''article : ");
        countArt = Double.parseDouble(console().readLine());

        out.print("Taux TVA : ");
        tTVA = Double.parseDouble(console().readLine());

        result = (artHT*countArt)*(1+(tTVA/100));
        out.println("Le montant total est de : "+result);
    }
}
