/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.newcreative.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.newcreative.model.RangeItem;
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
 * SetRangeRequest
 */
@JsonPropertyOrder({
  SetRangeRequest.JSON_PROPERTY_CREATIVE_GROUP_ID,
  SetRangeRequest.JSON_PROPERTY_RANGE_ITEMS
})
@JsonTypeName("SetRangeRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SetRangeRequest {
  public static final String JSON_PROPERTY_CREATIVE_GROUP_ID = "creativeGroupId";
  private Long creativeGroupId;

  public static final String JSON_PROPERTY_RANGE_ITEMS = "rangeItems";
  private List<RangeItem> rangeItems = null;

  public SetRangeRequest() { 
  }

  public SetRangeRequest creativeGroupId(Long creativeGroupId) {
    
    this.creativeGroupId = creativeGroupId;
    return this;
  }

   /**
   * Get creativeGroupId
   * @return creativeGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATIVE_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreativeGroupId() {
    return creativeGroupId;
  }


  @JsonProperty(JSON_PROPERTY_CREATIVE_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreativeGroupId(Long creativeGroupId) {
    this.creativeGroupId = creativeGroupId;
  }


  public SetRangeRequest rangeItems(List<RangeItem> rangeItems) {
    
    this.rangeItems = rangeItems;
    return this;
  }

  public SetRangeRequest addRangeItemsItem(RangeItem rangeItemsItem) {
    if (this.rangeItems == null) {
      this.rangeItems = new ArrayList<>();
    }
    this.rangeItems.add(rangeItemsItem);
    return this;
  }

   /**
   * Get rangeItems
   * @return rangeItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RANGE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RangeItem> getRangeItems() {
    return rangeItems;
  }


  @JsonProperty(JSON_PROPERTY_RANGE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRangeItems(List<RangeItem> rangeItems) {
    this.rangeItems = rangeItems;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetRangeRequest setRangeRequest = (SetRangeRequest) o;
    return Objects.equals(this.creativeGroupId, setRangeRequest.creativeGroupId) &&
        Objects.equals(this.rangeItems, setRangeRequest.rangeItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creativeGroupId, rangeItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetRangeRequest {\n");
    sb.append("    creativeGroupId: ").append(toIndentedString(creativeGroupId)).append("\n");
    sb.append("    rangeItems: ").append(toIndentedString(rangeItems)).append("\n");
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

