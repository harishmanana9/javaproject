
public class SwitchCaseDemo {
	public static void main(String[] args) {
		char ch = 'R';
		
		switch(ch) {
		case 'a' : 
		case 'e' : 
		case 'i' : 
		case 'o' : 
		case 'u' : System.out.println("Vowel"); break;
		default  : System.out.println("Consonent");
		}
	}
}
