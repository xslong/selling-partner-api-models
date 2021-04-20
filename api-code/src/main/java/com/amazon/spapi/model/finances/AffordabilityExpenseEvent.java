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
import com.amazon.spapi.model.finances.Currency;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An expense related to an affordability promotion.
 */
@ApiModel(description = "An expense related to an affordability promotion.")

public class AffordabilityExpenseEvent {
  @SerializedName("AmazonOrderId")
  private String amazonOrderId = null;

  @SerializedName("PostedDate")
  private String postedDate = null;

  @SerializedName("MarketplaceId")
  private String marketplaceId = null;

  @SerializedName("TransactionType")
  private String transactionType = null;

  @SerializedName("BaseExpense")
  private Currency baseExpense = null;

  @SerializedName("TaxTypeCGST")
  private Currency taxTypeCGST = null;

  @SerializedName("TaxTypeSGST")
  private Currency taxTypeSGST = null;

  @SerializedName("TaxTypeIGST")
  private Currency taxTypeIGST = null;

  @SerializedName("TotalExpense")
  private Currency totalExpense = null;

  public AffordabilityExpenseEvent amazonOrderId(String amazonOrderId) {
    this.amazonOrderId = amazonOrderId;
    return this;
  }

   /**
   * An Amazon-defined identifier for an order.
   * @return amazonOrderId
  **/
  @ApiModelProperty(value = "An Amazon-defined identifier for an order.")
  public String getAmazonOrderId() {
    return amazonOrderId;
  }

  public void setAmazonOrderId(String amazonOrderId) {
    this.amazonOrderId = amazonOrderId;
  }

  public AffordabilityExpenseEvent postedDate(String postedDate) {
    this.postedDate = postedDate;
    return this;
  }

   /**
   * The date and time when the financial event was created.
   * @return postedDate
  **/
  @ApiModelProperty(value = "The date and time when the financial event was created.")
  public String getPostedDate() {
    return postedDate;
  }

  public void setPostedDate(String postedDate) {
    this.postedDate = postedDate;
  }

  public AffordabilityExpenseEvent marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * An encrypted, Amazon-defined marketplace identifier.
   * @return marketplaceId
  **/
  @ApiModelProperty(value = "An encrypted, Amazon-defined marketplace identifier.")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public AffordabilityExpenseEvent transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Indicates the type of transaction.   Possible values:  * Charge - For an affordability promotion expense.  * Refund - For an affordability promotion expense reversal.
   * @return transactionType
  **/
  @ApiModelProperty(value = "Indicates the type of transaction.   Possible values:  * Charge - For an affordability promotion expense.  * Refund - For an affordability promotion expense reversal.")
  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public AffordabilityExpenseEvent baseExpense(Currency baseExpense) {
    this.baseExpense = baseExpense;
    return this;
  }

   /**
   * The amount charged for clicks incurred under the Sponsored Products program.
   * @return baseExpense
  **/
  @ApiModelProperty(value = "The amount charged for clicks incurred under the Sponsored Products program.")
  public Currency getBaseExpense() {
    return baseExpense;
  }

  public void setBaseExpense(Currency baseExpense) {
    this.baseExpense = baseExpense;
  }

  public AffordabilityExpenseEvent taxTypeCGST(Currency taxTypeCGST) {
    this.taxTypeCGST = taxTypeCGST;
    return this;
  }

   /**
   * Central Goods and Service Tax, charged and collected by the central government.
   * @return taxTypeCGST
  **/
  @ApiModelProperty(required = true, value = "Central Goods and Service Tax, charged and collected by the central government.")
  public Currency getTaxTypeCGST() {
    return taxTypeCGST;
  }

  public void setTaxTypeCGST(Currency taxTypeCGST) {
    this.taxTypeCGST = taxTypeCGST;
  }

  public AffordabilityExpenseEvent taxTypeSGST(Currency taxTypeSGST) {
    this.taxTypeSGST = taxTypeSGST;
    return this;
  }

   /**
   * State Goods and Service Tax, charged and collected by the state government.
   * @return taxTypeSGST
  **/
  @ApiModelProperty(required = true, value = "State Goods and Service Tax, charged and collected by the state government.")
  public Currency getTaxTypeSGST() {
    return taxTypeSGST;
  }

  public void setTaxTypeSGST(Currency taxTypeSGST) {
    this.taxTypeSGST = taxTypeSGST;
  }

  public AffordabilityExpenseEvent taxTypeIGST(Currency taxTypeIGST) {
    this.taxTypeIGST = taxTypeIGST;
    return this;
  }

   /**
   * Integrated Goods and Service Tax, charged and collected by the central government.
   * @return taxTypeIGST
  **/
  @ApiModelProperty(required = true, value = "Integrated Goods and Service Tax, charged and collected by the central government.")
  public Currency getTaxTypeIGST() {
    return taxTypeIGST;
  }

  public void setTaxTypeIGST(Currency taxTypeIGST) {
    this.taxTypeIGST = taxTypeIGST;
  }

  public AffordabilityExpenseEvent totalExpense(Currency totalExpense) {
    this.totalExpense = totalExpense;
    return this;
  }

   /**
   * The total amount charged to the seller. TotalExpense &#x3D; BaseExpense + TaxTypeIGST + TaxTypeCGST + TaxTypeSGST.
   * @return totalExpense
  **/
  @ApiModelProperty(value = "The total amount charged to the seller. TotalExpense = BaseExpense + TaxTypeIGST + TaxTypeCGST + TaxTypeSGST.")
  public Currency getTotalExpense() {
    return totalExpense;
  }

  public void setTotalExpense(Currency totalExpense) {
    this.totalExpense = totalExpense;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AffordabilityExpenseEvent affordabilityExpenseEvent = (AffordabilityExpenseEvent) o;
    return Objects.equals(this.amazonOrderId, affordabilityExpenseEvent.amazonOrderId) &&
        Objects.equals(this.postedDate, affordabilityExpenseEvent.postedDate) &&
        Objects.equals(this.marketplaceId, affordabilityExpenseEvent.marketplaceId) &&
        Objects.equals(this.transactionType, affordabilityExpenseEvent.transactionType) &&
        Objects.equals(this.baseExpense, affordabilityExpenseEvent.baseExpense) &&
        Objects.equals(this.taxTypeCGST, affordabilityExpenseEvent.taxTypeCGST) &&
        Objects.equals(this.taxTypeSGST, affordabilityExpenseEvent.taxTypeSGST) &&
        Objects.equals(this.taxTypeIGST, affordabilityExpenseEvent.taxTypeIGST) &&
        Objects.equals(this.totalExpense, affordabilityExpenseEvent.totalExpense);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amazonOrderId, postedDate, marketplaceId, transactionType, baseExpense, taxTypeCGST, taxTypeSGST, taxTypeIGST, totalExpense);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AffordabilityExpenseEvent {\n");
    
    sb.append("    amazonOrderId: ").append(toIndentedString(amazonOrderId)).append("\n");
    sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    baseExpense: ").append(toIndentedString(baseExpense)).append("\n");
    sb.append("    taxTypeCGST: ").append(toIndentedString(taxTypeCGST)).append("\n");
    sb.append("    taxTypeSGST: ").append(toIndentedString(taxTypeSGST)).append("\n");
    sb.append("    taxTypeIGST: ").append(toIndentedString(taxTypeIGST)).append("\n");
    sb.append("    totalExpense: ").append(toIndentedString(totalExpense)).append("\n");
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

