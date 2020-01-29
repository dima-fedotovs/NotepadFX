package lv.itlat.dima;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InitDatabase {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.
                getConnection("jdbc:h2:~/testitlat");
        Statement stmt = conn.createStatement();

        stmt.execute("CREATE TABLE records (\n" +
                "   id UUID NOT NULL PRIMARY KEY,\n" +
                "   name VARCHAR(200) NOT NULL,\n" +
                "   email VARCHAR(400),\n" +
                "   phone VARCHAR(50)\n" +
                ")");

        stmt.execute("INSERT INTO\n" +
                "    records (id, name, email, phone)\n" +
                "VALUES (\n" +
                "    'c65ec3ac-412e-11ea-b77f-2e728ce88125',\n" +
                "    'Ivan Ivanov',\n" +
                "    'ivan@gmail.com',\n" +
                "    '1234567890'\n" +
                ")");

        conn.close();
    }
}
