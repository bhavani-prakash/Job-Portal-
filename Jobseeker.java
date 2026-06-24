import java.util.ArrayList;
import java.util.Scanner;
public class Jobseeker {
    public void applyForJob( ArrayList<applicationData> applications, Scanner sc) {
        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("Enter your phone number:");
        long phno = sc.nextLong();
        System.out.println("Enter your email:");
        String email = sc.next();
        System.out.println("Enter your passed out year:");
        int passedout = sc.nextInt();
        System.out.println("Enter your CGPA:");
        double cgpa = sc.nextDouble();
        System.out.println("Enter the job ID you want to apply for:");
        int jobid = sc.nextInt();

        applicationData newApplication = new applicationData(name, phno, email, passedout, cgpa, jobid);
        applications.add(newApplication);
        
      
        System.out.println("Application submitted successfully!");
    }

    public void filterByYear(ArrayList<job> jobs, Scanner sc) {
        System.out.println("Enter the year to filter jobs:");
        int year = sc.nextInt();
        System.out.println("Jobs filtered by year " + year + ":");
        boolean found = false;
        for (job job : jobs) {
            if (job.getYear() == year) {
                job.getJobData();
                System.out.println("--------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No jobs found for the year " + year);
        }
        
    }

    
    
}
