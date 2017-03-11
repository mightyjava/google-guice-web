package com.mightyjava.listener;

import javax.servlet.annotation.WebListener;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import com.mightyjava.servlet.ActionServlet;
import com.mightyjava.servlet.GuiceServlet;
import com.mightyjava.servlet.LoginServlet;

@WebListener
public class GuiceListener extends GuiceServletContextListener {

	@Override
	protected Injector getInjector() {
		return Guice.createInjector(new ServletModule() {
			@Override
			protected void configureServlets() {
				serve("/guice").with(GuiceServlet.class);
				serve("/login").with(LoginServlet.class);
				serve("/authenticate").with(ActionServlet.class);
			}
		});
	}

}
