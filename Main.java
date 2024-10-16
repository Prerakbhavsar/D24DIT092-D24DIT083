import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n1. Add Event");
            System.out.println("2. Add Attendee");
            System.out.println("3. List Events");
            System.out.println("4. List Attendees");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter event name: ");
                    String eventName = scanner.nextLine();
                    System.out.print("Enter event date: ");
                    String date = scanner.nextLine();
                    System.out.print("Enter event location: ");
                    String location = scanner.nextLine();
                    eventManager.addEvent(new Event(eventName, date, location));
                    break;
                    
                case 2:
                    System.out.print("Enter attendee name: ");
                    String attendeeName = scanner.nextLine();
                    System.out.print("Enter attendee email: ");
                    String email = scanner.nextLine();
                    eventManager.addAttendee(new Attendee(attendeeName, email));
                    break;
                    
                case 3:
                    eventManager.listEvents();
                    break;
                    
                case 4:
                    eventManager.listAttendees();
                    break;
                    
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
