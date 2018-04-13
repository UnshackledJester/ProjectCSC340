package Test;

import Models.Customer;
import java.util.ArrayList;
import java.util.Scanner;

public class TestMethods {

    public static String name;
    public static String street;
    public static String town;
    public static String postcode;
    public static int ID;
    public static String username;
    public static String password;
    public static String type;

    static Scanner sc = new Scanner(System.in);
    static Scanner sd = new Scanner(System.in);
    static int tempvar;
    static int tempID;

    static ArrayList<Customer> list = new ArrayList<Customer>();

    static String names[] = {"John Hepburn", "David Jones", "Louise White",
        "Harry Martin", "Christine Robertson"};

    static String streets[] = {"50 Granton Road", "121 Lochend Park",
        "100 Govan Avenue", "51 Gorgie Road", "1 Leith Street"};

    static String towns[] = {"Edinburgh", "Greensobro", "Glasgow", "Raleigh",
        "Edinburgh"};

    static String postcodes[] = {"123", "123", "123", "123",
        "123"};

    static int IDs[] = {10001, 10002, 10003, 10004, 10005};

    static String usernames[] = {"A", "B", "C", "D", "E"};
    static String passwords[] = {"A", "B", "C", "D", "E"};

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            name = names[i];
            street = streets[i];
            town = towns[i];
            postcode = postcodes[i];
            ID = IDs[i];
            username = usernames[i];
            password = passwords[i];
            Customer e = new Customer(name, street, town, postcode, ID, username, password);
            list.add(e);
        }
            // statements and prompts within the console for the user to follow
            System.out.println("Welcome to your employment System");
            System.out.println();
            System.out.println("Please enter your choice below from the following options");
            System.out.println();
            System.out.println("Add an employee = 1 ");
            System.out.println("Delete an employee = 2 ");
            System.out.println("View employee list = 3 ");
            System.out.println("To exit the system = 0 ");

            // allows user to enter number of choice and this reflects which statement is ran in userChoice method
            tempvar = sc.nextInt();
            userChoice();
    }
            /*          EmployeeM model = CustomerinfoDatabase();

            //Create a view : to write customer details on console
            EmployeeView view = new EmployeeView();

            EmployeeController controller = new EmployeeController(model, view);

            //update model data
            controller.setCustomerusername(name);
            controller.setID(ID);
            controller.setStreet(street);
            controller.setTown(town);
            controller.setUsername(username);
            controller.setPassword(password);
            controller.setPostcode(postcode);
            controller.updateView();

        }

    }

    private static EmployeeM CustomerinfoDatabase() {

        EmployeeM Employeem = new EmployeeM();
        Employeem.setCustomerusername(name);
        Employeem.setID(ID);
        Employeem.setStreet(street);
        Employeem.setTown(town);
        Employeem.setUsername(username);
        Employeem.setPassword(password);
        Employeem.setPostcode(postcode);
        return Employeem; 
    }
             */
        
    

    // method to determine what statement runs according to which choice user makes
    public static void userChoice() {
        Customer tempEmployee = new Customer();
        boolean foundEmployee = false;
        // if user enters 1 it prints out the employee list.
        if (tempvar == 1) {
            String tempstring1;
            int stringlength;
            int whitespace;
            String tempstring2;
            String tempstring3;
            // initialises variables for entering title
            String tempstring4;
            int stringlength2;
            int whitespace2;
            String tempstring5;
            String tempstring6;

            String tempstring7;

            System.out.println("You have chosen to add an employee to the system");
            System.out.println();

            // block of code that builds string together to get employee name
            System.out.println("Please enter the name of the new employee: ");
            tempstring1 = sd.nextLine(); // takes in string using scanner
            stringlength = tempstring1.length(); // saves length of string
            if (tempstring1.contains(" ")) // if statement to see if the string contains a space
            {
                whitespace = tempstring1.indexOf(" "); // finds the whitespace
                tempstring2 = tempstring1.substring((0), (whitespace));// creates string from start of input to whitespace
                tempstring3 = tempstring1.substring((whitespace) + 1, (stringlength));// creates string from whitespace plus one and adds on rest of the string
                tempEmployee.setName(tempstring2 + " " + tempstring3); // combines tempstring1 and tempstring2 together to complete full string
            } else // else statement that just enters the string if it is just one word
            {
                tempEmployee.setName(tempstring1);
            }

            // block of code that repeats same process as above to get street name
            System.out.println("Please enter the address of the employee: ");
            tempstring4 = sd.nextLine();
            stringlength2 = tempstring4.length();
            if (tempstring4.contains(" ")) {
                whitespace2 = tempstring4.indexOf(" ");
                tempstring5 = tempstring4.substring((0), (whitespace2));
                tempstring6 = tempstring4.substring((whitespace2) + 1, (stringlength2));
                tempEmployee.setStreet(tempstring5 + " " + tempstring6);
            } else {
                tempEmployee.setStreet(tempstring4);
            }

            System.out.println("Please enter the town: ");
            tempEmployee.setTown(sd.nextLine());// takes in town using scanner
            System.out.println("Please enter the postcode: ");
            tempstring7 = sd.nextLine(); //post code using scanner

            if (tempstring7.length() > 5 && tempstring7.length() < 9) // sets the length of string
            {
                tempEmployee.setPostcode(tempstring7);
            } else {
                tempEmployee.setPostcode("You have not entered a valid postcode");
            }

            tempEmployee.setID(ID + 1); // sets ID number to next in sequence

            System.out.println("Please enter your username");
            tempEmployee.setUsername(sd.next());
            System.out.println("Please enter your password");
            tempEmployee.setPassword(sd.next());

            list.add(tempEmployee);// creates temp employee and adds to list
            printEmployeelist();// prints employee list to view

        } else if (tempvar == 2) {
            printEmployeelist();
            System.out.println("");
            System.out.println("Above are a list of all employees.");
            System.out.println("Please enter the ID number of the employee you wish to delete from the system");
            ID = sc.nextInt();

            // while loop to search on payroll number, deletes the employee if correct, error message if not
            if (list.isEmpty() == false) {
                int a = 0;
                while (a < list.size()) {
                    tempEmployee = list.get(a);
                    if (tempEmployee.ID == ID) {
                        foundEmployee = true;
                        break;
                    }
                    a++;
                }
                if (foundEmployee == true) {
                    System.out.println("You have deleted : " + tempEmployee.getName());
                    System.out.println();
                    list.remove(tempEmployee);
                    printEmployeelist();
                } else {
                    System.out.println("The ID number you have entered is incorrect");
                }
            }

        } else if (tempvar
                == 3) {
            printEmployeelist();
        } else if (tempvar
                == 0) // if user hits 0 it allows them to exit the programme
        {
            System.out.println("You have exited the system");
            System.exit(0);
        } else // if any other choice entered they will be met with this message
        {
            System.out.println("You have entered the wrong choice");
        }
    }

    public static void printEmployeelist() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    // method to create the book list using a for loop

}
