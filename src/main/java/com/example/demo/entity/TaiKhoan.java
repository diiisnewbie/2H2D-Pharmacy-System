package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
@Table(name = "TaiKhoan")
public class TaiKhoan {
    @Id
    @Column(name = "maTaiKhoan",columnDefinition = "NVARCHAR(50)",nullable = false)
    private String maTaiKhoan;

    @Column(name = "tenDangNhap",columnDefinition = "NVARCHAR(50)",nullable = false)
    private String tenDangNhap;

    @Column(name = "matKhau",columnDefinition = "NVARCHAR(255)",nullable = true)
    private String matKhau;

    @Column(name = "trangThaiTaiKhoan",nullable = false)
    private boolean trangThaiTaiKhoan;

    @OneToOne
    @JoinColumn(name = "maNhanVien",nullable = false)
    private NhanVien nhanVien;


}
