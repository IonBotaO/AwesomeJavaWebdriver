public class MyClass {

    public MyClass(String param){
        //I can do some additional staff here
        System.out.println("Constructor with param:" + param);

    }

    public MyClass(){
        System.out.println("Constructor with no param");
    }

    public void print() {
        System.out.println("printed");
    }

    public String print(String parameterValue) {
        String result;
        result = parameterValue + " printed";
        return result;
    }

}
