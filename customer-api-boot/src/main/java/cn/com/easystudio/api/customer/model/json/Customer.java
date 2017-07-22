package cn.com.easystudio.api.customer.model.json;

public class Customer {
    //    private CustomerData data = new CustomerData();
    private Long id;
    private String name;

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    public Customer(CustomerData input) {
//        data = input;
//    }
//
//    public CustomerData getData() {
//        return data;
//    }
//
//    public void setData(CustomerData data) {
//        this.data = data;
//    }
}
