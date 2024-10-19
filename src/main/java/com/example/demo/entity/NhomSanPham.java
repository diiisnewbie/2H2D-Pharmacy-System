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
@Table(name = "NhomSanPham")
public class NhomSanPham {
    @Id
    @Column(name = "maNhomSanPham",columnDefinition = "NVARCHAR(50)",nullable = false)
    private String maNhomSanPham;

    @Column(name = "tenNhomSanPham",columnDefinition = "NVARCHAR(50)",nullable = false)
    private String tenNhomSanPham;

    @OneToMany(mappedBy = "nhomSanPham",cascade = CascadeType.ALL)
    private List<SanPham> dsSanPham;
}
