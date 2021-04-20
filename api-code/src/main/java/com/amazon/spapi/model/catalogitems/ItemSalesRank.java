/*
 * Selling Partner API for Catalog Items
 * The Selling Partner API for Catalog Items provides programmatic access to information about items in the Amazon catalog.
 *
 * OpenAPI spec version: 2020-12-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.catalogitems;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Sales rank of an Amazon catalog item.
 */
@ApiModel(description = "Sales rank of an Amazon catalog item.")

public class ItemSalesRank {
  @SerializedName("title")
  private String title = null;

  @SerializedName("link")
  private String link = null;

  @SerializedName("rank")
  private Integer rank = null;

  public ItemSalesRank title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title, or name, of the sales rank.
   * @return title
  **/
  @ApiModelProperty(required = true, value = "Title, or name, of the sales rank.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ItemSalesRank link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Corresponding Amazon retail website link, or URL, for the sales rank.
   * @return link
  **/
  @ApiModelProperty(value = "Corresponding Amazon retail website link, or URL, for the sales rank.")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public ItemSalesRank rank(Integer rank) {
    this.rank = rank;
    return this;
  }

   /**
   * Sales rank value.
   * @return rank
  **/
  @ApiModelProperty(required = true, value = "Sales rank value.")
  public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemSalesRank itemSalesRank = (ItemSalesRank) o;
    return Objects.equals(this.title, itemSalesRank.title) &&
        Objects.equals(this.link, itemSalesRank.link) &&
        Objects.equals(this.rank, itemSalesRank.rank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, link, rank);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemSalesRank {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
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

