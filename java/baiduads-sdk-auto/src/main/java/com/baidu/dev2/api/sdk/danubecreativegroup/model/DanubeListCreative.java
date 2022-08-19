/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.danubecreativegroup.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.danubecreativegroup.model.ListType;
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
 * DanubeListCreative
 */
@JsonPropertyOrder({
  DanubeListCreative.JSON_PROPERTY_CONTENT,
  DanubeListCreative.JSON_PROPERTY_MT_ID,
  DanubeListCreative.JSON_PROPERTY_CN_NAME,
  DanubeListCreative.JSON_PROPERTY_EN_NAME,
  DanubeListCreative.JSON_PROPERTY_STYLE
})
@JsonTypeName("DanubeListCreative")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DanubeListCreative {
  public static final String JSON_PROPERTY_CONTENT = "content";
  private ListType content;

  public static final String JSON_PROPERTY_MT_ID = "mtId";
  private Integer mtId;

  public static final String JSON_PROPERTY_CN_NAME = "cnName";
  private String cnName;

  public static final String JSON_PROPERTY_EN_NAME = "enName";
  private String enName;

  public static final String JSON_PROPERTY_STYLE = "style";
  private String style;

  public DanubeListCreative() { 
  }

  public DanubeListCreative content(ListType content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ListType getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(ListType content) {
    this.content = content;
  }


  public DanubeListCreative mtId(Integer mtId) {
    
    this.mtId = mtId;
    return this;
  }

   /**
   * Get mtId
   * @return mtId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMtId() {
    return mtId;
  }


  @JsonProperty(JSON_PROPERTY_MT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMtId(Integer mtId) {
    this.mtId = mtId;
  }


  public DanubeListCreative cnName(String cnName) {
    
    this.cnName = cnName;
    return this;
  }

   /**
   * Get cnName
   * @return cnName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCnName() {
    return cnName;
  }


  @JsonProperty(JSON_PROPERTY_CN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCnName(String cnName) {
    this.cnName = cnName;
  }


  public DanubeListCreative enName(String enName) {
    
    this.enName = enName;
    return this;
  }

   /**
   * Get enName
   * @return enName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnName() {
    return enName;
  }


  @JsonProperty(JSON_PROPERTY_EN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnName(String enName) {
    this.enName = enName;
  }


  public DanubeListCreative style(String style) {
    
    this.style = style;
    return this;
  }

   /**
   * Get style
   * @return style
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStyle() {
    return style;
  }


  @JsonProperty(JSON_PROPERTY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStyle(String style) {
    this.style = style;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DanubeListCreative danubeListCreative = (DanubeListCreative) o;
    return Objects.equals(this.content, danubeListCreative.content) &&
        Objects.equals(this.mtId, danubeListCreative.mtId) &&
        Objects.equals(this.cnName, danubeListCreative.cnName) &&
        Objects.equals(this.enName, danubeListCreative.enName) &&
        Objects.equals(this.style, danubeListCreative.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, mtId, cnName, enName, style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DanubeListCreative {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    mtId: ").append(toIndentedString(mtId)).append("\n");
    sb.append("    cnName: ").append(toIndentedString(cnName)).append("\n");
    sb.append("    enName: ").append(toIndentedString(enName)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
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

