package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "taikhoan")
public class TaiKhoan {
    @Id
    @Column(name = "maTaiKhoan")
    private String maTaiKhoan;

    @Column(name = "tenDangNhap")
    private String tenDangNhap;

    @Column(name = "matKhau")
    private String matKhau;

    @Column(name = "trangThaiTaiKhoan")
    private boolean trangThaiTaiKhoan;

    @OneToOne(mappedBy = "taiKhoan", cascade = CascadeType.ALL)
    private NhanVien nhanVien;

}
