package GUI;

import BusFirmHasA.Booth;
import FirmInheritance.BusFirm;
import FirmInheritance.Restaurant;
import FirmInheritance.Shop;
import SystemAndMain.FirmSys;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTextField;

public class AddFrame extends javax.swing.JFrame {
    
    FirmFrame ff = null;
    BoothFrame boothf =  new BoothFrame(this);
    private ArrayList<Booth> booths = new ArrayList<>();
    
    
    public AddFrame(FirmFrame ff) {
        initComponents(); 
        this.ff = ff;
        busRBtn.setSelected(true);
        busPanel.setVisible(true); 
        shopPanel.setVisible(false); 
        restPanel.setVisible(false); 
        setLocationRelativeTo(null);
        setSize(750, 480);
        
        grossSalesLB.setVisible(false);
        grossSalesTF.setVisible(false);
   
    }
        
    public void addClear(){
        //idTF nameTF phoneTF grossSalesTF numOfSeatsTF foodCostTF  boothIdTF fuelCostTF  areaTF wh1TF wh2TF invTF
        idTF.setText("");
        nameTF.setText("");
        phoneTF.setText("");
        grossSalesTF.setText("");
        numOfSeatsTF.setText("");
        foodCostTF.setText("");
        boothIdTF.setText("");
        fuelCostTF.setText("");
        areaTF.setText("");
        wh1TF.setText("");
        wh2TF.setText("");
        invTF.setText("");
    }
    
    public void cmbClear(){
         msgInfo.setText("");
         idTF.setText("");
         nameTF.setText("");
         phoneTF.setText("");
         grossSalesTF.setText("");
    }

    public ArrayList<Booth> getBooths() {
        return booths;
    }

    public String getBoothIdTF_STR() {
        return boothIdTF.getText();
    }
    
    public void setBoothIdTF(String boothIdTF) {
        this.boothIdTF.setText(boothIdTF);
    }

    public JButton getAddFirmBtn() {
        return addFirmBtn;
    }

    public JButton getCloseBtn() {
        return closeBtn;
    }

    public JTextField getIdTF() {
        return idTF;
    }

    public JTextField getNameTF() {
        return nameTF;
    }

    public JTextField getPhoneTF() {
        return phoneTF;
    }

    public JTextField getFuelCostTF() {
        return fuelCostTF;
    }
    
    public JTextField getBoothIdTF() {
        return boothIdTF;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        chimneyGRP = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        busRBtn = new javax.swing.JRadioButton();
        shopRBtn = new javax.swing.JRadioButton();
        restRBtn = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idTF = new javax.swing.JTextField();
        nameTF = new javax.swing.JTextField();
        phoneTF = new javax.swing.JTextField();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        busPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fuelCostTF = new javax.swing.JTextField();
        msgBooth = new javax.swing.JLabel();
        boothIdTF = new javax.swing.JTextField();
        shopPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        areaTF = new javax.swing.JTextField();
        typeCMB = new javax.swing.JComboBox<>();
        wh1TF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        wh2TF = new javax.swing.JTextField();
        invTF = new javax.swing.JTextField();
        restPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        isChNeededRBtn = new javax.swing.JRadioButton();
        isChNotNeededRBtn = new javax.swing.JRadioButton();
        numOfSeatsTF = new javax.swing.JTextField();
        foodCostTF = new javax.swing.JTextField();
        addFirmBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        msgInfo = new javax.swing.JTextArea();
        grossSalesLB = new javax.swing.JLabel();
        grossSalesTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Choose Firm Type to Add"));

        buttonGroup1.add(busRBtn);
        busRBtn.setText("Bus");
        busRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busRBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(shopRBtn);
        shopRBtn.setText("Shop");
        shopRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shopRBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(restRBtn);
        restRBtn.setText("Restaurant");
        restRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restRBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(busRBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(shopRBtn)
                .addGap(18, 18, 18)
                .addComponent(restRBtn)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busRBtn)
                    .addComponent(shopRBtn)
                    .addComponent(restRBtn))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 290, 60));

        jLabel1.setText("Firm ID: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel2.setText("Firm Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 30));

        jLabel3.setText("Firm Phone: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        jPanel1.add(idTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 170, -1));

        nameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFActionPerformed(evt);
            }
        });
        jPanel1.add(nameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 170, -1));
        jPanel1.add(phoneTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 170, -1));

        busPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Bus "));

        jLabel4.setText("Fuel Cost: ");

        jLabel5.setText("Booth ID:");

        msgBooth.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        boothIdTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boothIdTFActionPerformed(evt);
            }
        });
        boothIdTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EnterKeyBoothIdEvent(evt);
            }
        });

        javax.swing.GroupLayout busPanelLayout = new javax.swing.GroupLayout(busPanel);
        busPanel.setLayout(busPanelLayout);
        busPanelLayout.setHorizontalGroup(
            busPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(busPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(busPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(msgBooth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(busPanelLayout.createSequentialGroup()
                        .addGroup(busPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(busPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fuelCostTF, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boothIdTF, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 85, Short.MAX_VALUE)))
                .addContainerGap())
        );
        busPanelLayout.setVerticalGroup(
            busPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(busPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(busPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fuelCostTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(busPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boothIdTF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(43, 43, 43)
                .addComponent(msgBooth, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        shopPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Shop"));

        jLabel6.setText("Area:");

        jLabel7.setText("Type: ");

        jLabel8.setText("Working Hours:");

        jLabel9.setText("Inventory Cost:");

        typeCMB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BookStore", "ConvenientStore", "Pharmacy", "RetailStore", "TechnologyStore" }));
        typeCMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeCMBActionPerformed(evt);
            }
        });

        jLabel10.setText(":");

        invTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout shopPanelLayout = new javax.swing.GroupLayout(shopPanel);
        shopPanel.setLayout(shopPanelLayout);
        shopPanelLayout.setHorizontalGroup(
            shopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(shopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(shopPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(wh1TF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wh2TF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(shopPanelLayout.createSequentialGroup()
                        .addGroup(shopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(76, 76, 76)
                        .addGroup(shopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(areaTF)
                            .addComponent(typeCMB, 0, 154, Short.MAX_VALUE)))
                    .addGroup(shopPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(invTF)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        shopPanelLayout.setVerticalGroup(
            shopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shopPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(shopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(areaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(shopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(typeCMB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(shopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(wh1TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(wh2TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(shopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(invTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        restPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Restaurant"));

        jLabel11.setText("Number Of Seats: ");

        jLabel12.setText("Chimney Needed?");

        jLabel13.setText("Food Cost: ");

        chimneyGRP.add(isChNeededRBtn);
        isChNeededRBtn.setText("Yes");

        chimneyGRP.add(isChNotNeededRBtn);
        isChNotNeededRBtn.setText("No");

        javax.swing.GroupLayout restPanelLayout = new javax.swing.GroupLayout(restPanel);
        restPanel.setLayout(restPanelLayout);
        restPanelLayout.setHorizontalGroup(
            restPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(restPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(restPanelLayout.createSequentialGroup()
                        .addGroup(restPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(restPanelLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(isChNeededRBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(isChNotNeededRBtn)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(restPanelLayout.createSequentialGroup()
                        .addGroup(restPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(restPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numOfSeatsTF)
                            .addComponent(foodCostTF, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))))
                .addContainerGap())
        );
        restPanelLayout.setVerticalGroup(
            restPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(restPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(numOfSeatsTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(restPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(foodCostTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(restPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isChNotNeededRBtn)
                    .addComponent(isChNeededRBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(busPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(shopPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(restPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(restPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap(28, Short.MAX_VALUE)
                    .addComponent(busPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(49, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 45, Short.MAX_VALUE)
                    .addComponent(shopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 45, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(restPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap(35, Short.MAX_VALUE)
                    .addComponent(busPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(35, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(shopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 410, 230));

        addFirmBtn.setText("Add Firm");
        addFirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFirmBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addFirmBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 200, -1));

        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 200, -1));

        msgInfo.setColumns(20);
        msgInfo.setRows(5);
        jScrollPane1.setViewportView(msgInfo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 270, 50));

        grossSalesLB.setText("Gross Sales");
        jPanel1.add(grossSalesLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));
        jPanel1.add(grossSalesTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 170, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTFActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        ff.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_closeBtnActionPerformed

    private void addFirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFirmBtnActionPerformed

       /* String firmType, String id, String name, 
        String telephone, String numOfSeats,
        String isChimneyNeeded, String rawFoodCost, 
        String area, String type, String workingHours, 
        String inventoryCost, String busFuelCost )*/
        //idTF nameTF phoneTF fuelCostTF  areaTF wh1TF wh2TF  grossSalesTF numOfSeatsTF foodCostTF
        if(busRBtn.isSelected()){
           if(idTF.getText().isEmpty() || nameTF.getText().isEmpty() || phoneTF.getText().isEmpty() || fuelCostTF.getText().isEmpty())
               msgInfo.setText("Enter Bus Details Please!");
           else{
                
               FirmSys.addFirm( "BusFirm", idTF.getText(), nameTF.getText(), phoneTF.getText(), null, null, null, null, null, null, null, null,  fuelCostTF.getText(), booths);
               msgInfo.setText("BusFirm is added.");
           }     
        }else if(shopRBtn.isSelected()){
            if(idTF.getText().isEmpty() || nameTF.getText().isEmpty() || phoneTF.getText().isEmpty() || areaTF.getText().isEmpty() || wh1TF.getText().isEmpty() || wh2TF.getText().isEmpty() || invTF.getText().isEmpty()  || grossSalesTF.getText().isEmpty())
                msgInfo.setText("Enter Shop Details Please!");
              
            else{
                FirmSys.addFirm( "Shop", idTF.getText(), nameTF.getText(), phoneTF.getText(), grossSalesTF.getText(),null, null, null, areaTF.getText(), typeCMB.getSelectedItem().toString(), wh1TF.getText()+ "."  + "00" + "-"+ wh2TF.getText()+ "."  + "00" , invTF.getText(), null, null);
                msgInfo.setText("Shop is added.");
            }
        }else if(restRBtn.isSelected()){
            if(idTF.getText().isEmpty() || nameTF.getText().isEmpty() || phoneTF.getText().isEmpty() || numOfSeatsTF.getText().isEmpty() || foodCostTF.getText().isEmpty() || grossSalesTF.getText().isEmpty())
                msgInfo.setText("Enter Restaurant Details Please!");
            else{
                String slc = "";
                if(isChNeededRBtn.isSelected())
                    slc = "true";
                else
                    slc = "false";
                
                FirmSys.addFirm( "Restaurant", idTF.getText(), nameTF.getText(), phoneTF.getText(), grossSalesTF.getText(), numOfSeatsTF.getText(), slc, foodCostTF.getText(), null, null, null, null, null, null);
                msgInfo.setText("Restaurant is added.");
            }
        }
        
       addClear();
        
    }//GEN-LAST:event_addFirmBtnActionPerformed

    private void shopRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopRBtnActionPerformed

        busPanel.setVisible(false); 
        shopPanel.setVisible(false); 
        restPanel.setVisible(false); 
        if(shopRBtn.isSelected()){
            shopPanel.setVisible(true);
            grossSalesLB.setVisible(true);
            grossSalesTF.setVisible(true);
            cmbClear();
            
        }
    }//GEN-LAST:event_shopRBtnActionPerformed

    private void restRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restRBtnActionPerformed
        busPanel.setVisible(false); 
        shopPanel.setVisible(false); 
        restPanel.setVisible(false); 
        isChNeededRBtn.setSelected(true);
        if(restRBtn.isSelected()){
            restPanel.setVisible(true);
            grossSalesLB.setVisible(true);
            grossSalesTF.setVisible(true);
            cmbClear();
        }
    }//GEN-LAST:event_restRBtnActionPerformed

    private void busRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busRBtnActionPerformed
        busPanel.setVisible(false); 
        shopPanel.setVisible(false); 
        restPanel.setVisible(false); 
        if(busRBtn.isSelected()){
            busPanel.setVisible(true);
            grossSalesLB.setVisible(false);
            grossSalesTF.setVisible(false);
            cmbClear();
        }
    }//GEN-LAST:event_busRBtnActionPerformed

    private void typeCMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeCMBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeCMBActionPerformed

    private void invTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invTFActionPerformed

    private void boothIdTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boothIdTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boothIdTFActionPerformed

    private void EnterKeyBoothIdEvent(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EnterKeyBoothIdEvent
      
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
             if(boothIdTF.getText().isEmpty())
                msgBooth.setText("Please Enter Booth Id First");
             else{
             
                 boothf.setVisible(true);
                 idTF.setEditable(false);
                 nameTF.setEditable(false);
                 phoneTF.setEditable(false);
                 fuelCostTF.setEditable(false);
                 boothIdTF.setEditable(false);
                 addFirmBtn.setVisible(false);
                 closeBtn.setVisible(false);
             }
                 
             
        } 
        
    }//GEN-LAST:event_EnterKeyBoothIdEvent
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFirmBtn;
    private javax.swing.JTextField areaTF;
    private javax.swing.JTextField boothIdTF;
    private javax.swing.JPanel busPanel;
    private javax.swing.JRadioButton busRBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup chimneyGRP;
    private javax.swing.JButton closeBtn;
    private javax.swing.JTextField foodCostTF;
    private javax.swing.JTextField fuelCostTF;
    private javax.swing.JLabel grossSalesLB;
    private javax.swing.JTextField grossSalesTF;
    private javax.swing.JTextField idTF;
    private javax.swing.JTextField invTF;
    private javax.swing.JRadioButton isChNeededRBtn;
    private javax.swing.JRadioButton isChNotNeededRBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel msgBooth;
    private javax.swing.JTextArea msgInfo;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextField numOfSeatsTF;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JPanel restPanel;
    private javax.swing.JRadioButton restRBtn;
    private javax.swing.JPanel shopPanel;
    private javax.swing.JRadioButton shopRBtn;
    private javax.swing.JComboBox<String> typeCMB;
    private javax.swing.JTextField wh1TF;
    private javax.swing.JTextField wh2TF;
    // End of variables declaration//GEN-END:variables
}
