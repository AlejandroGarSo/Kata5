package kata5;

import java.util.List;
import kata5.db.TableInserter;
import kata5.db.SelectApp;
import static kata5.db.BDCreator.createDB;
import static kata5.db.TableCreator.createTable;
import kata5.model.*;
import kata5.view.*;

public class Kata5 {

    public static void main(String[] args) {
        String db = "mail.db";
        String table = "mails";
        createDB(db);
        createTable(db, table);
        init(db,table);
        List<Mail> mailList = MailListDBReader.read(db, table);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram);
        histogramDisplay.execute();
    }
    
    private static void init(String db, String table){
        TableInserter idt = new TableInserter();
        idt.insert("def123@gmail.com",db,table);
        idt.insert("def123@ulpgc.com",db,table);
        idt.insert("def123@hotmail.es",db,table);
        idt.insert("def123@gmail.com",db,table);
    }
    
}
