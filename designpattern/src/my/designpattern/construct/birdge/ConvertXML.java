package my.designpattern.construct.birdge;

public class ConvertXML extends ConvertDate{
	@Override
	public void convertData(String fileName) {
		// TODO Auto-generated method stub
		System.out.println(ds.getConnecton());
		System.out.println("convert "+fileName+" to XML");
	}
}
