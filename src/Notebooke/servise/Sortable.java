package Notebooke.servise;


import Notebooke.impl.NoteBook;

import java.util.List;

public interface Sortable < T extends NoteBook>{
    public List<T> sort(List<T> list); // описание метода
}
