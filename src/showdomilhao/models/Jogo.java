/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showdomilhao.models;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import showdomilhao.DAO.PerguntaDAO;
import showdomilhao.DAO.PontuacaoDAO;

/**
 *
 * @author hugobertoche
 */
public class Jogo {
    private final ArrayList<Pergunta> perguntas;
    private Pergunta perguntaDaVez;
    private int pontos;
    private int perguntasRespondidas;
    private String jogador;
    private Ranking ranking;
    private boolean pulou = false;
    private boolean cartas = false;
    
    public static enum StatusJogo {
        EM_ANDAMENTO, PERDIDO, GANHO
    };
    private StatusJogo status;
    
    public Jogo() {
        perguntas = new PerguntaDAO().read();
        ranking = new PontuacaoDAO().read();
        ranking.sort();
        pontos = 0;
        perguntasRespondidas = 0;
        status = StatusJogo.EM_ANDAMENTO;
        setPerguntaDaVez();
    }
    
    public void setJogador(String nome) {
        this.jogador = nome;
    }
    
    public String getJogador() {
        return this.jogador;
    }
    
    public int getPerguntasRespondidas() {
        return this.perguntasRespondidas;
    }
    
    public int countPerguntas() {
        return this.perguntas.size();
    }
    
    public int getPontos() {
        return this.pontos;
    }
    
    public void incrementPerguntasRespondidas() {
        this.perguntasRespondidas++;
    }
    
    public Pergunta getPerguntaDaVez() {
        return this.perguntaDaVez;
    }
    
    public Ranking getRanking() {
        return this.ranking;
    }
    
    public final void setPerguntaDaVez() {
        int nPerguntas = perguntas.size();
        Random randomGenerator = new Random();
        int pergunta = randomGenerator.nextInt(nPerguntas);
        this.perguntaDaVez = perguntas.remove(pergunta);
        this.perguntaDaVez.setSeed();
    }
    
    private void setStatus (StatusJogo status) {
        this.status = status;
    }
    
    public StatusJogo getStatus() {
        return this.status;
    }
    
    public void salvarPontuacao() {
        this.getRanking().add(this.jogador, this.pontos);
        new PontuacaoDAO().save(this.getRanking());
    }
    
    public void responder(int i) {
        try {
            if (this.perguntaDaVez.respostaCerta(i)) {
                this.perguntasRespondidas++;
                this.pontos += (1000 + (this.pontos * 2)) / 10;
            } else {
                this.setStatus(StatusJogo.PERDIDO);
            }
            
            if (this.perguntas.size() == 0 && this.status == StatusJogo.EM_ANDAMENTO) {
                this.setStatus(StatusJogo.GANHO);
            }
        } catch (Exception ex) {
            Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (this.status != StatusJogo.EM_ANDAMENTO) {
            this.salvarPontuacao();
        } else {
            setPerguntaDaVez();
        }
    }
    
    public boolean pular() {
        if (!this.pulou) {
            this.incrementPerguntasRespondidas();
            this.pulou = true;
            setPerguntaDaVez();
            return true;
        } else {
            return false;
        }
        
    }
    
    public boolean getPulou() {
        return this.pulou;
    }
    
    public boolean getCartas() {
        return this.cartas;
    }
    
    public void cartas() {
        this.cartas = true;
    }
}
