public class XeMay{
    String  hang;
    String DongXe;
    Float gia;
    Integer DongCo;
    Integer TocDoHienTai;
    Boolean DangChay;
    public XeMay(String hang, String DongXe, Float gia, Integer DongCo) {
        this.hang = hang;
        this.DongXe = DongXe;
        this.gia = gia;
        this.DongCo = DongCo;
        this.TocDoHienTai = 0;
        this.DangChay = false;
    }
    public void bat(){
        this.TocDoHienTai = 10;
        System.out.println("xe chay");
    }
    public void tat(){
        this.TocDoHienTai = 0;
        System.out.println("xe dung");
    }
    public void Thaydoitocdo(int tocdo){
        this.TocDoHienTai = tocdo;
        System.out.println("Thay doi toc do:" + tocdo);
    }
    public void chuyentrangthai(){
        if (this.TocDoHienTai == 0)
        {
//            this.DangChay = false ;
            System.out.println("Chuyen qua trang thai dung yen");
        }else {
//            this.DangChay = true;
            System.out.println("Chuyen qua trang thai quay");
        }
    }
    @Override
    public String toString() {
        return "XeMay{" +
                "hang='" + hang + '\'' +
                ", DongXe='" + DongXe + '\'' +
                ", gia=" + gia +
                ", DongCo=" + DongCo +
                ", TocDoHienTai=" + TocDoHienTai +
                ", DangChay=" + DangChay +
                '}';
    }
    public static void main(String[] args) {
        XeMay XeMay3 = new XeMay("HonDa,", "TayGa", 999999.f, 175);
        XeMay3.bat();
        XeMay3.Thaydoitocdo(0);
        XeMay3.chuyentrangthai();
        System.out.println(XeMay3);
    }
}
