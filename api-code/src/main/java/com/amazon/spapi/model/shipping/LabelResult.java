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
import com.amazon.spapi.model.shipping.Label;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Label details including label stream, format, size.
 */
@ApiModel(description = "Label details including label stream, format, size.")

public class LabelResult {
  @SerializedName("containerReferenceId")
  private String containerReferenceId = null;

  @SerializedName("trackingId")
  private String trackingId = null;

  @SerializedName("label")
  private Label label = null;

  public LabelResult containerReferenceId(String containerReferenceId) {
    this.containerReferenceId = containerReferenceId;
    return this;
  }

   /**
   * Get containerReferenceId
   * @return containerReferenceId
  **/
  @ApiModelProperty(value = "")
  public String getContainerReferenceId() {
    return containerReferenceId;
  }

  public void setContainerReferenceId(String containerReferenceId) {
    this.containerReferenceId = containerReferenceId;
  }

  public LabelResult trackingId(String trackingId) {
    this.trackingId = trackingId;
    return this;
  }

   /**
   * The tracking identifier assigned to the container.
   * @return trackingId
  **/
  @ApiModelProperty(value = "The tracking identifier assigned to the container.")
  public String getTrackingId() {
    return trackingId;
  }

  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }

  public LabelResult label(Label label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(value = "")
  public Label getLabel() {
    return label;
  }

  public void setLabel(Label label) {
    this.label = label;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelResult labelResult = (LabelResult) o;
    return Objects.equals(this.containerReferenceId, labelResult.containerReferenceId) &&
        Objects.equals(this.trackingId, labelResult.trackingId) &&
        Objects.equals(this.label, labelResult.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerReferenceId, trackingId, label);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelResult {\n");
    
    sb.append("    containerReferenceId: ").append(toIndentedString(containerReferenceId)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

