package initAndCleanup;

/**
 * Created by H.J
 * 2018/5/21
 */
class Bowl{
    Bowl(int market){
        System.out.println("Bowl(" + market + ")");
    }
    void f1(int market){
        System.out.println("f1(" + market + ")");
    }
}

class Table{
    static Bowl bowl1 = new Bowl(1);
    Table(){
        System.out.println("Table()");
        bowl2.f1(1);
    }
    void f2(int market){
        System.out.println("f2(" + market + ")");
    }
    static Bowl bowl2 = new Bowl(2);
}

class Cupboard{
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);
    Cupboard(){
        System.out.println("Cupboard()");
        bowl4.f1(2);
    }
    void f3(int market){
        System.out.println("f3(" + market + ")");
    }
    static Bowl bowl5 = new Bowl(5);
}

public class StaticInitialization {
    public static void main(String[] args){
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }
    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}
