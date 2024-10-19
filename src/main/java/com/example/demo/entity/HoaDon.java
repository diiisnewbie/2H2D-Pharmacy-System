package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "HoaDon")
public class HoaDon {
    @Id
    @Column(name = "maHoaDon",columnDefinition = "NVARCHAR(50)",nullable = false)
    private String maHoaDon;

    @Column(name = "trangThaiHoaDon",nullable = false)
    private boolean trangThaiHoaDon;

    @Column(name = "ngayTao",nullable = false)
    private LocalDate ngayTao;

    @Column(name = "tongGiaTriHoaDon",nullable = false)
    private double tongGiaTriHoaDon;

    @Column(name = "tienDaGiam",nullable = false)
    private double tienDaGiam;

    @Column(name = "tongTienThanhToan",nullable = false)
    private double tongTienThanhToan;

    @Column(name="tongTienKhachTra",nullable = false)
    private double tongTienKhachTra;

    @Column(name = "tongTienTraLai",nullable = false)
    private double tongTienTraLai;

    @Column(name = "phuongThucThanhToan")
    private PhuongThucThanhToan phuongThucThanhToan;

    private final double VAT = 0.08;
    
    @ManyToOne
    @JoinColumn(name = "maNhanVien")
    private NhanVien nhanVien;

    @OneToMany(mappedBy = "maHoaDon",cascade = CascadeType.ALL)
    private List<ChiTietHoaDon>  dsChiTietHoaDon;

    @ManyToOne
    @JoinColumn(name = "maChietKhau")
    private ChietKhau chietKhau;

    @ManyToOne
    @JoinColumn(name = "maKhachHang")
    private KhachHang khachHang;
}
