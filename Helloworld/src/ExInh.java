
class Poly{
    void display() {
        System.out.println("no arg");
    }
    void display(int a) {
        System.out.println(" one arg");
    }
    void display(int  a,float b) {
        System.out.println("two arg of int");
    }
    void display(float a,float b) {
        System.out.println("two arg with float");
    }
    
}
public class ExInh{
    public static void main(String[] args) {
        Poly p=new Poly();
        p.display(2.0f,3);
    }
}