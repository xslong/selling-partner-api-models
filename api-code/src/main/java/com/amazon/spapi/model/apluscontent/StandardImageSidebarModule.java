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
import com.amazon.spapi.model.apluscontent.StandardImageCaptionBlock;
import com.amazon.spapi.model.apluscontent.StandardImageTextBlock;
import com.amazon.spapi.model.apluscontent.StandardTextBlock;
import com.amazon.spapi.model.apluscontent.StandardTextListBlock;
import com.amazon.spapi.model.apluscontent.TextComponent;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Two images, two paragraphs, and two bulleted lists. One image is smaller and displayed in the sidebar.
 */
@ApiModel(description = "Two images, two paragraphs, and two bulleted lists. One image is smaller and displayed in the sidebar.")

public class StandardImageSidebarModule {
  @SerializedName("headline")
  private TextComponent headline = null;

  @SerializedName("imageCaptionBlock")
  private StandardImageCaptionBlock imageCaptionBlock = null;

  @SerializedName("descriptionTextBlock")
  private StandardTextBlock descriptionTextBlock = null;

  @SerializedName("descriptionListBlock")
  private StandardTextListBlock descriptionListBlock = null;

  @SerializedName("sidebarImageTextBlock")
  private StandardImageTextBlock sidebarImageTextBlock = null;

  @SerializedName("sidebarListBlock")
  private StandardTextListBlock sidebarListBlock = null;

  public StandardImageSidebarModule headline(TextComponent headline) {
    this.headline = headline;
    return this;
  }

   /**
   * Get headline
   * @return headline
  **/
  @ApiModelProperty(value = "")
  public TextComponent getHeadline() {
    return headline;
  }

  public void setHeadline(TextComponent headline) {
    this.headline = headline;
  }

  public StandardImageSidebarModule imageCaptionBlock(StandardImageCaptionBlock imageCaptionBlock) {
    this.imageCaptionBlock = imageCaptionBlock;
    return this;
  }

   /**
   * Get imageCaptionBlock
   * @return imageCaptionBlock
  **/
  @ApiModelProperty(value = "")
  public StandardImageCaptionBlock getImageCaptionBlock() {
    return imageCaptionBlock;
  }

  public void setImageCaptionBlock(StandardImageCaptionBlock imageCaptionBlock) {
    this.imageCaptionBlock = imageCaptionBlock;
  }

  public StandardImageSidebarModule descriptionTextBlock(StandardTextBlock descriptionTextBlock) {
    this.descriptionTextBlock = descriptionTextBlock;
    return this;
  }

   /**
   * Get descriptionTextBlock
   * @return descriptionTextBlock
  **/
  @ApiModelProperty(value = "")
  public StandardTextBlock getDescriptionTextBlock() {
    return descriptionTextBlock;
  }

  public void setDescriptionTextBlock(StandardTextBlock descriptionTextBlock) {
    this.descriptionTextBlock = descriptionTextBlock;
  }

  public StandardImageSidebarModule descriptionListBlock(StandardTextListBlock descriptionListBlock) {
    this.descriptionListBlock = descriptionListBlock;
    return this;
  }

   /**
   * Get descriptionListBlock
   * @return descriptionListBlock
  **/
  @ApiModelProperty(value = "")
  public StandardTextListBlock getDescriptionListBlock() {
    return descriptionListBlock;
  }

  public void setDescriptionListBlock(StandardTextListBlock descriptionListBlock) {
    this.descriptionListBlock = descriptionListBlock;
  }

  public StandardImageSidebarModule sidebarImageTextBlock(StandardImageTextBlock sidebarImageTextBlock) {
    this.sidebarImageTextBlock = sidebarImageTextBlock;
    return this;
  }

   /**
   * Get sidebarImageTextBlock
   * @return sidebarImageTextBlock
  **/
  @ApiModelProperty(value = "")
  public StandardImageTextBlock getSidebarImageTextBlock() {
    return sidebarImageTextBlock;
  }

  public void setSidebarImageTextBlock(StandardImageTextBlock sidebarImageTextBlock) {
    this.sidebarImageTextBlock = sidebarImageTextBlock;
  }

  public StandardImageSidebarModule sidebarListBlock(StandardTextListBlock sidebarListBlock) {
    this.sidebarListBlock = sidebarListBlock;
    return this;
  }

   /**
   * Get sidebarListBlock
   * @return sidebarListBlock
  **/
  @ApiModelProperty(value = "")
  public StandardTextListBlock getSidebarListBlock() {
    return sidebarListBlock;
  }

  public void setSidebarListBlock(StandardTextListBlock sidebarListBlock) {
    this.sidebarListBlock = sidebarListBlock;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandardImageSidebarModule standardImageSidebarModule = (StandardImageSidebarModule) o;
    return Objects.equals(this.headline, standardImageSidebarModule.headline) &&
        Objects.equals(this.imageCaptionBlock, standardImageSidebarModule.imageCaptionBlock) &&
        Objects.equals(this.descriptionTextBlock, standardImageSidebarModule.descriptionTextBlock) &&
        Objects.equals(this.descriptionListBlock, standardImageSidebarModule.descriptionListBlock) &&
        Objects.equals(this.sidebarImageTextBlock, standardImageSidebarModule.sidebarImageTextBlock) &&
        Objects.equals(this.sidebarListBlock, standardImageSidebarModule.sidebarListBlock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headline, imageCaptionBlock, descriptionTextBlock, descriptionListBlock, sidebarImageTextBlock, sidebarListBlock);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardImageSidebarModule {\n");
    
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    imageCaptionBlock: ").append(toIndentedString(imageCaptionBlock)).append("\n");
    sb.append("    descriptionTextBlock: ").append(toIndentedString(descriptionTextBlock)).append("\n");
    sb.append("    descriptionListBlock: ").append(toIndentedString(descriptionListBlock)).append("\n");
    sb.append("    sidebarImageTextBlock: ").append(toIndentedString(sidebarImageTextBlock)).append("\n");
    sb.append("    sidebarListBlock: ").append(toIndentedString(sidebarListBlock)).append("\n");
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

