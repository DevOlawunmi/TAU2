package miniprojectemailadminapp;
/*
Scenario: An IT support admin charged with the task of creating email addresses for new hires.
Your app should do the ff
Generate an email with the ff syntax firstname.lastname@department.company.com
Determine the department (sales, dev, accounting), if none leave blank
Generate a random string for a password
Have set methods to change the password, set the mailbox capacity and define an alternate email address
Have get methods to display the name, email and mailbox capacity
 */

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String  password;
    private int defaultPasswordLength = 10;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String email;
    private final String companySuffix = "AdunTech.com";
    // constructor to receive the first name and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        // call a method asking for the department - return the department
        this.department= setDepartment();

        //call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is :" + this.password);
        // combine elements to generate email
        email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+ companySuffix;

    }

    //ask for the department
    private String setDepartment(){
        System.out.print("New Worker: "+ firstName +". Department Codes: \n1 for Sales \n2 for Dev \n3 for Accounting \n0 for none \n Enter department code: ");
        Scanner scanner = new Scanner(System.in);
        int departmentChoice = scanner.nextInt();
        if (departmentChoice == 1){ return "Sales";}
        else if (departmentChoice==2){ return "Dev"; }
        else if (departmentChoice==3){ return "Accounting"; }
        else return "";
    }

    //generate the password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@£#!%$";
        char[] password = new char[length];
        for (int i = 0; i<length;i++){
           int rand= (int) (Math.random() * passwordSet.length());
           password[i]=passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //write method to change password
    public void changePassword(String password){
        this.password=password;
    }

    //set mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity  = capacity;
    }

    //set alternate email
    public void setAlternateEmail (String altEmail){
        this.alternateEmail = altEmail;    }

       public String getAlternateEmail (){
        return alternateEmail;
    }

    public String getPassword (){
        return password;
    }
    public int getMailboxCapacity (){
        return mailboxCapacity;
    }

    public String showInfo(){
        return "Name: "+ firstName+" "+ lastName+
                "\nCompany Email: "+ email+
                "\nMailbox Capacity: " + mailboxCapacity +"mb";

    }
}
