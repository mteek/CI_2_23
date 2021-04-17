package com.tts;

import java.util.Collection;

public interface OrderRepository {

	Collection<EntityModel<Order>> findAll();

	Object findById(Long id);

	Order save(Order order);

}
