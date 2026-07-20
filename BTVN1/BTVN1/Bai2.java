import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap a: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap b: ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap c: ");
        int c = Integer.parseInt(scanner.nextLine());

        if (a + b > c || b + c > a || c + a > b) {
            if (a == b && b == c) {
                System.out.println("La tam giac deu");
            } else if (a == b && b == c && c == a) {
                System.out.println("La tam giac can");
            } else {
                System.out.println("La tam giac thuong");
            }
            double chuvi =(double) (a+b+c);
            double p = chuvi / 2;
            double dientich = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.printf("Chu vi tam giac la: %.2f%n", chuvi);
            System.out.printf("Dien tich tam giac la: %.2f%n", dientich);
        } else {
            System.out.println("Khong phai la mot tam giac");
        }
        scanner.close();
    }
}
