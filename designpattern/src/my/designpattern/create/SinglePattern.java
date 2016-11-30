package my.designpattern.create;

public class SinglePattern {
	
	// 饿汉式单利模式
	private static final SinglePattern SINGLEPATTERN = new SinglePattern();
	
	private SinglePattern(){}
	
	public static SinglePattern getInstance(){
		return SinglePattern.SINGLEPATTERN;
	}
	
}
