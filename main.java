import java.util.Scanner;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимой операции: ");
        System.out.println("1 - Добавить новую игрушку");
        System.out.println("2 - Поменять вес игрушки");
        System.out.println("3 - Организовать розыгрыш игрушек");
        
        int what = in.nextInt();
        if (what==1) {
            Toys.addNewToy();         
        } 
        if (what==2) {
            Toys.changeProbability();
        }
        if (what==3) {
            Lottery.draw();
        }
        in.close();
    }
}
