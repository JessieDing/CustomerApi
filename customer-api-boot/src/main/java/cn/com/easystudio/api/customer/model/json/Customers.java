package cn.com.easystudio.api.customer.model.json;

import java.util.ArrayList;
import java.util.List;

public class Customers {
    private List<CustomerData> customerDatas = new ArrayList<>();

 /*   public Customers(List<CustomerData> customerDatas) {
        this.customerDatas = customerDatas;
    }*/

    public List<CustomerData> getCustomerDatas() {
        return customerDatas;
    }

    public void setCustomerDatas(List<CustomerData> customerDatas) {
        this.customerDatas = customerDatas;
    }
}
