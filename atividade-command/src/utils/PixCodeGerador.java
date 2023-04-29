/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author mvictor
 */
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import javax.xml.bind.DatatypeConverter;

public class PixCodeGerador {

    private static final String PIX_KEY = "chave_pix";

    /**
     * @return generatePixCode - retorna o código pix.
     */
    public static String generatePixCode() {
        Random random = new Random();
        long randomNumber = random.nextLong() & 0xffffffffL;
        String rawString = String.format("%010d%s", randomNumber, PIX_KEY);
        String hashedString = hashString(rawString);
        return hashedString;
    }
    
    
    /**
     * @param input - chave gerada que você que fazer o código HASH.
     * @return  gerar o código HASH da chave PIX.
     */
    private static String hashString(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] messageDigest = md.digest(input.getBytes());
            String hashedString = DatatypeConverter.printHexBinary(messageDigest);
            return hashedString;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

}

