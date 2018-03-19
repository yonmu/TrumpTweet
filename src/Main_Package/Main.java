package Main_Package;
import java.util.Scanner;

//Main function - run menu:
public class Main {
	public static void main (String args[]) {
	//Initialization and var' declaration:
	String[] theTweets = getTweets.get100Tweets();	//get the last 100 tweets
	String[] stringArrayToPrint;
	//Loop over the menu:
	while (true) {
		System.out.println("Hello! Please select an option: "
				+ "1 - for Hashtag list, 2 - for Mention list, 3 - for word statistics. Any other key - to exit.");
		Scanner scanner = new Scanner(System.in);
		int userChoice = scanner.nextInt();
		switch (userChoice) { 
		//First case - call for hashtag and print:
		case 1: {
			stringArrayToPrint = getHashtagOrMention.getHashtagOrMentionList(theTweets, "#");	//get hashtag list
			stringMethods.printStringArray(stringArrayToPrint);									//print hashtag list
			break;
		}
		//Second case - call for mention and print:
		case 2: {
			stringArrayToPrint = getHashtagOrMention.getHashtagOrMentionList(theTweets, "@");	//get mention list
			stringMethods.printStringArray(stringArrayToPrint);									//print mention list
			break;
		}
		//Third case - get word stats:
		case 3: {
			//get word stats
			break;
		}
		//Default - close:
		default: {
			scanner.close();
			System.exit(0);
				}
			}
		}
	}
}