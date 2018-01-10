package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    private int id = 1;
    private String name = "Ata";
    private String country = "Po";

    public PersonController() {
    }

    @RequestMapping(value="/person/id", method=RequestMethod.GET)
    public int getId() {
        return id;
    }

    public void setId(@RequestParam(value="id", defaultValue="1") int id) {
        this.id = id;
    }

    @RequestMapping(value="/person/name", method=RequestMethod.GET)
    public String getName() {
        return name;
    }

    public void setName(@RequestParam(value="name", defaultValue="Luis") String name) {
        this.name = name;
    }

    @RequestMapping(value="/person/country", method=RequestMethod.GET)
    public String getCountry() {
        return country;
    }

    @RequestMapping(value="/person", method=RequestMethod.GET)
    public String getPerson() {
        return "WHOA";
    }

    public void setCountry(@RequestParam(value="country", defaultValue="Brasil") String country) {
        this.country = country;
    }

}