public class PermanentEmployee {

    private int employeeId;
    private String employeeName;

    private String location;

//    public PermanentEmployee(String employeeName, String location) {
//        this.employeeId = employeeId;
//        this.employeeName = employeeName;
//
//        this.location = location;
//    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

       public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
