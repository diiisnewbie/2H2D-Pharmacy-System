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
@Table(name = "loaithuoc")
public class LoaiThuoc {
    @Id
    @Column(name = "maLoaiThuoc")
    private String maLoaiThuoc;

    @Column(name = "tenLoaiThuoc")
    private String tenLoaiThuoc;

    @OneToMany(mappedBy = "loaiThuoc",cascade = CascadeType.ALL)
    private List<Thuoc> dsThuoc;
}
