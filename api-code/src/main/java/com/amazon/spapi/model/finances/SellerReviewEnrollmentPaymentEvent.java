/*
 * Selling Partner API for Finances
 * The Selling Partner API for Finances helps you obtain financial information relevant to a seller's business. You can obtain financial events for a given order, financial event group, or date range without having to wait until a statement period closes. You can also obtain financial event groups for a given date range.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.finances;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.finances.ChargeComponent;
import com.amazon.spapi.model.finances.Currency;
import com.amazon.spapi.model.finances.FeeComponent;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A fee payment event for the Early Reviewer Program.
 */
@ApiModel(description = "A fee payment event for the Early Reviewer Program.")

public class SellerReviewEnrollmentPaymentEvent {
  @SerializedName("PostedDate")
  private String postedDate = null;

  @SerializedName("EnrollmentId")
  private String enrollmentId = null;

  @SerializedName("ParentASIN")
  private String parentASIN = null;

  @SerializedName("FeeComponent")
  private FeeComponent feeComponent = null;

  @SerializedName("ChargeComponent")
  private ChargeComponent chargeComponent = null;

  @SerializedName("TotalAmount")
  private Currency totalAmount = null;

  public SellerReviewEnrollmentPaymentEvent postedDate(String postedDate) {
    this.postedDate = postedDate;
    return this;
  }

   /**
   * The date and time when the financial event was posted.
   * @return postedDate
  **/
  @ApiModelProperty(value = "The date and time when the financial event was posted.")
  public String getPostedDate() {
    return postedDate;
  }

  public void setPostedDate(String postedDate) {
    this.postedDate = postedDate;
  }

  public SellerReviewEnrollmentPaymentEvent enrollmentId(String enrollmentId) {
    this.enrollmentId = enrollmentId;
    return this;
  }

   /**
   * An enrollment identifier.
   * @return enrollmentId
  **/
  @ApiModelProperty(value = "An enrollment identifier.")
  public String getEnrollmentId() {
    return enrollmentId;
  }

  public void setEnrollmentId(String enrollmentId) {
    this.enrollmentId = enrollmentId;
  }

  public SellerReviewEnrollmentPaymentEvent parentASIN(String parentASIN) {
    this.parentASIN = parentASIN;
    return this;
  }

   /**
   * The Amazon Standard Identification Number (ASIN) of the item that was enrolled in the Early Reviewer Program.
   * @return parentASIN
  **/
  @ApiModelProperty(value = "The Amazon Standard Identification Number (ASIN) of the item that was enrolled in the Early Reviewer Program.")
  public String getParentASIN() {
    return parentASIN;
  }

  public void setParentASIN(String parentASIN) {
    this.parentASIN = parentASIN;
  }

  public SellerReviewEnrollmentPaymentEvent feeComponent(FeeComponent feeComponent) {
    this.feeComponent = feeComponent;
    return this;
  }

   /**
   * Get feeComponent
   * @return feeComponent
  **/
  @ApiModelProperty(value = "")
  public FeeComponent getFeeComponent() {
    return feeComponent;
  }

  public void setFeeComponent(FeeComponent feeComponent) {
    this.feeComponent = feeComponent;
  }

  public SellerReviewEnrollmentPaymentEvent chargeComponent(ChargeComponent chargeComponent) {
    this.chargeComponent = chargeComponent;
    return this;
  }

   /**
   * Get chargeComponent
   * @return chargeComponent
  **/
  @ApiModelProperty(value = "")
  public ChargeComponent getChargeComponent() {
    return chargeComponent;
  }

  public void setChargeComponent(ChargeComponent chargeComponent) {
    this.chargeComponent = chargeComponent;
  }

  public SellerReviewEnrollmentPaymentEvent totalAmount(Currency totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * The FeeComponent value plus the ChargeComponent value.
   * @return totalAmount
  **/
  @ApiModelProperty(value = "The FeeComponent value plus the ChargeComponent value.")
  public Currency getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Currency totalAmount) {
    this.totalAmount = totalAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SellerReviewEnrollmentPaymentEvent sellerReviewEnrollmentPaymentEvent = (SellerReviewEnrollmentPaymentEvent) o;
    return Objects.equals(this.postedDate, sellerReviewEnrollmentPaymentEvent.postedDate) &&
        Objects.equals(this.enrollmentId, sellerReviewEnrollmentPaymentEvent.enrollmentId) &&
        Objects.equals(this.parentASIN, sellerReviewEnrollmentPaymentEvent.parentASIN) &&
        Objects.equals(this.feeComponent, sellerReviewEnrollmentPaymentEvent.feeComponent) &&
        Objects.equals(this.chargeComponent, sellerReviewEnrollmentPaymentEvent.chargeComponent) &&
        Objects.equals(this.totalAmount, sellerReviewEnrollmentPaymentEvent.totalAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postedDate, enrollmentId, parentASIN, feeComponent, chargeComponent, totalAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SellerReviewEnrollmentPaymentEvent {\n");
    
    sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
    sb.append("    enrollmentId: ").append(toIndentedString(enrollmentId)).append("\n");
    sb.append("    parentASIN: ").append(toIndentedString(parentASIN)).append("\n");
    sb.append("    feeComponent: ").append(toIndentedString(feeComponent)).append("\n");
    sb.append("    chargeComponent: ").append(toIndentedString(chargeComponent)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
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

