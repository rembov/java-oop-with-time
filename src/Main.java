import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Vremya vr = new Vremya();
        Scanner vhod = new Scanner(System.in);
        System.out.print("Введи что надо узнать: ");
        String a = vhod.nextLine();
        vhod.close();
        switch (a) {
            case "день года":
                vr.dengoda();
                break;
            case "день недели":
                vr.DenNedeli();
                break;
            case "год":
                vr.year();
                break;
            case "дата":
                vr.getDatatoday();
                break;
            case "время":
                vr.timeoclock();
                break;
            case "выход":
                break;

        }
    }
}