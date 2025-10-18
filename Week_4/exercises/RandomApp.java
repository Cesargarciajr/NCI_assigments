public class RandomApp{
    public static void main(String[] args){
        //var
        int randomNum;
        String result;

        //object
        Random random = new Random();

        //input
        randomNum=(int)(Math.random() * 20); //casting the *8Double** to an **Integer**

        //set
        random.setRandomNum(randomNum);

        //compute
        random.compareRandomNum();

        //get
        result = random.getResult();

        //output
        System.out.println("The random number generated was " +randomNum);
        System.out.println(result);
    }
}
