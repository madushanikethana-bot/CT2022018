package Q1;
//Parent Class
public class Pet {
    private String name;

    //constructor
    public Pet(){
        this.name = "pet";
    }

    public String getName(){
        return name;
    }
    public void setName(String petName){

        this.name = petName;
    }

    public String speak(){

        return  " I'm your cuddly little pet.";
    }





}
