package Main_Package;

public class stringMethods {
	//Method to get number of hashtags or mentions in current tweet:
	static int getNumOfHorM(String currentTweet, String type) {
		int lastIndex = 0, countHorM = 0;
		while(lastIndex != -1){
		    lastIndex = currentTweet.indexOf(type,lastIndex);
		    if(lastIndex != -1){
		        countHorM ++;
		        lastIndex += type.length();
		    }
		}
		return countHorM;
	}
	//Print method - iterate and print until null:
	public static void printStringArray (String[] arrayToPrint) {
		for (int i = 0; i< arrayToPrint.length; i++) {
			if (arrayToPrint[i] == null)
				break;
			System.out.println(arrayToPrint[i]);
			}	
	}
}