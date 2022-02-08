package week3.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j;
		String text = "We learn java basics as part of Java sessions sessions in java week1";
		String[]words = text.split("\\string");
		for (int i = 0; i < words.length; i++) 
		{
		for (j = i+1; j < words.length; j++)
		{
		if (words[i].contains(words[j]))
		{
		  words[j] = "";
		   
		}
		 System.out.println(words[j]);
		}
		}
	}
}
