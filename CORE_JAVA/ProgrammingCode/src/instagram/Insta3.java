package instagram;

public class Insta3 extends Inst2 {
	
	@Override
	void upload() {
		super.upload();
		System.out.println("short reels uploaded");
	}
	
	@Override
	void call() {
		super.call();
		System.out.println("video call");
	}
	
	void status() {
		System.out.println("images status");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Insta3 i = new Insta3();
		i.call();
		i.upload();
		i.status();

	}

}
