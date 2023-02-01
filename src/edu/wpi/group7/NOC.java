package edu.wpi.group7;

import java.util.List;

public class NOC {
    private String name;
    private List<NSF> NSFs;

    public NOC(String name, List<NSF> NSFs) {
        this.name = name;
        this.NSFs = NSFs;
    }

    String getName() {
        return name;
    }

    List<NSF> getNSFs() {
        return NSFs;
    }

    void setName(String name) {
        this.name = name;
    }

    void setNSFs(List<NSF> NSFs) {
        this.NSFs = NSFs;
    }

    @Override
    public String toString() {
        return "NOC{" +
                "name='" + name + '\'' +
                ", NSFs=" + NSFs +
                '}';
    }

    int countNSFs() {
        return this.NSFs.size();
    }

    int countPlayersInNSFs() {
        int count = 0;
        for (int i = 0; i < NSFs.size(); i++) {
            count += NSFs.get(i).players.size();
        }
        return count;
    }
}
