
public class matching{
	public static void main(String[] args) {
		
		String a = "GopiChand";
		String b = "Gopi";
		for(int i=0;i<a.length();i++) {
			for(int j=i;j<b.length();j++) {
			
			if(a.charAt(i)==b.charAt(j)) {
				System.out.println(a.charAt(i));
			}
			}
	}
}
}