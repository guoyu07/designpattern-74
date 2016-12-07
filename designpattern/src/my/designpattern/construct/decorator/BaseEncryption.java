package my.designpattern.construct.decorator;

public class BaseEncryption implements IEncryption{

	@Override
	public String encryption(String info) {
		return info+"1";
	}

}
