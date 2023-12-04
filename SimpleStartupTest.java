public class SimpleStartupTest {
    public static void main(String[] args) {
        SimpleStartup dot = new SimpleStartup();
        int [] loation = {2,3,4};
        dot.setLocationcells(loation);
        int userGuess = 2;
        String result = dot.checkYourself(userGuess);

    }

}
