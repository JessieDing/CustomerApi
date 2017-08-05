package cn.com.easystudio.api.customer.repository;

import cn.com.easystudio.api.customer.entity.Individual;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IndividualRepository extends PagingAndSortingRepository<Individual, Long>, JpaSpecificationExecutor<Individual> {
    List<Individual> findAllByFirstName(String firstName);
}
