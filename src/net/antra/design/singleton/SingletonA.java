package net.antra.design.singleton;

public class SingletonA {
	private static final SingletonA instance = new SingletonA();

	private SingletonA() {
		if (instance != null)
			throw new RuntimeException();
	}

	public static SingletonA getInstance(){
		return instance;
	}
	
}
