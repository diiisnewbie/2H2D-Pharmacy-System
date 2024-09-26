package com.example.demo.entity;

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
@Table(name = "vitrisanpham")
public class ViTriSanPham {
    @Id
    @Column(name = "maViTri")
    private String maViTri;

    @Column(name = "viTri")
    private String viTri;


    @OneToMany(mappedBy = "viTriSanPham",cascade = CascadeType.ALL)
    private List<SanPham> dsSanPham;

    @OneToMany(mappedBy = "viTriSanPham",cascade = CascadeType.ALL)
    private List<Thuoc> dsThuoc;

}
