package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import JunitTestBook.Largest;

import junit.framework.TestCase;

public class TestLargestDataFile extends TestCase{

	public TestLargestDataFile(String name) {
		super(name);
	}
	
	public void testFromFile() throws Exception{
		
		String line;
		BufferedReader reader = new BufferedReader(new FileReader("C://datatest.txt"));
		
		while((line = reader.readLine())!=null){
			
			if(line.startsWith("#")){
				continue;
			}
			StringTokenizer st = new StringTokenizer(line);
			
			if(!st.hasMoreTokens()){
				continue;
			}
			String val = st.nextToken();
			int expected = Integer.valueOf(val);
			int number;
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			while(st.hasMoreTokens()){
				list.add(Integer.valueOf(st.nextToken()));
			}
			int tab[] = new int[list.size()];
			for (int i = 0; i<tab.length;i++){
				tab[i] = list.get(i);
			}
		
			assertEquals(expected, Largest.largest(tab));
		}
	}
}
