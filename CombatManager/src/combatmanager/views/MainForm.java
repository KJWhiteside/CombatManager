/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package combatmanager.views;

import combatmanager.models.Combatant;
import combatmanager.models.CombatantList;

/**
 *
 * @author Kevin
 */
public class MainForm extends javax.swing.JFrame
{
    public CombatantList PlayerCharacters;
    
    /**
     * Creates new form MainForm
     */
    public MainForm()
    {
        // Constructor
        initDebugModel();
        initComponents();
    }

    private void initDebugModel()
    {
        PlayerCharacters = new CombatantList();
        PlayerCharacters.addCombatant(new Combatant(1, "Bob"));
        PlayerCharacters.addCombatant(new Combatant(2, "Charlotte"));
        PlayerCharacters.addCombatant(new Combatant(0, "Alan"));
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        pcList = new javax.swing.JList();
        addPCBtn = new javax.swing.JButton();
        editPCBtn = new javax.swing.JButton();
        removePCBtn = new javax.swing.JButton();
        beginCombatBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        loadPartyBtn = new javax.swing.JButton();
        savePartyBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CombatManager 2.0");
        setBackground(new java.awt.Color(102, 102, 102));
        setForeground(new java.awt.Color(102, 102, 102));
        setName("CombatManager"); // NOI18N
        setResizable(false);

        pcList.setModel(PlayerCharacters);
        pcList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(pcList);

        addPCBtn.setText("Add PC");
        addPCBtn.setActionCommand("");

        editPCBtn.setText("Edit PC");

        removePCBtn.setText("Remove PC");

        beginCombatBtn.setText("Begin Combat");
        beginCombatBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                beginCombatBtnActionPerformed(evt);
            }
        });

        exitBtn.setText("Exit Program");

        loadPartyBtn.setText("Load Party");

        savePartyBtn.setText("Save Party");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(beginCombatBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removePCBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editPCBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addPCBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loadPartyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(savePartyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addPCBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editPCBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removePCBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(beginCombatBtn)
                        .addGap(18, 18, 18)
                        .addComponent(savePartyBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loadPartyBtn)
                        .addGap(18, 18, 18)
                        .addComponent(exitBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void beginCombatBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_beginCombatBtnActionPerformed
    {//GEN-HEADEREND:event_beginCombatBtnActionPerformed
        // TODO add your handling code here:
        BattleForm battle = new BattleForm(this.PlayerCharacters.getCombatants());
        battle.setVisible(true);        
    }//GEN-LAST:event_beginCombatBtnActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPCBtn;
    private javax.swing.JButton beginCombatBtn;
    private javax.swing.JButton editPCBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loadPartyBtn;
    private javax.swing.JList pcList;
    private javax.swing.JButton removePCBtn;
    private javax.swing.JButton savePartyBtn;
    // End of variables declaration//GEN-END:variables

}
