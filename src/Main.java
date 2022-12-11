import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
/*        Path pathToDiscover = Paths.get(".");
        FileSystemDiscoveryService service = new FileSystemDiscoveryService();
        service.findAllFilePaths(pathToDiscover);
        System.out.println("=================================");
        service.findAllFilePathsWithRecursion(pathToDiscover);*/
/*        for (int i = 0; i < 10; i++) {
            int result = fibonacciShit(i);
            System.out.println(result);
        }*/
        int whenDoWeRunOut = 0;
        try {
            whenDoWeRunOut = stupdShit(0);
        }catch (StackOverflowError e){
            System.out.println(whenDoWeRunOut);
        }

    }


    public static int stupdShit(int number){
        System.out.println(number);
        List<String> memoryFiller = new ArrayList<>(10000000);
        for (double i = 0; i < 10000000; i++) {
            memoryFiller.add("nem csinalok soha ilyet");
        }
        stupdShit(number + 1);
        return number + 1;
    }


    public static int calcualteFactorial(int number){
        if(number == 1){
            return 1;
        }
        System.out.println("well shit i dunno \n" +
                "result is: " + number + "* " +  (number - 1) );
        return number * calcualteFactorial(number - 1);
    }

    public static int fibonacciShit(int number){
        if(number == 0){
            return 0;
        }
        if(number == 1){
            return 1;
        }
        return fibonacciShit(number - 1) + fibonacciShit(number - 2);
    }
}