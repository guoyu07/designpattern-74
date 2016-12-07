package my.designpattern.construct.birdge;

public interface DataSource {
	
	void setConnection(String userName,String password);
	
	String getConnecton();
}
