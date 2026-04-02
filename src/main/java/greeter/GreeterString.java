package greeter;

public interface GreeterString {
    public String greet();
}

class FormalGreeter implements GreeterString {
    public String greet() {
        return "Good evening, sir.";
    }
}

class CasualGreeter implements GreeterString {
    public String greet() {
        return "Sup bro?";
    }
}

class IntimateGreeter implements GreeterString {
    public String greet() {
        return "Hello Darling!";
    }
}

class NormalGreeter implements GreeterString {
    public String greet() {
        return "Hello.";
    }
}