package gamepack;

import entities.Bullet;
import entities.Mob;
import static gamepack.Game.BULLETMAP;
import static gamepack.Game.JOHNNY;
import static gamepack.Game.MAPHEIGHT;
import static gamepack.Game.MAPWIDTH;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

public class gameFrame extends javax.swing.JFrame {
    String strMAP;
    public gameFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mazePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mazeArea = new javax.swing.JTextArea();
        playerStatsPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        hpProgressBar = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar3 = new javax.swing.JProgressBar();
        jProgressBar4 = new javax.swing.JProgressBar();
        jProgressBar5 = new javax.swing.JProgressBar();
        hpProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar6 = new javax.swing.JProgressBar();
        gameSettingsPanel = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jSlider1 = new javax.swing.JSlider();
        entitiesPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        playerControlsPanel = new javax.swing.JPanel();
        label5 = new java.awt.Label();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        mazePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("GG MAZE"));

        mazeArea.setEditable(false);
        mazeArea.setColumns(MAPWIDTH);
        mazeArea.setRows(MAPHEIGHT);
        mazeArea.setText("");
        mazeArea.setToolTipText("");
        mazeArea.setPreferredSize(new java.awt.Dimension(41, 41));
        mazeArea.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        mazeArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mazeAreaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(mazeArea);

        javax.swing.GroupLayout mazePanelLayout = new javax.swing.GroupLayout(mazePanel);
        mazePanel.setLayout(mazePanelLayout);
        mazePanelLayout.setHorizontalGroup(
            mazePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mazePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                .addContainerGap())
        );
        mazePanelLayout.setVerticalGroup(
            mazePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        playerStatsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("PLAYER STATS"));

        jLabel3.setText("LIVES");

        jLabel4.setText("HP");

        jLabel5.setText("ATTACK DAMAGE");

        jLabel6.setText("VISION");

        jLabel7.setText("ARMOR");

        jLabel8.setText("LOST ITEM");

        jLabel9.setText("GOLD");

        hpProgressBar.setMaximum(JOHNNY.getLives());
        hpProgressBar.setMinimum(0);
        hpProgressBar.setValue(JOHNNY.getLives());

        jProgressBar2.setMaximum(10);
        jProgressBar2.setMinimum(5);
        jProgressBar2.setValue(JOHNNY.getATTACKDAMAGE()/10);

        jProgressBar3.setMaximum(5);
        jProgressBar3.setMinimum(2);
        jProgressBar3.setValue(JOHNNY.getARMOR());

        jProgressBar4.setMaximum(5);
        jProgressBar4.setMinimum(2);
        jProgressBar4.setValue(JOHNNY.getVISION());

        jProgressBar5.setMaximum(40);
        jProgressBar5.setMinimum(0);
        jProgressBar5.setValue(JOHNNY.getGoldAmount());

        hpProgressBar1.setMaximum(JOHNNY.getTOTALHP());
        hpProgressBar1.setValue(JOHNNY.getHP());

        jProgressBar6.setMaximum(JOHNNY.getTotalLostItemAmount());
        jProgressBar6.setMinimum(0);
        jProgressBar6.setValue(JOHNNY.getLostItemAmount());

        javax.swing.GroupLayout playerStatsPanelLayout = new javax.swing.GroupLayout(playerStatsPanel);
        playerStatsPanel.setLayout(playerStatsPanelLayout);
        playerStatsPanelLayout.setHorizontalGroup(
            playerStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerStatsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(playerStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(77, 77, 77)
                .addGroup(playerStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hpProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(hpProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        playerStatsPanelLayout.setVerticalGroup(
            playerStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerStatsPanelLayout.createSequentialGroup()
                .addGroup(playerStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(hpProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(hpProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(jProgressBar4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jProgressBar6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(playerStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProgressBar5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        gameSettingsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("GAME SETTINGS"));

        jToggleButton1.setText("GAME SOUND");
        jToggleButton1.setToolTipText("");

        javax.swing.GroupLayout gameSettingsPanelLayout = new javax.swing.GroupLayout(gameSettingsPanel);
        gameSettingsPanel.setLayout(gameSettingsPanelLayout);
        gameSettingsPanelLayout.setHorizontalGroup(
            gameSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameSettingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        gameSettingsPanelLayout.setVerticalGroup(
            gameSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameSettingsPanelLayout.createSequentialGroup()
                .addGroup(gameSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton1)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        entitiesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("ENTITIES"));

        jLabel1.setText(" J  - PLAYER");

        jLabel2.setText(" Z  - ZOMBIE");

        jLabel10.setText(" +  - 5 HP");

        jLabel11.setText(" $  - 5 GOLD");

        jLabel12.setText(" # - FOG");

        jLabel13.setText(" @ - LOST ITEM");

        jLabel14.setText(" * - BULLET");

        jLabel15.setText(" E - EXIT");

        javax.swing.GroupLayout entitiesPanelLayout = new javax.swing.GroupLayout(entitiesPanel);
        entitiesPanel.setLayout(entitiesPanelLayout);
        entitiesPanelLayout.setHorizontalGroup(
            entitiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entitiesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(entitiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(entitiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        entitiesPanelLayout.setVerticalGroup(
            entitiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entitiesPanelLayout.createSequentialGroup()
                .addGroup(entitiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(entitiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(entitiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(entitiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel15))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        playerControlsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("PLAYER CONTROLS"));

        jLabel16.setText("W - MOVE UP");

        jLabel17.setText("A - MOVE LEFT");

        jLabel18.setText("S - MOVE DOWN");

        jLabel19.setText("D - MOVE RIGHT");

        jLabel20.setText("UP ARROW - SHOOT UP");

        jLabel21.setText("LEFT ARROW - SHOOT LEFT");

        jLabel22.setText("DOWN ARROW - SHOOT DOWN");

        jLabel23.setText("RIGHT ARROW - SHOOT RIGHT");

        jLabel25.setText("P - PAUSE");

        javax.swing.GroupLayout playerControlsPanelLayout = new javax.swing.GroupLayout(playerControlsPanel);
        playerControlsPanel.setLayout(playerControlsPanelLayout);
        playerControlsPanelLayout.setHorizontalGroup(
            playerControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerControlsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(playerControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playerControlsPanelLayout.createSequentialGroup()
                        .addGroup(playerControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerControlsPanelLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(playerControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addContainerGap(43, Short.MAX_VALUE))
                    .addGroup(playerControlsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        playerControlsPanelLayout.setVerticalGroup(
            playerControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerControlsPanelLayout.createSequentialGroup()
                .addGroup(playerControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(4, 4, 4)
                .addGroup(playerControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(mazePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playerStatsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gameSettingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerControlsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(entitiesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(playerStatsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entitiesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerControlsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gameSettingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(mazePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        boolean exist = false;
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_UP:
                System.out.println("up");
                for(int i=0 ; i<BULLETMAP.size() ; i++){
                    if(BULLETMAP.get(i).getX()==JOHNNY.getX() && BULLETMAP.get(i).getY()==JOHNNY.getY()-1 && BULLETMAP.get(i).getDir()==0){
                        exist = true;
                        break;
                    }
                }
                if(!exist){
                    Bullet bullet = new Bullet(" * ", JOHNNY.getX(), JOHNNY.getY()-1, 0);
                    BULLETMAP.add(bullet);
                    Thread bulletThread= new Thread(bullet);
                    bulletThread.start();
                }
                break;
                
            case KeyEvent.VK_DOWN:
                for(int i=0 ; i<BULLETMAP.size() ; i++){
                    if(BULLETMAP.get(i).getX()==JOHNNY.getX() && BULLETMAP.get(i).getY()==JOHNNY.getY()+1 && BULLETMAP.get(i).getDir()==1){
                        exist = true;
                        break;
                    }
                }
                if(!exist){
                    Bullet bullet = new Bullet(" * ", JOHNNY.getX(), JOHNNY.getY()+1, 1);
                    BULLETMAP.add(bullet);
                }
                break;
                
            case KeyEvent.VK_LEFT:
                for(int i=0 ; i<BULLETMAP.size() ; i++){
                    if(BULLETMAP.get(i).getX()==JOHNNY.getX()-1 && BULLETMAP.get(i).getY()==JOHNNY.getY() && BULLETMAP.get(i).getDir()==2){
                        exist = true;
                        break;
                    }
                }
                if(!exist){
                    Bullet bullet = new Bullet(" * ", JOHNNY.getX()-1, JOHNNY.getY(), 2);
                    BULLETMAP.add(bullet);
                }
                break;
                
            case KeyEvent.VK_RIGHT:
                for(int i=0 ; i<BULLETMAP.size() ; i++){
                    if(BULLETMAP.get(i).getX()==JOHNNY.getX()+1 && BULLETMAP.get(i).getY()==JOHNNY.getY() && BULLETMAP.get(i).getDir()==3){
                        exist = true;
                        break;
                    }
                }
                if(!exist){
                    Bullet bullet = new Bullet(" * ", JOHNNY.getX()+1, JOHNNY.getY(), 3);
                    BULLETMAP.add(bullet);
                }
                break;
                
            case KeyEvent.VK_W:
            case KeyEvent.VK_S:
            case KeyEvent.VK_A:
            case KeyEvent.VK_D:
                JOHNNY.executeCollisionAction(evt);
                break;   
            case KeyEvent.VK_P:
            {
                pauseDialog pause = new pauseDialog();
                pause.start();
            try {
                this.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(gameFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }
    }//GEN-LAST:event_formKeyPressed

    private void mazeAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mazeAreaKeyPressed
        formKeyPressed(evt);
    }//GEN-LAST:event_mazeAreaKeyPressed

    public void start() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Game MazerunnerGame = new Game();
                strMAP = MazerunnerGame.toString();
                mazeArea.setRows(MAPHEIGHT);
                mazeArea.setColumns(MAPHEIGHT);
                mazeArea.append(strMAP);
                
                gameFrame frame = new gameFrame();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                
                Thread a = new Thread(){
                    @Override
                    public void run() {
                        while (true) {
                            MazerunnerGame.refresh();
                            mazeArea.setText(MazerunnerGame.toString());
                            System.out.println(mazeArea.getText());
                            
                            if(JOHNNY.getGoldAmount()==40){
                                upgradeDialog dialog = new upgradeDialog();
                                dialog.setLocationRelativeTo(null);
                                dialog.setVisible(true);
                            }
                            
                            synchronized( this ){
                                try {
                                    this.wait(10);
                                    //sleep(3000);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(gameFrame.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                    }
                };
                a.start();
                
                Thread zombieThread = new Thread(new Mob());
                zombieThread.start();
                
                Thread bulletThread = new Thread(new Bullet(" * ", 0, 0, 0));
                bulletThread.start();
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel entitiesPanel;
    private javax.swing.JPanel gameSettingsPanel;
    private javax.swing.JProgressBar hpProgressBar;
    private javax.swing.JProgressBar hpProgressBar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JProgressBar jProgressBar5;
    private javax.swing.JProgressBar jProgressBar6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JToggleButton jToggleButton1;
    private java.awt.Label label5;
    private javax.swing.JTextArea mazeArea;
    private javax.swing.JPanel mazePanel;
    private javax.swing.JPanel playerControlsPanel;
    private javax.swing.JPanel playerStatsPanel;
    // End of variables declaration//GEN-END:variables
}
