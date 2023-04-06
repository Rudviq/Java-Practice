public class Complex {

    int real,img;

    public Complex(int r, int i){
        this.real = r;
        this.img = i;
    }

    public void printComplex(){
        System.out.println(this.real+"+"+this.img+"i");
    }

    public static Complex AddComplexNumber(Complex a1, Complex a2){
        Complex res =  new Complex(0,0);

        res.real = a1.real + a2.real;
        res.img = a1.img + a2.img;
        return res;
    }


    public static void main(String args[]){
//        Complex a1,a2;
        Complex a1 = new Complex(1,2);
        Complex a2 = new Complex(3,4);

        System.out.println("First Complex number");

        a1.printComplex();

        System.out.println("Second Complex number");
        a2.printComplex();

        Complex res = AddComplexNumber(a1,a2);
        res.printComplex();

    }
}
