package my.designpattern.create.singleton;

/**
 * iodh 技术是介于 懒汉式 和 饿汉式 中间的方式 
 * 即满足懒汉式对系统资源上的优势
 * 又满足饿汉式对线程安全上的优势
 * @author Wanglp
 *
 */
public final class IODH {
	private IODH(){System.out.println("IODH is init");}
	private static class IODHCLASS{
		private static final IODH IODHINSTANCE = new IODH();
	}
	public static IODH getInstance(){
		return IODHCLASS.IODHINSTANCE;
	}
}
