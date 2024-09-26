package com.example.demo.entity;

import java.util.List;


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

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "donvitinh")
public class DonViTinh {
    @Id
    @Column(name = "maDonViTinh")
    private String maDonViTinh;

    @Column(name = "ten")
    private String ten;

    @OneToMany(mappedBy = "donViTinh",cascade = CascadeType.ALL)
    private List<Thuoc_DonViTinh> dsThuoc_DonViTinh;

    @OneToMany(mappedBy = "donViTinh", cascade = CascadeType.ALL)
    private List<KhoThuoc> dsKhoThuoc;

    @OneToMany(mappedBy = "donViTinhCha", cascade = CascadeType.ALL)
    private List<DonViTinh> dsDonViTinhCha;

    @ManyToOne
    @JoinColumn(name = "maDonViTinhCha")
    private DonViTinh donViTinhCha;
}
