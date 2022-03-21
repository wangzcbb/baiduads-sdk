/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.advice.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AcceptInfo
 */
@JsonPropertyOrder({
  AcceptInfo.JSON_PROPERTY_ITEMS,
  AcceptInfo.JSON_PROPERTY_DOWNLOAD_URL
})
@JsonTypeName("AcceptInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AcceptInfo {
  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<Object> items = null;

  public static final String JSON_PROPERTY_DOWNLOAD_URL = "downloadUrl";
  private String downloadUrl;

  public AcceptInfo() { 
  }

  public AcceptInfo items(List<Object> items) {
    
    this.items = items;
    return this;
  }

  public AcceptInfo addItemsItem(Object itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(List<Object> items) {
    this.items = items;
  }


  public AcceptInfo downloadUrl(String downloadUrl) {
    
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * Get downloadUrl
   * @return downloadUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DOWNLOAD_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDownloadUrl() {
    return downloadUrl;
  }


  @JsonProperty(JSON_PROPERTY_DOWNLOAD_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcceptInfo acceptInfo = (AcceptInfo) o;
    return Objects.equals(this.items, acceptInfo.items) &&
        Objects.equals(this.downloadUrl, acceptInfo.downloadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, downloadUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcceptInfo {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

