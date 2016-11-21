package dev.fringe.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.net.URL;

@Entity(name = "Contact")
public class Contact {
    @Id
    private Integer id;
    private Name name;
    private String notes;
    private URL website;
    private boolean starred;
}
