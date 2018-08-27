package Algorithm;


import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class KeyGeneration {

    public String keyGeneration() {

        Random rnd = new Random();
        int i = 100000 + rnd.nextInt(900000);
        String key = "" + i;
        System.out.println("value of n = " + i);
        return key;
    }
}
