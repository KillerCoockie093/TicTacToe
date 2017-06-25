import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class SPIEL
{
    private SPIELFELD spielfeld;
    private static X x1,x2,x3,x4,x5,x6,x7,x8,x9;
    private static O o1,o2,o3,o4,o5,o6,o7,o8,o9;
    private JButton Start,Restart;
    public static JLabel Anzeige;
    public static int x,y;
    private static int spielzahl;
    private static int rotdiagonal1,rotdiagonal2,rothorizontaloben,rothorizontalunten,rotvertikal1,rotvertikal2,rotmitte1,rotmitte2;
    private static int blaudiagonal1,blaudiagonal2,blauhorizontaloben,blauhorizontalunten,blauvertikal1,blauvertikal2,blaumitte1,blaumitte2;
    private static int feld1,feld2,feld3,feld4,feld5,feld6,feld7,feld8,feld9 = 0;
    public static LINIE linie1,linie2,linie3,linie4,linie5,linie6,linie7,linie8;

    public static void main(String[] args)
    {
        SPIEL spiel = new SPIEL(); 
    }
    
    public SPIEL()
    {
        spielzahl = 1;

        spielfeld = new SPIELFELD();

        Start = new JButton("Start");
        Start.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    zeichne();
                }
            }
        );
        Start.setBackground(Color.WHITE);
        Start.setForeground(Color.BLACK);
        Start.setOpaque(false);
        Start.setFocusPainted(false);
        Start.setBorderPainted(false);
        Start.setFont(new Font("Dialog", Font.PLAIN, 16));
        ZEICHENFENSTER.gibFenster().komponenteHinzufuegen(Start,"unten");

        Restart = new JButton("Restart");
        Restart.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    Reset();
                }
            }
        );
        Restart.setBackground(Color.WHITE);
        Restart.setForeground(Color.BLACK);
        Restart.setOpaque(false);
        Restart.setFocusPainted(false);
        Restart.setBorderPainted(false);
        Restart.setFont(new Font("Dialog", Font.PLAIN, 16));
        ZEICHENFENSTER.gibFenster().komponenteHinzufuegen(Restart,"unten");

        Anzeige = new JLabel();
        Anzeige.setFont(new Font("Dialog", Font.PLAIN, 16));
        Anzeige.setBackground(Color.WHITE);
        Anzeige.setForeground(Color.BLACK);
        Anzeige.setOpaque(false);
        Anzeige.setVerticalAlignment(JLabel.CENTER);
        ZEICHENFENSTER.gibFenster().komponenteHinzufuegen(Anzeige,"unten");
    }

    private void zeichne()
    {
        spielfeld.zeichne();
    }

    public static void  main()
    {
        if((spielzahl % 2) != 0)
        {
            if(spielzahl < 10)
            {
                if(( x < 210) && (y <210) && (feld1 == 0))
                {
                    x1 = new X(40,40,160,160);
                    x1.zeichne();
                    blauhorizontaloben++;
                    blauvertikal1++;
                    blaudiagonal1++;
                    spielzahl++;
                    Rechner();
                    feld1 = 1;
                }

                else if(( x < 410) &&  (y < 210) && (210 < x) && (feld2 == 0))
                {
                    x2 = new X(250,40,370,160);
                    x2.zeichne();
                    blauhorizontaloben++;
                    blaumitte1++;
                    spielzahl++;
                    Rechner();
                    feld2 = 1;
                }

                else if(( x < 610) && (y < 210) && (400 < x) && (feld3 == 0))
                {
                    x3 = new X(460,40,580,160);
                    x3.zeichne();
                    blauhorizontaloben++;
                    blauvertikal2++;
                    blaudiagonal2++;
                    spielzahl++;
                    Rechner();
                    feld3 = 1;
                }

                else if(( x < 210) && ( y <410) && (220 < y) && (feld4 == 0))
                {
                    x4 = new X(40,250,160,370);
                    x4.zeichne();
                    blauvertikal1++;
                    blaumitte2++;
                    spielzahl++;
                    Rechner();
                    feld4 = 1;
                }
                else if(( x < 410) && ( y <410) && (220 < y) && (210 < x) && (feld5 == 0))
                {
                    x5 = new X(250,250,370,370);
                    x5.zeichne();
                    blaudiagonal1++;
                    blaudiagonal2++;
                    blaumitte1++;
                    blaumitte2++;
                    spielzahl++;
                    Rechner();
                    feld5 = 1;
                }
                else if(( x < 610) && ( y <410) && (220 < y) && (410 < x) && (feld6 == 0))
                {
                    x6 = new X(460,250,580,370);
                    x6.zeichne();
                    blaumitte2++;
                    blauvertikal2++;
                    spielzahl++;
                    Rechner();
                    feld6 = 1;
                }
                else if(( x < 210) && ( y <610) && (420 < y) && (feld7 == 0))
                {
                    x7 = new X(40,460,160,580);
                    x7.zeichne();
                    blaudiagonal2++;
                    blauvertikal1++;
                    blauhorizontalunten++;
                    spielzahl++;
                    Rechner();
                    feld7 = 1;
                }
                else if(( x < 410) && ( y <610) && (420 < y) && (210 < x) && (feld8 == 0))
                {
                    x8 = new X(250,460,370,580);
                    x8.zeichne();
                    blauhorizontalunten++;
                    blaumitte1++;
                    spielzahl++;
                    Rechner();
                    feld8 = 1;
                }
                else if(( x < 610) && ( y <610) && (420 < y)&& (410 < x) && (feld9 == 0))
                {
                    x9 = new X(460,460,580,580);
                    x9.zeichne();
                    blaudiagonal1++;
                    blauhorizontalunten++;
                    blauvertikal2++;
                    spielzahl++;
                    Rechner();
                    feld9 = 1;
                }
            }
        }
        else
        {
            if(spielzahl < 10)
            {
                if(( x < 210) && ( y <210) && (feld1 == 0))
                {
                    o1 = new O(100,100,60);
                    o1.zeichne();
                    rothorizontaloben++;
                    rotvertikal1++;
                    rotdiagonal1++;
                    spielzahl++;
                    Rechner();
                    feld1 = 1;
                }

                else if(( x < 410) && ( y < 210) && (210 < x) && (feld2 == 0))
                {
                    o2 = new O(310,100,60);
                    o2.zeichne();
                    rothorizontaloben++;
                    rotmitte1++;
                    spielzahl++;
                    Rechner();
                    feld2 = 1;
                }

                else if(( x < 610) && ( y < 210) && (400 < x) && (feld3 == 0))
                {
                    o3 = new O(520,100,60);
                    o3.zeichne();
                    rothorizontaloben++;
                    rotvertikal2++;
                    rotdiagonal2++;
                    spielzahl++;
                    Rechner();
                    feld3 = 1;
                }

                else if(( x < 210) && ( y <410) && (220 < y) && (feld4 == 0))
                {
                    o4 = new O(100,310,60);
                    o4.zeichne();
                    rotvertikal1++;
                    rotmitte2++;
                    spielzahl++;
                    Rechner();
                    feld4 = 1;
                }
                else if(( x < 410) && ( y <410) && (220 < y) && (210 < x) && (feld5 == 0))
                {
                    o5 = new O(310,310,60);
                    o5.zeichne();
                    rotdiagonal1++;
                    rotdiagonal2++;
                    rotmitte1++;
                    rotmitte2++;
                    spielzahl++;
                    Rechner();
                    feld5 = 1;
                }
                else if(( x < 610) && ( y <410) && (220 < y) && (410 < x) && (feld6 == 0))
                {
                    o6 = new O(520,310,60);
                    o6.zeichne();
                    rotmitte2++;
                    rotvertikal2++;
                    spielzahl++;
                    Rechner();
                    feld6 = 1;
                }
                else if(( x < 210) && ( y <610) && (420 < y) && (feld7 == 0))
                {
                    o7 = new O(100,520,60);
                    o7.zeichne();
                    rotdiagonal2++;
                    rotvertikal1++;
                    rothorizontalunten++;
                    spielzahl++;
                    Rechner();
                    feld7 = 1;
                }
                else if(( x < 410) && ( y <610) && (420 < y) && (210 < x) && (feld8 == 0))
                {
                    o8 = new O(310,520,60);
                    o8.zeichne();
                    rothorizontalunten++;
                    rotmitte1++;
                    spielzahl++;
                    Rechner();
                    feld8 = 1;
                }
                else if(( x < 610) && ( y <610) && (420 < y)&& (410 < x) && (feld9 == 0))
                {
                    o9 = new O(520,520,60);
                    o9.zeichne();
                    rotdiagonal1++;
                    rothorizontalunten++;
                    rotvertikal2++;
                    spielzahl++;
                    Rechner();
                    feld9 = 1;
                }
            } 
        }
    }

    private void Reset()
    {
        ZEICHENFENSTER.gibFenster().loescheAlles();
        zeichne();
        spielzahl = 1;
        feld1 = 0;
        feld2 = 0;
        feld3 = 0;
        feld4 = 0;
        feld5 = 0;
        feld6 = 0;
        feld7 = 0;
        feld8 = 0;
        feld9 = 0;
        rotdiagonal1 = 0;
        rotdiagonal2 = 0;
        rothorizontaloben = 0;
        rothorizontalunten = 0;
        rotvertikal1 = 0;
        rotvertikal2 = 0;
        rotmitte1 = 0;
        rotmitte2 = 0;
        blaudiagonal1 = 0;
        blaudiagonal2 = 0;
        blauhorizontaloben = 0;
        blauhorizontalunten = 0;
        blauvertikal1 = 0;
        blauvertikal2 = 0;
        blaumitte1 = 0;
        blaumitte2 = 0;
        Anzeige.setText("");
    }

    public static void Rechner()
    {
        if(rotdiagonal1 == 3)
        {  
            Anzeige.setText("  Rot gewinnt! ");
            spielzahl = 10;
            linie1 = new LINIE(50,50,570,570,0);
            linie1.zeichneDuenn();
        }
        else if(rotdiagonal2 == 3)
        {  
            Anzeige.setText("  Rot gewinnt! ");
            spielzahl = 10;
            linie2 = new LINIE(570,50,50,570,0);
            linie2.zeichneDuenn();
        }
        else if(rothorizontaloben == 3)
        {  
            Anzeige.setText("  Rot gewinnt! ");
            spielzahl = 10;
            linie3 = new LINIE(50,100,570,100,0);
            linie3.zeichneDuenn();
        }
        else if(rothorizontalunten == 3)
        {  
            Anzeige.setText("  Rot gewinnt! ");
            spielzahl = 10;
            linie4 = new LINIE(50,520,570,520,0);
            linie4.zeichneDuenn();
        }
        else if( rotvertikal1 == 3 )
        {  
            Anzeige.setText("  Rot gewinnt! ");
            spielzahl = 10;
            linie5 = new LINIE(100,50,100,570,0);
            linie5.zeichneDuenn();
        }
        else if( rotvertikal2 == 3 )
        {  
            Anzeige.setText("  Rot gewinnt! ");
            spielzahl = 10;
            linie6 = new LINIE(520,50,520,570,0);
            linie6.zeichneDuenn();
        }
        else if( rotmitte1 == 3 )
        {  
            Anzeige.setText("  Rot gewinnt! ");
            spielzahl = 10;
            linie7 = new LINIE(310,50,310,570,0);
            linie7.zeichneDuenn();
        }
        else if( rotmitte2 == 3 )
        {  
            Anzeige.setText("  Rot gewinnt! ");
            spielzahl = 10;
            linie8 = new LINIE(50,310,570,310,0);
            linie8.zeichneDuenn();
        }
        else if(blaudiagonal1 == 3)
        {  
            Anzeige.setText("  Blau gewinnt! ");
            spielzahl = 10;
            linie1 = new LINIE(50,50,570,570,0);
            linie1.zeichneDuenn();
        }
        else if(blaudiagonal2 == 3)
        {  
            Anzeige.setText("  Blau gewinnt! ");
            spielzahl = 10;
            linie2 = new LINIE(570,50,50,570,0);
            linie2.zeichneDuenn();
        }
        else if(blauhorizontaloben == 3)
        {  
            Anzeige.setText("  Blau gewinnt! ");
            spielzahl = 10;
            linie3 = new LINIE(50,100,570,100,0);
            linie3.zeichneDuenn();
        }
        else if(blauhorizontalunten == 3)
        {  
            Anzeige.setText("  Blau gewinnt! ");
            spielzahl = 10;
            linie4 = new LINIE(50,520,570,520,0);
            linie4.zeichneDuenn();
        }
        else if( blauvertikal1 == 3 )
        {  
            Anzeige.setText("  Blau gewinnt! ");
            spielzahl = 10;
            linie5 = new LINIE(100,50,100,570,0);
            linie5.zeichneDuenn();
        }
        else if( blauvertikal2 == 3 )
        {  
            Anzeige.setText("  Blau gewinnt! ");
            spielzahl = 10;
            linie6 = new LINIE(520,50,520,570,0);
            linie6.zeichneDuenn();
        }
        else if( blaumitte1 == 3 )
        {  
            Anzeige.setText("  Blau gewinnt! ");
            spielzahl = 10;
            linie7 = new LINIE(310,50,310,570,0);
            linie7.zeichneDuenn();
        }
        else if( blaumitte2 == 3 )
        {  
            Anzeige.setText("  Blau gewinnt! ");
            spielzahl = 10;
            linie8 = new LINIE(50,310,570,310,0);
            linie8.zeichneDuenn();
        }
        else if( spielzahl == 10 )
        {
            Anzeige.setText("  Kein Gewinner! ");
        }
    }
}
