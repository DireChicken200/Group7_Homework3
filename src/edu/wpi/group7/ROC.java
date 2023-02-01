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

    @Override
    public String toString() {
        return "ROC{" +
                "name='" + name + '\'' +
                ", NOCs=" + NOCs +
                '}';
    }

    int countNSFs() {
        int count = 0;
        for (int i = 0; i < NOCs.size(); i++) {
            count += NOCs.get(i).countNSFs();
        }
        return count;
    }

    int countPlayersInNOCNSFs() {
        int count = 0;
        for (int i = 0; i < NOCs.size(); i++) {
            count += NOCs.get(i).countPlayersInNSFs();
        }
        return count;
    }
}
