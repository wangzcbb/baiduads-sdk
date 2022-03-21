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
import com.baidu.dev2.api.sdk.advice.model.AdviceSummary;
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
 * AdviceContent
 */
@JsonPropertyOrder({
  AdviceContent.JSON_PROPERTY_TOTAL_COUNT,
  AdviceContent.JSON_PROPERTY_MATERIAL_LIST,
  AdviceContent.JSON_PROPERTY_SUMMARY
})
@JsonTypeName("AdviceContent")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdviceContent {
  public static final String JSON_PROPERTY_TOTAL_COUNT = "totalCount";
  private Long totalCount;

  public static final String JSON_PROPERTY_MATERIAL_LIST = "materialList";
  private List<Object> materialList = null;

  public static final String JSON_PROPERTY_SUMMARY = "summary";
  private AdviceSummary summary;

  public AdviceContent() { 
  }

  public AdviceContent totalCount(Long totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTotalCount() {
    return totalCount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }


  public AdviceContent materialList(List<Object> materialList) {
    
    this.materialList = materialList;
    return this;
  }

  public AdviceContent addMaterialListItem(Object materialListItem) {
    if (this.materialList == null) {
      this.materialList = new ArrayList<>();
    }
    this.materialList.add(materialListItem);
    return this;
  }

   /**
   * Get materialList
   * @return materialList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATERIAL_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getMaterialList() {
    return materialList;
  }


  @JsonProperty(JSON_PROPERTY_MATERIAL_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaterialList(List<Object> materialList) {
    this.materialList = materialList;
  }


  public AdviceContent summary(AdviceSummary summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdviceSummary getSummary() {
    return summary;
  }


  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSummary(AdviceSummary summary) {
    this.summary = summary;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdviceContent adviceContent = (AdviceContent) o;
    return Objects.equals(this.totalCount, adviceContent.totalCount) &&
        Objects.equals(this.materialList, adviceContent.materialList) &&
        Objects.equals(this.summary, adviceContent.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, materialList, summary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdviceContent {\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    materialList: ").append(toIndentedString(materialList)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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

