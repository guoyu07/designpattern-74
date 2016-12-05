package my.designpattern.create.abfactory;

public class WindosOSFactory extends OSFactory {

	@Override
	protected OperationController getOperation() {
		// TODO Auto-generated method stub
		return new WindowsOperation();
	}
	
	@Override
	protected InterfaceController getInterface() {
		// TODO Auto-generated method stub
		return new WindowsInterface();
	}

}
