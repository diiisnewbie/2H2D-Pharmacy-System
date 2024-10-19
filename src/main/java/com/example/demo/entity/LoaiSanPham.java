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
@Table(name = "LoaiSanPham")
public class LoaiSanPham {
    @Id
    @Column(name = "maLoaiSanPham",columnDefinition = "NVARCHAR(50)",nullable = false)
    private String maLoaiSanPham;

    @Column(name = "tenLoaiSanPham",columnDefinition = "NVARCHAR(50)",nullable = false)
    private String tenLoaiSanPham;

    @OneToMany(mappedBy = "loaiSanPham",cascade = CascadeType.ALL)
    private List<SanPham> dsSanPham;
}
