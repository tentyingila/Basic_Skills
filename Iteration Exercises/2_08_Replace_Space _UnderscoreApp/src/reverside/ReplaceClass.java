package reverside;

public class ReplaceClass {

	public static void main(String[] args) {
		String str = "I love hello world and programming";
		replaceSpace(str);

	}
	
	public static void replaceSpace(String str) {
	       char[] ch = new char[str.length()];
		for (int i = 0; i < ch.length; i++){
		    ch[i] = str.charAt(i);
			if (ch[i] == ' '){
				ch[i] = '_';
			}
		}
		for(char rch : ch){
		    System.out.print(rch);
		}
	}

}
