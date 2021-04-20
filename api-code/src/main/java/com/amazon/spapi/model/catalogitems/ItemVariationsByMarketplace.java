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
import java.util.ArrayList;
import java.util.List;

/**
 * Variation details for the Amazon catalog item for the indicated Amazon marketplace.
 */
@ApiModel(description = "Variation details for the Amazon catalog item for the indicated Amazon marketplace.")

public class ItemVariationsByMarketplace {
  @SerializedName("marketplaceId")
  private String marketplaceId = null;

  @SerializedName("asins")
  private List<String> asins = new ArrayList<String>();

  /**
   * Type of variation relationship of the Amazon catalog item in the request to the related item(s): \&quot;PARENT\&quot; or \&quot;CHILD\&quot;.
   */
  @JsonAdapter(VariationTypeEnum.Adapter.class)
  public enum VariationTypeEnum {
    PARENT("PARENT"),
    
    CHILD("CHILD");

    private String value;

    VariationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VariationTypeEnum fromValue(String text) {
      for (VariationTypeEnum b : VariationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VariationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VariationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VariationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VariationTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("variationType")
  private VariationTypeEnum variationType = null;

  public ItemVariationsByMarketplace marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * Amazon marketplace identifier.
   * @return marketplaceId
  **/
  @ApiModelProperty(required = true, value = "Amazon marketplace identifier.")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public ItemVariationsByMarketplace asins(List<String> asins) {
    this.asins = asins;
    return this;
  }

  public ItemVariationsByMarketplace addAsinsItem(String asinsItem) {
    this.asins.add(asinsItem);
    return this;
  }

   /**
   * Identifiers (ASINs) of the related items.
   * @return asins
  **/
  @ApiModelProperty(required = true, value = "Identifiers (ASINs) of the related items.")
  public List<String> getAsins() {
    return asins;
  }

  public void setAsins(List<String> asins) {
    this.asins = asins;
  }

  public ItemVariationsByMarketplace variationType(VariationTypeEnum variationType) {
    this.variationType = variationType;
    return this;
  }

   /**
   * Type of variation relationship of the Amazon catalog item in the request to the related item(s): \&quot;PARENT\&quot; or \&quot;CHILD\&quot;.
   * @return variationType
  **/
  @ApiModelProperty(example = "PARENT", required = true, value = "Type of variation relationship of the Amazon catalog item in the request to the related item(s): \"PARENT\" or \"CHILD\".")
  public VariationTypeEnum getVariationType() {
    return variationType;
  }

  public void setVariationType(VariationTypeEnum variationType) {
    this.variationType = variationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemVariationsByMarketplace itemVariationsByMarketplace = (ItemVariationsByMarketplace) o;
    return Objects.equals(this.marketplaceId, itemVariationsByMarketplace.marketplaceId) &&
        Objects.equals(this.asins, itemVariationsByMarketplace.asins) &&
        Objects.equals(this.variationType, itemVariationsByMarketplace.variationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceId, asins, variationType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemVariationsByMarketplace {\n");
    
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    asins: ").append(toIndentedString(asins)).append("\n");
    sb.append("    variationType: ").append(toIndentedString(variationType)).append("\n");
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

