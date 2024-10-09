package ITOGWORK;

import java.util.*;

public class LAPTOP {
    public String brand;
    public  int hdd;
    public String os;

    public LAPTOP(String brand, int hdd, String os) {
        this.brand = brand;
        this.hdd = hdd;
        this.os = os;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", HDD: " + hdd + "GB, OS: " + os;
    }
}

