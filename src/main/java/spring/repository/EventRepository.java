package spring.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;
import spring.domain.Event;

/**
 * 14/09/2023 HelloREST
 *
 * @author Wladimir Weizen
 */
@Repository
public class EventRepository {

  static List<Event> events =
      new ArrayList<>(
          Arrays.asList(
              new Event("Opera", "London", 50.5),
              new Event("Violin concert", "Prague", 60.4),
              new Event("Jazz concert", "Berlin", 54.8),
              new Event("Art exhibition", "London", 87.2),
              new Event("Royal Variety Show", "Paris", 65.1)
          )
      );

  public List<Event> findAll() {
    return events;
  }

  public Event findById(int id) {
    for (Event event : events) {
      if (event.getId() == id) {
        return event;
      }
    }
    return null;
  }

  public Event save(Event event) {
    if (event.getId() == null) {
      Event newEvent = new Event(event.getName(), event.getCity(), event.getPrice());
      events.add(newEvent);
      return newEvent;
    } else {
      Event updateEvent = findById(event.getId());
      if (updateEvent != null) {
        updateEvent.setName(event.getName());
        updateEvent.setCity(event.getCity());
        updateEvent.setPrice(event.getPrice());
        return updateEvent;
      }
      return null;
    }
  }

  public Event remove(int id) {
    Event removeEvent = findById(id);
    events.remove(removeEvent);
    return removeEvent;
  }
}
