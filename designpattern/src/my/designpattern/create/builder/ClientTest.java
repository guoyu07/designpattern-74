package my.designpattern.create.builder;

public class ClientTest {
	public static void main(String[] args) {
		ActorController ac = new ActorController();
		VideoComponent vc = ac.construct(new SimpleMode());
		System.out.println(vc);
	}
}
