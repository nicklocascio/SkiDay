import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class LoadImageApp
	{
	BufferedImage img;
	
	public LoadImageApp() {
    try {
        img = ImageIO.read(new File("strawberry.jpg"));
    } catch (IOException e) {
    }
	}
	}
	
