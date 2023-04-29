/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 * SigleTon - Gerador do Pix.
 * @author mvictor
 */
public class GeradorPix {
   private static GeradorPix instancia = null;
 
   private GeradorPix() {
      // construtor privado para evitar criação direta de objetos
   }
   
   /**
    * @return getInstancia - retorna a Instância da classe.
    */
   public static GeradorPix getInstancia() {
      if (instancia == null) {
         instancia = new GeradorPix();
      }
      return instancia;
   }
   /**
    * @return gerarCodigoPix - retorna o código pix.
    */
   public String gerarCodigoPix() {
      return PixCodeGerador.generatePixCode();
   }
}

