package compressPictures;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
/**
 * @author mos
 * jdk 1.6
 */
public class CompressPictures {

	public static void main(String[] args) {
		compressPictures("inputPath", "outputPath");
	}

	/**
	 * @param inputPath  原图片路径
	 * @param outputPath 压缩图片保存路径
	 */
	public static final void compressPictures(String inputPath, String outputPath) {
		try {
			File file = new File(inputPath);
			FileInputStream stream = new FileInputStream(file);
			BufferedImage image;
			image = ImageIO.read(stream);
			image.getGraphics().drawImage(image, 0, 0, 0, 0, 358, 441, 358, 441, null);
			ImageIO.write(image, "jpg", new File(outputPath));
		} catch (IOException e) {
			e.getMessage();
		}
	}
}
