package Notebooke.servise;


import Notebooke.Comparator.NotebookComporator;
import Notebooke.impl.NoteBook;


import java.util.Collections;
import java.util.List;

public class NotebookService implements Sortable<NoteBook>{
    @Override
    public List<NoteBook> sort(List<NoteBook> list) {
//        Collections.sort(list, new ComputerComparator()); //2
        Collections.sort(list, new NotebookComporator()); //1
         return list;
    }

}
