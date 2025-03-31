package instagram;

public class Inst2 extends Insta1 {
	
	@Override
	void upload() {
		super.upload();
		System.out.println("videos uploaded");
	}
	
	void call() {
		System.out.println("voice call");
	}

}
