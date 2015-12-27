/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showdomilhao.DAO;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import showdomilhao.models.Pergunta;
import showdomilhao.models.Resposta;

/**
 *
 * @author hugobertoche
 */
public class PerguntaDAO {
    public ArrayList<Pergunta> read() {
        ArrayList<Pergunta> perguntas = new ArrayList<Pergunta>();
        JSONParser parser = new JSONParser();
        
        try {
            Object obj = parser.parse(new FileReader("perguntas.json"));
            JSONObject jsonObject = (JSONObject) obj;
            
            JSONArray perguntasJSON = (JSONArray) jsonObject.get("perguntas");
            Iterator<JSONObject> perguntasIterator = perguntasJSON.iterator();
            while(perguntasIterator.hasNext()) {
                JSONObject perguntaObject = perguntasIterator.next();
                ArrayList<Resposta> respostas = new ArrayList<Resposta>();
                Pergunta pergunta;
                JSONArray respostasArray = (JSONArray) perguntaObject.get("respostas");
                Iterator<JSONObject> respostasIterator = respostasArray.iterator();
                
                while (respostasIterator.hasNext()) {
                    JSONObject respostaObject = respostasIterator.next();
                    Resposta resposta;
                    resposta = new Resposta((String) respostaObject.get("texto"), (boolean) respostaObject.get("certa"));
                    respostas.add(resposta);
                }
                
                pergunta = new Pergunta((String) perguntaObject.get("texto"), respostas);
                perguntas.add(pergunta);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PerguntaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(PerguntaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return perguntas;
    }
}
