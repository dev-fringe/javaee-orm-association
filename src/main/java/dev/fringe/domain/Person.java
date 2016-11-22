package dev.fringe.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by v.hdlee on 2016-11-22.
 */
@Entity(name = "Person")
public class Person {

    @Id
    private Long id;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "phone_register",
            joinColumns = @JoinColumn(name = "phone_id"),
            inverseJoinColumns = @JoinColumn(name = "person_id"))
    @MapKey(name = "since")
    @MapKeyTemporal(TemporalType.TIMESTAMP)
    private Map<Date, Phone> phoneRegister = new HashMap<Date, Phone>();

    public Person() {
    }

    public Person(Long id) {
        this.id = id;
    }

    public Map<Date, Phone> getPhoneRegister() {
        return phoneRegister;
    }

    public void addPhone(Phone phone) {
        phoneRegister.put( phone.getSince(), phone );
    }
}