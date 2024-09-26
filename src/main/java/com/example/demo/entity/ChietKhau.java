package com.example.demo.entity;

import java.time.LocalDate;

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
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "chietkhau")
public class ChietKhau {
    @Id
    @Column(name = "maGiamGia")
    private String maGiamGia;

    @Column(name = "soLuong")
    private int soLuong;

    @Column(name = "giaTriChietKhau")
    private float giaTriChietKhau;

    @Column(name = "ngayBatDauApDung")
    private LocalDate ngayBatDauApDung;

    @Column(name = "ngayKetThucApDung")
    private LocalDate ngayKetThucApDung;

    @Column(name = "trangThaiChietKhau")
    private boolean trangThaiChietKhau;

    @Column(name = "moTa")
    private String moTa;

    @OneToMany(mappedBy = "chietKhau",cascade = CascadeType.ALL)
    private List<HoaDon> dsHoaDon;
}
