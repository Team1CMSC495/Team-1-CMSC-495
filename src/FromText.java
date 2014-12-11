
/**
 * PR2 (Personal Record Recorder) An application created to record personal
 * records of CrossFit athletes Created by Luis Dall, Tracy Devault and Stephen
 * Blackburn Group 1: CMSC 495 7981 Current Trends and Projects in Computer
 * Science (2148) 
 * Instructor: Dr. Hung Dao
 *
 * FromText Class
 *
 * @author Luis Dall November 24, 2014 The FromText class will contain an
 * arraylist of Lift objects and an arraylist of WOD objects.
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;

public class FromText {

    ArrayList<Lift> liftData = new ArrayList<>(); //to hold the Lifts
    ArrayList<WOD> wodData = new ArrayList<>(); //to hold the Lifts

    public boolean FromText(String newData) throws IllegalFormat {
        String originalData = newData;
        StringTokenizer data = new StringTokenizer(originalData, ":");    // create a tokenizer

        String check = data.nextToken();

        if (check.equals("// ")) {

        } else {
            if (check.equals("l ")) {
                String liftName = data.nextToken().trim();      // retrieves 2nd token in string 
                String oneRM = data.nextToken().trim();           // retrieves 3rd token in string

                Lift lift = new Lift(liftName, oneRM);            //create new Lift object
                liftData.add(lift);                             // add lift to Arraylist
                return true;

            } else if (check.equals("w ")) {
                String wodName = data.nextToken().trim();          // retrieves 2nd token in string 
                String hour = data.nextToken().trim();             // retrieves 3rd token in string
                String minute = data.nextToken().trim();           // retrieves 4th token in string
                String second = data.nextToken().trim();           // retrieves 5th token in string
                String content = data.nextToken().trim();
                String notes = data.nextToken().trim();
                String url = data.nextToken().trim();

                WOD wod = new WOD(wodName, hour, minute, second, content, notes, url);
                wodData.add(wod);
                return true;
            } else {
                throw new IllegalFormat("Error!!! Incorrect text file input");
            }
        }
        return true;
    }

    // reads contenets of arrayLists inot master.txt file
    public boolean toTextFile() {
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date today = Calendar.getInstance().getTime();
        String reportDate = df.format(today);

        try {
            File file = new File("master.txt");
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            try (BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write("// : sample data file for PR2 software application\n"
                        + "// : Stephen Blackburn\n"
                        + "// : November 23, 2014\n"
                        + "// : Lift format\n"
                        + "// : l :<name>:<1 rep max>\n");

                for (Lift liftData1 : liftData) {
                    bw.write(liftData1.toString() + "\n");
                }

                bw.write("// : WOD format\n"
                        + "// : w :<name>:<hour>:<minute>:<second>\n"
                        + "// :  name            hour  minute   second\n");

                for (WOD wodData1 : wodData) {
                    bw.write(wodData1.toString() + "\n");
                }
                bw.write("// : Last Update was = " + reportDate);
            }

        } catch (IOException e) {
        }
        return true;
    }

 //reads contents of arrayLists to backup.txt file
    public boolean toBackupFile() {
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date today = Calendar.getInstance().getTime();
        String reportDate = df.format(today);

        try {
            File file = new File("backup.txt");
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            try (BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write("// : sample data file for PR2 software application\n"
                        + "// : Stephen Blackburn\n"
                        + "// : November 23, 2014\n"
                        + "// : Lift format\n"
                        + "// : l :<name>:<1 rep max>\n");

                for (Lift liftData1 : liftData) {
                    bw.write(liftData1.toString() + "\n");
                }

                bw.write("// : WOD format\n"
                        + "// : w :<name>:<hour>:<minute>:<second>\n"
                        + "// :  name            hour  minute   second\n");

                for (WOD wodData1 : wodData) {
                    bw.write(wodData1.toString() + "\n");
                }
                bw.write("// : Last Update was = " + reportDate);
            }
        } catch (IOException e) {
        }
        return true;
    }

   //Accessor and mutators of WOD objects in wodData ArrayList
    //WOD Name will be retrieved from Jcombobox in Main will not need to be accessed or mutated
    //Takes wod name input finds and returns content
    public String getDescription(String wodName) {
        String copy = wodName.trim();         //string to search for wodName
        String content = " ";                 // string to return result
        for (WOD wodData1 : wodData) {
            if (copy.equalsIgnoreCase(wodData1.getWodName())) {
                content = wodData1.getCon();
            } else {
            }
        }
        return content;
    }

//Takes wod name input, finds and returns notes   
    public String getNotesFT(String wodName) {
        String copy = wodName.trim();           //string to search for wodName
        String note = " ";               // string to return result
        for (WOD wodData1 : wodData) {
            if (copy.equalsIgnoreCase(wodData1.getWodName())) {
                note = wodData1.getNotes();
            } else {
            }
        }
        return note;
    }

//Takes wod name input, finds and sets inputNotes as new note data   
    public boolean setNotesFT(String wodName, String inputNotes) {
        String copy = wodName.trim();           //string to search for wodName
        String user_Notes = inputNotes;                // string to hold user input

        for (WOD wodData1 : wodData) {
            if (copy.equalsIgnoreCase(wodData1.getWodName())) {
                wodData1.setNotes(user_Notes);
            } else {
                return false;
            }
        }
        return true;
    }

//Takes wod name input, finds and returns url   
    public String getUrlFT(String wodName) {
        String copy = wodName.trim();           //string to search for wodName
        String url_data = " ";                  // string to return result
        for (WOD wodData1 : wodData) {
            if (copy.equalsIgnoreCase(wodData1.getWodName())) {
                url_data = wodData1.getUrl();
            } else {
            }
        }
        return url_data;
    }

//Takes wod name input, finds and returns hour    
    public String getHourFT(String wodName) {
        String copy = wodName.trim();           //string to search for wodName
        String hrs = " ";               // string to return result
        for (WOD wodData1 : wodData) {
            if (copy.equalsIgnoreCase(wodData1.getWodName())) {
                hrs = wodData1.getHour();
            } else {
            }
        }
        return hrs;
    }

//Takes wod name input, finds and sets inputHour as new hour data   
    public boolean setHourFT(String wodName, String inputHour) {
        String copy = wodName.trim();           //string to search for wodName
        String user_Hour = inputHour;           // string to hold user input

        for (WOD wodData1 : wodData) {
            if (copy.equalsIgnoreCase(wodData1.getWodName())) {
                wodData1.setHour(user_Hour);
            } else {
                return false;
            }
        }
        return true;
    }

//Takes wod name input, finds and returns minute data   
    public String getMinFT(String wodName) {
        String copy = wodName.trim();           //string to search for wodName
        String minutes = " ";               // string to return result
        for (WOD wodData1 : wodData) {
            if (copy.equalsIgnoreCase(wodData1.getWodName())) {
                minutes = wodData1.getMin();
            } else {
            }
        }
        return minutes;
    }

//Takes wod name input, finds and sets inputMinutes as new minute data   
    public boolean setMinFT(String wodName, String inputMinutes) {
        String copy = wodName.trim();           //string to search for wodName
        String user_min = inputMinutes;         // string to hold user input

        for (WOD wodData1 : wodData) {
            if (copy.equalsIgnoreCase(wodData1.getWodName())) {
                wodData1.setMin(user_min);
            } else {
                return false;
            }
        }
        return true;
    }

//Takes wod name input, finds and returns second data   
    public String getSecFT(String wodName) {
        String copy = wodName.trim();           //string to search for wodName
        String seconds = " ";               // string to return result
        for (WOD wodData1 : wodData) {
            if (copy.equalsIgnoreCase(wodData1.getWodName())) {
                seconds = wodData1.getSec();
            } else {
            }
        }
        return seconds;
    }

//Takes wod name input, finds and sets inputSeconds as new second data   
    public boolean setSecFT(String wodName, String inputSeconds) {
        String copy = wodName.trim();           //string to search for wodName
        String user_sec = inputSeconds;         // string to hold user input

        for (WOD wodData1 : wodData) {
            if (copy.equalsIgnoreCase(wodData1.getWodName())) {
                wodData1.setSec(user_sec);
            } else {
                return false;
            }
        }
        return true;
    }

//Takes lift name input, finds and returns 1 rep max data   
    public String get1RM_FT(String liftName) {
        String copy = liftName.trim();         //string to search for wodName
        String oneRepMax = " ";               // string to return result
        for (Lift liftData1 : liftData) {
            if (copy.equalsIgnoreCase(liftData1.getLiftName())) {
                oneRepMax = liftData1.get1RM();
            } else {
            }
        }
        return oneRepMax;
    }

//Takes lift name input, finds and sets input1RM as new 1RM data   
    public boolean set1RM_FT(String liftName, String input1RM) {
        String copy = liftName.trim();           //string to search for wodName
        String user_1rm = input1RM;         // string to hold user input

        for (Lift liftData1 : liftData) {
            if (copy.equalsIgnoreCase(liftData1.getLiftName())) {
                liftData1.set1RM(user_1rm);
            } else {
                return false;
            }
        }
        return true;
    }
}
