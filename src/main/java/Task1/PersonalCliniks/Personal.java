package Task1.PersonalCliniks;

public class Personal {
    private String name;
    private String jobTitle;
    private Double expirience;

    public Personal(String name, String jobTitle, Double expirience) {
    this.name = name;
    this.jobTitle = jobTitle;
    this.expirience = expirience;
    }

    public Personal() {

    }

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public void setExpirience(Double expirience){
        this.expirience = expirience;
    }

    public Double getExpirience() {
        return getExpirience();
    }
    public void startJob(){
        System.out.println("Приходит на работу  ");
    }
    public void startJobToMiddleJob(){
        System.out.println("Осматривает животных ");
    }
    public void startJobToMiddleJobNurse(){
        System.out.println("Помогает осматривать животных доктору ");
    }
    public void middleJobToEndJob(){
        System.out.println("Лечит животных ");
    }
    public void middleJobToEndJobNurse(){
        System.out.println("Помогает доктору лечить животных ");
    }
    public void endJob(){
        System.out.println("Уходит с работы ");
    }
    public void workDayDoctor(){
        startJob();
        startJobToMiddleJob();
        middleJobToEndJob();
        endJob();
    }
    public void workDayNurse(){
        startJob();
        startJobToMiddleJobNurse();
        middleJobToEndJobNurse();
        endJob();
    }

    @Override
    public String toString() {
        return "Personal{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", expirience=" + expirience +
                '}';
    }
}

