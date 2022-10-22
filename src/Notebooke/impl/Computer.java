package Notebooke.impl;

public abstract class Computer {

    private String id;
    private String model;
    private String memory;
    private String ssd;

    public Computer(String id, String model, String memory, String ssd) {
        this.id = id;
        this.model = model;
        this.memory = memory;
        this.ssd = ssd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }
}
