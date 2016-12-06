package my.designpattern.create.singleton;

public class ClientTest {
	public static void main(String[] args) {
		ImmediateSingleton isa = ImmediateSingleton.getInstance();
		ImmediateSingleton isb = ImmediateSingleton.getInstance();
		System.out.println(isa == isb);
		
		LazySingleton lsa = LazySingleton.getInstance();
		LazySingleton lsb = LazySingleton.getInstance();
		System.out.println(lsa == lsb);
		
		IODH ia = IODH.getInstance();
		IODH ib = IODH.getInstance();
		System.out.println(ia == ib);
	}
}
