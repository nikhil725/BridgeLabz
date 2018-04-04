package com.bridgeit.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgeit.config.Config;
import com.bridgeit.model.Cart;
import com.bridgeit.model.Items;

/**
 * Purpose: This class is to implement one to many mapping
 * 
 * @author SANA SHAIKH
 *
 */
public class OneToMany {
	public static void main(String args[]) {

		SessionFactory sessionFactory = null;
		sessionFactory = Config.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();

		Cart cart = new Cart();
		cart.setName("My Cart");

		Items item1 = new Items("I1", 10, 1, cart);
		Items item2 = new Items("I2", 20, 2, cart);

		Set<Items> itemsSet = new HashSet<Items>();
		itemsSet.add(item1);
		itemsSet.add(item2);

		cart.setItems(itemsSet);
		cart.setTotal(10 * 1 + 20 * 2);

		// Save the Model objects
		session.save(cart);
		session.save(item1);
		session.save(item2);

		// Commit transaction
		transaction.commit();
		System.out.println("Cart ID=" + cart.getId());
		sessionFactory.close();
	}
}
