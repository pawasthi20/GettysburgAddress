/**
 * 
 * @author Parth Awasthi
 *
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class GettysburgAddress 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		//Creating an Array List of words 
		Scanner file = new Scanner(new File("/Users/parth/git/GettysburgAddress/src/GettysburgAddress.txt")).useDelimiter(" |\\n|-");
		
		//Looked up useDelimiter method to delete special characters
		ArrayList<String> words = new ArrayList<String>();
		
		//Declaring Variables
		String word;
		String longestWord = null;
		int wordLength;
		int longestWordlength = 0;
		int totalWordlength = 0;
		int numWords;
		int averageWordlength = 0;
				
		//Adding each word into the ArrayList and calculating longest word and average word length
		while (file.hasNext())
		{	
			word = file.next();
			words.add(word);
			wordLength = word.length();
			if(wordLength > longestWordlength)
			{
				longestWordlength = wordLength;
				longestWord = word;
			}
			totalWordlength += wordLength;
		}
		numWords = words.size();
		
		//Making sure if file does not have words, program does not crash
		if (numWords > 0)
		{
			averageWordlength = totalWordlength/numWords;
		}
		
		//Printing
		System.out.println("The longest word in the Gettysburg Address is: " + longestWord);
		System.out.println("The average word length in the Gettysburg Address is: " + averageWordlength);
		file.close();
	}	
}