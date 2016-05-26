package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String zipCode;
    private String data;

    protected Location() {}

    
    public Location(String zipCode, String data) {
        this.zipCode = zipCode;
        this.data = data;
    }
}

