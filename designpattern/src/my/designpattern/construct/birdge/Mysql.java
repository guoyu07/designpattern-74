package my.designpattern.construct.birdge;

public class Mysql implements DataSource{

	private String conn = null;
	
	@Override
	public void setConnection(String userName, String password) {
		// TODO Auto-generated method stub
		conn = userName+"::"+password;
	}

	@Override
	public String getConnecton() {
		// TODO Auto-generated method stub
		return "Mysql == "+conn;
	}
	
}
