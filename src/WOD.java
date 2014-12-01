
/**
 * WOD.java class creates a Lift object and a the lift GUI for the user
 * interaction with the Lift object
 *
 * @Basic lift object created by Luis Dall, all GUI components and created by
 * Tracy Devault, Error handling created by Stephen Blackburn
 */
import javax.swing.JOptionPane;

public class WOD extends javax.swing.JFrame {

    /**
     * Creates new form WOD
     */
    //Fields
    private String originalData = "WOD name : hour : minutes : seconds";	// hold string read from txt file
    private int tokenCount;										// hold number of tokens
    private String wodName;    //Holds WOD name
    private String hour;                               //Holds Hour value
    private String min;                               //Holds minute value
    private String sec;                               //Holds second value 
    private String con;                                //holds content value
    private String notes;                               //Holds notes value
    private String url;                                  // Holds url value

    /**
     * The constructor sets the WOD;s name and hour, minute, second, content,
     * notes, and URL data
     *
     * @param wodName
     * @param hour
     * @param min
     * @param sec
     * @param con
     * @param notes
     * @param url
     */
    public WOD(String wodName, String hour, String min, String sec, String con, String notes, String url) {
        this.wodName = wodName;
        this.hour = hour;
        this.min = min;
        this.sec = sec;
        this.con = con;
        this.notes = notes;
        this.url = url;
    }

    /**
     * Accessors and Mutators
     */
    /**
     * Accessors and Mutators
     *
     * @param newWodName
     */
    public void setWodName(String newWodName) {
        wodName = newWodName;
    }

    public String getWodName() {
        return wodName;
    }

    public void setHour(String newHour) {
        hour = newHour;
    }

    public String getHour() {
        return hour;
    }

    public void setMin(String newMin) {
        min = newMin;
    }

    public String getMin() {
        return min;
    }

    public void setSec(String newSec) {
        sec = newSec;
    }

    public String getSec() {
        return sec;
    }

    public void setCon(String newCon) {
        con = newCon;
    }

    public String getCon() {
        return con;
    }

    public void setNotes(String newNotes) {
        notes = newNotes;
    }

    public String getNotes() {
        return notes;
    }

    public void setUrl(String newUrl) {
        url = newUrl;
    }

    public String getUrl() {
        return url;
    }

    /**
     * The toString method returns a string containing the Lift's data.
     *
     * @return a reference to the a string
     */
    @Override
    public String toString() {
        String str;

        str = "w : " + getWodName() + " : " + hour + " : " + min + " : " + sec + " : " + con + " : " + notes + " : " + url;
        return str;
    }
    //////////////////////////////////

    String item = "";
    PR2 wodParent;
    FromText ft;

    public WOD() {
        initComponents();
    }

    public WOD(String item) {
        initComponents();
        this.item = item;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wodNameTitle = new javax.swing.JLabel();
        hourDisplayLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        updateNote_Btn = new javax.swing.JButton();
        returnToMain_WOD = new javax.swing.JButton();
        wodShowName = new javax.swing.JLabel();
        wodHour = new javax.swing.JLabel();
        wodMinute = new javax.swing.JLabel();
        wodSecond = new javax.swing.JLabel();
        wodNote = new javax.swing.JLabel();
        wodURL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        wodContent = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        updateNote = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        newHour = new javax.swing.JLabel();
        updateHour = new javax.swing.JTextField();
        newMinute = new javax.swing.JLabel();
        updateMinute = new javax.swing.JTextField();
        newSecond = new javax.swing.JLabel();
        updateSecond = new javax.swing.JTextField();
        updateTime_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("WOD Window");
        setMaximumSize(new java.awt.Dimension(2147483647, 2047483047));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        wodNameTitle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        wodNameTitle.setText("WOD Name:");

        hourDisplayLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hourDisplayLabel.setText("Hour:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Minute:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Second:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Content:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Note:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("URL:");

        updateNote_Btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateNote_Btn.setText("Update note");
        updateNote_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateNote_BtnMouseClicked(evt);
            }
        });

        returnToMain_WOD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        returnToMain_WOD.setText("Return to Main Menu");
        returnToMain_WOD.setAlignmentY(0.0F);
        returnToMain_WOD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnToMain_WODMouseClicked(evt);
            }
        });
        returnToMain_WOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnToMain_WODActionPerformed(evt);
            }
        });

        wodShowName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        wodShowName.setForeground(new java.awt.Color(0, 204, 102));
        wodShowName.setText("jLabel8");

        wodHour.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        wodHour.setForeground(new java.awt.Color(0, 204, 102));
        wodHour.setText("jLabel9");

        wodMinute.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        wodMinute.setForeground(new java.awt.Color(0, 204, 102));
        wodMinute.setText("jLabel10");

        wodSecond.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        wodSecond.setForeground(new java.awt.Color(0, 204, 102));
        wodSecond.setText("jLabel11");

        wodNote.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        wodNote.setForeground(new java.awt.Color(0, 204, 102));
        wodNote.setText("jLabel13");

        wodURL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        wodURL.setForeground(new java.awt.Color(0, 204, 102));
        wodURL.setText("jLabel14");
        wodURL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wodURLMouseClicked(evt);
            }
        });

        wodContent.setColumns(20);
        wodContent.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        wodContent.setForeground(new java.awt.Color(0, 204, 102));
        wodContent.setLineWrap(true);
        wodContent.setRows(3);
        jScrollPane1.setViewportView(wodContent);

        updateNote.setColumns(20);
        updateNote.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateNote.setRows(5);
        jScrollPane3.setViewportView(updateNote);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Note");

        newHour.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newHour.setText("New Hour");

        updateHour.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        newMinute.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newMinute.setText("New Minute");

        updateMinute.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        newSecond.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newSecond.setText("New Second");

        updateSecond.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        updateTime_Btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateTime_Btn.setText("Update Time");
        updateTime_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateTime_BtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wodNameTitle)
                            .addComponent(hourDisplayLabel)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wodHour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(wodMinute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(wodSecond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(wodNote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(wodURL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(wodShowName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(returnToMain_WOD)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(434, 434, 434)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(updateTime_Btn)
                                    .addComponent(updateNote_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(newHour)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateHour, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(newMinute)
                        .addGap(18, 18, 18)
                        .addComponent(updateMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newSecond)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {updateHour, updateMinute, updateSecond});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wodNameTitle)
                    .addComponent(wodShowName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hourDisplayLabel)
                    .addComponent(wodHour))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(wodMinute))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(wodSecond))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(wodNote))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(wodURL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel12)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(updateNote_Btn)
                                .addGap(64, 64, 64)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newHour)
                    .addComponent(updateHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newMinute)
                    .addComponent(updateMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newSecond)
                    .addComponent(updateSecond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateTime_Btn))
                .addGap(20, 20, 20)
                .addComponent(returnToMain_WOD)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {hourDisplayLabel, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, wodNameTitle});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {wodHour, wodMinute, wodNote, wodSecond, wodShowName, wodURL});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        wodParent.enable(true);
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

        wodShowName.setText(item);
        wodHour.setText(ft.getHourFT(item)); //pass wod hour 
        wodMinute.setText(ft.getMinFT(item)); //pass wod minute
        wodSecond.setText(ft.getSecFT(item)); //pass wod second
        wodContent.setText(ft.getDescription(item)); //pass wod content
        wodNote.setText(ft.getNotesFT(item)); //pass wod note
        wodURL.setText(ft.getUrlFT(item)); //pass wod url
    }//GEN-LAST:event_formWindowOpened

    private void updateNote_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateNote_BtnMouseClicked
        // add your code here to update note
        String note = updateNote.getText();

        int validate = validateWOD_Note(note);
        if (validate != 1) {
            return;
        }
        for (WOD wodData : ft.wodData) {
            if (wodData.getWodName().compareTo(item) == 0) {
                wodData.setNotes(note);
                break;
            }
        }

        wodNote.setText(note); //pass wod note
        ft.toTextFile();
    }//GEN-LAST:event_updateNote_BtnMouseClicked

    // Error handling for user input  (Time)  
    public static Integer validateWOD_Time(String hour, String min, String sec) {

        String error1 = "Hours must be a whole number between 00-12.\n";
        String error2 = "Minutes must be a whole number between 00-59.\n";
        String error3 = "Seconds must be a whole number between 00-59.\n";
        String errorOutput = "Please correct the following errors and try again: \n";
        int intHour, intMin, intSec;
        if (!hour.equals("")) {
            try {
                intHour = Integer.parseInt(hour);
                if (intHour < 0 || intHour > 12) {
                    errorOutput = errorOutput + error1;
                }
            } catch (NumberFormatException e) {
                errorOutput = errorOutput + error1;
            }
        }
        if (!min.equals("")) {
            try {
                intMin = Integer.parseInt(min);
                if (intMin < 0 || intMin > 59) {
                    errorOutput = errorOutput + error2;
                }
            } catch (NumberFormatException e) {
                errorOutput = errorOutput + error2;
            }
        }
        if (!sec.equals("")) {
            try {
                intSec = Integer.parseInt(sec);
                if (intSec < 0 || intSec > 59) {
                    errorOutput = errorOutput + error3;
                }
            } catch (NumberFormatException e) {
                errorOutput = errorOutput + error3;
            }
        }

        if (!errorOutput.equals("Please correct the following errors and try again: \n")) {
            invalidInput(errorOutput);
            return 0;
        } else {
            return 1;
        }
    }

// Error handling for user input  (Note) 
    public static Integer validateWOD_Note(String note) {
        String error = "Notes cannot contain the following reserved characters:  Colons (:), Quotation Marks (\").\n";
        String errorOutput = "Please correct the following errors and try again: \n";
        for (int i = 0; i < note.length(); i++) {
            char c = note.charAt(i);
            if (c == ':' || c == '"') {
                errorOutput = errorOutput + error;
            }
        }
        if (!errorOutput.equals("Please correct the following errors and try again: \n")) {
            invalidInput(errorOutput);
            return 0;
        } else {
            return 1;
        }
    }

    //Error handling message
    public static void invalidInput(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Invalid Entry", JOptionPane.ERROR_MESSAGE);
    }


    private void returnToMain_WODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnToMain_WODActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_returnToMain_WODActionPerformed

    private void returnToMain_WODMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnToMain_WODMouseClicked
        // TODO add your handling code here:
        this.dispose();
        wodParent.show();
        wodParent.enable(true);
    }//GEN-LAST:event_returnToMain_WODMouseClicked

    //providing internet access to url links
    private void wodURLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wodURLMouseClicked
        try {
            //Set your page url in this string. For eg, I m using URL for Google Search engine
            String WODurl = "http://" + wodURL.getText();
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(WODurl));
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_wodURLMouseClicked

    private void updateTime_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateTime_BtnMouseClicked
        // add your code here to update note

        String newhour = updateHour.getText();
        String newminute = updateMinute.getText();
        String newsecond = updateSecond.getText();
        int validate = validateWOD_Time(newhour, newminute, newsecond);
        if (validate != 1) {
            return;
        }
        for (WOD wodData : ft.wodData) {
            if (wodData.getWodName().compareTo(item) == 0) {
                wodData.setHour(newhour);
                wodData.setMin(newminute);
                wodData.setSec(newsecond);

                break;
            }
        }
        wodHour.setText(newhour); //pass wod hour 
        wodMinute.setText(newminute); //pass wod minute
        wodSecond.setText(newsecond); //pass wod second

        ft.toTextFile();
    }//GEN-LAST:event_updateTime_BtnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WOD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WOD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WOD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WOD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new WOD().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hourDisplayLabel;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel newHour;
    private javax.swing.JLabel newMinute;
    private javax.swing.JLabel newSecond;
    private javax.swing.JButton returnToMain_WOD;
    private javax.swing.JTextField updateHour;
    private javax.swing.JTextField updateMinute;
    private javax.swing.JTextArea updateNote;
    private javax.swing.JButton updateNote_Btn;
    private javax.swing.JTextField updateSecond;
    private javax.swing.JButton updateTime_Btn;
    private javax.swing.JTextArea wodContent;
    private javax.swing.JLabel wodHour;
    private javax.swing.JLabel wodMinute;
    private javax.swing.JLabel wodNameTitle;
    private javax.swing.JLabel wodNote;
    private javax.swing.JLabel wodSecond;
    private javax.swing.JLabel wodShowName;
    private javax.swing.JLabel wodURL;
    // End of variables declaration//GEN-END:variables
}
