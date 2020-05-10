package org.stacktrace.singleton;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	public static volatile Singleton instance;

	private Singleton() {
		// no op
	}

	public static Singleton getInstance() throws IllegalArgumentException {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException();
	}

	// At the time of serialization instance of calling readObject method your
	// class readResolve method will be called
	protected Object readResolve() {
		return instance;
	}

}
