public class HardSkill implements Skill{
    //represents a hard skill such as programming 

    public HardSkill(String name, String type, int skillLevel){
        this.name = name; 
        this.type = type; 
        this.skillLevel = skillLevel;
    }

    public String getType(){
        return type; 
    }

    public String getName(){
        return name; 
    }

    public int getSkillLevel(){
        return skillLevel; 
    }

    public void identifySkill(){
        System.out.println(this.getSkillLevel() + " of " + this.getType() + " has a level of " + this.getSkillLevel());
    }
}
