package spring.domain;

/**
 * 14/09/2023 HelloREST
 *
 * @author Wladimir Weizen
 */
public class Event {

  private Integer id;
  private String name;
  private String city;
  private double price;
  private static int counter = 0;

  public Event() {
  }

  public Event(String name, String city, double price) {
    this.id = ++counter;
    this.name = name;
    this.city = city;
    this.price = price;
  }

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
