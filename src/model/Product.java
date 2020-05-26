package model;

public class Product {
    int id;
    String tenSP;
    int gia;
    int soLuong;
    String mauSac;
    String moTa;
    int idDM;
    String TenDanhMuc;

    public Product() {
    }

    public Product(int id, String tenSP, int gia, int soLuong, String mauSac, String moTa) {
        this.id = id;
        this.tenSP = tenSP;
        this.gia = gia;
        this.soLuong = soLuong;
        this.mauSac = mauSac;
        this.moTa = moTa;
    }

    public Product(int id, String tenSP, int gia, int soLuong, String mauSac, String moTa, String TenDanhMuc) {
        this.id = id;
        this.tenSP = tenSP;
        this.gia = gia;
        this.soLuong = soLuong;
        this.mauSac = mauSac;
        this.moTa = moTa;
        this.TenDanhMuc = TenDanhMuc;
    }

    public Product(int id, String tenSP, int gia, int soLuong, String mauSac, String moTa, int idDM) {
        this.id = id;
        this.tenSP = tenSP;
        this.gia = gia;
        this.soLuong = soLuong;
        this.mauSac = mauSac;
        this.moTa = moTa;
        this.idDM = idDM;
    }

    public int getIdDM() {
        return idDM;
    }

    public void setIdDM(int idDM) {
        this.idDM = idDM;
    }

    public String getTenDanhMuc() {
        return TenDanhMuc;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        TenDanhMuc = tenDanhMuc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

}
