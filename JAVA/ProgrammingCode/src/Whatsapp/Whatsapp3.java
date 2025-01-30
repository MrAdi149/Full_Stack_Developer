package Whatsapp;

public class Whatsapp3 extends Whatsapp2 {

	@Override
	void tick() {
		super.tick();
		System.out.println("Blue Tick");
	}
	
	@Override
	void call() {
		super.call();
		System.out.println("Video call");
	}
	
	void status() {
		super.call();
		System.out.println("image uploaded to status");
	}
}
