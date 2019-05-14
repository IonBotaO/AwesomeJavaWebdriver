import org.testng.annotations.Test;

public class Day1 {

    @Test
    public void testMethod(){
        System.out.println("Hello world!");
    }

    @Test
    public void testMethod2() {

        int myNumber;
        myNumber = 5;
        System.out.println(myNumber);
    }

    @Test
    public void test003() {
        float f = (float) 4.5;
        System.out.println(f);
    }

    @Test
    public void test004() {
        char c = 'g';

        String s2 = "who who who!";
        String s3 = "who let whe dogs out?";

        System.out.println(s2 + s3);
    }

    @Test
    public void test005() {
        int num = 4;
        String s = "I have " + num + " cookies";
        System.out.println(s);
    }

    @Test
    public void test006() {
        boolean b = false;
        b = true;

        boolean toBe = false;
        b = toBe || !toBe;
        System.out.println(b);
    }

    @Test
    public void test007() {
        boolean ifElementIsPresented = true;
        if (ifElementIsPresented == false) {
            System.out.println("is true");
        } else {
            System.out.println("is false");
        }
    }

    @Test
    public void test008() {
        int [] arrayOfInteger = new int[] {8, 6, 58, 33, 4};
        for(int i = 0; i< arrayOfInteger.length; i++){
                int arrayMember = arrayOfInteger[i];
            System.out.println(arrayMember);
        }
    }

    @Test
    public void test009() throws Exception{
        int [] array;

        array = new int[10];
        array[0] =4;
        array[1] =6;
        array[2] =8;

        String messageStart = "a[]= ";
        String messageEnd = " i=";

        int i = 1;
        System.out.println(messageStart + array[i] + messageEnd + i);
    }

    @Test
    public void test010() throws Exception {
        String [] arrayOfStrings = {"String1", "String2", "String3"};

        System.out.println(arrayOfStrings[2]);
    }


}
