import java.util.Scanner;


public class ComplexNumbers {

    int real,img;

    public ComplexNumbers(int r, int i){
        this.real = r;
        this.img = i;
    }

    public static ComplexNumbers addComplexNumbers(ComplexNumbers c1, ComplexNumbers c2){
        ComplexNumbers c3 = new ComplexNumbers(0,0);
        c3.real = c2.real + c1.real;
        c3.img =  c2.img + c1.img;
        return c3;
    }

    public static ComplexNumbers subComplexNumbers(ComplexNumbers c1, ComplexNumbers c2){
        ComplexNumbers c3 = new ComplexNumbers(0,0);
        c3.real = c2.real - c1.real;
        c3.img =  c2.img - c1.img;
        return c3;
    }

    public static int mulComplexNumbers(ComplexNumbers c1, ComplexNumbers c2){
//        ComplexNumbers c3 = new ComplexNumbers(0,0);
        int num;
        num = c2.real*c1.real - c2.img*c1.img + c1.real*c2.img + c2.real*c1.img;
//        c3.img =  c2.img - c1.img;
        return num;
    }

    public void printValues(){
        System.out.println(this.real + "+" + this.img + "i");
    }
    public static void main(String[] args) {
        ComplexNumbers c1 = new ComplexNumbers(1,2);
        ComplexNumbers c2 = new ComplexNumbers(3,4);
//        ComplexNumbers c3 = new ComplexNumbers(0,0);

        while(true){
            System.out.println("Choose any of the operations to proceed:\n");
            System.out.println("1. Addition of Complex numbers\n2. Subtraction of Complex numbers \n3. Multiplication of Complex numbers\n");
            System.out.println("Enter your choice:");

//            int choice;
            Scanner myObj = new Scanner(System.in);
            int choice = myObj.nextInt();

            switch (choice){
                case 1:

                    ComplexNumbers c3= addComplexNumbers(c1,c2);
                    c3.printValues();
                    break;

                case 2:
                    ComplexNumbers c4= subComplexNumbers(c1,c2);
                    c4.printValues();
                    break;

                case 3:
                    int res;
                    res = mulComplexNumbers(c1,c2);
                    System.out.println("Multiplication of complex numbers is "+ res);
            }
            System.out.println("Do you want to continue(Y/N):");
            char con = myObj.next().charAt(0);

            if(con == 'Y'){
                continue;
            }
            else{
                break;
            }


        }

    }
}
