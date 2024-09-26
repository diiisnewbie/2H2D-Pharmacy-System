package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.TaiKhoan;

public interface AccountDAO {
    public void save(List<TaiKhoan> accounts);
}
