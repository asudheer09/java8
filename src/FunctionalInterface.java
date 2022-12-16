import java.io.Serializable;

interface Repository{
    public  abstract int add(int a, int b);
}

class RepositoryImpl implements  Repository, Serializable,Cloneable {

    @Override
    public int add(int a, int b) {
        return a+b;
    }
}

//RepositoryImpl.class --->

public class FunctionalInterface {
    public static void main(String[] args) {
        //Repository repository= (a,b)->{return a+b;};
        Repository repository= new RepositoryImpl();
        int c=repository.add(10,20);
        System.out.println(c);
    }
}
