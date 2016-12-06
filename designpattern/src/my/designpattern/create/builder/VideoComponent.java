package my.designpattern.create.builder;

public class VideoComponent {
	private String meau;
	private String list;
	private String mainWindow;
	private String controller;
	public String getMeau() {
		return meau;
	}
	public void setMeau(String meau) {
		this.meau = meau;
	}
	public String getList() {
		return list;
	}
	public void setList(String list) {
		this.list = list;
	}
	public String getMainWindow() {
		return mainWindow;
	}
	public void setMainWindow(String mainWindow) {
		this.mainWindow = mainWindow;
	}
	public String getController() {
		return controller;
	}
	public void setController(String controller) {
		this.controller = controller;
	}
	@Override
	public String toString() {
		return "VideoComponent [meau=" + meau + ", list=" + list + ", mainWindow=" + mainWindow + ", controller="
				+ controller + "]";
	}
	
}
