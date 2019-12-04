package kata5;

import static kata5.BDCreator.createDB;
import static kata5.TableCreator.createTable;

public class Kata5 {

    public static void main(String[] args) {
        createDB("mail.db");
        createTable("mail.db", "mails");
        //SelectApp app = new SelectApp();
        //app.selectAll();
    }
    
    
}
