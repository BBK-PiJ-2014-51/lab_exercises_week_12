package Exercise2;
public class HashUtilities{
	
	
	public static int shortHash(int num){
		if (num == 0) num = 35;
		num = Math.abs(num);
		while (num <= 1000){
			num *= 17;
		}
		while (num > 1000){
			num %= 997;
		}
		return num;
	}
}