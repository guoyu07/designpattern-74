package my.designpattern.create.abfactory;

public class ClientTest {
	
	public static void main(String[] args) {
		OSFactory osf = new AndroidOSFactory();//new WindosOSFactory();
		osf.getOperation().moveDown();
	}
	
}
