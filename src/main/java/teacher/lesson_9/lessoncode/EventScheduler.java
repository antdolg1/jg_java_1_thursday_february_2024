package teacher.lesson_9.lessoncode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EventScheduler {

    public static void main(String[] args) {

        List<Event> events = new ArrayList<>();

        events.add(new Event("Daily stand-up", LocalDate.of(2024, 04, 1)));
        events.add(new Event("Sprint planning", LocalDate.of(2024, 04, 2)));
        events.add(new Event("Retrospective", LocalDate.of(2024, 04, 6)));
        events.add(new Event("Refinement", LocalDate.of(2024, 05, 12)));

        System.out.println("Upcoming events:");
        for (Event event : events) {
            if (event.isUpcomingEvent()) {
                System.out.println("Event: " + event.getEventName() + ", Date: " + event.getEventDate());
            }
        }


    }
}
