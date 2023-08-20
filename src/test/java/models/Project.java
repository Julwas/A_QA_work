package models;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


import java.util.Date;
@Data
public class Project {
    private String projectName;
    private String announcement;
    private boolean flag;
    private int projectType;
    private Date date;
    private Milestone milestone;
}