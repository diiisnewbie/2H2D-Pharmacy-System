package com.example.demo.entity;

import java.time.LocalDate;

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
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "ChiTietPhieuNhap")
public class ChiTietPhieuNhap {

    @Column(name = "soLo",columnDefinition = "NVARCHAR(50)",nullable = false)
    private String soLo;

    @Column(name = "soLuong",nullable = false)
    private int soLuong;

    @Column(name = "giaNhap",nullable = false)
    private double giaNhap;

    @Column(name = "donViTinh", columnDefinition = "NVARCHAR(50)",nullable = false)
    private String donViTinh;

    @Column(name = "hanSuDung",nullable = false)
    private LocalDate hanSuDung;

    @Column(name = "thanhTien",nullable = false)
    private double thanhTien;
    
    @Column(name = "ngaySanXuat",nullable = false)
    private LocalDate ngaySanXuat;
    
    @Id
    @ManyToOne
    @JoinColumn(name = "maPhieuNhap",columnDefinition = "NVARCHAR(50)",nullable = false)
    private PhieuNhap maPhieuNhap;

    @Id
    @ManyToOne
    @JoinColumn(name = "maSanPham",columnDefinition = "NVARCHAR(50)",nullable = false)
    private SanPham maSanPham;


}
