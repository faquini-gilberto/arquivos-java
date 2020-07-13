package aplicacao;

import java.io.File;

public class InfoFile {

	public static void main(String[] args) {
		
		String path = "c:\\workspace\\ws-eclipse\\teste.txt";
		
		File file = new File(path);
		
		System.out.println("getAbsolutePath :" + file.getAbsolutePath());
		//System.out.println("get :" + file.getCanonicalPath());
		System.out.println("getFreeSpace :" + file.getFreeSpace());
		System.out.println("getName :" + file.getName());
		System.out.println("getParent :" + file.getParent());
		System.out.println("getPath :" + file.getPath());
		System.out.println("getTotalSpace :" + file.getTotalSpace());
		System.out.println("getUsabelSpace :" + file.getUsableSpace());
		System.out.println("isDirectory :" + file.isDirectory());
		System.out.println("isAbsolute :" + file.isAbsolute());
		System.out.println("isFile :" + file.isFile());
		System.out.println("isHidden :" + file.isHidden());
		
	}

}
