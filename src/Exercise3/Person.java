package Exercise3;
public class Person{
	public String getInitials(String fullName) {
		String result = "";
		String[] words = fullName.split(" ");
		for (int i = 0; i < words.length; i++) {
			String nextInitial = "";
			for (int j = 0; j < words[i].length(); j++){
				if (words[i].charAt(j) != ' '){
					nextInitial = "" + words[i].charAt(j);
					break;
				}
			}
			result = result + nextInitial.toUpperCase();
		}	
		return result;
	}

}