package dev.fringe.domain;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Phone")
public class Phone {

    @Id
    @GeneratedValue
    private Long id;

    private PhoneType type;

    @Column(name = "`number`")
    private String number;

    private Date since;

    public Phone() {
    }

    public Phone(PhoneType type, String number, Date since) {
        this.type = type;
        this.number = number;
        this.since = since;
    }

    public PhoneType getType() {
        return type;
    }

    public String getNumber() {
        return number;
    }

    public Date getSince() {
        return since;
    }
}