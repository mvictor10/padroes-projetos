
import utils.GeradorPix;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mvictor
 */
public class TestMain {
    
    public static void main(String[] args){
        String pix_code = GeradorPix.getInstancia().gerarCodigoPix();
        System.out.println(pix_code);
    }
}
