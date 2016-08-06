package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-08-06T10:57:42.355Z")

public class SCSConnection   {
  
  private String eCMIBorOOB = null;
  private String networkID = null;
  private String transportID = null;
  private String eCMGPort = null;
  private String sCSHost = null;
  private Integer cASystemID = null;
  private Integer repetitionRate = null;
  private Integer delayStart = null;
  private Integer delayStop = null;
  private Integer cWsInAdvance = null;
  private Integer cWsPerMessage = null;
  private Integer transportStreamPacketization = null;
  private Integer minCPDuration = null;
  private Integer maxCompTime = null;

  /**
   **/
  public SCSConnection eCMIBorOOB(String eCMIBorOOB) {
    this.eCMIBorOOB = eCMIBorOOB;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ECMIBorOOB")
  public String getECMIBorOOB() {
    return eCMIBorOOB;
  }
  public void setECMIBorOOB(String eCMIBorOOB) {
    this.eCMIBorOOB = eCMIBorOOB;
  }

  /**
   **/
  public SCSConnection networkID(String networkID) {
    this.networkID = networkID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("NetworkID")
  public String getNetworkID() {
    return networkID;
  }
  public void setNetworkID(String networkID) {
    this.networkID = networkID;
  }

  /**
   **/
  public SCSConnection transportID(String transportID) {
    this.transportID = transportID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("TransportID")
  public String getTransportID() {
    return transportID;
  }
  public void setTransportID(String transportID) {
    this.transportID = transportID;
  }

  /**
   **/
  public SCSConnection eCMGPort(String eCMGPort) {
    this.eCMGPort = eCMGPort;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ECMGPort")
  public String getECMGPort() {
    return eCMGPort;
  }
  public void setECMGPort(String eCMGPort) {
    this.eCMGPort = eCMGPort;
  }

  /**
   **/
  public SCSConnection sCSHost(String sCSHost) {
    this.sCSHost = sCSHost;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("SCSHost")
  public String getSCSHost() {
    return sCSHost;
  }
  public void setSCSHost(String sCSHost) {
    this.sCSHost = sCSHost;
  }

  /**
   **/
  public SCSConnection cASystemID(Integer cASystemID) {
    this.cASystemID = cASystemID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("CASystemID")
  public Integer getCASystemID() {
    return cASystemID;
  }
  public void setCASystemID(Integer cASystemID) {
    this.cASystemID = cASystemID;
  }

  /**
   **/
  public SCSConnection repetitionRate(Integer repetitionRate) {
    this.repetitionRate = repetitionRate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("RepetitionRate")
  public Integer getRepetitionRate() {
    return repetitionRate;
  }
  public void setRepetitionRate(Integer repetitionRate) {
    this.repetitionRate = repetitionRate;
  }

  /**
   **/
  public SCSConnection delayStart(Integer delayStart) {
    this.delayStart = delayStart;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("DelayStart")
  public Integer getDelayStart() {
    return delayStart;
  }
  public void setDelayStart(Integer delayStart) {
    this.delayStart = delayStart;
  }

  /**
   **/
  public SCSConnection delayStop(Integer delayStop) {
    this.delayStop = delayStop;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("DelayStop")
  public Integer getDelayStop() {
    return delayStop;
  }
  public void setDelayStop(Integer delayStop) {
    this.delayStop = delayStop;
  }

  /**
   **/
  public SCSConnection cWsInAdvance(Integer cWsInAdvance) {
    this.cWsInAdvance = cWsInAdvance;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("CWsInAdvance")
  public Integer getCWsInAdvance() {
    return cWsInAdvance;
  }
  public void setCWsInAdvance(Integer cWsInAdvance) {
    this.cWsInAdvance = cWsInAdvance;
  }

  /**
   **/
  public SCSConnection cWsPerMessage(Integer cWsPerMessage) {
    this.cWsPerMessage = cWsPerMessage;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("CWsPerMessage")
  public Integer getCWsPerMessage() {
    return cWsPerMessage;
  }
  public void setCWsPerMessage(Integer cWsPerMessage) {
    this.cWsPerMessage = cWsPerMessage;
  }

  /**
   **/
  public SCSConnection transportStreamPacketization(Integer transportStreamPacketization) {
    this.transportStreamPacketization = transportStreamPacketization;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("TransportStreamPacketization")
  public Integer getTransportStreamPacketization() {
    return transportStreamPacketization;
  }
  public void setTransportStreamPacketization(Integer transportStreamPacketization) {
    this.transportStreamPacketization = transportStreamPacketization;
  }

  /**
   **/
  public SCSConnection minCPDuration(Integer minCPDuration) {
    this.minCPDuration = minCPDuration;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("MinCPDuration")
  public Integer getMinCPDuration() {
    return minCPDuration;
  }
  public void setMinCPDuration(Integer minCPDuration) {
    this.minCPDuration = minCPDuration;
  }

  /**
   **/
  public SCSConnection maxCompTime(Integer maxCompTime) {
    this.maxCompTime = maxCompTime;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("MaxCompTime")
  public Integer getMaxCompTime() {
    return maxCompTime;
  }
  public void setMaxCompTime(Integer maxCompTime) {
    this.maxCompTime = maxCompTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SCSConnection sCSConnection = (SCSConnection) o;
    return Objects.equals(eCMIBorOOB, sCSConnection.eCMIBorOOB) &&
        Objects.equals(networkID, sCSConnection.networkID) &&
        Objects.equals(transportID, sCSConnection.transportID) &&
        Objects.equals(eCMGPort, sCSConnection.eCMGPort) &&
        Objects.equals(sCSHost, sCSConnection.sCSHost) &&
        Objects.equals(cASystemID, sCSConnection.cASystemID) &&
        Objects.equals(repetitionRate, sCSConnection.repetitionRate) &&
        Objects.equals(delayStart, sCSConnection.delayStart) &&
        Objects.equals(delayStop, sCSConnection.delayStop) &&
        Objects.equals(cWsInAdvance, sCSConnection.cWsInAdvance) &&
        Objects.equals(cWsPerMessage, sCSConnection.cWsPerMessage) &&
        Objects.equals(transportStreamPacketization, sCSConnection.transportStreamPacketization) &&
        Objects.equals(minCPDuration, sCSConnection.minCPDuration) &&
        Objects.equals(maxCompTime, sCSConnection.maxCompTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eCMIBorOOB, networkID, transportID, eCMGPort, sCSHost, cASystemID, repetitionRate, delayStart, delayStop, cWsInAdvance, cWsPerMessage, transportStreamPacketization, minCPDuration, maxCompTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SCSConnection {\n");
    
    sb.append("    eCMIBorOOB: ").append(toIndentedString(eCMIBorOOB)).append("\n");
    sb.append("    networkID: ").append(toIndentedString(networkID)).append("\n");
    sb.append("    transportID: ").append(toIndentedString(transportID)).append("\n");
    sb.append("    eCMGPort: ").append(toIndentedString(eCMGPort)).append("\n");
    sb.append("    sCSHost: ").append(toIndentedString(sCSHost)).append("\n");
    sb.append("    cASystemID: ").append(toIndentedString(cASystemID)).append("\n");
    sb.append("    repetitionRate: ").append(toIndentedString(repetitionRate)).append("\n");
    sb.append("    delayStart: ").append(toIndentedString(delayStart)).append("\n");
    sb.append("    delayStop: ").append(toIndentedString(delayStop)).append("\n");
    sb.append("    cWsInAdvance: ").append(toIndentedString(cWsInAdvance)).append("\n");
    sb.append("    cWsPerMessage: ").append(toIndentedString(cWsPerMessage)).append("\n");
    sb.append("    transportStreamPacketization: ").append(toIndentedString(transportStreamPacketization)).append("\n");
    sb.append("    minCPDuration: ").append(toIndentedString(minCPDuration)).append("\n");
    sb.append("    maxCompTime: ").append(toIndentedString(maxCompTime)).append("\n");
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

