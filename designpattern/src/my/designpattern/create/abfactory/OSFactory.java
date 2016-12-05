package my.designpattern.create.abfactory;

public abstract class OSFactory {
	protected abstract OperationController getOperation();
	protected abstract InterfaceController getInterface();
}
