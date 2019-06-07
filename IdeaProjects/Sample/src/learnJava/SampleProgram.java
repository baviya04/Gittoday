package learnJava;

public class SampleProgram {

    int a = 6;
    int b=7;


    public static void main(String[] args) {

        SampleProgram sampleProgram = new SampleProgram();

        int cVal = sampleProgram.add();

        System.out.println(cVal);

    }

    public int add()
    {

        int c = a +b;

        return c;
    }

    public int sub()
    {

        int c = a - b;

        return  c;
    }


}
