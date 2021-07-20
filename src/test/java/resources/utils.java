package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class utils {
 public static String getGlobalvalue() throws IOException{
	 
	 Properties prop = new Properties();
	 FileInputStream fis = new FileInputStream("C:\\Users\\Jyotsna Pandey\\eclipse-workspace_jyo\\APIFramework\\global.properties");
	 prop.load(fis);
	 return prop.getProperty("URL");
	  
 }
}
