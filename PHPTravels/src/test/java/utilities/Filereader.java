package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Filereader {
	private static Properties properties;
	private final static String propertyfilepath=System.getProperty("user.dir")+"\\src\\main\\resources\\global.properties";

	private static  FileInputStream fis;
	public static Properties getProperty() {
		try {
			fis=new FileInputStream(propertyfilepath);
			properties=new Properties();
			properties.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return properties;
	}
}
