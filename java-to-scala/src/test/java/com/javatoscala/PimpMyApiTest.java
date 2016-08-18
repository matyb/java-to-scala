package com.javatoscala;

import static com.javatoscala.PimpMyApiTest.Filters.TXT_FILE_FILTER;
import static org.junit.Assert.assertTrue;
import static java.util.Arrays.asList;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PimpMyApiTest {
	
	@Test
	public void testTheBestJavaCanProvide(){
		List<String> paths = new ArrayList<String>();
		for(File file : findRecursively(new File("/Users/maty/devl"), TXT_FILE_FILTER)){
			paths.add(file.getAbsolutePath());
		}
		for(String expected : asList("/Users/maty/devl/build/apache-maven-3.3.9/lib/ext/README.txt")){
			assertTrue(expected + " not found in " + paths, paths.contains(expected));
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
