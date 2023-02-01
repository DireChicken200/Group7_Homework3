package edu.wpi.group7;

import java.util.List;

class ROC {
    private String name;
    private List<NOC> NOCs;

    public ROC(String name, List<NOC> NOCs) {
        this.name = name;
        this.NOCs = NOCs;
    }

    void setName(String name) {
        this.name = name;
    }

    void setNOCs(List<NOC> NOCs) {
        this.NOCs = NOCs;
    }

    String getName() {
        return name;
    }

    List<NOC> getNOCs() {
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
