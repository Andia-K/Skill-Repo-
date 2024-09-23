abstract class Skill {
    //serves as parent class for all different kinds of skills

    //parameters shared by all concrete classes
    String name; 
    String type; 
    int skillLevel; 

    //constructor class to initialize all parameters 
    public Skill(){
        name = "";
        type = "skill";
        skillLevel = 0; 
    }

    //getter methods for parameters
    public String getName(){
        return name; 
    }

    public String getType(){
        return type; 
    }

    public int getSkillLevel(){
        return skillLevel; 
    }

    //method contained in all concrete classes
    abstract void identifySkill(); 
}