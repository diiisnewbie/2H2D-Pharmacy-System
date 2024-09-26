package com.example.demo.entity;

public enum PhuongThucThanhToan {
    TIENMAT(0),
    VNPAY(1);

    private int value;

    PhuongThucThanhToan(int value){
        this.value = value;
    }

    public static PhuongThucThanhToan fromPhuongThucThanhToan(int value){
        return value == 1 ? VNPAY : TIENMAT;
    }
}
