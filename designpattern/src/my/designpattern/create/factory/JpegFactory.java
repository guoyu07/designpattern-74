package my.designpattern.create.factory;

public class JpegFactory implements ImageFactory {

	@Override
	public ImageReader getInstance() {
		return new JpegReader();
	}

}
