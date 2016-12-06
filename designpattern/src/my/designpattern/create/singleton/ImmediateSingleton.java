package my.designpattern.create.singleton;

/**
 * 饿汉式单例模式
 * 由于懒汉式实在类加载的时候进行对象的赋值，所以没有线程安全的问题
 * @author Wanglp
 *
 */
public final class ImmediateSingleton {
	
	private static final ImmediateSingleton IS = new ImmediateSingleton();
	
	private ImmediateSingleton(){}
	
	public static ImmediateSingleton getInstance(){
		return IS;
	}
}
