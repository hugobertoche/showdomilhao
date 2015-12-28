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
    private int idResposta;
    private boolean removida = false;
    
    public Resposta (String texto, boolean certa) {
        this.certa = certa;
        this.texto = texto;
        this.idResposta = -1;
    };
    
    public String getTexto() {
        return this.texto;
    }
    
    public boolean getCerta() {
        return this.certa;
    }
    
    public void setId(int id) {
        this.idResposta = id;
    }
    
    public int getId() {
        return this.idResposta;
    }
    
    public boolean getRemovida() {
        return this.removida;
    }
    
    public void setRemovida(boolean removida) {
        this.removida = removida;
    }
}
