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
@Table(name = "hoadon")
public class HoaDon {
    @Id
    @Column(name = "maHoaDon")
    private String maHoaDon;

    @Column(name = "trangThaiHoaDon")
    private boolean trangThaiHoaDon;

    @Column(name = "ngayTao")
    private LocalDate ngayTao;

    @Column(name = "tongGiaTriHoaDon")
    private float tongGiaTriHoaDon;

    @Column(name = "tienDaGiam")
    private float tienDaGiam;

    @Column(name = "tongTienThanhToan")
    private float tongTienThanhToan;

    @Column(name="tongTienKhachTra")
    private float tongTienKhachTra;

    @Column(name = "phuongThucThanhToan")
    private PhuongThucThanhToan phuongThucThanhToan;

    @Column(name = "tongTienTraLai")
    private float tongTienTraLai;
    
    @ManyToOne
    @JoinColumn(name = "maNhanVien")
    private NhanVien nhanVien;

    @OneToMany(mappedBy = "hoaDon",cascade = CascadeType.ALL)
    private List<ChiTietHoaDon>  dsChiTietHoaDon;

    @ManyToOne
    @JoinColumn(name = "maChietKhau")
    private ChietKhau chietKhau;
}
