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
@Table(name = "ChietKhau")
public class ChietKhau {
    @Id
    @Column(name = "maChietKhau", columnDefinition = "NVARCHAR(50)",nullable = false)
    private String maChietKhau;

    @Column(name = "soLuong",nullable = false)
    private int soLuong;

    @Column(name = "giaTriChietKhau",nullable = false)
    private double giaTriChietKhau;

    @Column(name = "ngayBatDauApDung",nullable = false)
    private LocalDate ngayBatDauApDung;

    @Column(name = "ngayKetThucApDung",nullable = false)
    private LocalDate ngayKetThucApDung;

    @Column(name = "trangThaiChietKhau",nullable = false)
    private boolean trangThaiChietKhau;

    @Column(name = "moTa", columnDefinition = "NVARCHAR(255)",nullable = true)
    private String moTa;

    @OneToMany(mappedBy = "chietKhau",cascade = CascadeType.ALL)
    private List<HoaDon> dsHoaDon;
}
