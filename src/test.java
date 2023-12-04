
public class test {
    public int a ;
    public int b;
    public int add(int a, int b ){
        this.a =a;
        this.b=b;
return a+b;
    }
    public static void main(String[] args) {
        test t =new test();
       int c=  t.add(5,6);

        System.out.println("a = "+t.a +"b =" +t.b);
System.out.println("result is "+c);



    }
}