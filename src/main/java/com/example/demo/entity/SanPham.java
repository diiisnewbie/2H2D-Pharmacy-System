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

import java.util.List;
import java.time.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "sanpham")
public class SanPham {
    @Id
    @Column(name = "maSanPham")
    private String maSanPham;

    @Column(name = "tenSanPham")
    private String tenSanPham;

    @Column(name = "quyCachDongGoi")
    private String quyCachDongGoi;

    @Column(name = "nhaSanXuat")
    private String nhaSanXuat;

    @Column(name = "quocGiaSanXuat")
    private String quocGiaSanXuat;

    @Column(name = "doiTuongSuDung")
    private String doiTuongSuDung;

    @Column(name = "hanSuDung")
    private LocalDate hanSuDung;

    @Column(name = "ngaySanXuat")
    private LocalDate ngaySanXuat;

    @Column(name = "moTaSanPham")
    private String moTaSanPham;

    @Column(name = "nhaCungCap")
    private String nhaCungCap;

    @Column(name = "giaSanPham")
    private float giaSanPham;

    @Column(name = "soLuong")
    private int soLuong;

    @OneToMany(mappedBy = "sanPham",cascade = CascadeType.ALL)
    private List<ChiTietHoaDon> dsChiTietHoaDon;

    @ManyToOne
    @JoinColumn(name = "maViTri")
    private ViTriSanPham viTriSanPham;

    @OneToOne(mappedBy = "sanPham",cascade = CascadeType.ALL)
    private GiaBan giaBan;
}
