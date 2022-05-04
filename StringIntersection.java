package weekday3;

public class StringIntersection {
public static void main(String[] args) {

	String text="I am learning testing in testleaf Both manual testing and automation testing are learning";
	int count = 0;
	String[] split = text.split(" ");
	for (int i = 0; i < split.length; i++) {
		 count=1;
		for (int j = i+1; j < split.length; j++) {
			if(split[i].equals(split[j])) {
			//	System.out.println(split[i]);
				count++;
			}
		}
		if(count>1) {
			System.out.println(count);
		}
	}
}
}
