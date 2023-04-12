public class SanhCuoi {
    private String maSanh;
    private String tenSanh;
    private String viTriSanh;
    private int sucChua;

    public SanhCuoi(String maSanh, String tenSanh, String viTriSanh, int sucChua) {
        this.maSanh = maSanh;
        this.tenSanh = tenSanh;
        this.viTriSanh = viTriSanh;
        this.sucChua = sucChua;
    }

    public String getMaSanh() {

        return maSanh;
    }

    public void setMaSanh(String maSanh) {
        this.maSanh = maSanh;
    }

    public String getTenSanh() {
        return tenSanh;
    }

    public void setTenSanh(String tenSanh) {
        this.tenSanh = tenSanh;
    }

    public String getViTriSanh() {
        return viTriSanh;
    }

    public void setViTriSanh(String viTriSanh) {
        this.viTriSanh = viTriSanh;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    @Override
    public String toString() {
        return String.format("Ma sanh: %s\nTen sanh: %s\nVi tri sanh: %s\nSuc chua: %d ban\n", maSanh, tenSanh, viTriSanh, sucChua);
    }
}
