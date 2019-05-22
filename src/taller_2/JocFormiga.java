/*
 * Classe puzzle que és un JPanel i implementa la classe KeyListener.
 *
 * 
 */
package taller_2;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author Manuel Peña Llull
 */
public class JocFormiga extends JPanel {

    private static final int DIMENSIO = 20; //dimensio del arrray de caselles
    private static final int MAXIM = 800; //tamany maxim de la finestra
    private static final int COSTAT = MAXIM / DIMENSIO; //tamany de cada costat
    private Casella[][] joc; //array de caselles que formen el joc
    //array que conté el valor original del codi de cada casella quan el joc
    //és inicialitzat.
    Random ran;//random per col·locar la formiga
    int fila, col;
    int formigaX = 0;//lloc on guardam les coordenades de la formiga
    int formigaY = 0;

    /**
     * Constructor de la classe JocFormiga. Inicialitzam el puzzle.
     */
    public JocFormiga() {
        joc = new Casella[DIMENSIO][DIMENSIO];
        int y = 0;
        for (int i = 0; i < DIMENSIO; i++) {
            int x = 0;
            for (int j = 0; j < DIMENSIO; j++) {
                Rectangle2D.Float r = new Rectangle2D.Float(x, y, COSTAT, COSTAT);
                joc[i][j] = new Casella(r);
                x += COSTAT;
            }
            y += COSTAT;
        }

    }

    /**
     * paintComponent del joc
     *
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        for (int i = 0; i < DIMENSIO; i++) {
            for (int j = 0; j < DIMENSIO; j++) {
                try {
                    joc[i][j].paintComponent(g);
                } catch (stateNotFoundException ex) {
                    System.out.println(ex);
                }
            }
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(MAXIM, MAXIM);
    }

    /**
     * Retorna vertader quan el joc es completa.
     *
     * @return
     */
    public Boolean acabat() {
        for (int i = 0; i < DIMENSIO; i++) {
            for (int j = 0; j < DIMENSIO; j++) {
                if (joc[i][j].getEstat() == 'f') {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Mètode que orienta la casella de la formiga depenent del paràmetre.
     *
     * @param direccio
     */
    public void orienta(char direccio) {

        //cercam la casella de la formiga i guardam les seves coordenades
        for (int i = 0; i < DIMENSIO; i++) {
            for (int j = 0; j < DIMENSIO; j++) {
                if (joc[i][j].getEstat() == 'o' || joc[i][j].getEstat() == 'n' || joc[i][j].getEstat() == 's' || joc[i][j].getEstat() == 'e') {
                    formigaX = i;
                    formigaY = j;
                }
            }
        }

        //switch que segons el parametre direccio, s'orienta la casella de la formiga
        //cap a una direcció concreta
        switch (direccio) {
            case 'o':
                joc[formigaX][formigaY].setEstat(direccio);
                break;
            case 'e':
                joc[formigaX][formigaY].setEstat(direccio);
                break;
            case 'n':
                joc[formigaX][formigaY].setEstat(direccio);
                break;
            case 's':
                joc[formigaX][formigaY].setEstat(direccio);
                break;
        }
    }

    //mou una casella cap a la direcció indicada
    public void moure() {
        try{
        switch (joc[formigaX][formigaY].getEstat()) {
            case 'o':
                if (formigaX >= 0) {
                    joc[formigaX][formigaY].setEstat('b');
                    joc[formigaX][formigaY-1].setEstat('o');
                }
                break;
            case 'e':
                if (formigaX <= joc.length) {
                    joc[formigaX][formigaY].setEstat('b');
                    joc[formigaX][formigaY+1].setEstat('e');
                }
                break;
            case 'n':
                if (formigaY >= 0) {
                    joc[formigaX][formigaY].setEstat('b');
                    joc[formigaX-1][formigaY].setEstat('n');
                }
                break;
            case 's':
                if (formigaY <= joc.length) {
                    joc[formigaX][formigaY].setEstat('b');
                    joc[formigaX+1][formigaY].setEstat('s');
                }
                break;

        }
        }catch(Exception e){
            System.out.println(e);
        }
    }

    /**
     * Col·loca les caselles del joc a la seva posició original.
     */
    public void inicialitzar() {
        ran = new Random(DIMENSIO - 1);
        joc = new Casella[DIMENSIO][DIMENSIO];
        int y = 0;
        for (int i = 0; i < DIMENSIO; i++) {
            int x = 0;
            for (int j = 0; j < DIMENSIO; j++) {
                Rectangle2D.Float r = new Rectangle2D.Float(x, y, COSTAT, COSTAT);
                joc[i][j] = new Casella(r);
                joc[i][j].setEstat('f');
                x += COSTAT;
            }
            y += COSTAT;
        }
        fila = ran.nextInt(DIMENSIO-1);
        col = ran.nextInt(DIMENSIO-1);
        joc[fila][col].setEstat('e');
    }
}
