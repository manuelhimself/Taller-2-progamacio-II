/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_2;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Manuel
 */
class Imatge {


    private BufferedImage imatge;

    public Imatge(String fitxerImatge) {

    try {
            imatge = ImageIO.read(new File(fitxerImatge)); 

        } catch (IOException e) {
            System.out.println("ERROR llegint la imatge: " + e.getMessage());
        }
    }

    BufferedImage toBufferedImage() {
        return imatge;
    }
    
    
}
