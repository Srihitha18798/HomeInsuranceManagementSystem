package com.cg.hims.repository;

import com.cg.hims.entities.Property;

public interface IPropertyRepository {

	public Property addProperty(Property property);

	public Property viewProperty();

}
