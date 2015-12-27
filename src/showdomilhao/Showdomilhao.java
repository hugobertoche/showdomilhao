/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showdomilhao;

import java.awt.EventQueue;
import javafx.embed.swing.JFXPanel;
import showdomilhao.forms.PerguntaForm;
import showdomilhao.models.Jogo;

/**
 *
 * @author hugobertoche
 */
public class Showdomilhao {
    
    private static final int JFXPANEL_WIDTH_INT = 300;
    private static final int JFXPANEL_HEIGHT_INT = 250;
    private static JFXPanel fxContainer;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         EventQueue.invokeLater(new Runnable() {
        
            @Override
            public void run() {
                Jogo jogo = new Jogo();
                PerguntaForm perguntaForm = new PerguntaForm(jogo);
                perguntaForm.setVisible(true);
                // jogo.setVisible(true);
            }
        });
    }
    
   
    
}
