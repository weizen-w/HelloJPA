package spring.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.domain.Event;
import spring.repository.EventRepository;

/**
 * 14/09/2023 HelloREST
 *
 * @author Wladimir Weizen
 */
@Service
public class EventService {

  @Autowired
  private EventRepository eventRepository;

  public List<Event> findAll() {
    return eventRepository.findAll();
  }

  public Event add(Event event) {
    return eventRepository.save(event);
  }

  public Event findById(Integer id) {
    return eventRepository.findById(id).isPresent()? eventRepository.findById(id).get():null;
  }

  public Event update(Event event) {
    return eventRepository.save(event);
  }

  public Event delete(Integer id) {
    Event event = findById(id);
    if (event != null) {
      eventRepository.delete(event);
    }
    return event;
  }
}
