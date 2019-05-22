/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_2;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author manue
 */
public class Taller_2 extends JFrame implements KeyListener {

    JocFormiga joc;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // Programa principal, crida al constructor del joc i fa visible la finestra
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        new Taller_2().setVisible(true);
    }

    public Taller_2() { 
        super("Joc de la formiga");
        initComponents();
        this.setDefaultCloseOperation(Taller_2.EXIT_ON_CLOSE);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_RIGHT){
            joc.orienta('e');
        }if(key == KeyEvent.VK_UP){
            joc.orienta('n');
        }if(key == KeyEvent.VK_DOWN){
            joc.orienta('s');
        }if(key == KeyEvent.VK_LEFT){
            joc.orienta('o');
        }if (key == KeyEvent.VK_SPACE) {
            joc.moure();
        }repaint();
        if (joc.acabat()) {
            missatgeAcabat();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    private void initComponents() {
        joc = new JocFormiga();
        joc.addKeyListener(this);
        joc.setFocusable(true);
        joc.requestFocusInWindow();
        joc.inicialitzar();
        this.getContentPane().add(joc, BorderLayout.CENTER);
        this.setSize(joc.getPreferredSize());
        this.setResizable(false);
        this.pack();
    }

    //missatge que es mostrarà quan es completi el joc
    private void missatgeAcabat() {
        JOptionPane.showConfirmDialog(null, "ENHORABONA\nHas completat el joc!!\nLA FORMIGA S'HA MENJAT TOTES LES FULLES", "ENHORABONA", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }

}
