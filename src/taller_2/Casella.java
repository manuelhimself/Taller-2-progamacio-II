/**
 * Classe Casella definida per un rectangle, un codi, i una imatge.
 */
package taller_2;

/**
 *
 * @author Manuel Peña Llull
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

class Casella {

    /**
     * Atributs de la classe rec: rectangle de la casella img: imatge de la
     * casella codi: nombre assignat de la casella nImatge: nom de l'imatge del
     * puzzle
     */
    private final Rectangle.Float rec;
    private Imatge img;
    private char estat;
    stateNotFoundException stN = new stateNotFoundException();

    /**
     * Constructor de la classe Casella
     *
     * @param rec
     * @param codi
     */
    public Casella(Rectangle.Float rec) {
        this.rec = rec;
    }

    /**
     * paintComponent de la classe
     *
     * @param g
     */
    public void paintComponent(Graphics g) throws stateNotFoundException{
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);
        g2d.draw(rec);
        g2d.setBackground(Color.WHITE);
        switch (estat) {
            case 'b':
                img = new Imatge("nada.png");
                break;
            case 'n':
            case 's':
            case 'e':
            case 'o':
                img = new Imatge("hormiga_"+estat+".png");
                break;
            case 'f':
                img = new Imatge("hoja.png");
                break;
            default:
                throw stN;
        }
            g2d.drawImage(img.toBufferedImage(), null, (int) rec.x, (int) rec.y);
    }

    public char getEstat() {
        return estat;
    }

    public void setEstat(char estat) {
        this.estat = estat;
    }

}
