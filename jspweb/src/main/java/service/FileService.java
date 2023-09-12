package service;

import java.io.File;

public class FileService {

	public static boolean fileDelete(String filepath)
	{
		File file = new File(filepath);
		if(file.exists())
		{
			file.delete();
			return true;
		}
		return false;
	}
}
