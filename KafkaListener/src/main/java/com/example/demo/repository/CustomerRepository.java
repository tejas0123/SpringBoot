package com.example.demo.repository;




import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.example.demo.entity.CustomerOrder;


public interface CustomerRepository extends ElasticsearchRepository<CustomerOrder, String>{

	

	

}
