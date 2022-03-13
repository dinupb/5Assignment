package assignment_5;

public class permulation_of_string {
	public class per {
		 
	    // Function to print all the permutations of string
	    static void printPermutn(String str, String ans)
	    {
	 
	        // If string is empty
	        if (str.length() == 0) {
	            System.out.print(ans + " ");
	            return;
	        }
	 
	        for (int i = 0; i < str.length(); i++) {
	 
	            // it character of string
	            char ch = str.charAt(i);
	 
	            // Rest of the string after excluding
	            // the it character
	            String ros = str.substring(0, i) +
	                         str.substring(i + 1);
	 
	            // Recursive call
	            printPermutn(ros, ans + ch);
	        }
	    }
	 
	    // Driver code
	    
	    public static void main(String[] args)
	    {
	        String s = "drk";
	        printPermutn(s, "");
	    }
	}
}
