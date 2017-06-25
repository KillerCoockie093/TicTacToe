public class O
{
    private KREIS gross,klein;
    private int x,y,radius;
    // private String farbe;
    public  O(int xstart,int ystart, int radiusstart /**   String farbestart   **/ )
    {
        x = xstart;
        y = ystart;
        radius = radiusstart;
        //farbe = farbestsart;
        gross = new KREIS(x,y,radius,"rot");
        klein = new KREIS(x,y,radius-15,"weiss");
    }

    public void zeichne()
    {
        gross.zeichne();
        klein.zeichne();
    }
}
