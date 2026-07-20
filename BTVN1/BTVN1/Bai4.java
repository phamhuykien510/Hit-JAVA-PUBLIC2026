import java.util.Scanner;
public class Bai4 {
    public static double timDiemCaoNhat(double[] diemHocSinh) {
        double diemCaoNhat = diemHocSinh[0];
        for (int i = 1; i < diemHocSinh.length; i++) {
            if (diemHocSinh[i] > diemCaoNhat) {
                diemCaoNhat = diemHocSinh[i];
            }
        }
        return diemCaoNhat;
    }
    public static double tinhDiemTrungBinh(double[] diemHocSinh) {
        double tongDiem = 0;
        for (int i = 0; i < diemHocSinh.length; i++) {
            tongDiem += diemHocSinh[i];
        }
        return tongDiem / diemHocSinh.length;
    }

    public static int demHocSinhDuoiTrungBinh(double[] diemHocSinh) {
        int soLuong = 0;
        for (double diem : diemHocSinh) {
            if (diem < 5.0) {
                soLuong++;
            }
        }
        return soLuong;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng học sinh: ");
        int soLuongHocSinh = Integer.parseInt(scanner.nextLine());
        double[] diemHocSinh = new double[soLuongHocSinh];
        for (int i = 0; i < soLuongHocSinh; i++) {
            do {
                System.out.print("Nhập điểm học sinh thứ " + (i + 1) + ": ");
                diemHocSinh[i] = Double.parseDouble(scanner.nextLine());
                if (diemHocSinh[i] < 0 || diemHocSinh[i] > 10) {
                    System.out.println("Điểm không hợp lệ! Vui lòng nhập lại.");
                }
            } while (diemHocSinh[i] < 0 || diemHocSinh[i] > 10);
        }
        double diemCaoNhat = timDiemCaoNhat(diemHocSinh);
        double diemTrungBinh = tinhDiemTrungBinh(diemHocSinh);
        int soHocSinhDuoiTrungBinh = demHocSinhDuoiTrungBinh(diemHocSinh);

        System.out.println("Điểm cao nhất: " + diemCaoNhat);
        System.out.printf("Điểm trung bình lớp: %.2f\n", diemTrungBinh);
        System.out.println("Số học sinh có điểm dưới trung bình (< 5.0): " + soHocSinhDuoiTrungBinh);

        scanner.close();
    }
}
