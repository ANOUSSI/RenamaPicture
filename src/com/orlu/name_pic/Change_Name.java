/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orlu.name_pic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author DSITD
 */
public class Change_Name extends javax.swing.JFrame {

    public static final String RESULT_FILE_NAME_BON = "FUSIONS-PHOTOS-TRAITEES.txt";
        public static final String RESULT_FILE_NAME_MAUVAIS = "FUSIONS-NON-TRAITEES.txt";
        private JFrame frame;
	public static File dossier_photo;
	public static File numCptFile;
        public static final String DEST_DIR = "c:/output/";
    public Change_Name() {
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

        panNamePic = new javax.swing.JPanel();
        lblTitre = new javax.swing.JLabel();
        btnSelFile = new javax.swing.JButton();
        btnRepPic = new javax.swing.JButton();
        lblPathPic = new javax.swing.JLabel();
        lblPathFile = new javax.swing.JLabel();
        Separator = new javax.swing.JSeparator();
        btnGo = new javax.swing.JButton();
        pbNamePic = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInfo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitre.setBackground(new java.awt.Color(0, 153, 204));
        lblTitre.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitre.setText("CHANGE NAME PICTURE");

        btnSelFile.setText("Veuillez selectionner le fichier des numéros de comptes");
        btnSelFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelFileActionPerformed(evt);
            }
        });

        btnRepPic.setText("Veuillez selectionner le répertoire des photos");
        btnRepPic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepPicActionPerformed(evt);
            }
        });

        btnGo.setBackground(new java.awt.Color(0, 204, 204));
        btnGo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnGo.setText("GO");
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });

        txtInfo.setEditable(false);
        txtInfo.setBackground(new java.awt.Color(0, 0, 0));
        txtInfo.setColumns(20);
        txtInfo.setForeground(new java.awt.Color(255, 51, 51));
        txtInfo.setRows(5);
        txtInfo.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(txtInfo);

        javax.swing.GroupLayout panNamePicLayout = new javax.swing.GroupLayout(panNamePic);
        panNamePic.setLayout(panNamePicLayout);
        panNamePicLayout.setHorizontalGroup(
            panNamePicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panNamePicLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panNamePicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(Separator, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSelFile, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                    .addComponent(lblPathPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPathFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRepPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panNamePicLayout.createSequentialGroup()
                        .addComponent(btnGo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pbNamePic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panNamePicLayout.setVerticalGroup(
            panNamePicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panNamePicLayout.createSequentialGroup()
                .addComponent(lblTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRepPic, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPathPic, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSelFile, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPathFile, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panNamePicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pbNamePic, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panNamePic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panNamePic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void comparaison(File[] photosDest, List<String> numCompts) throws IOException {
        if(Objects.isNull(photosDest) || Objects.isNull(numCompts) || numCompts.isEmpty() || photosDest.length ==0){
            return;
        }

        File photosRenommes = new File(DEST_DIR + "/PhotosRenommees");
        File photosErreurs = new File(DEST_DIR + "/PhotosAproblemes");
        Files.createDirectories(photosRenommes.toPath());
        Files.createDirectories(photosErreurs.toPath());
        pbNamePic.setMaximum(photosDest.length);
        pbNamePic.setMinimum(0);
        pbNamePic.setValue(0);
        pbNamePic.setStringPainted(true);
        Runnable runnable = () -> {
            int i = 0;
            for (File photo : photosDest) {
                try {
                List<String> numCompteByPin = findNumCompteByPin(numCompts, photo);
                if(numCompteByPin.isEmpty()){
                    File dest = new File(DEST_DIR + "/PhotosAproblemes/" + photo.getName());
                    Files.copy(photo.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
                     writeInFileMauvais(photo.getName().substring(0,6));

                    txtInfo.append("Not match for :"+photo.getName()+"\n");

                }else numCompteByPin.forEach(numCmpt ->{
                    try {
                    writeInFileBon(numCmpt);
                        File dest = new File(DEST_DIR + "/PhotosRenommees/" + numCmpt + ".jpg");

                        Files.copy(photo.toPath(), dest.toPath(),StandardCopyOption.REPLACE_EXISTING);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                });
                pbNamePic.setValue(++i);
                pbNamePic.setString(i + " photos traitées ");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }




        };
        new Thread(runnable).start();
    }
    
    public static void writeInFileMauvais(String pin) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(DEST_DIR+ "/" + RESULT_FILE_NAME_MAUVAIS, true);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        try (PrintWriter out = new PrintWriter(bufferedWriter)) {
            out.println(pin);
        }
    }
    public static void writeInFileBon(String pin) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(DEST_DIR+ "/" + RESULT_FILE_NAME_BON, true);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        try (PrintWriter out = new PrintWriter(bufferedWriter)) {
            out.println(pin);
        }

    }
    private List<String> findNumCompteByPin(List<String> numCompts, File photo) {
           return numCompts.stream().filter(numCmpt -> photo.getName().contains(numCmpt.substring(2, 8))).collect(Collectors.toList());
    }      
    
    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {
File[] photos= dossier_photo.listFiles();
        List<String> lignes;
            {
                try {
                    lignes = Files.readAllLines(Path.of(String.valueOf(numCptFile)));
                    comparaison(photos, lignes);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
    }//GEN-LAST:event_btnGoActionPerformed

    private void btnRepPicActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser chooser = new JFileChooser();
	chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            if (chooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION)
                {
		dossier_photo = chooser.getSelectedFile();
		lblPathPic.setText(dossier_photo.getAbsolutePath());
                }
    }//GEN-LAST:event_btnRepPicActionPerformed

    private void btnSelFileActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser chooser = new JFileChooser();
	chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            if (chooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION)
                {
		numCptFile = chooser.getSelectedFile();
		lblPathFile.setText(numCptFile.getAbsolutePath());
                }
    }//GEN-LAST:event_btnSelFileActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Change_Name.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Change_Name.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Change_Name.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Change_Name.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Change_Name().setVisible(true);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separator;
    private javax.swing.JButton btnGo;
    private javax.swing.JButton btnRepPic;
    private javax.swing.JButton btnSelFile;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPathFile;
    private javax.swing.JLabel lblPathPic;
    private javax.swing.JLabel lblTitre;
    private javax.swing.JPanel panNamePic;
    private javax.swing.JProgressBar pbNamePic;
    private javax.swing.JTextArea txtInfo;
    // End of variables declaration//GEN-END:variables
}
