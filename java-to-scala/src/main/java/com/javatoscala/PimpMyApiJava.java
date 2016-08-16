package com.javatoscala;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
import static com.javatoscala.PimpMyApiJava.Filters.TXT_FILE_FILTER;

public class PimpMyApiJava {
	
	public static void main(String[] args) {
		
		for(File file : findRecursively(new File("/Users/maty/devl"), TXT_FILE_FILTER)){
			System.out.println(file.getAbsolutePath());
		}
		
	}
	
	public static List<File> findRecursively(File file, FileFilter filter) {
		List<File> files = new ArrayList<File>();
		if(file.isDirectory()){
			if(file.listFiles() != null){
				for(File foundFile : file.listFiles()) {
					if(filter.accept(foundFile)){
						files.add(foundFile);
					}else{
						files.addAll(findRecursively(foundFile, filter));
					}
				}
			}
		}
		return files;
	}
	
	public static class Filters {
		public static final FileFilter TXT_FILE_FILTER = new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.getAbsolutePath().endsWith(".txt");
			}
		};
	}
	
}
