package Notebooke;

import Notebooke.impl.Computer;

public class PC extends Computer {
    private Integer powerSupply;

    public PC(String id, String model, String memory, String ssd, Integer powerSupply) {
        super(id, model, memory, ssd);
        this.powerSupply = powerSupply;
    }

    public Integer getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(Integer powerSupply) {
        this.powerSupply = powerSupply;
    }
}
