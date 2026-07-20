package Properties.inheritance;

public class BoxWeight extends Box { //extends the property of box class
    double weight;

    public BoxWeight(){
        this.weight=-1;
    }

    public BoxWeight(double l,double h,double w,double weight){
        super(l,h,w);//what is this? call the parents class constructor
        //used to initialize value present in parents class
        this.weight=weight;
    }
}
