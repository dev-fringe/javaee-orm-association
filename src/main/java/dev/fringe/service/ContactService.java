package dev.fringe.service;

import dev.fringe.domain.Contact;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import javax.inject.Inject;
import java.util.List;

@Service
public class ContactService {

    @Inject private SessionFactory sessionFactory;

    public List<Contact> list() {
        Session session = this.sessionFactory.openSession();
        List<Contact> list = session.createQuery("from Contact").list();
        session.close();
        return list;
    }

}
