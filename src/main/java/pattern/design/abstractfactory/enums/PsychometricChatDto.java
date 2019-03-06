package pattern.design.abstractfactory.enums;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author Gurmehar Class used for communicating for Psychometric chat
 * 
 */
public class PsychometricChatDto implements Serializable {

  private static final long serialVersionUID = -8232490414965176765L;
  
  private String scenarioId = "";
  private String chat;
  private Character option;
  private String answer;
  private String interim;
 
  private Map<String,Object> interimJson= new LinkedHashMap<String,Object>();
  private Float profileCompletion = new Float(0.0);
  private String placeHolder;
    

  public String getPlaceHolder() {
    return placeHolder;
  }

  public void setPlaceHolder(String placeHolder) {
    this.placeHolder = placeHolder;
  }

  public Map<String, Object> getInterimJson() {
    return interimJson;
  }

  public void setInterimJson(Map<String, Object> interimJson) {
    this.interimJson = interimJson;
  }

  public Float getProfileCompletion() {
    return profileCompletion;
  }

  public void setProfileCompletion(Float profileCompletion) {
    this.profileCompletion = profileCompletion;
  }
  
  

  public PsychometricChatDto() {}

  public String getInterim() {
    return interim;
  }

  public void setInterim(String interim) {
    this.interim = interim;
  }

  

  public String getScenarioId() {
    return scenarioId;
  }

  public void setScenarioId(String scenarioId) {
    this.scenarioId = scenarioId;
  }

  public String getChat() {
    return chat;
  }

  public void setChat(String chat) {
    this.chat = chat;
  }

  public Character getOption() {
    return option;
  }

  public void setOption(Character option) {
    this.option = option;
  }

  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  @Override
  public String toString() {
    return "PsychometricChatDto [scenarioId=" + scenarioId + ", chat=" + chat + ", option=" + option
        + ", answer=" + answer + ", interim=" + interim + ", interimJson=" + interimJson
        + ", profileCompletion=" + profileCompletion + ", placeHolder=" + placeHolder + "]";
  }

 

 
}
