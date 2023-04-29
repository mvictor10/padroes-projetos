/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author mvictor
 */
public class Utils {
    private static Utils instance=null;
    private Utils(){}
    public static Utils getIstance(){
        if(instance==null){
            instance=new Utils();
        }
        return instance;
    }
    
    /**
     *
     * @param nome - String em questão.
     * @param comando - Aqui você irá fornecer o que você gostaria de remover da string.
     * @return extrairNomeProduto - retorna o nome do produto.
     */
    public final static String extrairNomeProduto(String nome, String comando){
        String[] partes = nome.split(comando);
        return partes[0];
    }
    
    /**
     * @param texto - o texto que você gostaria de retorna somente o valor númerico.
     * @return extrairValorNumerico.
     */
    public String extrairValorNumerico(String texto) {
        // criar um padrão de expressão regular para encontrar o valor numérico
        Pattern pattern = Pattern.compile("\\d+\\.\\d+");
        Matcher matcher = pattern.matcher(texto);
        // verificar se há uma correspondência
        if (matcher.find()) {
            // retornar o valor numérico encontrado
            return matcher.group();
        } else {
            // se não houver correspondência, retornar null
            return null;
        }
    }
    
    

}
