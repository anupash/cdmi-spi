/*
 * Copyright 2016 Karlsruhe Institute of Technology (KIT)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 */

package org.indigo.cdmi;

import java.util.Map;

final public class CdmiObjectStatus {

  final private Status status;
  final private String currentCapabilitiesUri;
  final private String targetCapabilitiesUri;
  final private Map<String, String> monitoredAttributes;

  public CdmiObjectStatus(Status status, Map<String, String> monitoredAttributes,
      String currentCapabilitiesUri, String targetCapabilitiesUri) {
    this.status = status;
    this.monitoredAttributes = monitoredAttributes;
    this.currentCapabilitiesUri = currentCapabilitiesUri;
    this.targetCapabilitiesUri = targetCapabilitiesUri;
  }

  public Status getStatus() {
    return status;
  }

  public String getCurrentCapabilitiesUri() {
    return currentCapabilitiesUri;
  }

  public String getTargetCapabilitiesUri() {
    return targetCapabilitiesUri;
  }

  public Map<String, String> getMonitoredAttributes() {
    return monitoredAttributes;
  }

  @Override
  public String toString() {
    return "CdmiObjectStatus [" + (status != null ? "status=" + status + ", " : "")
        + (currentCapabilitiesUri != null
            ? "currentCapabilitiesUri=" + currentCapabilitiesUri + ", " : "")
        + (targetCapabilitiesUri != null ? "targetCapabilitiesUri=" + targetCapabilitiesUri + ", "
            : "")
        + (monitoredAttributes != null ? "monitoredAttributes=" + monitoredAttributes : "") + "]";
  }
}
