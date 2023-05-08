package Engine.DTO;

import Engine.Enums.Location;
import Engine.Enums.State;
import Engine.Graph;
import javafx.scene.control.CheckBox;

import java.util.Set;

public class TargetDTO {
    // members
    private String targetName;
    private Location targetLocation;
    private String targetLocationString;
    private Set<String> targetDependsOn;
    private int targetDependsOnNum;
    private Set<String> targetRequiredFor;
    private int targetRequiredForNum;
    private String targetInfo;
    private State targetState;
    private String targetStateString;
    private long targetTime;
    private CheckBox selectedState;
    private int serialSetsBelongs; //how many serial sets the target is in
    private int totalDependencies;
    private int totalRequirements;

    // constructor
    public TargetDTO(TargetDTOWithoutCB t, CheckBox checkBox) {
        this.targetName = t.getTargetName();
        this.targetLocation = t.getTargetLocation();
        this.targetLocationString = t.getTargetLocationString();
        this.targetDependsOn = t.getTargetDependsOn();
        this.targetDependsOnNum = t.getTargetDependsOnNum();
        this.targetRequiredFor = t.getTargetRequiredFor();
        this.targetRequiredForNum = t.getTargetDependsOnNum();
        this.targetInfo = t.getTargetInfo();
        this.targetState = t.getTargetState();
        this.targetStateString = t.getTargetStateString();
        this.targetTime = t.getTargetTime();
        this.serialSetsBelongs = t.getSerialSetsBelongs();
        this.totalDependencies = t.getTotalDependencies();
        this.totalRequirements = t.getTotalRequierments();
        this.selectedState = checkBox;
    }


    public TargetDTO(Graph.Target t) {
        this.targetName = t.getName();
        this.targetLocation = t.getLocation();
        this.targetLocationString = t.getLocation().toString();
        this.targetDependsOn = t.getDependsOn();
        this.targetDependsOnNum = this.targetDependsOn.size();
        this.targetRequiredFor = t.getRequiredFor();
        this.targetRequiredForNum = this.targetRequiredFor.size();
        this.targetInfo = t.getInfo();
        this.targetState = t.getState();
        this.targetStateString = this.targetState.toString();
        this.targetTime = t.getTime();
        this.serialSetsBelongs = t.getSerialSetsBelongs();
        this.totalDependencies = t.getDependsOn().size();
        this.totalRequirements = t.getRequiredFor().size();
        this.selectedState = new CheckBox();
    }


    // methods
    @Override
    public String toString() {
        return "TargetDTO{" +
                "targetName='" + targetName + '\'' +
                ", targetLocation=" + targetLocation +
                ", targetDependsOn=" + targetDependsOn +
                ", targetRequiredFor=" + targetRequiredFor +
                ", targetInfo='" + targetInfo + '\'' +
                ", targetState=" + targetState +
                ", targetTime=" + targetTime +
                ", serialSetsBelongs=" + serialSetsBelongs +
                '}';
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public Location getTargetLocation() {
        return targetLocation;
    }

    public void setTargetLocation(Location targetLocation) {
        this.targetLocation = targetLocation;
    }

    public String getTargetLocationString() {
        return targetLocationString;
    }

    public void setTargetLocationString(String targetLocationString) {
        this.targetLocationString = targetLocationString;
    }

    public Set<String> getTargetDependsOn() {
        return targetDependsOn;
    }

    public void setTargetDependsOn(Set<String> targetDependsOn) {
        this.targetDependsOn = targetDependsOn;
    }

    public int getTargetDependsOnNum() {
        return targetDependsOnNum;
    }

    public void setTargetDependsOnNum(int targetDependsOnNum) {
        this.targetDependsOnNum = targetDependsOnNum;
    }

    public Set<String> getTargetRequiredFor() {
        return targetRequiredFor;
    }

    public void setTargetRequiredFor(Set<String> targetRequiredFor) {
        this.targetRequiredFor = targetRequiredFor;
    }

    public int getTargetRequiredForNum() {
        return targetRequiredForNum;
    }

    public void setTargetRequiredForNum(int targetRequiredForNum) {
        this.targetRequiredForNum = targetRequiredForNum;
    }

    public String getTargetInfo() {
        return targetInfo;
    }

    public void setTargetInfo(String targetInfo) {
        this.targetInfo = targetInfo;
    }

    public State getTargetState() {
        return targetState;
    }

    public void setTargetState(State targetState) {
        this.targetState = targetState;
    }

    public String getTargetStateString() {
        return targetStateString;
    }

    public void setTargetStateString(String targetStateString) {
        this.targetStateString = targetStateString;
    }

    public long getTargetTime() {
        return targetTime;
    }

    public void setTargetTime(long targetTime) {
        this.targetTime = targetTime;
    }

    public CheckBox getSelectedState() {
        return selectedState;
    }

    public void setSelectedState(CheckBox selectedState) {
        this.selectedState = selectedState;
    }

    public int getSerialSetsBelongs() {
        return serialSetsBelongs;
    }

    public void setSerialSetsBelongs(int serialSetsBelongs) {
        this.serialSetsBelongs = serialSetsBelongs;
    }

    public int getTotalDependencies() {
        return totalDependencies;
    }

    public void setTotalDependencies(int totalDependencies) {
        this.totalDependencies = totalDependencies;
    }

    public int getTotalRequirements() {
        return totalRequirements;
    }

    public void setTotalRequirements(int totalRequirements) {
        this.totalRequirements = totalRequirements;
    }

    public boolean isRoot() {
        return targetLocation == Location.ROOT;
    }

    public boolean isLeaf() {
        return targetLocation == Location.LEAF;
    }

    public boolean isIndependent() {
        return targetLocation == Location.INDEPENDENT;
    }

}
