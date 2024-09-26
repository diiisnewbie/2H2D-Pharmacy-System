package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
@Table(name = "giaban")
public class GiaBan {
    @Id
    @Column(name = "maGiaBan")
    private String maGiaBan;

    @Column(name = "giaBan")
    private double giaBan;

    private final float VAT = 0.05f;

    @OneToOne
    @JoinColumn(name = "maThuoc")
    private Thuoc thuoc;

    @OneToOne
    @JoinColumn(name = "maSanPham")
    private SanPham sanPham;
}
