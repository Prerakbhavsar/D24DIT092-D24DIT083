import java.util.ArrayList;

public class EventManager {
    private ArrayList<Event> events;
    private ArrayList<Attendee> attendees;

    public EventManager() {
        events = new ArrayList<>();
        attendees = new ArrayList<>();
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public void addAttendee(Attendee attendee) {
        attendees.add(attendee);
    }

    public void listEvents() {
        System.out.println("Events:");
        for (Event event : events) {
            System.out.println(event);
        }
    }

    public void listAttendees() {
        System.out.println("Attendees:");
        for (Attendee attendee : attendees) {
            System.out.println(attendee);
        }
    }
}
