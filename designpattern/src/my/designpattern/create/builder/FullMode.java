package my.designpattern.create.builder;

public class FullMode extends VideoBuilder{

	@Override
	protected void buildMeau() {
		// TODO Auto-generated method stub
		vc.setMeau("meau");
	}

	@Override
	protected void buildList() {
		// TODO Auto-generated method stub
		vc.setList("list");
	}

	@Override
	protected void buildMainWindow() {
		// TODO Auto-generated method stub
		vc.setMainWindow("mainWindow");
	}

	@Override
	protected void buildController() {
		// TODO Auto-generated method stub
		vc.setController("Controller");
	}
	
}
