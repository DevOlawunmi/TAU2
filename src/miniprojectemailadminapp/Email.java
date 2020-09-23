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
    private int mailboxCapacity;
    private String alternateEmail;
    // constructor to receive the first name and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: "+ this.firstName+ "."+ this.lastName);

        // call a method asking for the department - return the department
        this.department= setDepartment();
        System.out.println("Department: "+ department);

        //call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is :" + this.password);
    }



    //ask for the department
    private String setDepartment(){
        System.out.print("DEPARTMENT CODES : \n1 for Sales \n2 for Dev \n3 for Accounting \n0 for none \n Enter department code");
        Scanner scanner = new Scanner(System.in);
        int departmentChoice = scanner.nextInt();
        if (departmentChoice == 1){ return "sales";}
        else if (departmentChoice==2){ return "dev"; }
        else if (departmentChoice==3){ return "accounting"; }
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

    //set mailbox capacity

    //set alternate email

    //display email

    //display name

    //display mailbox capacity
}
