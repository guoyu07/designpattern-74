package my.designpattern.create.abfactory;

public class SymbianOSFactory extends OSFactory {

	@Override
	protected OperationController getOperation() {
		// TODO Auto-generated method stub
		return new SymbianOperation();
	}

	@Override
	protected InterfaceController getInterface() {
		// TODO Auto-generated method stub
		return new SymbianInterface();
	}

}
