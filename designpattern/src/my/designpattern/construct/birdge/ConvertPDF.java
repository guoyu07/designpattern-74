package my.designpattern.construct.birdge;

public class ConvertPDF extends ConvertDate{
	@Override
	public void convertData(String fileName) {
		// TODO Auto-generated method stub
		System.out.println(ds.getConnecton());
		System.out.println("convert "+fileName+" to PDF");
	}
}
