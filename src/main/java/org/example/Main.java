package org.example;

import org.example.models.Equipo;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        /*
            - Configurar POM
            - Añadir anotaciones a los modelos
            - Configurar Hibernate

         */

        var cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory();

        sessionFactory.inSession(session -> {
            session.createQuery("from Equipo", Equipo.class)
                    .list()
                    .forEach(System.out::println);
        });

    }
}
