/*class P1{

}

class P2{

}

class P3 extends P1,P2{

}*/


interface I1{
    public void m1();

}

interface I2{

    public void m1();

}

class I1AndI2Impl implements I1,I2{

    @Override
    public void m1() {
        System.out.println("m1 method is implemented");
    }


}



public class MultipleInheritanceTest {
    public static void main(String[] args) {
        I2 i= new I1AndI2Impl();
        i.m1();
    }
}
