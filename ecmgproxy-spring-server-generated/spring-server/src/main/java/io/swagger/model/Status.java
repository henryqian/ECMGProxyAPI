package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-08-06T10:57:42.355Z")

public class Status   {
  
  private Integer numofChannels = null;

  /**
   **/
  public Status numofChannels(Integer numofChannels) {
    this.numofChannels = numofChannels;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("NumofChannels")
  public Integer getNumofChannels() {
    return numofChannels;
  }
  public void setNumofChannels(Integer numofChannels) {
    this.numofChannels = numofChannels;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Status status = (Status) o;
    return Objects.equals(numofChannels, status.numofChannels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numofChannels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    
    sb.append("    numofChannels: ").append(toIndentedString(numofChannels)).append("\n");
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

