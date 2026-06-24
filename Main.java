
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        ArrayList<job> jobs = new ArrayList<>();
        ArrayList<applicationData> applications = new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        int option;

        Jobprovider jobProvider = new Jobprovider();
        Jobseeker jobSeeker = new Jobseeker();
    

        while (true) {
            System.out.println("Welcome to job Portal");
            System.out.println("Enter an Option ");
            System.out.println("1-->  Job provider ");
            System.out.println("2-->  Job Seeker ");
            System.out.println("3-->  Exit  ");

            int choice=sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    while (true) {
                    System.out.println("---------------------");
                    System.out.println("Enter an option ");
                    System.out.println(" 1--> Add job ");
                    System.out.println(" 2--> View Job");
                    System.out.println(" 3--> Applications ");
                    System.out.println(" 4--> Back");

                    option = sc.nextInt();

                    if(option==4){
                        break;
                    }

                    switch (option) {
                        case 1:
                            // it calls the metthod  to add the job in the arraylist of jobs
                            jobProvider.addjob(jobs, sc);
                        
                            break;
                        case 2:

                        System.out.println("Currently you are Viewing the All Jobs ! ");
                        jobProvider.viewjob(jobs);
                            break;
                        case 3:
                            jobProvider.viewApplications(applications);
                            break;
                        default:
                            System.out.println("OOPS ......Ente a valid Option .... ");
                            break;
                    }
                }
                case 2:
                    while (true) {
                    System.out.println("---------------------");
                    System.out.println("Wellcome to the job Seeker ");
                    System.out.println("----------------------");
                    System.out.println(".....Select the option.....");
                    System.out.println(" 1--> View Jobs ");
                    System.out.println(" 2--> Filter by years ");
                    System.out.println("3--> Apply Jobs ");
                    System.out.println("4--> Back");
                    System.out.println("---------------------");
                    option=sc.nextInt();

                    

                    if(option==4){
                        break;
                    }

                   switch (option) {
                    case 1:
                        System.out.println("View all the jobs (Jobseeker )");
                        jobProvider.viewjob(jobs);
                        System.out.println("---------------------");
                        
                        break;
                    case 2:

                        System.out.println("Filtering by the Years !!!");
                        jobSeeker.filterByYear(jobs, sc);
                        System.out.println("---------------------");
                        break;
                    case 3:
                        System.out.println("Apply the JOb  you want :");
                        jobSeeker.applyForJob(applications, sc);
                        System.out.println("---------------------");
                        break;
                    default:
                        System.out.println("OOPS ...Enter a Valid  Option ");
                        break;
                   }

                   
                }
                

                case 3:
                    break;
            
                default:
                    break;
            }
        }

           
    }            
        }
    
