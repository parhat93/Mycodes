package Days16Homeworks;
//String names[] ={"Erick", "Lisa", "Hose", "Roger", "Nina", "Ekaterina", "Peter", "Sara"};
//Create an array named namesLengthFour and store 
//elements from array names that have only four letters in the name.
//Use loop to go through elements in the array names. 
//Check how many letters each name contains.
//Store only names that have four letters in the array namesLengthFour.
public class WordsLengthFour {

	public static void main(String[] args) {
		String names[] = {"Erick", "Lisa", "Hose", "Roger", "Nina", "Ekaterina",
				"Peter", "Sara"};
		for (String z : names) {
			if (z.length() == 4) {
				String[] withFourletter = {z};
				for (int i = 0; i< withFourletter.length; i++) {
					System.out.println(withFourletter[i]);
				}

			}
		}

	}

}
