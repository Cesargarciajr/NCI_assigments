import java.util.concurrent.TimeUnit;
public class BottlesOfBeersSong {
    public static void main (String[] args){
        //loop
        for (int bottles = 99; bottles >= 1; bottles--) {
            //variable that calculates bottles -1 to display on the second print
            int nextBottleWord = bottles - 1;

            //conditional that will check counter in order to print the correct string
            if (nextBottleWord > 0){
                System.out.println("🎶 "+bottles+" bottles of beer on the wall, "+bottles+" bottles of beer. 🎶");
                System.out.println("🎶 Take one down and pass it around, "+nextBottleWord+" bottles of beer on the wall. 🎶\n")
            } else {
                System.out.println("🎶 "+bottles+" bottles of beer on the wall, "+bottles+" bottles of beer. 🎶");
            }
        }

        // After the loop print those final strings
        System.out.println("Take one down and pass it around, no more bottles of beer on the wall. 🎶\n");
        System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
        System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall. 🎶\n");
        System.out.println("   .~~~~.     .~~~~.\n" + //
                         "  _i====i     i====i_\n" + //
                        " (_|cccc|     |cccc|_)\n" + //
                        "   |cccc|     |cccc|\n" + //
                        "   `-==-‘     ‘-==-’\n" + //
                        "");
    }
}
