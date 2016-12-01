package my.designpattern.create.factory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test {
	
	public static void main(String[] args) throws IOException {
		byte[] buff = new byte[2046];
		FileOutputStream fo = new FileOutputStream(new File("C:/Users/Wanglp/Desktop/wenxin14.jpg"));
		ImageFactory imageFactory = new JpegFactory();
		InputStream is = imageFactory.getInstance().read("C:/Users/Wanglp/Desktop/wenxin13.jpg");
		while(is.read(buff) != -1){
			fo.write(buff);
		}
		is.close();
		fo.close();
	}
	
}
