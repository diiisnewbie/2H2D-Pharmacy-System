package com.example.demo.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "chitiethoadon")
public class ChiTietHoaDon {
    @Id
    @Column(name = "maChiTietHoaDon")
    private String maChiTietHoaDon;

    @Column(name = "soLuong")
    private int soLuong;

    @Column(name = "gia")
    private double gia;

    @Column(name = "tongTien")
    private float tongTien;

    @ManyToOne
    @JoinColumn(name = "maSanPham")
    private SanPham sanPham;

    @ManyToOne
    @JoinColumn(name = "maHoaDon")
    private HoaDon hoaDon;

    @ManyToOne
    @JoinColumn(name = "maThuoc")
    private Thuoc thuoc;

}
