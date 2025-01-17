/*
 * Selling Partner API for Shipping
 * Provides programmatic access to Amazon Shipping APIs.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.shipping;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.shipping.AcceptedRate;
import com.amazon.spapi.model.shipping.Address;
import com.amazon.spapi.model.shipping.ContainerList;
import com.amazon.spapi.model.shipping.Party;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The shipment related data.
 */
@ApiModel(description = "The shipment related data.")

public class Shipment {
  @SerializedName("shipmentId")
  private String shipmentId = null;

  @SerializedName("clientReferenceId")
  private String clientReferenceId = null;

  @SerializedName("shipFrom")
  private Address shipFrom = null;

  @SerializedName("shipTo")
  private Address shipTo = null;

  @SerializedName("acceptedRate")
  private AcceptedRate acceptedRate = null;

  @SerializedName("shipper")
  private Party shipper = null;

  @SerializedName("containers")
  private ContainerList containers = null;

  public Shipment shipmentId(String shipmentId) {
    this.shipmentId = shipmentId;
    return this;
  }

   /**
   * Get shipmentId
   * @return shipmentId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getShipmentId() {
    return shipmentId;
  }

  public void setShipmentId(String shipmentId) {
    this.shipmentId = shipmentId;
  }

  public Shipment clientReferenceId(String clientReferenceId) {
    this.clientReferenceId = clientReferenceId;
    return this;
  }

   /**
   * Get clientReferenceId
   * @return clientReferenceId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getClientReferenceId() {
    return clientReferenceId;
  }

  public void setClientReferenceId(String clientReferenceId) {
    this.clientReferenceId = clientReferenceId;
  }

  public Shipment shipFrom(Address shipFrom) {
    this.shipFrom = shipFrom;
    return this;
  }

   /**
   * Get shipFrom
   * @return shipFrom
  **/
  @ApiModelProperty(required = true, value = "")
  public Address getShipFrom() {
    return shipFrom;
  }

  public void setShipFrom(Address shipFrom) {
    this.shipFrom = shipFrom;
  }

  public Shipment shipTo(Address shipTo) {
    this.shipTo = shipTo;
    return this;
  }

   /**
   * Get shipTo
   * @return shipTo
  **/
  @ApiModelProperty(required = true, value = "")
  public Address getShipTo() {
    return shipTo;
  }

  public void setShipTo(Address shipTo) {
    this.shipTo = shipTo;
  }

  public Shipment acceptedRate(AcceptedRate acceptedRate) {
    this.acceptedRate = acceptedRate;
    return this;
  }

   /**
   * Get acceptedRate
   * @return acceptedRate
  **/
  @ApiModelProperty(value = "")
  public AcceptedRate getAcceptedRate() {
    return acceptedRate;
  }

  public void setAcceptedRate(AcceptedRate acceptedRate) {
    this.acceptedRate = acceptedRate;
  }

  public Shipment shipper(Party shipper) {
    this.shipper = shipper;
    return this;
  }

   /**
   * Get shipper
   * @return shipper
  **/
  @ApiModelProperty(value = "")
  public Party getShipper() {
    return shipper;
  }

  public void setShipper(Party shipper) {
    this.shipper = shipper;
  }

  public Shipment containers(ContainerList containers) {
    this.containers = containers;
    return this;
  }

   /**
   * Get containers
   * @return containers
  **/
  @ApiModelProperty(required = true, value = "")
  public ContainerList getContainers() {
    return containers;
  }

  public void setContainers(ContainerList containers) {
    this.containers = containers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Shipment shipment = (Shipment) o;
    return Objects.equals(this.shipmentId, shipment.shipmentId) &&
        Objects.equals(this.clientReferenceId, shipment.clientReferenceId) &&
        Objects.equals(this.shipFrom, shipment.shipFrom) &&
        Objects.equals(this.shipTo, shipment.shipTo) &&
        Objects.equals(this.acceptedRate, shipment.acceptedRate) &&
        Objects.equals(this.shipper, shipment.shipper) &&
        Objects.equals(this.containers, shipment.containers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipmentId, clientReferenceId, shipFrom, shipTo, acceptedRate, shipper, containers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shipment {\n");
    
    sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
    sb.append("    clientReferenceId: ").append(toIndentedString(clientReferenceId)).append("\n");
    sb.append("    shipFrom: ").append(toIndentedString(shipFrom)).append("\n");
    sb.append("    shipTo: ").append(toIndentedString(shipTo)).append("\n");
    sb.append("    acceptedRate: ").append(toIndentedString(acceptedRate)).append("\n");
    sb.append("    shipper: ").append(toIndentedString(shipper)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

