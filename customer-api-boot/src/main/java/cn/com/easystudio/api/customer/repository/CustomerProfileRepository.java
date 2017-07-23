package cn.com.easystudio.api.customer.repository;

import cn.com.easystudio.api.customer.entity.CustomerProfile;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerProfileRepository extends PagingAndSortingRepository<CustomerProfile, Long>, JpaSpecificationExecutor<CustomerProfile> {
    CustomerProfile findOneByCustomerProfileIdAndBrandId(Long id, String name);
}
