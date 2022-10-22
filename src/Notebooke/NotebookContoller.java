package Notebooke;


import Notebooke.impl.NoteBook;
import Notebooke.servise.NotebookService;

import java.util.List;

public class NotebookContoller {
    private NotebookService notebookService;

    public NotebookContoller() {
        this.notebookService = new NotebookService()  ;
    }

    public List<NoteBook> getSortedNotebookById(List<NoteBook> list) {
        return notebookService.sort(list);
    }
}
