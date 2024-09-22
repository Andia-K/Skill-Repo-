public class SoftSkill extends Skill{
    //represents soft skills

    //constructor class - initializes all variables
    public SoftSkill(String type, String name, int skillLevel){
        this.type = type; 
        this.name = name; 
        this.skillLevel = skillLevel; 
    }

    //implementation of abstract method
    public void identifySkill(){
        System.out.println(this.getSkillLevel() + " of " + this.getType() + " has a level of " + this.getSkillLevel());
    }    
}