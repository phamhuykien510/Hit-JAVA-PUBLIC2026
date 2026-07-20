import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mật khẩu: ");
        String matKhau = scanner.nextLine();

        matKhau = matKhau.trim();

        boolean coChuSo = false;
        boolean coChuHoa = false;

        for (int i = 0; i < matKhau.length(); i++) {
            char kyTu = matKhau.charAt(i);

            if (kyTu >= '0' && kyTu <= '9') {
                coChuSo = true;
            }
            if (kyTu >= 'A' && kyTu <= 'Z') {
                coChuHoa = true;
            }
        }

        boolean hopLe = true;
        if (matKhau.length() < 8) {
            hopLe = false;
        }
        if (!coChuSo) {
            hopLe = false;
        }
        if (!coChuHoa) {
            hopLe = false;
        }
        if (hopLe) {
            System.out.println("Mật khẩu hợp lệ!");
        } else {
            System.out.println("Mật khẩu không hợp lệ!");

            if (matKhau.length() < 8) {
                System.out.println("- Mật khẩu phải có độ dài tối thiểu là 8 ký tự (Độ dài hiện tại sau khi cắt khoảng trắng: "
                        + matKhau.length() + ").");
            }
            if (!coChuSo) {
                System.out.println("- Mật khẩu phải chứa ít nhất 1 chữ số.");
            }
            if (!coChuHoa) {
                System.out.println("- Mật khẩu phải chứa ít nhất 1 chữ cái viết hoa.");
            }
        }

        scanner.close();
    }
}
