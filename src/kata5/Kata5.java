package kata5;

import static kata5.BDCreator.createDB;
import static kata5.TableCreator.createTable;

public class Kata5 {

    public static void main(String[] args) {
        String db = "mail.db";
        String table = "mails";
        createDB(db);
        createTable(db, table);
        TableInserter idt = new TableInserter();
        idt.insert("abc@ulpgc.es",db, table);
        idt.insert("xyz@ull.es",db,table);
        idt.insert("def123@gmail.com",db,table);
        SelectApp app = new SelectApp();
        app.selectAll(db,table);
    }
    
    
}
