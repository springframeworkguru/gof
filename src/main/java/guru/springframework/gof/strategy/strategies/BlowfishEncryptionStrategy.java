package guru.springframework.gof.strategy.strategies;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class BlowfishEncryptionStrategy implements EncryptionStrategy{
    @Override
    public void encryptData(String plaintext) {
        System.out.println("\n-------Encrypting data using Blowfish algorithm-------");
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("Blowfish");
            keyGenerator.init(128);
            SecretKey secretKey = keyGenerator.generateKey();
            byte[] plaintTextByteArray = plaintext.getBytes("UTF8");

            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] cipherText = cipher.doFinal(plaintTextByteArray);

            System.out.println("Original data: " + plaintext);
            System.out.println("Encrypted data:");
            for (int i = 0; i < cipherText.length; i++) {
                System.out.print(cipherText[i] + " ");

            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
