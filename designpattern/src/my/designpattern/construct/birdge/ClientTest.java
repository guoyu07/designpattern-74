package my.designpattern.construct.birdge;

public class ClientTest {
	public static void main(String[] args) {
		DataSource ds = new Mysql();
		ds.setConnection("orcl1", "orclpwd");
		
		ConvertDate cd = new ConvertTXT();
		cd.setDataSource(ds);
		cd.convertData("text1");
	}
}
