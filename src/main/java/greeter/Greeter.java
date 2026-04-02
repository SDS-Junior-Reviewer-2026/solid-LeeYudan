package greeter;

public class Greeter {
    String formality ="";
    GreeterString greeter = new NormalGreeter();

    public String greet(){
        return greeter.greet();
    }

    public void setFormality(String formality) {
        if (this.formality == null ) this.formality= "";
        else this.formality = formality;
        greeter = GreeterFactory.create(formality);
    }
}