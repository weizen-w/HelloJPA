package spring.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.domain.City;
import spring.domain.Event;
import spring.repository.CityRepository;
import spring.repository.EventRepository;

/**
 * 14/09/2023 HelloREST
 *
 * @author Wladimir Weizen
 */
@Service
public class CityService {

  @Autowired
  private CityRepository cityRepository;

  public List<City> findAll() {
    return cityRepository.findAll();
  }

  public City add(City city) {
    return cityRepository.save(city);
  }

  public City findById(Integer id) {
    return cityRepository.findById(id).isPresent()? cityRepository.findById(id).get():null;
  }

  public City update(City city) {
    return cityRepository.save(city);
  }

  public City delete(Integer id) {
    City city = findById(id);
    if (city != null) {
      cityRepository.delete(city);
    }
    return city;
  }
}
