/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showdomilhao.models;

/**
 *
 * @author hugobertoche
 */
public class Resposta {
    private final String texto;
    private final boolean certa;
    
    public Resposta (String texto, boolean certa) {
        this.certa = certa;
        this.texto = texto;
    };
    
    String getTexto() {
        return this.texto;
    }
    
    boolean getCerta() {
        return this.certa;
    }
}
