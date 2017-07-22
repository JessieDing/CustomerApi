package cn.com.easystudio.api.customer.model.enumeration;

import java.io.Serializable;

public final class Brand implements Serializable {
    public static final Brand PICC = new Brand("PICC");//人保
    public static final Brand PINGAN = new Brand("PINGAN");//平安
    public static final Brand CHINALIFE = new Brand("CHINALIFE");//人寿
    public static final Brand CPIC = new Brand("CPIC");//太平洋
    public static final Brand CIC = new Brand("CIC");//中华联合
    public static final Brand CCIC = new Brand("CCIC");//大地
    public static final Brand SINOSIG = new Brand("SINOSIG");//阳光
    public static final Brand TAIPING = new Brand("TAIPING");//太平

    private String value;

    public Brand() {
        value = "";
    }

    public Brand(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String name() {
        return value;
    }

    /* of 方法，静态引用*/
    public static Brand of(String value) {
        return new Brand(value);
    }

    @Override
    public boolean equals(Object o){
        if (this==o){
            return true;
        }
        if (o==null||getClass()!=o.getClass()){
            return false;
        }
        Brand brand =(Brand) o;
        return !(value!=null ? !value.equals(brand.value) : brand.value!=null);
    }

    @Override
    public int hashCode(){
        return value!=null?value.hashCode():0;
    }
}
