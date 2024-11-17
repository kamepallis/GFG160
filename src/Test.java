import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test {
    static public void main(String[] args) {
        System.out.println("Hi");

    }
}

class Test1{
    final int a;
    Test1(int a) throws FileNotFoundException {
        this.a =a;
    }
    Test1() throws FileNotFoundException {
        this.a = 100;
    }
    public void display() throws FileNotFoundException {
        System.out.println(a);
        //a= 24;
        PrintWriter writer = null;
        try{
            writer= new PrintWriter(new File("test.txt"));
            writer.println("Hello World");
        } finally {
            if(writer != null) {
                writer.close();
            }
        }
    }



}