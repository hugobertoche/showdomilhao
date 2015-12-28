/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showdomilhao.DAO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import showdomilhao.models.RankItem;
import showdomilhao.models.Ranking;

/**
 *
 * @author hugobertoche
 */
public class PontuacaoDAO {
    public Ranking read() {
        Ranking ranking = new Ranking();
        JSONParser parser = new JSONParser();
        
        try {
            Object obj = parser.parse(new FileReader("ranking.json"));
            JSONObject jsonObject = (JSONObject) obj;
            
            JSONArray rankingJSON = (JSONArray) jsonObject.get("ranking");
            Iterator<JSONObject> rankingIterator = rankingJSON.iterator();
            while(rankingIterator.hasNext()) {
                JSONObject rankObject = rankingIterator.next();
                RankItem rank = new RankItem();
                rank.jogador = (String) rankObject.get("jogador");
                rank.pontuacao = (long) rankObject.get("pontuacao");
                
                ranking.add(rank);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PontuacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(PontuacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ranking;
    }
    
    public void save(Ranking ranking) {
        JSONObject jsonToFile = new JSONObject();
        JSONArray rankingJSON = new JSONArray();
        
        for (RankItem rank : ranking.getRanking()) {
            JSONObject rankJSON = new JSONObject();
            rankJSON.put("jogador", rank.jogador);
            rankJSON.put("pontuacao", rank.pontuacao);
            rankingJSON.add(rankJSON);
        }
        
        jsonToFile.put("ranking", rankingJSON);
        
        try (FileWriter file = new FileWriter("ranking.json")) {
            file.write(jsonToFile.toString());
        } catch (IOException ex) {
            Logger.getLogger(PontuacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(jsonToFile.toString());
    }
}
