package entities;

import java.util.ArrayList;
import java.util.List;

public class PrintService <T> {
	
	public List <T> list = new ArrayList<>();
	public  void addvalue(T value) {
		list.add(value);
		
	
	}
	public  T fisrt() {
		return  list.get(0);
	
	}
	public  void print() {
		
	}
	

}
