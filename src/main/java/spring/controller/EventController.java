package spring.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.domain.Event;
import spring.service.EventService;

/**
 * 14/09/2023 HelloREST
 *
 * @author Wladimir Weizen
 */
@RestController
@RequestMapping("/event")
public class EventController {

  @Autowired
  private EventService eventService;

  @GetMapping("/all")
  public List<Event> findAll() {
    return eventService.findAll();
  }

  @GetMapping("/{id}")
  public Event findById(@PathVariable Integer id) {
    return eventService.findById(id);
  }

  @PostMapping("/add")
  public Event add(@RequestBody Event event) {
    return eventService.add(event);
  }

  @DeleteMapping("/delete/{id}")
  public Event delete(@PathVariable Integer id) {
    return eventService.delete(id);
  }

  @PutMapping("/update")
  public Event update(@RequestBody Event event) {
    return eventService.update(event);
  }
}
