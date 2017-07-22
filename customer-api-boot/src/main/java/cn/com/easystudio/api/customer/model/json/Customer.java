package cn.com.easystudio.api.customer.model.json;

public class Customer {
    private CustomerData data = new CustomerData();

    public Customer() {
    }

    public Customer(CustomerData input) {
        data = input;
    }

    public CustomerData getData() {
        return data;
    }

    public void setData(CustomerData data) {
        this.data = data;
    }
}
