package com.example.demo.oop.domain;

/**
 * packageName   :   com.example.demo.phone
 * fileName      :   GalPhone
 * author        :   JeongMyeongHong
 * date          :   2022-02-08
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-08      JeongMyoengHong     최초 생성
 */
public class GalPhone extends IPhone {
    public final static String KIND = "갤럭시";
    private String pay;

    public GalPhone(String company) {
        super(company);
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return String.format("%s 에서 만든 %s 제품을 사용해서 %s로 결제한다.",
                super.getCompany(), KIND, pay);
    }
}
