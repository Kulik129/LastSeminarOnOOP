package Notebooke.impl;

public class PCСonstructor {
    private Integer ssd;
    private Integer ram;
    private String diagonal;
    private String cpu;

    public PCСonstructor(Integer ssd, Integer ram, String diagonal, String cpu) {
        this.ssd = ssd;
        this.ram = ram;
        this.diagonal = diagonal;
        this.cpu = cpu;
    }

    public PCСonstructor() {

    }

    public Integer getSsd() {
        return ssd;
    }

    public void setSsd(Integer ssd) {
        this.ssd = ssd;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public String getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "PCСonstructor{" +
                "ssd=" + ssd +
                ", ram=" + ram +
                ", diagonal='" + diagonal + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }



}
