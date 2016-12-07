package my.designpattern.construct.birdge;

public abstract class ConvertDate {
	
	public DataSource ds = null;
	
	public void setDataSource(DataSource ds){
		this.ds = ds;
	}
	
	public abstract void convertData(String fileName);
	
}
