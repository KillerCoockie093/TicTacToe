public class KASTEN
{
    private int links;
    private int oben;
    private int breite;
    private int hoehe;
    private String farbe;

    public KASTEN()
    {
        links = (720 - (breite/2)); 
        oben = 0;
        breite = 200;
        hoehe = 720;
        farbe = "grau";
    }

    public KASTEN(int links0, int oben0, int breite0, int hoehe0, String farbe0)
    {
        links = links0;
        oben = oben0;
        breite = breite0;
        hoehe = hoehe0;
        farbe = farbe0;
    }

    public void zeichne()
    {
        ZEICHENFENSTER.gibFenster().fuelleRechteck(links,oben,breite,hoehe,farbe);
    }

    public void löschen()
    {
        ZEICHENFENSTER.gibFenster().loescheRechteck(links,oben,breite,hoehe);
    }
}
