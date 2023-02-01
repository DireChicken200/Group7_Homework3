package edu.wpi.group7;

import java.util.ArrayList;

class ROC {
    private String name;
    private ArrayList<NOC> NOCs;

    public ROC(String name, ArrayList<NOC> NOCs) {
        this.name = name;
        this.NOCs = NOCs;
    }

    void setName(String name) {
        this.name = name;
    }

    void setNOCs(ArrayList<NOC> NOCs) {
        this.NOCs = NOCs;
    }

    String getName() {
        return name;
    }

    ArrayList<NOC> getNOCs() {
        return NOCs;
    }

    public String toString() {

        return "";
    }

    int countNSFs() {
        return 1;
    }

    int countPlayersInNOCNSFs() {
        return 1;
    }
}
