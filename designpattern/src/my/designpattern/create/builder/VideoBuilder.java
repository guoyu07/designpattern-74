package my.designpattern.create.builder;

public abstract class VideoBuilder {
	protected VideoComponent vc = new VideoComponent();
	
	protected abstract void buildMeau();
	protected abstract void buildList();
	protected abstract void buildMainWindow();
	protected abstract void buildController();
	
	protected VideoComponent create(){
		return vc;
	}
}
