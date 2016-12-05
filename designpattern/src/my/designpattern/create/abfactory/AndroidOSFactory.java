package my.designpattern.create.abfactory;

public class AndroidOSFactory extends OSFactory {

	@Override
	protected OperationController getOperation() {
		// TODO Auto-generated method stub
		return new AndroidOperation();
	}

	@Override
	protected InterfaceController getInterface() {
		// TODO Auto-generated method stub
		return new AndroidInterface();
	}

}
