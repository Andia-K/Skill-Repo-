public class TalentSkill  extends Skill{
    //represents a skills considered talents 

    //constructor class - initializes all variables
    public TalentSkill(String name, String type, int skillLevel){
        this.name = name; 
        this.type = type; 
        this.skillLevel = skillLevel;
    }

    //implementation of abstract method
    public void identifySkill(){
        System.out.println(this.getType() + " Skill of " + this.getName() + " has a level of " + this.getSkillLevel());
    }
}