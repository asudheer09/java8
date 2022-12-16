class A {
    int a;
    A(int a) {
        this.a = a;
        System.out.println("A's object created and a value is "+a);
    }
}

class B extends A {

    int x ;
    int y;

    B() {
        super(10);
        System.out.println("B's object created");
    }

    B(int x, int y){
        super(20);
        this.x=x;
        this.y=y;
        System.out.println("B's object created using parameterized x and y are "+x+" "+y);
    }

}


public class SuperUse {
    public static void main(String[] args) {
        B b= new B(10,20);

    }
}
