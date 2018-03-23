package com.purcell.repo;

import com.purcell.domain.Staff;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StaffRepository extends PagingAndSortingRepository<Staff,Integer> {
}
