package Notebooke.impl;

import java.util.ArrayList;

public class BasePC {
    public BasePC(){

        pp.add(new PCСonstructor(8, 256, "24", "M1"));
        pp.add(new PCСonstructor(8, 512, "24", "M1"));
        pp.add(new PCСonstructor(16, 512, "24", "M1"));
        pp.add(new PCСonstructor(16, 1024, "24", "M1"));
        pp.add(new PCСonstructor(8, 256, "24", "M2"));
        pp.add(new PCСonstructor(16, 512, "24", "M2"));

    }
    ArrayList<PCСonstructor> pp = new ArrayList<>();

    public PCСonstructor getCPU(String cpu) {
        for (PCСonstructor produkt : pp) {
            if (produkt.getCpu().equals(String.valueOf(cpu)))
                return produkt;
        }
        return null;
    }


}
