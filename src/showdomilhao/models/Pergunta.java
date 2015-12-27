/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showdomilhao.models;

import java.util.ArrayList;

/**
 *
 * @author hugobertoche
 */
public class Pergunta {
    private String texto;
    private ArrayList<Resposta> respostas;
    private final int numRespostas = 4;
    
    public Pergunta (String texto) {
        this.texto = texto;
        this.respostas = null;
    }
    
    public Pergunta (String texto, ArrayList<Resposta> respostas) throws Exception {
        this.texto = texto;
        if (respostas.size() == numRespostas) {
            this.respostas = respostas;
        } else {
            throw new Exception("Muitas respostas.");
        }
    }
    
    void addResposta(Resposta resposta) throws Exception {
        if (this.respostas.size() < numRespostas) {
            this.respostas.add(resposta);
        } else {
            throw new Exception("Pergunta com mais de " + this.numRespostas + " respostas.");
        }
    }
    
    int respostaCerta() throws Exception {
       int i = 0;
       for (i = 0; i < respostas.size(); i++) {
           if (respostas.get(i).getCerta())
               return i;
       }
       
       throw new Exception ("Nenhuma resposta certa.");
    }
    
    /**
     * Onde i e o numero da resposta
     * @param i
     * @return 
     */
    boolean respostaCerta(int i) throws Exception {
        return i == this.respostaCerta();
    }
    
}
