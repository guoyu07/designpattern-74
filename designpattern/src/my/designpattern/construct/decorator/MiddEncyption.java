package my.designpattern.construct.decorator;

public class MiddEncyption extends AbstractEncryption {

	public MiddEncyption(IEncryption encryption) {
		super(encryption);
	}

	@Override
	public String encryption(String info) {
		return encryption.encryption(info)+"2";
	}

	@Override
	public String decoratorEncry(String str) {
		return encryption(str)+1;
	}
	
	
}
