package halsywallet;

import javax.swing.JOptionPane;

public class HalsyGameWallet extends javax.swing.JFrame {
    int satu, dua, tiga, empat, lima, harga, no, beli, total, bayar, kembali;

    public HalsyGameWallet() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pembayaran = new javax.swing.JComboBox<>();
        rb_satu = new javax.swing.JRadioButton();
        rb_dua = new javax.swing.JRadioButton();
        rb_tiga = new javax.swing.JRadioButton();
        rb_empat = new javax.swing.JRadioButton();
        rb_lima = new javax.swing.JRadioButton();
        text_harga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_input = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();
        btn_cetak = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        text_area = new javax.swing.JTextArea();
        text_no = new javax.swing.JTextField();
        text_nama = new javax.swing.JTextField();
        text_jumlah = new javax.swing.JTextField();
        text_total = new javax.swing.JTextField();
        text_bayar = new javax.swing.JTextField();
        text_kembali = new javax.swing.JTextField();
        text_pesan = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 204), 1, true));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Halsy Game Wallet");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Daftar Harga Steam Wallet IDR"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Pembayaran");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 30, -1, -1));

        jLabel3.setText("Steam Wallet");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 74, -1, -1));

        jLabel4.setText("Harga");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 209, -1, -1));

        pembayaran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OVO / DANA / BNI", "Pulsa XL", "Pulsa TSEL" }));
        pembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pembayaranActionPerformed(evt);
            }
        });
        jPanel2.add(pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 27, 102, -1));

        buttonGroup1.add(rb_satu);
        rb_satu.setText("60.000");
        rb_satu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_satuActionPerformed(evt);
            }
        });
        jPanel2.add(rb_satu, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 70, 102, -1));

        buttonGroup1.add(rb_dua);
        rb_dua.setText("120.000");
        rb_dua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_duaActionPerformed(evt);
            }
        });
        jPanel2.add(rb_dua, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 93, 102, -1));

        buttonGroup1.add(rb_tiga);
        rb_tiga.setText("250.000");
        rb_tiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_tigaActionPerformed(evt);
            }
        });
        jPanel2.add(rb_tiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 116, 102, -1));

        buttonGroup1.add(rb_empat);
        rb_empat.setText("400.000");
        rb_empat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_empatActionPerformed(evt);
            }
        });
        jPanel2.add(rb_empat, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 139, 102, -1));

        buttonGroup1.add(rb_lima);
        rb_lima.setText("600.000");
        rb_lima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_limaActionPerformed(evt);
            }
        });
        jPanel2.add(rb_lima, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 162, 102, -1));

        text_harga.setEditable(false);
        jPanel2.add(text_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 206, 102, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, 250));

        jLabel5.setText("No HP / Rek");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        jLabel6.setText("Nama");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        jLabel7.setText("Jumlah Pembelian");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        jLabel8.setText("Total Bayar");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        jLabel9.setText("Uang Bayar");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        jLabel10.setText("Uang Kembali");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        jLabel11.setText("Catatan");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, -1));

        btn_input.setText("Input Kembali");
        btn_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inputActionPerformed(evt);
            }
        });
        jPanel1.add(btn_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 110, -1));

        btn_close.setText("Close");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, -1, -1));

        btn_cetak.setText("Cetak Struk");
        btn_cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cetakActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 110, -1));

        text_area.setEditable(false);
        text_area.setColumns(20);
        text_area.setRows(5);
        jScrollPane1.setViewportView(text_area);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 470, 150));

        text_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_noActionPerformed(evt);
            }
        });
        text_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_noKeyTyped(evt);
            }
        });
        jPanel1.add(text_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 110, -1));

        text_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_namaActionPerformed(evt);
            }
        });
        jPanel1.add(text_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 110, -1));

        text_jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_jumlahActionPerformed(evt);
            }
        });
        text_jumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text_jumlahKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_jumlahKeyTyped(evt);
            }
        });
        jPanel1.add(text_jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 110, -1));

        text_total.setEditable(false);
        text_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_totalActionPerformed(evt);
            }
        });
        jPanel1.add(text_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 110, -1));

        text_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_bayarActionPerformed(evt);
            }
        });
        text_bayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text_bayarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_bayarKeyTyped(evt);
            }
        });
        jPanel1.add(text_bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 110, -1));

        text_kembali.setEditable(false);
        text_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_kembaliActionPerformed(evt);
            }
        });
        jPanel1.add(text_kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 110, -1));

        text_pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_pesanActionPerformed(evt);
            }
        });
        jPanel1.add(text_pesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 110, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/steam logo.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/vivid.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pembayaranActionPerformed
        //Pembayaran
        if(pembayaran.getSelectedItem().equals("Pilih Pembayaran")){
            buttonGroup1.clearSelection();
            text_harga.setText("");
        }
        else if(pembayaran.getSelectedItem().equals("OVO / DANA / BNI")){
            satu=68000;
            dua=135000;
            tiga=280000;
            empat=450000;
            lima=680000;
        }
        else if(pembayaran.getSelectedItem().equals("Pulsa XL")){
            satu=95000;
            dua=195000;
            tiga=390000;
            empat=620000;
            lima=935000;
        }
        else if(pembayaran.getSelectedItem().equals("Pulsa TSEL")){
            satu=100000;
            dua=200000;
            tiga=405000;
            empat=645000;
            lima=970000;
        }
    }//GEN-LAST:event_pembayaranActionPerformed

    private void btn_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inputActionPerformed
        //button input kembali
        buttonGroup1.clearSelection();
        text_harga.setText("");
        pembayaran.setSelectedItem("Pilih Pembayaran");
        text_no.setText("");
        text_nama.setText("");
        text_harga.setText("");
        text_total.setText("");
        text_jumlah.setText("");
        text_bayar.setText("");
        text_kembali.setText("");
        text_area.setText("");
        text_pesan.setText("");
        rb_satu.setSelected(false);
        rb_dua.setSelected(false);
        rb_tiga.setSelected(false);
        rb_empat.setSelected(false);
        rb_lima.setSelected(false);
    }//GEN-LAST:event_btn_inputActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        //Button Close
        int answer=JOptionPane.showConfirmDialog(null, "Apakah anda yakin keluar ?","Keluar", JOptionPane.OK_OPTION);
        if(answer==JOptionPane.OK_OPTION){
            dispose();
        }
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cetakActionPerformed
        //Cetak
        if(Integer.parseInt(text_kembali.getText()) >= 0 ){
            text_area.setText(
                "Nomor HP / Rekening\t: " +text_no.getText()+"\n"+
                "Nama\t\t: " +text_nama.getText()+"\n"+
                "Jumlah Pembelian\t: " +text_jumlah.getText()+"\n"+
                "Total Bayar\t\t: " +text_total.getText()+"\n"+
                "Uang Bayar\t\t: " +text_bayar.getText()+"\n"+
                "Uang Kembali\t\t: " +text_kembali.getText()+"\n"+
                "Pesan\t\t: " +text_pesan.getText()+"\n"+
                "Terima Kasih telah membeli di Halsy Game Wallet");
        }else{
            text_area.setText("DUIT NYA KURANG WOY");
        }
        
    }//GEN-LAST:event_btn_cetakActionPerformed

    private void text_jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_jumlahActionPerformed
        //Jumlah Pembelian
        try {
            if ("".equals(text_jumlah.getText())){
            }else{
                beli = Integer.parseInt(text_jumlah.getText());
                harga = Integer.parseInt(text_harga.getText());
                total = bayar * harga;
                text_total.setText(String.valueOf(total));
            }
        } catch (NumberFormatException e){
            
        }
    }//GEN-LAST:event_text_jumlahActionPerformed

    private void text_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_bayarActionPerformed
        //Jumlah Pembelian
        try {
            if ("".equals(text_bayar.getText())){
            }else{
                bayar=Integer.parseInt(text_bayar.getText());
                kembali=Integer.parseInt(text_total.getText());
                total=bayar-kembali;
                text_kembali.setText(String.valueOf(total));
            }
        } catch (NumberFormatException e){
        
        }     
    }//GEN-LAST:event_text_bayarActionPerformed

    private void text_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_totalActionPerformed

    private void rb_satuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_satuActionPerformed
        //60.000
        if(rb_satu.isSelected()){
            text_harga.setText(String.valueOf(satu));
        }
    }//GEN-LAST:event_rb_satuActionPerformed

    private void rb_duaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_duaActionPerformed
        //120.000
        if(rb_dua.isSelected()){
            text_harga.setText(String.valueOf(dua));
        }
    }//GEN-LAST:event_rb_duaActionPerformed

    private void rb_tigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_tigaActionPerformed
        //250.000
        if(rb_tiga.isSelected()){
            text_harga.setText(String.valueOf(tiga));
        }
    }//GEN-LAST:event_rb_tigaActionPerformed

    private void rb_empatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_empatActionPerformed
        //400.000
        if(rb_empat.isSelected()){
            text_harga.setText(String.valueOf(empat));
        }
    }//GEN-LAST:event_rb_empatActionPerformed

    private void rb_limaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_limaActionPerformed
        //600.000
        if(rb_lima.isSelected()){
            text_harga.setText(String.valueOf(lima));
        }
    }//GEN-LAST:event_rb_limaActionPerformed

    private void text_jumlahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_jumlahKeyReleased
        //Jumlah Pembelian
        int a,b,c;
        try{
            if (!text_jumlah.getText().equals("")){
                a = Integer.parseInt(text_harga.getText());
                b = Integer.parseInt(text_jumlah.getText());
                c=a*b;
                text_total.setText(""+c);
            }else{
                text_total.setText("");
            }
            
        }catch (NumberFormatException e){
            
        }
        
    }//GEN-LAST:event_text_jumlahKeyReleased

    private void text_bayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_bayarKeyReleased
        //Uang Bayar Key Release
        int a,b,c;
        try{
            if (!text_bayar.getText().equals("")){
                a = Integer.parseInt(text_bayar.getText());
                b = Integer.parseInt(text_total.getText());
                c = a - b;
                text_kembali.setText(""+c);
            }else{
                text_kembali.setText("");
            }
            
            
        }catch (NumberFormatException e){
            
        }
    }//GEN-LAST:event_text_bayarKeyReleased

    private void text_pesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_pesanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_pesanActionPerformed

    private void text_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_namaActionPerformed

    private void text_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_noActionPerformed

    private void text_noKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_noKeyTyped
        //nomor rekening
        char enter=evt.getKeyChar();
        if(!(Character.isDigit(enter)))
        {
            evt.consume();
        }
    }//GEN-LAST:event_text_noKeyTyped

    private void text_jumlahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_jumlahKeyTyped
        //jumlahbelitypeangka
        char enter=evt.getKeyChar();
        if(!(Character.isDigit(enter)))
        {
            evt.consume();
        }
    }//GEN-LAST:event_text_jumlahKeyTyped

    private void text_bayarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_bayarKeyTyped
        //jumlahbayarketik
        char enter=evt.getKeyChar();
        if(!(Character.isDigit(enter)))
        {
            evt.consume();
        }
    }//GEN-LAST:event_text_bayarKeyTyped

    private void text_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_kembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_kembaliActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(HalsyGameWallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalsyGameWallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalsyGameWallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalsyGameWallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalsyGameWallet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cetak;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_input;
    private javax.swing.ButtonGroup buttonGroup1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> pembayaran;
    private javax.swing.JRadioButton rb_dua;
    private javax.swing.JRadioButton rb_empat;
    private javax.swing.JRadioButton rb_lima;
    private javax.swing.JRadioButton rb_satu;
    private javax.swing.JRadioButton rb_tiga;
    private javax.swing.JTextArea text_area;
    private javax.swing.JTextField text_bayar;
    private javax.swing.JTextField text_harga;
    private javax.swing.JTextField text_jumlah;
    private javax.swing.JTextField text_kembali;
    private javax.swing.JTextField text_nama;
    private javax.swing.JTextField text_no;
    private javax.swing.JTextField text_pesan;
    private javax.swing.JTextField text_total;
    // End of variables declaration//GEN-END:variables
}
