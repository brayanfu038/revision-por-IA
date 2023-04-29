package co.edu.uptc.mstickets.util.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.stereotype.Component;

import co.edu.uptc.mstickets.util.FilesUtils;

@Component
public class FilesUtilsImpl implements FilesUtils{

	@Override
	public void write(String path, String lineData) throws IOException {
		// TODO Auto-generated method stub
		try {
			File file = new File(path);
			PrintWriter writer = new PrintWriter(new FileWriter(file, true));
			
			writer.println(lineData);
			writer.close();
		} catch (IOException e) {
			throw e;
	}
 }
}
