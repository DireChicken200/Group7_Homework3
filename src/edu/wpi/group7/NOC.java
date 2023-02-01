package edu.wpi.group7;

import java.util.ArrayList;

public class NOC {
    private String name;
    private ArrayList<NSF> NSFs;

    public NOC(String name, ArrayList<NSF> NSFs) {
        this.name = name;
        this.NSFs = NSFs;
    }

    String getName() {
        return name;
    }

    ArrayList<NSF> getNSFs() {
        return NSFs;
    }

    void setName(String name) {
        this.name = name;
    }

    void setNSFs(ArrayList<NSF> NSFs) {
        this.NSFs = NSFs;
    }

    public String toString() {
        return "";
    }

    int countNSFs() {
        return 1;
    }

    int countPlayersInNSFs() {
        return 1;
    }
}
