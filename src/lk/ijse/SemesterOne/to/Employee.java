package lk.ijse.SemesterOne.to;

public class Employee {
    private String emp_id;
    private String emp_name;
    private String emp_address;
    private String emp_email;
    private String emp_contact;

    public Employee(String emp_id, String emp_name, String emp_address, String emp_email, String emp_contact) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_address = emp_address;
        this.emp_email = emp_email;
        this.emp_contact = emp_contact;
    }

    public Employee(String emp_name, String emp_address, String emp_email, String emp_contact) {
    }


    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_address() {
        return emp_address;
    }

    public void setEmp_address(String emp_address) {
        this.emp_address = emp_address;
    }

    public String getEmp_email() {
        return emp_email;
    }

    public void setEmp_email(String emp_email) {
        this.emp_email = emp_email;
    }

    public String getEmp_contact() {
        return emp_contact;
    }

    public void setEmp_contact(String emp_contact) {
        this.emp_contact = emp_contact;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id='" + emp_id + '\'' +
                ", emp_name='" + emp_name + '\'' +
                ", emp_address='" + emp_address + '\'' +
                ", emp_email='" + emp_email + '\'' +
                ", emp_contact='" + emp_contact + '\'' +
                '}';
    }
}
