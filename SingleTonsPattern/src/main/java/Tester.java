import java.sql.SQLException;
import java.util.List;

public class Tester {

    public static void main(String[] args)
            throws SQLException {
        PermanentEmployee p1 = new PermanentEmployee();
        p1.setEmployeeName("Pooviya");
        p1.setLocation("Teni");
        DbDAOImpl db = new DbDAOImpl();
        db.add(p1);

        List<PermanentEmployee> ls = db.getEmployees();
        for (PermanentEmployee allEmp : ls) {
            System.out.println("Employee Name: " + allEmp.getEmployeeName());
        }

    }
}
