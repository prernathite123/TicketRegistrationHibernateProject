package com.Advanto.Configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Connection {

	public static SessionFactory connect() {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		
		return sf;
	}
	
}
