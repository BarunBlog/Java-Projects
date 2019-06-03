package prc2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<ArrayList<Integer>>();
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
		list2.add(list1);
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list2.size());
		}
	}

}
