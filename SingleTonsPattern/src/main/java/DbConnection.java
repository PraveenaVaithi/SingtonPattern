import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static Connection con = null;

    private DbConnection() {}
//    static
//    {
//        String url = "jdbc:mysql://localhost:3306/Employee_Details/useUnicode=yes&characterEncoding=UTF-8";
//        String user = "root";
//        String pass = "Flowering@9197";
//        try {
//            if (con==null) {
//                Class.forName("com.mysql.jdbc.Driver");
//                con = DriverManager.getConnection(url, user, pass);
//            }
//
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//        }
//    }
    public static Connection getConnections()
    {
        if(con==null){
            System.out.println("Entering Values");
            String url = "jdbc:mysql://localhost:3306/Employee_Details?characterEncoding=latin1&useConfigs=maxPerformance";
            String user = "root";
            String pass = "Flowering@9197";
            try {

                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("OK 2");
                con = DriverManager.getConnection(url, user, pass);
                System.out.println("Exit Values");

            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return con;
    }
}
