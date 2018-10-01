import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        Animal theDog = new Animal();

        System.out.println("The animal is named " + theDog.getName());

        System.out.println(Animal.printNumbers(100));

        Animal.countTo(100);

        Animal.guessMyNumber();

        // An array is a fixed series of boxes that contain multiple values of the same data type
        // How you create arrays
        // int[] favoriteNumbers;
        // favoriteNumbers = new int[20];

        int[] favoriteNumbers = new int[20];

        favoriteNumbers[0] = 100;

        String[] stringArray = {"Random", "Words", "Here"};

        // for(dataType[] varForRow : arrayName)
        for(String word : stringArray) {

            System.out.println(word);

        }

        // This is a multidimensional array
        String[][][] arrayName = { { { "000" }, { "100" }, { "200" }, { "300" } },
                { { "010" }, { "110" }, { "210" }, { "310" } },
                { { "020" }, { "120" }, { "220" }, { "320" } }};

        for(int i = 0; i < arrayName.length; i++)
        {
            for(int j = 0; j < arrayName[i].length; j++)
            {

                for(int k = 0; k < arrayName[i][j].length; k++)
                {
                    System.out.print("| " + arrayName[i][j][k] + " ");

                }
            }

            System.out.println("|");

        }

        // You can copy an array (stringToCopy, indexes to copy)
        String[] cloneOfArray = Arrays.copyOf(stringArray, 3);

        // You can print out the whole array
        System.out.println(Arrays.toString(cloneOfArray));

        // Returns the index or a negative number
        System.out.println(Arrays.binarySearch(cloneOfArray, "Random"));

    }
}
