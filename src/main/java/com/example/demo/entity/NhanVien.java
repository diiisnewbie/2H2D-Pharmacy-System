package com.example.demo.entity;

import java.time.LocalDate;
import java.util.List;


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

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "NhanVien")
public class NhanVien {
    @Id
    @Column(name = "maNhanVien",columnDefinition = "NVARCHAR(50)")
    private String maNhanVien;

    @Column(name = "tenNhanVien",columnDefinition = "NVARCHAR(50)")
    private String tenNhanVien;

    @Column(name = "email",columnDefinition = "NVARCHAR(100)")
    private String email;

    @Column(name = "gioiTinh",nullable = false)
    private boolean gioiTinh;

    @Column(name = "soDienThoai",columnDefinition = "NVARCHAR(15)")
    private String soDienThoai;
    
    @Column(name = "vaiTro",nullable = false)
    private VaiTro vaiTro;  

    @Column(name = "ngaySinh",nullable = false)
    private LocalDate ngaySinh;

    @Column(name = "cccd",columnDefinition = "NVARCHAR(12)")
    private String cccd;
    
    @OneToOne(mappedBy = "nhanVien",cascade = CascadeType.ALL)
    private TaiKhoan taiKhoan;

    @OneToMany(mappedBy = "nhanVien", cascade = CascadeType.ALL)
    private List<HoaDon> dsHoaDon;

    @OneToMany(mappedBy = "nhanVien",cascade = CascadeType.ALL)
    private List<PhieuNhap> dsPhieuNhap;

}
