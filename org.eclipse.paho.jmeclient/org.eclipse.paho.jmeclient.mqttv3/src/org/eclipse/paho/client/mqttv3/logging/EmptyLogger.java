package org.eclipse.paho.client.mqttv3.logging;

import java.util.Hashtable;

import org.eclipse.paho.client.mqttv3.util.PropertyResourceBundle;

/*
 * An implementation of the Logger class which performs no function and is simply used as place holder 
 * in case no other logger has been specified.
 */
public class EmptyLogger implements Logger {

	public void initialise(PropertyResourceBundle messageCatalog,
			String loggerID, String resourceName) {
	}

	public void setResourceName(String logContext) {
	}

	public boolean isLoggable(int level) {
		return false;
	}

	public void severe(String sourceClass, String sourceMethod, String msg) {
	}

	public void severe(String sourceClass, String sourceMethod, String msg,
			Object[] inserts) {
	}

	public void severe(String sourceClass, String sourceMethod, String msg,
			Object[] inserts, Throwable thrown) {
	}

	public void warning(String sourceClass, String sourceMethod, String msg) {
	}

	public void warning(String sourceClass, String sourceMethod, String msg,
			Object[] inserts) {
	}

	public void warning(String sourceClass, String sourceMethod, String msg,
			Object[] inserts, Throwable thrown) {
	}

	public void info(String sourceClass, String sourceMethod, String msg) {
	}

	public void info(String sourceClass, String sourceMethod, String msg,
			Object[] inserts) {
	}

	public void info(String sourceClass, String sourceMethod, String msg,
			Object[] inserts, Throwable thrown) {
	}

	public void config(String sourceClass, String sourceMethod, String msg) {
	}

	public void config(String sourceClass, String sourceMethod, String msg,
			Object[] inserts) {
	}

	public void config(String sourceClass, String sourceMethod, String msg,
			Object[] inserts, Throwable thrown) {
	}

	public void fine(String sourceClass, String sourceMethod, String msg) {
	}

	public void fine(String sourceClass, String sourceMethod, String msg,
			Object[] inserts) {
	}

	public void fine(String sourceClass, String sourceMethod, String msg,
			Object[] inserts, Throwable ex) {
	}

	public void finer(String sourceClass, String sourceMethod, String msg) {
	}

	public void finer(String sourceClass, String sourceMethod, String msg,
			Object[] inserts) {
	}

	public void finer(String sourceClass, String sourceMethod, String msg,
			Object[] inserts, Throwable ex) {
	}

	public void finest(String sourceClass, String sourceMethod, String msg) {
	}

	public void finest(String sourceClass, String sourceMethod, String msg,
			Object[] inserts) {
	}

	public void finest(String sourceClass, String sourceMethod, String msg,
			Object[] inserts, Throwable ex) {
	}

	public void log(int level, String sourceClass, String sourceMethod,
			String msg, Object[] inserts, Throwable thrown) {
	}

	public void trace(int level, String sourceClass, String sourceMethod,
			String msg, Object[] inserts, Throwable ex) {
	}

	public String formatMessage(String msg, Object[] inserts) {
		return null;
	}

	public void dumpTrace() {
	}

	public Hashtable getProperties() {
		return null;
	}
	
}
