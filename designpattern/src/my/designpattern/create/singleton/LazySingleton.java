package my.designpattern.create.singleton;

/**
 * 懒汉式单例模式
 * 由于懒汉式在多线程的环境下有可能会产生线程不安全的情况，所有一般采取双重检查来避免产生线程安全问题。
 * @author Wanglp
 *
 */
public final class LazySingleton {
	
	private static LazySingleton LS = null;
	
	private LazySingleton(){}
	
	public static LazySingleton getInstance(){
		if(null == LS){
			synchronized(LazySingleton.class){
				if(null == LS){
					LS = new LazySingleton();
				}
			}
		}
		return LS;
	}
	
}
