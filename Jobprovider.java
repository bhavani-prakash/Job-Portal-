import java.util.Scanner;
import java.util.ArrayList;

public class Jobprovider {
    public void addjob(ArrayList<job> jobs,Scanner sc){
        System.out.println("Enter the job id :");
        int id=sc.nextInt();
        System.out.println("Enter the job role :");
        String role=sc.next();
        System.out.println("Enter the salary :");
        int salary=sc.nextInt();
        System.out.println("Enter the skills required :");
        String skill=sc.next();
        System.out.println("Enter the company name :");
        String company=sc.next();
        System.out.println("Enter the year of passing out :");
        int year=sc.nextInt();
        sc.nextLine(); // Consume the newline character

        job newJob = new job(id, role, salary, skill, company,year);
        jobs.add(newJob);

        System.out.println(".....The Job Added Sucessfully ...");
    }

    public void viewjob(ArrayList<job> jobs){
        if(jobs.isEmpty()){
            System.out.println("No jobs available.");
            return;
        }
        System.out.println("Currently you are Viewing the All Jobs ! ");
        for (job j : jobs) {
            j.getJobData();
            System.out.println("--------------------");
        }
    }

    public void viewApplications(ArrayList<applicationData> applications){
        if(applications.isEmpty()){
            System.out.println("No applications available.");
            return;
        }
        System.out.println("The number of applications are : " + applications.size());
        for (applicationData app : applications) {
            app.getApplicationData();
            System.out.println("--------------------");
        }
    }
    
}
