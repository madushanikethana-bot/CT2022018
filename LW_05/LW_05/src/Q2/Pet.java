package Q2;
//Parent Class
public class Pet {
    private String name;
    private char petType;

    //constructor
    public Pet(){
        this.name = "pet";
        this.petType = 'd';
    }

    public String getName(){
        return name;
    }

    public char getpetType(){
        return petType;
    }

    public void setPetType(char pType){
        this.petType = pType;
    }
    public void setName(String petName){

        this.name = petName;
    }

    public String speak(){

        return  " I'm your cuddly little pet.";
    }





}
