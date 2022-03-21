/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.tab.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * TabType
 */
@JsonPropertyOrder({
  TabType.JSON_PROPERTY_TAB_ID,
  TabType.JSON_PROPERTY_ID_TYPE,
  TabType.JSON_PROPERTY_TAB_NAME,
  TabType.JSON_PROPERTY_TAB_COLOR
})
@JsonTypeName("TabType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TabType {
  public static final String JSON_PROPERTY_TAB_ID = "tabId";
  private Integer tabId;

  public static final String JSON_PROPERTY_ID_TYPE = "idType";
  private Integer idType;

  public static final String JSON_PROPERTY_TAB_NAME = "tabName";
  private String tabName;

  public static final String JSON_PROPERTY_TAB_COLOR = "tabColor";
  private String tabColor;

  public TabType() { 
  }

  public TabType tabId(Integer tabId) {
    
    this.tabId = tabId;
    return this;
  }

   /**
   * Get tabId
   * @return tabId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TAB_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTabId() {
    return tabId;
  }


  @JsonProperty(JSON_PROPERTY_TAB_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTabId(Integer tabId) {
    this.tabId = tabId;
  }


  public TabType idType(Integer idType) {
    
    this.idType = idType;
    return this;
  }

   /**
   * Get idType
   * @return idType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIdType() {
    return idType;
  }


  @JsonProperty(JSON_PROPERTY_ID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdType(Integer idType) {
    this.idType = idType;
  }


  public TabType tabName(String tabName) {
    
    this.tabName = tabName;
    return this;
  }

   /**
   * Get tabName
   * @return tabName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TAB_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTabName() {
    return tabName;
  }


  @JsonProperty(JSON_PROPERTY_TAB_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTabName(String tabName) {
    this.tabName = tabName;
  }


  public TabType tabColor(String tabColor) {
    
    this.tabColor = tabColor;
    return this;
  }

   /**
   * Get tabColor
   * @return tabColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TAB_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTabColor() {
    return tabColor;
  }


  @JsonProperty(JSON_PROPERTY_TAB_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTabColor(String tabColor) {
    this.tabColor = tabColor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TabType tabType = (TabType) o;
    return Objects.equals(this.tabId, tabType.tabId) &&
        Objects.equals(this.idType, tabType.idType) &&
        Objects.equals(this.tabName, tabType.tabName) &&
        Objects.equals(this.tabColor, tabType.tabColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tabId, idType, tabName, tabColor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TabType {\n");
    sb.append("    tabId: ").append(toIndentedString(tabId)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    tabName: ").append(toIndentedString(tabName)).append("\n");
    sb.append("    tabColor: ").append(toIndentedString(tabColor)).append("\n");
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

