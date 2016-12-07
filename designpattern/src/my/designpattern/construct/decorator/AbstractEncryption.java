package my.designpattern.construct.decorator;

public abstract class AbstractEncryption implements IEncryption{
	
	protected IEncryption encryption = null;
	
	public AbstractEncryption(IEncryption encryption){
		this.encryption = encryption;
	}
	
	public abstract String decoratorEncry(String str);
}
