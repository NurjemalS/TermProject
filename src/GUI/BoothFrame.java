package GUI;

import BusFirmHasA.Booth;
import FirmInheritance.BusFirm;
import FirmInheritance.Firm;
import SystemAndMain.FirmSys;
import java.util.HashMap;
import java.util.HashSet;

public class BoothFrame extends javax.swing.JFrame {
    private HashMap<String, Double> booth = new HashMap<>();
    
    
    
    AddFrame af = null;
    public BoothFrame(AddFrame af) {
        initComponents();
        this.af = af;
        setLocationRelativeTo(null);
    }

    public HashMap<String, Double> getBooth() {
        return booth;
    }
    
    public void clear(){
        ticketPriceTF.setText("");
        ticketIdTF.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddToBoothBtn = new javax.swing.JButton();
        addTicketBtn = new javax.swing.JButton();
        msgTicket = new javax.swing.JLabel();
        ticketIdTF = new javax.swing.JTextField();
        ticketPriceTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Booth");

        AddToBoothBtn.setText("Add To Booth");
        AddToBoothBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToBoothBtnActionPerformed(evt);
            }
        });

        addTicketBtn.setText("Add Ticket");
        addTicketBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTicketBtnActionPerformed(evt);
            }
        });

        msgTicket.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ticketPriceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketPriceTFActionPerformed(evt);
            }
        });

        jLabel2.setText("Ticket ID:");

        jLabel3.setText("Ticket Price:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(msgTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ticketPriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ticketIdTF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AddToBoothBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addTicketBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addTicketBtn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ticketIdTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ticketPriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(msgTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddToBoothBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ticketPriceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketPriceTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ticketPriceTFActionPerformed

    private void addTicketBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTicketBtnActionPerformed
        
        String id = ticketIdTF.getText();
        Double price = Double.parseDouble(ticketPriceTF.getText());
        booth.put(id, price);
        msgTicket.setText("Ticket is added");
        clear();
        
    }//GEN-LAST:event_addTicketBtnActionPerformed

    private void AddToBoothBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToBoothBtnActionPerformed
        String id = af.getBoothIdTF_STR();
        Booth bo = new Booth(id, booth);
        af.getBooths().add(bo); // arraylist add yapildi
        
        af.setBoothIdTF("");
        
        af.getAddFirmBtn().setVisible(true);
        af.getCloseBtn().setVisible(true);
        af.getIdTF().setEditable(true);
        af.getNameTF().setEditable(true);
        af.getPhoneTF().setEditable(true);
        af.getFuelCostTF().setEditable(true);
        af.getBoothIdTF().setEditable(true);
        

        af.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddToBoothBtnActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddToBoothBtn;
    private javax.swing.JButton addTicketBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel msgTicket;
    private javax.swing.JTextField ticketIdTF;
    private javax.swing.JTextField ticketPriceTF;
    // End of variables declaration//GEN-END:variables
}
