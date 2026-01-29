import java.sql.Connection;
import java.sql.PreparedStatement;

public class Test {

    public static void main(String[] args) throws Exception {

        Connection con = CreatDB.getConnection();

        PreparedStatement ps = con.prepareStatement(
                "CREATE TABLE students (" +
                "id INT UNIQUE," +
                "name VARCHAR(50) NOT NULL," +
                "age INT," +
                "subject VARCHAR(100)," +
                "year INT," +
                "venue VARCHAR(100) DEFAULT 'Sanalpur'" +
                ")"
        );

        ps.execute();
        ps.close();
        con.close();

        
        System.out.println("Table created successfully");
    }
}
