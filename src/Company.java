public class Company {
    private int emp_no;private String email;private float salary;private long acc_no;
    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }
    public int getEmp_no() {
        return emp_no;
    }
    public String getEmail() {
        return email;
    }
    public float getSalary() {
        return salary;
    }
    public long getAcc_no() {
        return acc_no;
    }
}

class Test {
    public static void main(String[] args) {
        Company c = new Company();
        c.setEmp_no(10001);
        c.setEmail("emp@gmail.com");
        c.setSalary(50000f);
        c.setAcc_no(551512122);

        System.out.println("Employee No: " + c.getEmp_no());
        System.out.println("Email: " + c.getEmail());
        System.out.println("Salary: " + c.getSalary());
        System.out.println("Account No: " + c.getAcc_no());
    }
}