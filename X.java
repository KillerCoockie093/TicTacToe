public class X
{
    private LINIE linie1, linie2;
    private int x1,x2,y1,y2;
    public X(int x1start,int y1start,int x2start,int y2start)
    {
        x1 = x1start;
        x2 = x2start;
        y1 = y1start;
        y2 = y2start;
        linie1 = new LINIE(x1,y1,x2,y2,1);
        linie2 = new LINIE(x1,y2,x2,y1,1);
    }

    public void zeichne()
    {
        linie1.zeichneDick();
        linie2.zeichneDick();
    }
    
}
