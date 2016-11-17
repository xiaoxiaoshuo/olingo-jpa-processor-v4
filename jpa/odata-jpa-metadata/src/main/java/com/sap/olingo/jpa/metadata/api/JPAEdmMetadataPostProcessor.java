package com.sap.olingo.jpa.metadata.api;

import com.sap.olingo.jpa.metadata.core.edm.mapper.extention.IntermediateNavigationPropertyAccess;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extention.IntermediatePropertyAccess;

public abstract class JPAEdmMetadataPostProcessor {

  public abstract void processNavigationProperty(final IntermediateNavigationPropertyAccess property,
      final String jpaManagedTypeClassName);

  /**
   * 
   * @param property
   * @param jpaManagedTypeClassName
   * @return
   */
  // TODO Documentation
  public abstract void processProperty(final IntermediatePropertyAccess property, final String jpaManagedTypeClassName);
}