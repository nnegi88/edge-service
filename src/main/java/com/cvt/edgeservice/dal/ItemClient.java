package com.cvt.edgeservice.dal;

import com.cvt.edgeservice.model.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("item-catalog-service")
public interface ItemClient{
	@GetMapping("/items")
    Resources<Item> readItems();
}
