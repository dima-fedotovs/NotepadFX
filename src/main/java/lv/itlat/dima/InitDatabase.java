package lv.itlat.dima;

import java.sql.SQLException;

public class InitDatabase {

    public static void main(String[] args) throws SQLException {
        RecordDAO.initDB();
    }
}
