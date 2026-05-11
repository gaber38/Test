package com.gaber.accounts;

import com.gaber.accounts.entity.Bid;
import com.gaber.accounts.entity.Item;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.PersistenceUtil;
import jakarta.transaction.Transactional;
import org.hibernate.Hibernate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Component
public class DataRunner implements CommandLineRunner
{

    @PersistenceContext
    EntityManager em;

    @Override
    @Transactional
    public void run(String... args)
    {

/*        Long count = em.createQuery(
                        "SELECT COUNT(BA) FROM BankAccount BA", Long.class)
                .getSingleResult();

        System.out.println(count);

        int pageSize = 2;
        int totalPages = (int) Math.ceil((double) count / pageSize);

        for (int page = 0; page < totalPages; page++) {

            int offset = page * pageSize;

            TypedQuery<BankAccount> query =
                    em.createQuery(
                            "SELECT BA FROM BankAccount BA ORDER BY BA.id",
                            BankAccount.class
                    );

            query.setFirstResult(offset);
            query.setMaxResults(pageSize);

            List<BankAccount> result = query.getResultList();

            System.out.println("Page " + page + " size: " + result.size());
        }*/

/*
        Long count = (Long)em.createQuery("SELECT COUNT(BA) FROM BankAccount BA")
                .getSingleResult();

        int pageSize = 2;
        int totalPages = (int) Math.ceil((double) count / pageSize);

        for(int page=0; page<totalPages; page++)
        {
            int offset = page * pageSize;
            TypedQuery<BankAccount> query =
                    em.createQuery(
                            "SELECT BA FROM BankAccount BA ORDER BY BA.id",
                            BankAccount.class
                    );

            query.setFirstResult(offset);
            query.setMaxResults(pageSize);

            List<BankAccount> result = query.getResultList();

            System.out.println("Page " + page + " size: " + result.size());
        }

*/
    /*    Student student = em.find(Student.class, 3);

        Course course = new Course();
        course.setTitle("Math");
        Course course2 = new Course();
        course.setTitle("Science");
        em.persist(course);
        em.persist(course2);

        student.setCourses(List.of(course, course2));

        em.persist(student);
        em.flush();*/

/*        Item item = em.find(Item.class, 1);
        em.remove(item);
        em.flush();*/

//        Item item = new Item();
//        Image img1 = new Image(item);
//        Image img2 = new Image(item);
//
//        item.getImages().add(img1);
//        item.getImages().add(img2);
//
//        em.persist(item);
//        em.flush();



        /*List<Item> items = em.createQuery("SELECT i from Item i").getResultList();
        for(Item item : items)
        {
            System.out.println(item.getBids().size());
        }*/

        Item item = new Item();
        em.persist(item);
        em.flush();




    }
}