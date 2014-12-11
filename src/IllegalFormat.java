
/**
 * PR2 (Personal Record Recorder) An application created to record personal
 * records of CrossFit athletes Created by Luis Dall, Tracy Devault and Stephen
 * Blackburn Group 1: CMSC 495 7981 Current Trends and Projects in Computer
 * Science (2148) 
 * Instructor: Dr. Hung Dao
 *
 * The IllegalFormat class creates an exception.
 *
 * @ author Luis Dall
 */

public class IllegalFormat extends NoSuchFieldException {

    public IllegalFormat(String message) {
        super(message);
    }
}
