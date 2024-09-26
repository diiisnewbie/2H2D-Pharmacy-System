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
@Table(name = "chietkhau")
public class ChietKhau {
    @Id
    @Column(name = "maChietKhau")
    private String maChietKhau;

    @Column(name = "soLuong")
    private int soLuong;
    @Column(name = "giaTriChietKhau")
    private float giaTriChietKhau;

    @Column(name = "ngayBatDauApDung")
    private LocalDate ngayBatDauApDung;

    @Column(name = "ngayKetThucApDung")
    private LocalDate ngayKetThucApDung;

    @ManyToOne
    @JoinColumn(name = "maNhanVien")
    private NhanVien nhanVien;

    @OneToMany(mappedBy = "chietKhau",cascade = CascadeType.ALL)
    private List<HoaDon> dsHoaDon;
}
