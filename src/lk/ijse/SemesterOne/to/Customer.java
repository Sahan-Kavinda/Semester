package lk.ijse.SemesterOne.to;

public class Customer {
    private String cus_id;
    private String cus_name;
    private String cus_address;
    private String cus_email;
    private String cus_contact;

    public Customer() {
    }
    public Customer(String cus_id, String cus_name, String cus_address, String cus_email, String cus_contact) {
        this.cus_id = cus_id;
        this.cus_name = cus_name;
        this.cus_address = cus_address;
        this.cus_email = cus_email;
        this.cus_contact = cus_contact;
    }

    public Customer(String cus_name, String cus_address, String cus_email, String cus_contact) {
    }

    public String getCus_id() {
        return cus_id;
    }

    public void setCus_id(String cus_id) {
        this.cus_id = cus_id;
    }

    public String getCus_name() {
        return cus_name;
    }

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    public String getCus_address() {
        return cus_address;
    }

    public void setCus_address(String cus_address) {
        this.cus_address = cus_address;
    }

    public String getCus_email() {
        return cus_email;
    }

    public void setCus_email(String cus_email) {
        this.cus_email = cus_email;
    }

    public String getCus_contact() {
        return cus_contact;
    }

    public void setCus_contact(String cus_contact) {
        this.cus_contact = cus_contact;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cus_id='" + cus_id + '\'' +
                ", cus_name='" + cus_name + '\'' +
                ", cus_address='" + cus_address + '\'' +
                ", cus_email='" + cus_email + '\'' +
                ", cus_contact='" + cus_contact + '\'' +
                '}';
    }
}



