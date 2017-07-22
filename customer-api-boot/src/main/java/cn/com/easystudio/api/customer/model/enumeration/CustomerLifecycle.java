package cn.com.easystudio.api.customer.model.enumeration;

import java.util.HashMap;
import java.util.Map;

public enum CustomerLifecycle {
    EX_CUSTOMER(101933L), CUSTOMER(101466L), PROSPECT(166L);

    private static Map<Long, CustomerLifecycle> map = new HashMap<>();
    private final Long value;

    CustomerLifecycle(Long value) {
        this.value = value;
    }

    public static CustomerLifecycle getCustomerLifecycle(Long value) {
        return map.get(value);
    }

    static {
        for (CustomerLifecycle customerLifecycle : CustomerLifecycle.values()) {
            map.put(customerLifecycle.value, customerLifecycle);
        }
    }

    public Long getValue() {
        return value;
    }
}
