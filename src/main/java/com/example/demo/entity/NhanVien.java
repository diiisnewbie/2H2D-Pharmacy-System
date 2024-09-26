package com.example.demo.entity;

import java.time.LocalDate;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
@Table(name = "nhanvien")
public class NhanVien {
    @Id
    @Column(name = "maNhanVien")
    private String maNhanVien;

    @Column(name = "tenNhanVien")
    private String tenNhanVien;

    @Column(name = "email")
    private String email;

    @Column(name = "gioiTinh")
    private boolean gioiTinh;

    @Column(name = "soDienThoai")
    private String soDienThoai;
    
    @Column(name = "vaiTro")
    private VaiTro vaiTro;  

    @Column(name = "ngaySinh")
    private LocalDate ngaySinh;

    @Column(name = "cccd")
    private String cccd;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "maTaiKhoan")
    private TaiKhoan taiKhoan;

    @OneToMany(mappedBy = "nhanVien",cascade = CascadeType.ALL)
    private List<ChietKhau> dsChietKhau;

    @OneToMany(mappedBy = "nhanVien", cascade = CascadeType.ALL)
    private List<HoaDon> dsHoaDon;

}
