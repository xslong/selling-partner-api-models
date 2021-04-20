/*
 * Selling Partner API for A+ Content Management
 * With the A+ Content API, you can build applications that help selling partners add rich marketing content to their Amazon product detail pages. A+ content helps selling partners share their brand and product story, which helps buyers make informed purchasing decisions. Selling partners assemble content by choosing from content modules and adding images and text.
 *
 * OpenAPI spec version: 2020-11-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.apluscontent;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.apluscontent.AplusPaginatedResponse;
import com.amazon.spapi.model.apluscontent.AsinMetadataSet;
import com.amazon.spapi.model.apluscontent.MessageSet;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ListContentDocumentAsinRelationsResponse
 */

public class ListContentDocumentAsinRelationsResponse extends AplusPaginatedResponse {
  @SerializedName("asinMetadataSet")
  private AsinMetadataSet asinMetadataSet = null;

  public ListContentDocumentAsinRelationsResponse asinMetadataSet(AsinMetadataSet asinMetadataSet) {
    this.asinMetadataSet = asinMetadataSet;
    return this;
  }

   /**
   * Get asinMetadataSet
   * @return asinMetadataSet
  **/
  @ApiModelProperty(required = true, value = "")
  public AsinMetadataSet getAsinMetadataSet() {
    return asinMetadataSet;
  }

  public void setAsinMetadataSet(AsinMetadataSet asinMetadataSet) {
    this.asinMetadataSet = asinMetadataSet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListContentDocumentAsinRelationsResponse listContentDocumentAsinRelationsResponse = (ListContentDocumentAsinRelationsResponse) o;
    return Objects.equals(this.asinMetadataSet, listContentDocumentAsinRelationsResponse.asinMetadataSet) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asinMetadataSet, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListContentDocumentAsinRelationsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    asinMetadataSet: ").append(toIndentedString(asinMetadataSet)).append("\n");
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

