/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showdomilhao.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author hugobertoche
 */
public class Pergunta {
    private String texto;
    private ArrayList<Resposta> respostas;
    private final int numRespostas = 4;
    private long seed;
    
    public Pergunta (String texto) {
        this.texto = texto;
        this.respostas = null;
        this.seed = 0;
    }
    
    public void setSeed() {
        this.seed = System.nanoTime();
    }
    
    public Pergunta (String texto, ArrayList<Resposta> respostas) throws Exception {
        this.texto = texto;
        if (respostas.size() == numRespostas) {
            this.respostas = respostas;
        } else {
            throw new Exception("Muitas respostas.");
        }
        
        for (int i = 0; i < respostas.size(); i++) {
            this.respostas.get(i).setId(i);
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
    public boolean respostaCerta(int i) throws Exception {
        return i == this.respostaCerta();
    }
    
    public String getTexto() {
        return this.texto;
    }
    
    public ArrayList<Resposta> getRespostas() {
        return this.respostas;
    }
    
    public ArrayList<Resposta> getRespostasEmbaralhadas() {
        ArrayList<Resposta> embaralhada = (ArrayList<Resposta>) this.respostas.clone();
        Collections.shuffle(embaralhada, new Random(this.seed));
        return embaralhada;
    }
}
