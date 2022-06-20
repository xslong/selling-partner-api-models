/*
 * Selling Partner APIs for Fulfillment Outbound
 * The Selling Partner API for Fulfillment Outbound lets you create applications that help a seller fulfill Multi-Channel Fulfillment orders using their inventory in Amazon's fulfillment network. You can get information on both potential and existing fulfillment orders.
 *
 * OpenAPI spec version: 2020-07-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.fulfillmentoutbound;

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
 * The weight.
 */
@ApiModel(description = "The weight.")

public class Weight {
  /**
   * The unit of weight.
   */
  @JsonAdapter(UnitEnum.Adapter.class)
  public enum UnitEnum {
    KG("KG"),
    
    KILOGRAMS("KILOGRAMS"),
    
    LB("LB"),
    
    POUNDS("POUNDS");

    private String value;

    UnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UnitEnum fromValue(String text) {
      for (UnitEnum b : UnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<UnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UnitEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return UnitEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("unit")
  private UnitEnum unit = null;

  @SerializedName("value")
  private String value = null;

  public Weight unit(UnitEnum unit) {
    this.unit = unit;
    return this;
  }

   /**
   * The unit of weight.
   * @return unit
  **/
  @ApiModelProperty(required = true, value = "The unit of weight.")
  public UnitEnum getUnit() {
    return unit;
  }

  public void setUnit(UnitEnum unit) {
    this.unit = unit;
  }

  public Weight value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The weight value.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The weight value.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Weight weight = (Weight) o;
    return Objects.equals(this.unit, weight.unit) &&
        Objects.equals(this.value, weight.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Weight {\n");
    
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

