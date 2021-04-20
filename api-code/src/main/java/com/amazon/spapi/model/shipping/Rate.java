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
import com.amazon.spapi.model.shipping.Currency;
import com.amazon.spapi.model.shipping.ServiceType;
import com.amazon.spapi.model.shipping.ShippingPromiseSet;
import com.amazon.spapi.model.shipping.Weight;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * The available rate that can be used to send the shipment
 */
@ApiModel(description = "The available rate that can be used to send the shipment")

public class Rate {
  @SerializedName("rateId")
  private String rateId = null;

  @SerializedName("totalCharge")
  private Currency totalCharge = null;

  @SerializedName("billedWeight")
  private Weight billedWeight = null;

  @SerializedName("expirationTime")
  private OffsetDateTime expirationTime = null;

  @SerializedName("serviceType")
  private ServiceType serviceType = null;

  @SerializedName("promise")
  private ShippingPromiseSet promise = null;

  public Rate rateId(String rateId) {
    this.rateId = rateId;
    return this;
  }

   /**
   * An identifier for the rate.
   * @return rateId
  **/
  @ApiModelProperty(value = "An identifier for the rate.")
  public String getRateId() {
    return rateId;
  }

  public void setRateId(String rateId) {
    this.rateId = rateId;
  }

  public Rate totalCharge(Currency totalCharge) {
    this.totalCharge = totalCharge;
    return this;
  }

   /**
   * The total charge that will be billed for the rate.
   * @return totalCharge
  **/
  @ApiModelProperty(value = "The total charge that will be billed for the rate.")
  public Currency getTotalCharge() {
    return totalCharge;
  }

  public void setTotalCharge(Currency totalCharge) {
    this.totalCharge = totalCharge;
  }

  public Rate billedWeight(Weight billedWeight) {
    this.billedWeight = billedWeight;
    return this;
  }

   /**
   * The weight that was used to calculate the totalCharge.
   * @return billedWeight
  **/
  @ApiModelProperty(value = "The weight that was used to calculate the totalCharge.")
  public Weight getBilledWeight() {
    return billedWeight;
  }

  public void setBilledWeight(Weight billedWeight) {
    this.billedWeight = billedWeight;
  }

  public Rate expirationTime(OffsetDateTime expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

   /**
   * The time after which the offering will expire.
   * @return expirationTime
  **/
  @ApiModelProperty(value = "The time after which the offering will expire.")
  public OffsetDateTime getExpirationTime() {
    return expirationTime;
  }

  public void setExpirationTime(OffsetDateTime expirationTime) {
    this.expirationTime = expirationTime;
  }

  public Rate serviceType(ServiceType serviceType) {
    this.serviceType = serviceType;
    return this;
  }

   /**
   * Get serviceType
   * @return serviceType
  **/
  @ApiModelProperty(value = "")
  public ServiceType getServiceType() {
    return serviceType;
  }

  public void setServiceType(ServiceType serviceType) {
    this.serviceType = serviceType;
  }

  public Rate promise(ShippingPromiseSet promise) {
    this.promise = promise;
    return this;
  }

   /**
   * Get promise
   * @return promise
  **/
  @ApiModelProperty(value = "")
  public ShippingPromiseSet getPromise() {
    return promise;
  }

  public void setPromise(ShippingPromiseSet promise) {
    this.promise = promise;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rate rate = (Rate) o;
    return Objects.equals(this.rateId, rate.rateId) &&
        Objects.equals(this.totalCharge, rate.totalCharge) &&
        Objects.equals(this.billedWeight, rate.billedWeight) &&
        Objects.equals(this.expirationTime, rate.expirationTime) &&
        Objects.equals(this.serviceType, rate.serviceType) &&
        Objects.equals(this.promise, rate.promise);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rateId, totalCharge, billedWeight, expirationTime, serviceType, promise);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rate {\n");
    
    sb.append("    rateId: ").append(toIndentedString(rateId)).append("\n");
    sb.append("    totalCharge: ").append(toIndentedString(totalCharge)).append("\n");
    sb.append("    billedWeight: ").append(toIndentedString(billedWeight)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    promise: ").append(toIndentedString(promise)).append("\n");
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

