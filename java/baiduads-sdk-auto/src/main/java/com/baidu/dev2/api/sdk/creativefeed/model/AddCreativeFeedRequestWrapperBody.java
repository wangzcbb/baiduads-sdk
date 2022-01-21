/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.creativefeed.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.creativefeed.model.CreativeFeedType;
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
 * AddCreativeFeedRequestWrapperBody
 */
@JsonPropertyOrder({
  AddCreativeFeedRequestWrapperBody.JSON_PROPERTY_CREATIVE_FEED_TYPES
})
@JsonTypeName("AddCreativeFeedRequestWrapper_body")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AddCreativeFeedRequestWrapperBody {
  public static final String JSON_PROPERTY_CREATIVE_FEED_TYPES = "creativeFeedTypes";
  private List<CreativeFeedType> creativeFeedTypes = null;

  public AddCreativeFeedRequestWrapperBody() { 
  }

  public AddCreativeFeedRequestWrapperBody creativeFeedTypes(List<CreativeFeedType> creativeFeedTypes) {
    
    this.creativeFeedTypes = creativeFeedTypes;
    return this;
  }

  public AddCreativeFeedRequestWrapperBody addCreativeFeedTypesItem(CreativeFeedType creativeFeedTypesItem) {
    if (this.creativeFeedTypes == null) {
      this.creativeFeedTypes = new ArrayList<>();
    }
    this.creativeFeedTypes.add(creativeFeedTypesItem);
    return this;
  }

   /**
   * Get creativeFeedTypes
   * @return creativeFeedTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATIVE_FEED_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CreativeFeedType> getCreativeFeedTypes() {
    return creativeFeedTypes;
  }


  @JsonProperty(JSON_PROPERTY_CREATIVE_FEED_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreativeFeedTypes(List<CreativeFeedType> creativeFeedTypes) {
    this.creativeFeedTypes = creativeFeedTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddCreativeFeedRequestWrapperBody addCreativeFeedRequestWrapperBody = (AddCreativeFeedRequestWrapperBody) o;
    return Objects.equals(this.creativeFeedTypes, addCreativeFeedRequestWrapperBody.creativeFeedTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creativeFeedTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddCreativeFeedRequestWrapperBody {\n");
    sb.append("    creativeFeedTypes: ").append(toIndentedString(creativeFeedTypes)).append("\n");
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

