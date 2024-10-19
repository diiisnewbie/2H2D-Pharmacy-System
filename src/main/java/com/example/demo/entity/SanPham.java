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
@Table(name = "SanPham")
public class SanPham {
    @Id
    @Column(name = "maSanPham",columnDefinition = "NVARCHAR(50)")
    private String maSanPham;

    @Column(name = "tenSanPham",columnDefinition = "NVARCHAR(255)")
    private String tenSanPham;

    @Column(name = "quyCachDongGoi",columnDefinition = "NVARCHAR(50)",nullable = true)
    private String quyCachDongGoi;

    @Column(name = "thanhPhan",columnDefinition = "NVARCHAR(255)",nullable = true)
    private String thanhPhan;

    @Column(name = "dangBaoChe",columnDefinition = "NVARCHAR(50)",nullable = true)
    private String dangBaoChe;

    @Column(name = "nhaSanXuat",columnDefinition = "NVARCHAR(50)")
    private String nhaSanXuat;

    @Column(name = "quocGiaSanXuat",columnDefinition = "NVARCHAR(50)")
    private String quocGiaSanXuat;

    @Column(name = "doiTuongSuDung",columnDefinition = "NVARCHAR(255)",nullable = false)
    private String doiTuongSuDung;

    @Column(name = "moTaSanPham",columnDefinition = "NVARCHAR(255)",nullable = true)
    private String moTaSanPham;

    @Column(name = "donGia",nullable = false)
    private double donGia;

    @Column(name = "soLuong",nullable = false)
    private int soLuong;

    @Column(name = "chiDinhSuDung",nullable = false)
    private ChiDinhSuDung chiDinhSuDung;

    @Column(name = "hamLuong",columnDefinition = "NVARCHAR(50)",nullable = true)
    private String hamLuong;

    @Column(name = "duongDung",columnDefinition = "NVARCHAR(20)",nullable = true)
    private String duongDung;

    @OneToMany(mappedBy = "maSanPham",cascade = CascadeType.ALL)
    private List<ChiTietHoaDon> dsChiTietHoaDon;

    @OneToMany(mappedBy = "maSanPham",cascade = CascadeType.ALL)
    private List<ChiTietPhieuNhap> dsChiTietPhieuNhap;

    @ManyToOne
    @JoinColumn(name = "maDonViTinh",nullable = false)
    private DonViTinh donViTinh;

    @ManyToOne
    @JoinColumn(name = "maLoaiSanPham",nullable = false)
    private LoaiSanPham loaiSanPham;

    @ManyToOne
    @JoinColumn(name = "maNhomSanPham",nullable = false)
    private NhomSanPham nhomSanPham;
    
}
