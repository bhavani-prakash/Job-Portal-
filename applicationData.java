public class applicationData {
    private String name;
    private long phno;
    private String email;
    private int passedout;
    private double cgpa;
    private int jobid;

    // Single Getter Method
    public void getApplicationData() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phno);
        System.out.println("Email: " + email);
        System.out.println("Passed Out: " + passedout);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Job ID: " + jobid);
    }

    // Single Setter Method
    public  applicationData(String name, long phno, String email, int passedout, double cgpa, int jobid) {
        this.name = name;
        this.phno = phno;
        this.email = email;
        this.passedout = passedout;
        this.cgpa = cgpa;
        this.jobid = jobid;
    }
}
