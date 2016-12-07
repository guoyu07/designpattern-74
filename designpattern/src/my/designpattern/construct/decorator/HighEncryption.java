package my.designpattern.construct.decorator;

public class HighEncryption extends AbstractEncryption {

	public HighEncryption(IEncryption encryption) {
		super(encryption);
	}

	@Override
	public String encryption(String info) {
		return encryption.encryption(info)+"3";
	}

	@Override
	public String decoratorEncry(String str) {
		// TODO Auto-generated method stub
		return null;
	}

}
