package corejava;

public class StringBufferOperations {
 private static final String evening = null;
 private static String man;

 public static void main(String[] args) {
	 StringBuffer sb = new StringBuffer("Hello");	 
	 System.out.println(sb); 
	 System.out.println("Append:"+sb.append(" World"));
	 System.out.println(sb);
	 System.out.println("Insert:"+sb.insert(2, "###"));
	 System.out.println(sb);
	 
	 System.out.println("Delete:"+sb.delete(3, 6));
	 System.out.println(sb);
	 
     System.out.println("DeleteCharAt:"+sb.deleteCharAt(1));
     System.out.println(sb);
     
     StringBuffer sbb = new StringBuffer("Good Morning");
     System.out.println("Replace:"+sbb.replace(5, 12, "Evening"));
     System.out.println(sbb); 
     
     System.out.println("Reverse:"+sb.reverse());
     System.out.println(sb);
     
     
     StringBuffer sbw = new StringBuffer("Java");
     sbw.setCharAt(0, 'Y');
     System.out.println(sbw);  // Output: Yava
     
     System.out.println("CharAt:"+sb.charAt(1));
     System.out.println(sb);

     
     System.out.println("Length:"+sb.length()); 
     System.out.println(sb);
     System.out.println("Cpacity"+sb.capacity());
     System.out.println(sb);
     
     System.out.println("EnsureCapacity:");sb.ensureCapacity(50);
     System.out.println(sb);

    
 
 
 }
}
