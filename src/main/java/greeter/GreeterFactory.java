package greeter;

public class GreeterFactory {
    static GreeterString create(String formality) {
        GreeterString i;
        if (formality == "formal") {
            FormalGreeter formal = new FormalGreeter();
            i = formal;
        } else if (formality == "casual") {
            CasualGreeter casual = new CasualGreeter();
            i = casual;
        } else if (formality == "intimate") {
            IntimateGreeter intimate = new IntimateGreeter();
            i = intimate;
        } else {
            NormalGreeter normal = new NormalGreeter();
            i = normal;
        }
        return i;
    }
}
