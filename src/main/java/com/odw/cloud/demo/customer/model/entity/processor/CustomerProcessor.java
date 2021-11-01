package com.odw.cloud.demo.customer.model.entity.processor;

import com.odw.cloud.demo.customer.model.entity.Customer;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomerProcessor implements RepresentationModelProcessor<EntityModel<Customer>> {

    @Override
    public EntityModel<Customer> process(EntityModel<Customer> model) {
        return EntityModel.of(model.getContent());
    }
}
