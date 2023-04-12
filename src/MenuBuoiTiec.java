import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuBuoiTiec {
    private List<DoAnUong> doAnUong = new ArrayList<>();

    public MenuBuoiTiec(DoAnUong... doAnUong) {
        this.doAnUong.addAll(Arrays.asList(doAnUong));
    }

    public List<DoAnUong> getDoAnUong() {
        return doAnUong;
    }

    public double tinhGia() {
        return doAnUong.stream().map(dau -> dau.getGia()).reduce(new Double(0.0), (sum, gia) -> sum += gia);
    }


}
