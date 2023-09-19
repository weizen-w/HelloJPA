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
import spring.domain.City;
import spring.domain.Event;
import spring.service.CityService;
import spring.service.EventService;

/**
 * 14/09/2023 HelloREST
 *
 * @author Wladimir Weizen
 */
@RestController
@RequestMapping("/cities")
public class CityController {

  @Autowired
  private CityService cityService;

  @GetMapping("/all")
  public List<City> findAll() {
    return cityService.findAll();
  }

  @GetMapping("/{id}")
  public City findById(@PathVariable Integer id) {
    return cityService.findById(id);
  }

  @PostMapping("/add")
  public City add(@RequestBody City city) {
    return cityService.add(city);
  }

  @DeleteMapping("/delete/{id}")
  public City delete(@PathVariable Integer id) {
    return cityService.delete(id);
  }

  @PutMapping("/update")
  public City update(@RequestBody City city) {
    return cityService.update(city);
  }
}
