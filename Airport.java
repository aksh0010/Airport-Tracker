/* Name : AKSH SANJAYBHAI PATEL
SID : 110028941  
*/

import java.util.LinkedList;

public class Airport {
    LinkedList<String> takeoff;     //Linked list to store data of flights to take off 
    LinkedList<String> landing;        // linked list of flights to land
    LinkedList<String> Data_stored;     // history of all actions including air and ground performed

    public Airport() {
        takeoff = new LinkedList<>();
        landing = new LinkedList<>();
        Data_stored = new LinkedList<>();
    }

    public void addTakeOff(String name) {
                        //simply adding planes in takeoff list or queque
        takeoff.add(name);
    }

    public void addLanding(String name) {

        landing.add(name); // simply adding planes in landing queque or list
    }

    public String handleNextAction() {  
            // first we check if here are any flights for landing and if so we let them land first before giving permission of flight to plane 
        if (landing.size() != 0) {
            Data_stored.add("Flight " + landing.getFirst() + " landed");
            return ("Flight " + landing.removeFirst() + " is  landing ");
        } else if (takeoff.size() != 0) {
            Data_stored.add("Flight " + landing.getFirst() + " taken-off");
            return ("Flight " + takeoff.removeFirst() + " is taking off");
        }
        return " No plane is waiting to land or take-off \n";
    }

    public String waitingPlanes() {
        String temp = "";
        int i = 0;
        int j = 0;
        // here we first check the condition that if size of linked list are empty or not and if yes means there are no queues for take off and landing for planes
        if (takeoff.size() == 0 && landing.size() == 0) {
            temp = " No plane is in the landing or take-off queues ";
        } else {    // othewise we simply add list of  planes in queue in single string and return for both take off and landing in single string
            while (i < takeoff.size()) {
                temp = temp + takeoff.get(i) + " \n";
                i++;
            }
            while (j < landing.size()) {
                temp = temp + landing.get(j) + " \n";
                j++;
            }

        }
        return temp;
    }

    public String log() {
        String temp = " ";
        // for printing the history we simply check if the linked list in which we choosed to store the data is empty or not and if yes means no activities in sky or ground
        int i = 0;
        if (Data_stored.isEmpty()) {
            return " No activity exists \n";
        }
        // here we are simply adding all the history in single string and returning 
        while (i < Data_stored.size()) {
            temp = temp + Data_stored.get(i) + " \n";
            i++;
        }
        return temp;
    }
}