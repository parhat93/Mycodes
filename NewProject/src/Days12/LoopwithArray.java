package Days12;

public class LoopwithArray {

	public static void main(String[] args) {
		String[] animal = new String[26];
		
		animal[0] = "giraffe";
		animal[1] = "crocodile";
		animal[2] = "dog";
		animal[3] = "fox";
		animal[4] = "bear";
		animal[5] = "cat";
		animal[6] = "bird";
		animal[7] = "rabbit";
		animal[8] = "sheep";
		animal[9] = "kuala";
		animal[10] = "cow";
		animal[11] = "donkey";
		animal[12] = "elephant";
		animal[13] = "duck";
		animal[14] = "polar bear";
		animal[15] = "hippopotamus";
		animal[16] = "frog";
		animal[17] = "mouse";
		animal[18] = "goat";
		animal[19] = "hedgehog";
		animal[20] = "skunk";
		animal[21] = "monkey";
		animal[22] = "lion";
		animal[23] = "panda";
		animal[24] = "pig";
		animal[25] = "penguin";
		// find of how many item in the array.

		int lengthOfArray = animal.length;

		System.out.println(lengthOfArray);

		int index = 0;

		while (index < lengthOfArray) { // while (index < 26)

			System.out.println(animal[index]);
			index++;
		}
	}

}
