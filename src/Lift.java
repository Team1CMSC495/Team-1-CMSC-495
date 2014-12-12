
/** 
 * PR2 (Personal Record Recorder) 
 * An application created to record personal records of CrossFit athletes 
 * Created by Stephen Blackburn, Luis Dall, Tracy Devault 
 * Group 1: CMSC 495 7981 Current Trends and Projects in Computer Science (2148) 
 * Instructor: Dr. Hung Dao
 * 
 * Lift.java class creates a Lift object and a the lift GUI for the user
 * interaction with the Lift object
 *
 * @Basic lift object created by Luis Dall, all GUI components and created by
 * Tracy Devault, Error handling created by Stephen Blackburn
 */
import java.io.Serializable;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Lift extends javax.swing.JFrame implements Serializable {

    /**
     * Creates new form Lift
     */
    //Fields
    private String originalData = "Lift name : 1RM";	// hold string read from txt file
    private int tokenCount;			// hold number of tokens
    private String liftName;                           //Holds Lifts name
    private String oneRepMax;                          //Holds 1RM

    /**
     * The constructor sets the Lifts's name and 1RM
     *
     * @param liftName
     * @param oneRepMax
     */
    public Lift(String liftName, String oneRepMax) {
        this.liftName = liftName;
        this.oneRepMax = oneRepMax;
    }

    
    /**
     * Accessors and Mutators
     *
     * @param newLiftName
     */
    public void setLiftName(String newLiftName) {
        liftName = newLiftName;
    }

    public String getLiftName() {
        return liftName;
    }

    public void set1RM(String new1RM) {
        oneRepMax = new1RM;
    }

    public String get1RM() {
        return oneRepMax;
    }

    /**
     * The toString method returns a string containing the Lift's data.
     *
     * @return a reference to the a string
     */
    @Override
    public String toString() {
        String str;

        str = "l : " + liftName + " : " + oneRepMax;
        return str;
    }

   ////////////////////////////////////////////////////////
    String item = "";
    PR2 liftParent;
    FromText ft;

    public Lift() {
        initComponents();
    }

    public Lift(String item) {
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

        current1RMDisplay = new javax.swing.JLabel();
        incrementedPercentages_Label = new javax.swing.JLabel();
        liftUpdate_Btn = new javax.swing.JButton();
        liftReturnToMain = new javax.swing.JButton();
        displayName = new javax.swing.JLabel();
        displayOneRepMax = new javax.swing.JLabel();
        enterNew1RM_Label = new javax.swing.JLabel();
        new1RM_TextField = new javax.swing.JTextField();
        incrementedPercentages_Display = new javax.swing.JScrollPane();
        displayIncrements = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Lift Window");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        current1RMDisplay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        current1RMDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        current1RMDisplay.setText("Current 1RM");

        incrementedPercentages_Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        incrementedPercentages_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        incrementedPercentages_Label.setText("Incremented Percentages");

        liftUpdate_Btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        liftUpdate_Btn.setText("Update");
        liftUpdate_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                liftUpdate_BtnMouseClicked(evt);
            }
        });

        liftReturnToMain.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        liftReturnToMain.setText("Return to Main Menu");
        liftReturnToMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                liftReturnToMainMouseClicked(evt);
            }
        });

        displayName.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        displayName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        displayName.setText("jLabel5");
        displayName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        displayOneRepMax.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        displayOneRepMax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        displayOneRepMax.setText("jLabel6");

        enterNew1RM_Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        enterNew1RM_Label.setText("Enter New 1RM");

        new1RM_TextField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        displayIncrements.setEditable(false);
        displayIncrements.setColumns(20);
        displayIncrements.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        displayIncrements.setRows(5);
        incrementedPercentages_Display.setViewportView(displayIncrements);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(displayName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(current1RMDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(displayOneRepMax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(incrementedPercentages_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(incrementedPercentages_Display)
                            .addComponent(liftReturnToMain, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(enterNew1RM_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                        .addComponent(new1RM_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(liftUpdate_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(160, 160, 160))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(displayName, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(current1RMDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayOneRepMax, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(incrementedPercentages_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(incrementedPercentages_Display, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(new1RM_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterNew1RM_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(liftUpdate_Btn)
                .addGap(39, 39, 39)
                .addComponent(liftReturnToMain, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(96, 96, 96))
        );

        setSize(new java.awt.Dimension(845, 603));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        liftParent.enable(true);
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                

        displayName.setText(item); //pass item name
        //populate your data and put them here
        DecimalFormat df = new DecimalFormat("#.##");
        int in = Integer.parseInt(ft.get1RM_FT(item));
        String increment = "\t95%  " + df.format(0.95 * in) + "\t\t\t" + "70%  " + df.format(0.70 * in) + "\n\t90%  " + df.format(0.90 * in) + "\t\t\t" + "65%  " + df.format(0.65 * in) + "\n\t85%  " + df.format(0.85 * in) + "\t\t\t" + "60%  " + df.format(0.60 * in) + "\n\t80%  " + df.format(0.80 * in) + "\t\t\t" + "55%  " + df.format(0.55 * in) + "\n\t75%  " + df.format(0.75 * in) + "\t\t\t" + "50%  " + df.format(0.50 * in);

        displayIncrements.setText(increment); //pass increment  
        displayOneRepMax.setText(ft.get1RM_FT(item)); //pass OneRepMax

    }//GEN-LAST:event_formWindowOpened

    private void liftReturnToMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_liftReturnToMainMouseClicked
        
        this.dispose();
        liftParent.show();
        liftParent.enable(true);
    }//GEN-LAST:event_liftReturnToMainMouseClicked

    private void liftUpdate_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_liftUpdate_BtnMouseClicked
        // add your code to change 1RM
        String changeOneRepMax = new1RM_TextField.getText();
        float validate = validate1RM(changeOneRepMax);
        if (validate != 1) {
            return;
        }
        for (Lift liftData : ft.liftData) {
            if (liftData.getLiftName().compareTo(item) == 0) {
                liftData.set1RM(changeOneRepMax);
                break;
            }
        }
        DecimalFormat df = new DecimalFormat("#.##");
        float in = Float.parseFloat(changeOneRepMax);
        String increment = "\t95%  " + df.format(0.95 * in) + "\t\t\t" + "70%  " + df.format(0.70 * in) + "\n\t90%  " + df.format(0.90 * in) + "\t\t\t" + "65%  " + df.format(0.65 * in) + "\n\t85%  " + df.format(0.85 * in) + "\t\t\t" + "60%  " + df.format(0.60 * in) + "\n\t80%  " + df.format(0.80 * in) + "\t\t\t" + "55%  " + df.format(0.55 * in) + "\n\t75%  " + df.format(0.75 * in) + "\t\t\t" + "50%  " + df.format(0.50 * in);
        displayIncrements.setText(increment); //pass increment         
        displayOneRepMax.setText(ft.get1RM_FT(item)); //pass OneRepMax
        ft.toTextFile();
    }//GEN-LAST:event_liftUpdate_BtnMouseClicked

    //Checking to see if user input is within the predetermined ranges
    public static Integer validate1RM(String text1RM) {
        String errorMessage = ("1RM must be a number between 30 and 3000.  Please Correct this entry and try again.");
        float int1RM;
        try {
            float RM1 = Float.parseFloat(text1RM);
            int1RM = RM1;
        } catch (NumberFormatException e) {
            invalidInput(errorMessage);
            return 0;
        }
        if (int1RM < 30 || int1RM > 3000) {
            invalidInput(errorMessage);
            return 0;
        } else {
            return 1;
        }
    }

    //Error handling Message
    public static void invalidInput(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Invalid Entry", JOptionPane.ERROR_MESSAGE);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Lift().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel current1RMDisplay;
    private javax.swing.JTextArea displayIncrements;
    private javax.swing.JLabel displayName;
    private javax.swing.JLabel displayOneRepMax;
    private javax.swing.JLabel enterNew1RM_Label;
    private javax.swing.JScrollPane incrementedPercentages_Display;
    private javax.swing.JLabel incrementedPercentages_Label;
    private javax.swing.JButton liftReturnToMain;
    private javax.swing.JButton liftUpdate_Btn;
    private javax.swing.JTextField new1RM_TextField;
    // End of variables declaration//GEN-END:variables
}
