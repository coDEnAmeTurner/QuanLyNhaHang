import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.stream.DoubleStream;

public class ChoThueSanh {
    private String tenBuoiTiec;
    private SanhCuoi sanhThue;
    private double donGiaThueSanh;
    private ThoiDiemThue thoiDiemThue;
    private Calendar ngayThue;
    private List<MenuBuoiTiec> listMenu = new ArrayList<>();
    private double donGiaMenu;
    private List<DichVu> listDV = new ArrayList<>();
    private double donGiaDV;

    public ChoThueSanh(String tenBuoiTiec, SanhCuoi sanhThue, double donGiaThueSanh, ThoiDiemThue thoiDiemThue,
                       Calendar ngayThue, List<MenuBuoiTiec> listMenu, List<DichVu> listDV) {
        this.tenBuoiTiec = tenBuoiTiec;
        this.sanhThue = sanhThue;
        this.donGiaThueSanh = donGiaThueSanh;
        this.thoiDiemThue = thoiDiemThue;
        this.ngayThue = ngayThue;
        this.listMenu = listMenu;
        this.listDV = listDV;
        this.donGiaMenu = listMenu.stream().map(menu -> menu.tinhGia()).reduce(new Double(0.0), (giaListMenu, giaMenu) -> giaListMenu += giaMenu);
        this.donGiaDV = listDV.stream().map(dichVu -> dichVu.getGiaDV()).reduce(new Double(0.0), (giaListDV, giaDV) -> giaListDV += giaDV);
    }

    public void themMenu(MenuBuoiTiec... menus) {
        listMenu.addAll(Arrays.asList(menus));
    }

    public void themDV(DichVu... dichVus) {
        listDV.addAll((Arrays.asList(dichVus)));
    }

    public void xuatHoaDon() {
        System.out.printf("Gia thue sanh: ", donGiaThueSanh);
        System.out.printf("Tong gia menu: ", donGiaMenu);
        System.out.printf("Gia thue sanh: ", donGiaDV);
    }

    public String getTenBuoiTiec() {
        return tenBuoiTiec;
    }

    public void setTenBuoiTiec(String tenBuoiTiec) {
        this.tenBuoiTiec = tenBuoiTiec;
    }

    public SanhCuoi getSanhThue() {
        return sanhThue;
    }

    public void setSanhThue(SanhCuoi sanhThue) {
        this.sanhThue = sanhThue;
    }

    public double getDonGiaThueSanh() {
        return donGiaThueSanh;
    }

    public void setDonGiaThueSanh(double donGiaThueSanh) {
        this.donGiaThueSanh = donGiaThueSanh;
    }

    public ThoiDiemThue getThoiDiemThue() {
        return thoiDiemThue;
    }

    public void setThoiDiemThue(ThoiDiemThue thoiDiemThue) {
        this.thoiDiemThue = thoiDiemThue;
    }

    public Calendar getNgayThue() {
        return ngayThue;
    }

    public void setNgayThue(Calendar ngayThue) {
        this.ngayThue = ngayThue;
    }

    public List<MenuBuoiTiec> getListMenu() {
        return listMenu;
    }

    public void setListMenu(List<MenuBuoiTiec> listMenu) {
        this.listMenu = listMenu;
    }

    public double getDonGiaMenu() {
        return donGiaMenu;
    }

    public void setDonGiaMenu(double donGiaMenu) {
        this.donGiaMenu = donGiaMenu;
    }

    public List<DichVu> getListDV() {
        return listDV;
    }

    public void setListDV(List<DichVu> listDV) {
        this.listDV = listDV;
    }

    public double getDonGiaDV() {
        return donGiaDV;
    }

    public void setDonGiaDV(double donGiaDV) {
        this.donGiaDV = donGiaDV;
    }
}
