package AccessControl;

public class objectDemo {

    public objectDemo(int num) {
        this.num = num;
    }

    int num;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    static void main(String[] args) {
        objectDemo obj = new objectDemo(34);
        System.out.println(obj.hashCode());
    }
}
