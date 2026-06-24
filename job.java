public class job {

    private int id;
    private String role;
    private int salary;
    private String skill;
    private String company;
    private int year;

  


    // Single Getter Method
    public void getJobData() {
        System.out.println("ID: " + id);
        System.out.println("Role: " + role);
        System.out.println("Salary: " + salary);
        System.out.println("Skill: " + skill);
        System.out.println("Company: " + company);
        System.out.println("Year: " + year);
    }

    // Single Setter Method
    public job(int id, String role, int salary, String skill, String company,int year) {
        this.id = id;
        this.role = role;
        this.salary = salary;
        this.skill = skill;
        this.company = company;
        this.year = year;
    }

    public int getYear(){
        return year;
    }
    
}
