package my.designpattern.create.factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class JpegReader implements ImageReader{

	@Override
	public InputStream read(String src) {
		if(!src.endsWith(".jpg"))
			throw new RuntimeException("error image formmate");
		FileInputStream fs = null;
		try {
			fs = new FileInputStream(new File(src));
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e.getMessage());
		}
		return fs;
	}

}
