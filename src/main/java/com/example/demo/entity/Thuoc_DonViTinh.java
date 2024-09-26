package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "thuoc_donvitinh")
public class Thuoc_DonViTinh {
    @Id
    @Column(name="maThuoc_DonViTinh")
    private String maThuoc_DonViTinh;

    @Column(name = "soLuongQuyDoi")
    private int soLuongQuyDoi;

    @ManyToOne
    @JoinColumn(name="maThuoc")
    private Thuoc thuoc;

    @ManyToOne
    @JoinColumn(name="maDonViTinh")
    private DonViTinh donViTinh;
}
