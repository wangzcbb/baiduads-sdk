/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.advancedsegment.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.advancedsegment.model.SegmentType;
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
 * SegmentTypeApiSegmentBatchRequest
 */
@JsonPropertyOrder({
  SegmentTypeApiSegmentBatchRequest.JSON_PROPERTY_ITEMS
})
@JsonTypeName("SegmentTypeApiSegmentBatchRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SegmentTypeApiSegmentBatchRequest {
  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<SegmentType> items = null;

  public SegmentTypeApiSegmentBatchRequest() { 
  }

  public SegmentTypeApiSegmentBatchRequest items(List<SegmentType> items) {
    
    this.items = items;
    return this;
  }

  public SegmentTypeApiSegmentBatchRequest addItemsItem(SegmentType itemsItem) {
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

  public List<SegmentType> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(List<SegmentType> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentTypeApiSegmentBatchRequest segmentTypeApiSegmentBatchRequest = (SegmentTypeApiSegmentBatchRequest) o;
    return Objects.equals(this.items, segmentTypeApiSegmentBatchRequest.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentTypeApiSegmentBatchRequest {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

