package Nested;

public class A {
    //nested interfaces
    public interface nestedEnterFace{
        boolean isOdd(int num);
    }
}

class B implements A.nestedEnterFace{
    @Override
    public boolean isOdd(int num) {
        return (num & 1)==1;//checking odd number
    }
}
