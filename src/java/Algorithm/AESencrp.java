/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aes;

/**
 *
 * @author User
 */
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.*;

public class AESencrp {
    
     private static final String ALGO = "AES";
     public static String kKey="";
    public static final byte[] keyValue = 
        new byte[] { 'T', 'h', 'e', 'B', 'e', 's', 't',

'S', 'e', 'c', 'r','e', 't', 'K', 'e', 'y' };


public String encrypt(String Data) throws Exception {
        Key key = generateKey1();
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] encVal = c.doFinal(Data.getBytes());
        String encryptedValue = new BASE64Encoder().encode(encVal);
        return encryptedValue;
    }

    public String decrypt(String encryptedData) throws Exception {
        Key key = generateKey1();
        System.out.println("decrypt key="+key.toString());
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.DECRYPT_MODE, key);
        byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedData);
        byte[] decValue = c.doFinal(decordedValue);
        String decryptedValue = new String(decValue);
        return decryptedValue;
    }
    public void setKey(String k){
    this.kKey=k;
        System.out.println("user key=="+kKey);
    }
    
    private static Key generateKey() throws Exception {
       /* String key1=kKey;
        byte b[]=new byte[16];
        for(int i=0;i<16;i++)
        {
        b[i]=(byte) key1.charAt(i);
        }*/
        Key key = new SecretKeySpec(keyValue, ALGO);
        return key;
}
    private static Key generateKey1() throws Exception {
        String key1=kKey;
        byte b[]=new byte[16];
        for(int i=0;i<16;i++)
        {
        b[i]=(byte) key1.charAt(i);
        }
        
        Key key = new SecretKeySpec(b, ALGO);
        return key;
}

}
