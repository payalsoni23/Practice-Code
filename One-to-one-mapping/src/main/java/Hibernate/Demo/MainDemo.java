package Hibernate.Demo;

import java.text.ParseException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Hibernate.Demo.Entity.Instructor;
import Hibernate.Demo.Entity.InstructorDetail;

public class MainDemo {

	public static void main(String[] args) throws ParseException {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {

			InstructorDetail instructorDetail = new InstructorDetail(1, "Quick Bites", "Cooking");
			Instructor instructor = new Instructor("Payal", "Soni", "payalsoni@gmail.com");
			instructor.setInstructorDetail(instructorDetail);

			session.beginTransaction();
			System.out.println("\n Saving instructor: " + instructor);
			session.save(instructor);
			session.getTransaction().commit();

		} finally {
			factory.close();
		}
	}

}
