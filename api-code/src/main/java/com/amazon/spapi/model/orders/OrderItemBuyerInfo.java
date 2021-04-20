/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.orders;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.orders.BuyerCustomizedInfoDetail;
import com.amazon.spapi.model.orders.Money;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A single order item&#39;s buyer information.
 */
@ApiModel(description = "A single order item's buyer information.")

public class OrderItemBuyerInfo {
  @SerializedName("OrderItemId")
  private String orderItemId = null;

  @SerializedName("BuyerCustomizedInfo")
  private BuyerCustomizedInfoDetail buyerCustomizedInfo = null;

  @SerializedName("GiftWrapPrice")
  private Money giftWrapPrice = null;

  @SerializedName("GiftWrapTax")
  private Money giftWrapTax = null;

  @SerializedName("GiftMessageText")
  private String giftMessageText = null;

  @SerializedName("GiftWrapLevel")
  private String giftWrapLevel = null;

  public OrderItemBuyerInfo orderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
    return this;
  }

   /**
   * An Amazon-defined order item identifier.
   * @return orderItemId
  **/
  @ApiModelProperty(required = true, value = "An Amazon-defined order item identifier.")
  public String getOrderItemId() {
    return orderItemId;
  }

  public void setOrderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
  }

  public OrderItemBuyerInfo buyerCustomizedInfo(BuyerCustomizedInfoDetail buyerCustomizedInfo) {
    this.buyerCustomizedInfo = buyerCustomizedInfo;
    return this;
  }

   /**
   * Buyer information for custom orders from the Amazon Custom program.
   * @return buyerCustomizedInfo
  **/
  @ApiModelProperty(value = "Buyer information for custom orders from the Amazon Custom program.")
  public BuyerCustomizedInfoDetail getBuyerCustomizedInfo() {
    return buyerCustomizedInfo;
  }

  public void setBuyerCustomizedInfo(BuyerCustomizedInfoDetail buyerCustomizedInfo) {
    this.buyerCustomizedInfo = buyerCustomizedInfo;
  }

  public OrderItemBuyerInfo giftWrapPrice(Money giftWrapPrice) {
    this.giftWrapPrice = giftWrapPrice;
    return this;
  }

   /**
   * The gift wrap price of the item.
   * @return giftWrapPrice
  **/
  @ApiModelProperty(value = "The gift wrap price of the item.")
  public Money getGiftWrapPrice() {
    return giftWrapPrice;
  }

  public void setGiftWrapPrice(Money giftWrapPrice) {
    this.giftWrapPrice = giftWrapPrice;
  }

  public OrderItemBuyerInfo giftWrapTax(Money giftWrapTax) {
    this.giftWrapTax = giftWrapTax;
    return this;
  }

   /**
   * The tax on the gift wrap price.
   * @return giftWrapTax
  **/
  @ApiModelProperty(value = "The tax on the gift wrap price.")
  public Money getGiftWrapTax() {
    return giftWrapTax;
  }

  public void setGiftWrapTax(Money giftWrapTax) {
    this.giftWrapTax = giftWrapTax;
  }

  public OrderItemBuyerInfo giftMessageText(String giftMessageText) {
    this.giftMessageText = giftMessageText;
    return this;
  }

   /**
   * A gift message provided by the buyer.
   * @return giftMessageText
  **/
  @ApiModelProperty(value = "A gift message provided by the buyer.")
  public String getGiftMessageText() {
    return giftMessageText;
  }

  public void setGiftMessageText(String giftMessageText) {
    this.giftMessageText = giftMessageText;
  }

  public OrderItemBuyerInfo giftWrapLevel(String giftWrapLevel) {
    this.giftWrapLevel = giftWrapLevel;
    return this;
  }

   /**
   * The gift wrap level specified by the buyer.
   * @return giftWrapLevel
  **/
  @ApiModelProperty(value = "The gift wrap level specified by the buyer.")
  public String getGiftWrapLevel() {
    return giftWrapLevel;
  }

  public void setGiftWrapLevel(String giftWrapLevel) {
    this.giftWrapLevel = giftWrapLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemBuyerInfo orderItemBuyerInfo = (OrderItemBuyerInfo) o;
    return Objects.equals(this.orderItemId, orderItemBuyerInfo.orderItemId) &&
        Objects.equals(this.buyerCustomizedInfo, orderItemBuyerInfo.buyerCustomizedInfo) &&
        Objects.equals(this.giftWrapPrice, orderItemBuyerInfo.giftWrapPrice) &&
        Objects.equals(this.giftWrapTax, orderItemBuyerInfo.giftWrapTax) &&
        Objects.equals(this.giftMessageText, orderItemBuyerInfo.giftMessageText) &&
        Objects.equals(this.giftWrapLevel, orderItemBuyerInfo.giftWrapLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderItemId, buyerCustomizedInfo, giftWrapPrice, giftWrapTax, giftMessageText, giftWrapLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemBuyerInfo {\n");
    
    sb.append("    orderItemId: ").append(toIndentedString(orderItemId)).append("\n");
    sb.append("    buyerCustomizedInfo: ").append(toIndentedString(buyerCustomizedInfo)).append("\n");
    sb.append("    giftWrapPrice: ").append(toIndentedString(giftWrapPrice)).append("\n");
    sb.append("    giftWrapTax: ").append(toIndentedString(giftWrapTax)).append("\n");
    sb.append("    giftMessageText: ").append(toIndentedString(giftMessageText)).append("\n");
    sb.append("    giftWrapLevel: ").append(toIndentedString(giftWrapLevel)).append("\n");
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

