package Whatsapp;

public class Whatsapp2 extends Whatsapp1 {
	
	@Override
	void tick() {
		super.tick();
		System.out.println("Double Tick");
	}
	
	void call() {
		System.out.println("voice call");
	}

}
