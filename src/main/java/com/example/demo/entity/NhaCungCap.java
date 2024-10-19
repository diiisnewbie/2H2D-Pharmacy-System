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
@Table(name = "NhaCungCap")
public class NhaCungCap {
    @Id
    @Column(name = "maNhaCungCap",columnDefinition = "NVARCHAR(50)",nullable = false)
    private String maNhaCungCap;
    
    @Column(name = "tenNhaCungCap",columnDefinition = "NVARCHAR(50)",nullable = false)
    private String tenNhaCungCap;

    @Column(name = "soDienThoai",columnDefinition = "NVARCHAR(15)",nullable = false)
    private String soDienThoai;

    @Column(name="diaChi",columnDefinition = "NVARCHAR(255)",nullable = false)
    private String diaChi;

    @Column(name = "email",columnDefinition = "NVARCHAR(100)",nullable = false)
    private String email;

    @OneToMany(mappedBy = "nhaCungCap",cascade = CascadeType.ALL)
    private List<PhieuNhap> dsPhieuNhap;


}
