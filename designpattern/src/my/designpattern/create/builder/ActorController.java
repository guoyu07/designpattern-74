package my.designpattern.create.builder;

public class ActorController {
	
	public VideoComponent construct(VideoBuilder vb){
		vb.buildController();
		vb.buildList();
		vb.buildMainWindow();
		vb.buildMeau();
		return vb.create();
	}
	
}
