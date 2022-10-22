package Notebooke.Comparator;

import Notebooke.impl.NoteBook;

import java.util.Comparator;


public class NotebookComporator implements Comparator<NoteBook> {
    @Override
    public int compare(NoteBook o1, NoteBook o2) {
        if (Integer.valueOf(o1.getBatteryCapacity())>Integer.valueOf(o2.getBatteryCapacity())){
            return 1;
        }

        if (Integer.valueOf(o1.getBatteryCapacity())<Integer.valueOf(o2.getBatteryCapacity())){
            return -1;
        }
        return 0;
    }

}
