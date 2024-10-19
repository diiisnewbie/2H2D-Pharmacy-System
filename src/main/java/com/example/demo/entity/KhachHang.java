package com.example.demo.entity;
import java.time.LocalDate;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name = "KhachHang")
public class KhachHang {
    @Id
    @Column(name = "maKhachHang",columnDefinition = "NVARCHAR(50)",nullable = false)
    private String maKhachHang;

    @Column(name = "hoTen",columnDefinition = "NVARCHAR(50)",nullable = false)
    private String hoTen;

    @Column(name = "soDienThoai",columnDefinition = "NVARCHAR(15)",nullable = false)
    private String soDienThoai;

    @Column(name = "ngaySinh",nullable = false)
    private LocalDate ngaySinh;

    @Column(name = "diemTichLuy",nullable = false)
    private int diemTichLuy;

    @Column(name = "gioiTinh",nullable = false)
    private boolean gioiTinh;

    @OneToMany(mappedBy = "khachHang", cascade = CascadeType.ALL)
    private List<HoaDon> dsHoaDon;
}
