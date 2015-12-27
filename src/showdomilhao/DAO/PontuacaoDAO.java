/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showdomilhao.DAO;

import java.util.ArrayList;
import showdomilhao.models.Ranking;

/**
 *
 * @author hugobertoche
 */
public class PontuacaoDAO {
    public Ranking read() {
        Ranking ranking = new Ranking();
        
        return ranking;
    }
    
    public void save(Ranking ranking) {
        System.out.println(ranking);
    }
}
