import java.util.Scanner;

public class Main {
    /**
     * This is a simple POS emulator for Teaching:
     * <li>GitHub</li>
     * <li>Classes</li>
     * <li>Data Structures</li>
     * It starts with providing services and their costs then students add products and sales.
     *
     * @param args Passed arguments - might have some at end
     */
    public static void main(String[] args) {
        Services services = new Services();
        Scanner scan = new Scanner(System.in);

        long price = 0;
        // TODO: 1st: Change order to a list for all selected services here
        String order = "";

        // Showing a do-while application
        do {
            System.out.println("Welcome to our store, we offer the following services: ");

            // Loop (foreach) over constant services and print each option
            for (var serv : services.SERVICES) {
                System.out.printf("\tOption is: %s\n", serv);
            }

            System.out.print("Which service do you want?");
            // TODO: 3rd: after order working & our arrays are changed to a List - validate choice
            order += scan.nextLine() + " ";

            // TODO: 4 = also add a check (if) that sees if order is same size as SERVICES
            // TODO: finally - make this work for answers like: "Yes I do" or "I do, Yes"
            System.out.print("Have you finished your order? (yes/no)");
        } while (!scan.nextLine().equalsIgnoreCase("yes"));

        System.out.println(order);
    }
}