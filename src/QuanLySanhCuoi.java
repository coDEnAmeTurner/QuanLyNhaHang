import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuanLySanhCuoi {
    private List<SanhCuoi> dsSanhCuoi = new ArrayList<>();

    public void themSanh(SanhCuoi... sanhCuois) {
        dsSanhCuoi.addAll(Arrays.asList(sanhCuois));
    }

    public SanhCuoi traCuuSanh(String maSanh) {
        return dsSanhCuoi.stream().filter(sanh -> sanh.getMaSanh() == maSanh).findFirst().get();
    }

    public void capNhatSanh(String maSanh) {
        SanhCuoi canCapNhat = traCuuSanh(maSanh);
        System.out.print("Cap nhat ten sanh: "); canCapNhat.setTenSanh(Chung.sc.nextLine());
        System.out.print("Cap nhat vi tri: "); canCapNhat.setViTriSanh(Chung.sc.nextLine());
        System.out.print("Cap nhat suc chua (so ban): "); canCapNhat.setSucChua(Chung.sc.nextInt());
    }

    public List<SanhCuoi> getDsSanhCuoi() {
        return dsSanhCuoi;
    }

    public void setDsSanhCuoi(List<SanhCuoi> dsSanhCuoi) {
        this.dsSanhCuoi = dsSanhCuoi;
    }
}
