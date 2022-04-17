class MyClass extends Thread{
 public void run(){
   System.out.println("Hello All");
 }
}
public class MultiThread{
 public static void main(String[] args){
    MyClass t=new MyClass();
    MyClass t1=new MyClass();
    MyClass t2=new MyClass();
    MyClass t3=new MyClass();
    MyClass t4=new MyClass();
    t.start();
    t1.start();
    t2.start();
    t3.start();
    t4.start();
 }
}
