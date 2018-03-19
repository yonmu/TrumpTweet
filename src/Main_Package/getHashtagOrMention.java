package Main_Package;

public class getHashtagOrMention {
	public static String[] getHashtagOrMentionList(String [] allTweets, String type) {
		//Initialization and declaration:
		String[] hashtagMentionList = new String[256];
		int hashtagMentionIndex = 0;
		//First loop - over all 100 tweets:
		for (int i=0; i<100; i++) {	
			//Count hashtag\mentions in current tweet:
			int countHorM = stringMethods.getNumOfHorM(allTweets[i], type);
			//Second loop - in each tweet - over each hashtag or mention (HorM) :
			for (int j=0; j<countHorM; j++) {
				int typeIndex = allTweets[i].indexOf(type);										//get #\@ location in string
				String currentTweetHorM = allTweets[i].substring(typeIndex + 1); 				//start string with hashtag or mention
			    if(currentTweetHorM.contains(" "))												//end string after hashtag or mention
			    	currentTweetHorM = currentTweetHorM.substring(0, currentTweetHorM.indexOf(' ')); 
				hashtagMentionList[hashtagMentionIndex] = currentTweetHorM;						//send hashtag or mention to array
				hashtagMentionIndex++;															//move forward
				allTweets[i] = allTweets[i].substring(typeIndex+1); 							//search tweet again after previous hashtag or mention
			}
		}
		return hashtagMentionList;
	}
}