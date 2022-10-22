// data

package Notebooke.impl;

public class NoteBook extends Computer {
    private Integer batteryCapacity;

    public NoteBook(String id, String model, String memory, String ssd, Integer batteryCapacity) {
        super(id, model, memory, ssd);
        this.batteryCapacity = batteryCapacity;
    }

    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(Integer batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "NoteBook{" + "id=" + getId()+
                "Battery Capacity=" + batteryCapacity +
                '}';
    }

}