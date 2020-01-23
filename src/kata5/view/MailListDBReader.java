package kata5.view;

import java.util.ArrayList;
import java.util.List;
import kata5.db.SelectApp;
import kata5.model.Mail;

public class MailListDBReader {

    public static List<Mail> read(String db, String table) {

        SelectApp app = new SelectApp();
        List<String> dbList = app.selectAllList(db,table);
        List<Mail> res = new ArrayList<>();
        for (String s : dbList) {
            res.add(new Mail(s));
        }
        return res;
    }

}
