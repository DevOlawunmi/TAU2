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

public class EmailApp {
    public static void main(String[] args) {
        Email email1 = new Email("Ola","Ajibola");
        System.out.println(email1.showInfo());




    }
}

