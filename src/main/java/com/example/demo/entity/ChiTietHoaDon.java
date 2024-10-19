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
@Table(name = "ChiTietHoaDon")
public class ChiTietHoaDon {
    @Id
    @ManyToOne
    @JoinColumn(name = "maHoaDon",columnDefinition = "NVARCHAR(50)",nullable = false)
    private HoaDon maHoaDon;

    @Id
    @ManyToOne
    @JoinColumn(name = "maSanPham",columnDefinition = "NVARCHAR(50)",nullable = false)
    private SanPham maSanPham;

    @Column(name = "soLuong",nullable = false)
    private int soLuong;

    @Column(name = "tongTien",nullable = false)
    private double tongTien;


}
