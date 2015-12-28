/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showdomilhao.forms;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import showdomilhao.models.Jogo;

/**
 *
 * @author hugobertoche
 */
public class PerguntaForm extends javax.swing.JFrame {
    private Jogo jogo;

    /**
     * Creates new form PerguntaForm
     */
    public PerguntaForm(Jogo jogo) {
        this.jogo = jogo;
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        this.jogo.setJogador(nome);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        perguntaLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Show do milhao");

        perguntaLabel.setText(this.jogo.getPerguntaDaVez().getTexto());
        perguntaLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jButton1.setText(this.jogo.getPerguntaDaVez().getRespostasEmbaralhadas().get(0).getTexto()

        );
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText(this.jogo.getPerguntaDaVez().getRespostasEmbaralhadas().get(1).getTexto());
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText(this.jogo.getPerguntaDaVez().getRespostasEmbaralhadas().get(2).getTexto());
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText(this.jogo.getPerguntaDaVez().getRespostasEmbaralhadas().get(3).getTexto());
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jLabel1.setText(this.jogo.getPontos() + "");

        jLabel2.setText("Pontos:");

        jLabel3.setText("Pergunta:");

        jLabel4.setText("" + (this.jogo.getPerguntasRespondidas() + 1) + " de " + (this.jogo.countPerguntas() + (this.jogo.getPerguntasRespondidas() + 1)));

        jLabel5.setText("Jogador: " + this.jogo.getJogador());

        jButton5.setText("Ver ranking");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(perguntaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1))
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(perguntaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap())
        );

        perguntaLabel.getAccessibleContext().setAccessibleName("perguntaLabel");
        perguntaLabel.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.responder(0);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.responder(1);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        this.responder(2);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        this.responder(3);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        new RankingFrame(jogo).setVisible(true);
    }//GEN-LAST:event_jButton5MouseClicked

    private void checaRecomeco(int recomecar) {
        if (recomecar == 0) {
                this.jogo = new Jogo();
                this.setVisible(false);
                new PerguntaForm(this.jogo).setVisible(true);
            }
    }
    
    private void responder(int resposta) {
        if (this.jogo.getStatus() == Jogo.StatusJogo.PERDIDO) {
            int recomecar = JOptionPane.showConfirmDialog(null, "Você já perdeu o jogo, deseja jogar novamente?");
            checaRecomeco(recomecar);
            return;
        } else if (this.jogo.getStatus() == Jogo.StatusJogo.GANHO) {
            int recomecar = JOptionPane.showConfirmDialog(null, "Você já ganhou o jogo, deseja jogar novamente?");
            checaRecomeco(recomecar);
            return;
        }
        
        int idResposta = this.jogo.getPerguntaDaVez().getRespostasEmbaralhadas().get(resposta).getId();
        this.jogo.responder(idResposta);
        
        this.jLabel1.setText(this.jogo.getPontos() +  "");
        this.jLabel4.setText((this.jogo.getPerguntasRespondidas() + 1) + " de " + (this.jogo.countPerguntas() + (this.jogo.getPerguntasRespondidas() + 1)));
        
        if (this.jogo.getStatus() == Jogo.StatusJogo.EM_ANDAMENTO) {
            this.jButton1.setText(this.jogo.getPerguntaDaVez().getRespostasEmbaralhadas().get(0).getTexto());
            this.jButton2.setText(this.jogo.getPerguntaDaVez().getRespostasEmbaralhadas().get(1).getTexto());
            this.jButton3.setText(this.jogo.getPerguntaDaVez().getRespostasEmbaralhadas().get(2).getTexto());
            this.jButton4.setText(this.jogo.getPerguntaDaVez().getRespostasEmbaralhadas().get(3).getTexto());

            this.perguntaLabel.setText(this.jogo.getPerguntaDaVez().getTexto());
        } else if (this.jogo.getStatus() == Jogo.StatusJogo.GANHO) {
            // ganhou o jogo
            int recomecar = JOptionPane.showConfirmDialog(null, "Você ganhou o jogo, deseja jogar novamente?");
            checaRecomeco(recomecar);
            return;
        } else if (this.jogo.getStatus() == Jogo.StatusJogo.PERDIDO) {
            int recomecar = JOptionPane.showConfirmDialog(null, "Você perdeu o jogo, deseja jogar novamente?");
            checaRecomeco(recomecar);
            return;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel perguntaLabel;
    // End of variables declaration//GEN-END:variables
}
