package students.igors_melkins.lesson_9;

import java.time.LocalDate;

public class Event {

    private  String eventName;
    private LocalDate eventDate;

    public Event(String eventName,LocalDate eventDate) {
        this.eventDate = eventDate;
        this.eventName = eventName;
    }
    public String getEventName (){
        return eventName;
    }
    public LocalDate getEventDate (){
        return eventDate;
    }
    public boolean isUscomingEvent (){
        return LocalDate.now().isBefore(eventDate);

    }
}



