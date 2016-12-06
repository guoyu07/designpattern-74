package my.designpattern.create.builder;

public class SimpleMode extends VideoBuilder{

	@Override
	protected void buildMeau() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void buildList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void buildMainWindow() {
		// TODO Auto-generated method stub
		vc.setMainWindow("MainWindow");
	}

	@Override
	protected void buildController() {
		// TODO Auto-generated method stub
		vc.setController("Controller");
	}
	
}
