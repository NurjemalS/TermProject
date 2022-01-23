package GUI;

import SystemAndMain.FirmSys;

public class FirmFrame extends javax.swing.JFrame {

    SearchFrame sf = new SearchFrame(this);
    AddFrame af = new AddFrame(this);
    
    public FirmFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        dispTA = new javax.swing.JTextArea();
        addBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        writeBtn = new javax.swing.JButton();
        dispAllProfitBtn = new javax.swing.JButton();
        displayByProfitBtn = new javax.swing.JButton();
        readBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Firm");

        dispTA.setColumns(20);
        dispTA.setRows(5);
        dispTA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayByDefault(evt);
            }
        });
        jScrollPane1.setViewportView(dispTA);

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        writeBtn.setText("Write To File");
        writeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writeBtnActionPerformed(evt);
            }
        });

        dispAllProfitBtn.setText("Display All Profit");
        dispAllProfitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispAllProfitBtnActionPerformed(evt);
            }
        });

        displayByProfitBtn.setText("Display By Profit");
        displayByProfitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayByProfitBtnActionPerformed(evt);
            }
        });

        readBtn.setText("Read From File");
        readBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(writeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dispAllProfitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayByProfitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(readBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(addBtn)
                        .addGap(18, 18, 18)
                        .addComponent(searchBtn)
                        .addGap(18, 18, 18)
                        .addComponent(displayByProfitBtn)
                        .addGap(18, 18, 18)
                        .addComponent(dispAllProfitBtn)
                        .addGap(18, 18, 18)
                        .addComponent(writeBtn)
                        .addGap(18, 18, 18)
                        .addComponent(readBtn)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        af.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        if(FirmSys.getFirmSet().isEmpty())
            dispTA.setText("Set is empty.");
         else{
            sf.setVisible(true);
            this.setVisible(false);
         }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void writeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writeBtnActionPerformed
         if(FirmSys.getFirmSet().isEmpty())
            dispTA.setText("Set is empty. Cannot write anything to the File");
         else{
             FirmSys.writeToFile();
             dispTA.setText("Your File is ready!");
         }
    }//GEN-LAST:event_writeBtnActionPerformed

    private void displayByDefault(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayByDefault
        if(FirmSys.getFirmSet().isEmpty())
            dispTA.setText("Set is empty. Please fill the set");
        else
            dispTA.setText(FirmSys.displayAllFirmsById()); 
    }//GEN-LAST:event_displayByDefault

    private void dispAllProfitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispAllProfitBtnActionPerformed
         if(FirmSys.getFirmSet().isEmpty())
            dispTA.setText("Set is empty. Please fill the set");
        else{
            dispTA.setText(FirmSys.calcAllProfit());
        }

    }//GEN-LAST:event_dispAllProfitBtnActionPerformed

    private void displayByProfitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayByProfitBtnActionPerformed
         if(FirmSys.getFirmSet().isEmpty())
            dispTA.setText("Set is empty. Please fill the set");
        else{
            dispTA.setText(FirmSys.displayAllFirmsByProfit());
        }
    }//GEN-LAST:event_displayByProfitBtnActionPerformed

    private void readBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readBtnActionPerformed
    if(FirmSys.readFromFile())
        dispTA.setText("File is read");
    else
        dispTA.setText("File not exist!");
    }//GEN-LAST:event_readBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton dispAllProfitBtn;
    private javax.swing.JTextArea dispTA;
    private javax.swing.JButton displayByProfitBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton readBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton writeBtn;
    // End of variables declaration//GEN-END:variables
}
