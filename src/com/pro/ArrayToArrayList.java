package com.pro;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		//System.out.println(Arrays.toString(a));
        ArrayList al=new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
			al.add(a[i]);
		}
        System.out.println(al);
	}}
		/*String[] s= {"ab","bc","cd"};
		ArrayList al=new ArrayList<>(Arrays.asList(s));
		System.out.println(al);
	}

}*/
