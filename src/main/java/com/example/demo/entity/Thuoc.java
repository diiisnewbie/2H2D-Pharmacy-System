package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "thuoc")
public class Thuoc {
    @Id
    @Column(name = "maThuoc")
    private String maThuoc;

    @Column(name = "tenThuoc")
    private String tenThuoc;

    @Column(name = "dangBaoChe")
    private String dangBaoChe;

    @Column(name = "quyCachDongGoi")
    private String quyCachDongGoi;

    @Column(name = "thanhPhan")
    private String thanhPhan;

    @Column(name = "chiDinhSuDung")
    private String chiDinhSuDung;

    @Column(name = "nhaSanXuat")
    private String nhaSanXuat;

    @Column(name = "quocGiaSanXuat")
    private String quocGiaSanXuat;

    @Column(name = "doiTuongSuDung")
    private String doiTuongSuDung;

    @Column(name = "ngaySanXuat")
    private Date ngaySanXuat;

    @Column(name = "hanSuDung")
    private Date hanSuDung;

    @Column(name = "moTaThuoc")
    private String moTaThuoc;

    @Column(name = "nhaCungCap")
    private String nhaCungCap;

    @Column(name = "giaThuoc")
    private double giaThuoc;

    @ManyToOne
    @JoinColumn(name="maViTRi")
    private ViTriSanPham viTriSanPham;

    @OneToMany(mappedBy = "thuoc",cascade = CascadeType.ALL)
    private List<ChiTietHoaDon> dsChiTietHoaDon;

    @OneToOne(mappedBy = "thuoc",cascade = CascadeType.ALL)
    private GiaBan giaBan;

    @ManyToOne
    @JoinColumn(name="maLoaiThuoc")
    private LoaiThuoc loaiThuoc;

    @OneToMany(mappedBy = "thuoc",cascade = CascadeType.ALL)
    private List<Thuoc_DonViTinh> dsThuoc_DonViTinh;

    @OneToMany(mappedBy = "thuoc", cascade = CascadeType.ALL)
    private List<KhoThuoc> dsKhoThuoc;
}
