package my.designpattern.construct.decorator;

public class ClientTest {
	public static void main(String[] args) {
		IEncryption baseencry,middleencry,highencry;
		
		baseencry = new BaseEncryption();
		middleencry = new MiddEncyption(baseencry);
		highencry = new HighEncryption(middleencry);
		System.out.println(highencry.encryption("wangliping"));
		
//		highencry = new HighEncryption(middleencry);
//		System.out.println(highencry.encryption("3"));
	}
}
