/*
 * Selling Partner API for Product Fees
 * The Selling Partner API for Product Fees lets you programmatically retrieve estimated fees for a product. You can then account for those fees in your pricing.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.productfees;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.productfees.MoneyType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The type of fee, fee amount, and other details.
 */
@ApiModel(description = "The type of fee, fee amount, and other details.")

public class IncludedFeeDetail {
  @SerializedName("FeeType")
  private String feeType = null;

  @SerializedName("FeeAmount")
  private MoneyType feeAmount = null;

  @SerializedName("FeePromotion")
  private MoneyType feePromotion = null;

  @SerializedName("TaxAmount")
  private MoneyType taxAmount = null;

  @SerializedName("FinalFee")
  private MoneyType finalFee = null;

  public IncludedFeeDetail feeType(String feeType) {
    this.feeType = feeType;
    return this;
  }

   /**
   * The type of fee charged to a seller.
   * @return feeType
  **/
  @ApiModelProperty(required = true, value = "The type of fee charged to a seller.")
  public String getFeeType() {
    return feeType;
  }

  public void setFeeType(String feeType) {
    this.feeType = feeType;
  }

  public IncludedFeeDetail feeAmount(MoneyType feeAmount) {
    this.feeAmount = feeAmount;
    return this;
  }

   /**
   * The amount charged for a given fee.
   * @return feeAmount
  **/
  @ApiModelProperty(required = true, value = "The amount charged for a given fee.")
  public MoneyType getFeeAmount() {
    return feeAmount;
  }

  public void setFeeAmount(MoneyType feeAmount) {
    this.feeAmount = feeAmount;
  }

  public IncludedFeeDetail feePromotion(MoneyType feePromotion) {
    this.feePromotion = feePromotion;
    return this;
  }

   /**
   * The promotion amount for a given fee.
   * @return feePromotion
  **/
  @ApiModelProperty(value = "The promotion amount for a given fee.")
  public MoneyType getFeePromotion() {
    return feePromotion;
  }

  public void setFeePromotion(MoneyType feePromotion) {
    this.feePromotion = feePromotion;
  }

  public IncludedFeeDetail taxAmount(MoneyType taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * The tax amount for a given fee.
   * @return taxAmount
  **/
  @ApiModelProperty(value = "The tax amount for a given fee.")
  public MoneyType getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(MoneyType taxAmount) {
    this.taxAmount = taxAmount;
  }

  public IncludedFeeDetail finalFee(MoneyType finalFee) {
    this.finalFee = finalFee;
    return this;
  }

   /**
   * The final fee amount for a given fee.
   * @return finalFee
  **/
  @ApiModelProperty(required = true, value = "The final fee amount for a given fee.")
  public MoneyType getFinalFee() {
    return finalFee;
  }

  public void setFinalFee(MoneyType finalFee) {
    this.finalFee = finalFee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncludedFeeDetail includedFeeDetail = (IncludedFeeDetail) o;
    return Objects.equals(this.feeType, includedFeeDetail.feeType) &&
        Objects.equals(this.feeAmount, includedFeeDetail.feeAmount) &&
        Objects.equals(this.feePromotion, includedFeeDetail.feePromotion) &&
        Objects.equals(this.taxAmount, includedFeeDetail.taxAmount) &&
        Objects.equals(this.finalFee, includedFeeDetail.finalFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeType, feeAmount, feePromotion, taxAmount, finalFee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncludedFeeDetail {\n");
    
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    feePromotion: ").append(toIndentedString(feePromotion)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    finalFee: ").append(toIndentedString(finalFee)).append("\n");
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

