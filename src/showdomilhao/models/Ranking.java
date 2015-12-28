/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showdomilhao.models;

import java.util.ArrayList;
import java.util.Comparator;
import showdomilhao.DAO.PontuacaoDAO;
import showdomilhao.comparators.RankingItemComparator;

/**
 *
 * @author hugobertoche
 */
public class Ranking {
    private ArrayList<RankItem> ranking;
    
    public Ranking () {
        ranking = new ArrayList<RankItem>();
    }
    
    public Ranking(ArrayList<RankItem> list) {
        ranking = list;
    }
    
    public void add(RankItem rank) {
        this.ranking.add(rank);
        ranking.sort(new RankingItemComparator());
    }
    
    public void add(String jogador, int pontuacao) {
        RankItem novoRegistro = new RankItem();
        novoRegistro.jogador = jogador;
        novoRegistro.pontuacao = pontuacao;
        ranking.add(novoRegistro);
        ranking.sort(new RankingItemComparator());
    }
    
    public void sort() {
        this.ranking.sort(new RankingItemComparator());
    }
    
    public ArrayList<RankItem> getRanking() {
        return this.ranking;
    }
    
    public void save() {
        new PontuacaoDAO().save(this);
    }
}