import java.util.ArrayList;

public class TC_001 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("astha");
		al.add("riya");
		al.add("sita");
		System.out.println(al);
		al.add(1, "radha");
System.out.println(al);
//Changing element
al.set(2, "garg");
System.out.println(al);
//removing element
al.remove("astha");
System.out.println(al);
//remove from index
al.remove(1);
System.out.println(al);

		
	}


}
