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
import java.util.List;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "PhieuNhap")
public class PhieuNhap {
    @Id
    @Column(name = "maPhieuNhap",columnDefinition = "NVARCHAR(50)",nullable = false)
    private String maPhieuNhap;

    @Column(name = "trangThaiPhieuNhap",nullable = false)
    private boolean trangThaiPhieuNhap;

    @Column(name = "ngayTao",nullable = false)
    private LocalDate ngayTao;

    @Column(name = "tongTien",nullable = false)
    private double tongTien;

    @ManyToOne
    @JoinColumn(name = "maNhanVien",nullable = false)
    private NhanVien nhanVien;

    @ManyToOne
    @JoinColumn(name = "maNhaCungCap",nullable = false)
    private NhaCungCap nhaCungCap;

    @OneToMany(mappedBy = "maPhieuNhap",cascade = CascadeType.ALL)
    private List<ChiTietPhieuNhap> dsChiTietPhieuNhap;
}
