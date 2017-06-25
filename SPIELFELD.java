public class SPIELFELD
{
    private KASTEN horizontal1, horizontal2, vertikal1, vertikal2;
    
    public SPIELFELD()
    {
        horizontal1 = new KASTEN(200,0,20,600,"schwarz");
        horizontal2 = new KASTEN(400,0,20,600,"schwarz");
        vertikal1 = new KASTEN(0,200,600,20,"schwarz");
        vertikal2 = new KASTEN(0,400,600,20,"schwarz");
    }
    
    public void zeichne()
    {
        horizontal1.zeichne();
        horizontal2.zeichne();
        vertikal1.zeichne();
        vertikal2.zeichne();
    }
}
