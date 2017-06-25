public class LINIE
{
    private int x1,x2,y1,y2, farbe;
    
    public LINIE(int x1start,int y1start,int x2start,int y2start, int farbestart)
    {
        x1 = x1start;
        x2 = x2start;
        y1 = y1start;
        y2 = y2start;
        farbe = farbestart;
    }
    
     public void zeichneDick()
    {
        ZEICHENFENSTER.gibFenster().zeichneLinieDick(x1,y1,x2,y2,farbe);
    }
    
     public void zeichneDuenn()
    {
        ZEICHENFENSTER.gibFenster().zeichneLinieDuenn(x1,y1,x2,y2,farbe);
    }

}