package codegym.case_study_spring.model;

import org.springframework.stereotype.Controller;

import javax.persistence.*;

@Entity
@Table( name = "furama")
public class FuramaDichVu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column( name = "tendichvu")
    private String tenDichVu;
    @Column( name = "dientich")
    private int dienTich;
    @Column( name = "soTang")
    private int soTang;
    @Column( name = "songuoitoida")
    private int soNguoiToiDa;
    @Column( name = "chiphithue")
    private int chiPhiThue;
    @Column(name = "trangthai")
    private String trangThai;
    @Column(name = "kieuthue_id")
    private int kieuThueId;

    @ManyToOne
    @JoinColumn(name = "loaidichvu")
    private FuramaLoaiDichVu furamaLoaiDichVu;

    public FuramaDichVu() {
    }

    public FuramaDichVu(String tenDichVu, int dienTich, int soTang, int soNguoiToiDa, int chiPhiThue, String trangThai, int kieuThueId, FuramaLoaiDichVu furamaLoaiDichVu) {
        this.tenDichVu = tenDichVu;
        this.dienTich = dienTich;
        this.soTang = soTang;
        this.soNguoiToiDa = soNguoiToiDa;
        this.chiPhiThue = chiPhiThue;
        this.trangThai = trangThai;
        this.kieuThueId = kieuThueId;
        this.furamaLoaiDichVu = furamaLoaiDichVu;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    public int getSoNguoiToiDa() {
        return soNguoiToiDa;
    }

    public void setSoNguoiToiDa(int soNguoiToiDa) {
        this.soNguoiToiDa = soNguoiToiDa;
    }

    public int getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(int chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public int getKieuThueId() {
        return kieuThueId;
    }

    public void setKieuThueId(int kieuThueId) {
        this.kieuThueId = kieuThueId;
    }

    public FuramaLoaiDichVu getFuramaLoaiDichVu() {
        return furamaLoaiDichVu;
    }

    public void setFuramaLoaiDichVu(FuramaLoaiDichVu furamaLoaiDichVu) {
        this.furamaLoaiDichVu = furamaLoaiDichVu;
    }
}
