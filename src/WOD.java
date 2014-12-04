
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

        hourDisplayLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        updateNote_Btn = new javax.swing.JButton();
        returnToMain_WOD = new javax.swing.JButton();
        wodShowName = new javax.swing.JLabel();
        wodURL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        wodContent = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        updateNote = new javax.swing.JTextArea();
        newHour = new javax.swing.JLabel();
        updateHour = new javax.swing.JTextField();
        newMinute = new javax.swing.JLabel();
        updateMinute = new javax.swing.JTextField();
        newSecond = new javax.swing.JLabel();
        updateSecond = new javax.swing.JTextField();
        updateTime_Btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        wodNote = new javax.swing.JTextArea();
        wodMinute = new javax.swing.JTextField();
        wodHour = new javax.swing.JTextField();
        wodSecond = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("WOD Window");
        setPreferredSize(new java.awt.Dimension(600, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        hourDisplayLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hourDisplayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hourDisplayLabel.setText("Hours");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Minutes");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Seconds");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Content:");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("<- Notes ->");

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

        wodShowName.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        wodShowName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wodShowName.setText("jLabel8");

        wodURL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        wodURL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wodURL.setText("jLabel14");
        wodURL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wodURLMouseClicked(evt);
            }
        });

        wodContent.setEditable(false);
        wodContent.setColumns(20);
        wodContent.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        wodContent.setLineWrap(true);
        wodContent.setRows(3);
        jScrollPane1.setViewportView(wodContent);

        updateNote.setEditable(true);
        updateNote.setColumns(20);
        updateNote.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateNote.setLineWrap(true);
        updateNote.setRows(5);
        jScrollPane3.setViewportView(updateNote);

        newHour.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newHour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newHour.setText("Hours");

        updateHour.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateHour.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        newMinute.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newMinute.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newMinute.setText("Minutes");

        updateMinute.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateMinute.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        newSecond.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newSecond.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newSecond.setText("Seconds");

        updateSecond.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateSecond.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        updateTime_Btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateTime_Btn.setText("Update Time");
        updateTime_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateTime_BtnMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Past Preformance");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Current Preformance");

        wodNote.setEditable(false);
        wodNote.setColumns(20);
        wodNote.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        wodNote.setLineWrap(true);
        wodNote.setRows(5);
        jScrollPane2.setViewportView(wodNote);

        wodMinute.setEditable(false);
        wodMinute.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        wodMinute.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        wodMinute.setLocation(new java.awt.Point(0, 0));

        wodHour.setEditable(false);
        wodHour.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        wodHour.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        wodHour.setLocation(new java.awt.Point(0, 0));

        wodSecond.setEditable(false);
        wodSecond.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        wodSecond.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        wodSecond.setLocation(new java.awt.Point(0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(wodShowName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addComponent(wodURL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(252, 252, 252)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hourDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(382, 382, 382)
                        .addComponent(newHour)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newMinute)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newSecond))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(wodHour, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wodMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wodSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(382, 382, 382)
                        .addComponent(updateHour, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(returnToMain_WOD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(jLabel6)
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(updateTime_Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)))
                    .addComponent(updateNote_Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane2, jScrollPane3});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {hourDisplayLabel, jLabel3, jLabel4, newHour, newMinute, newSecond, updateHour, updateMinute, updateSecond, wodHour, wodMinute, wodSecond});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(wodShowName, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(wodURL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newSecond)
                    .addComponent(newMinute)
                    .addComponent(newHour)
                    .addComponent(jLabel4)
                    .addComponent(hourDisplayLabel)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateSecond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wodSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wodMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wodHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateTime_Btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateNote_Btn)
                .addGap(34, 34, 34)
                .addComponent(returnToMain_WOD)
                .addGap(32, 32, 32))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {hourDisplayLabel, jLabel3, jLabel4, jLabel6, newHour, newMinute, newSecond, updateHour, updateMinute, updateSecond, wodHour, wodMinute, wodSecond});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane2, jScrollPane3});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2});

        setSize(new java.awt.Dimension(942, 761));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

        wodShowName.setText(item); // pass wod name
        wodMinute.setText(ft.getHourFT(item)); //pass wod hour 
        wodHour.setText(ft.getMinFT(item)); //pass wod minute
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

    private void updateTime_BtnMouseClicked(java.awt.event.MouseEvent evt) {
        // add your code here to update time

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
        wodMinute.setText(newhour); //pass wod hour 
        wodHour.setText(newminute); //pass wod minute
        wodSecond.setText(newsecond); //pass wod second

        ft.toTextFile();
    }

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
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
    private javax.swing.JTextField wodHour;
    private javax.swing.JTextField wodMinute;
    private javax.swing.JTextArea wodNote;
    private javax.swing.JTextField wodSecond;
    private javax.swing.JLabel wodShowName;
    private javax.swing.JLabel wodURL;
    // End of variables declaration//GEN-END:variables
}
