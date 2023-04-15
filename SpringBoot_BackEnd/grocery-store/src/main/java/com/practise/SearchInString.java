package com.practise;

public class SearchInString {

	public static boolean main(String[] args) {
		// TODO Auto-generated method stub
	    String name = "Kunal";
	    char target = 'u';
	    System.out.println(search (name, target));
	    static boolean search(String str, char target)  {
	    	if ( str.length() == 0) {
	    		return false;
	    		
	    	}
	    	for (int i = 0; i<str.length();i++) {
	    		if (target == str.charAt(i)) {
	    			return true;
	    			
	    		}
	    	}
	    }
		
		

	}

	private static char[] search(String name, char target) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
