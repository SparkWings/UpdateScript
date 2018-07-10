package mil.army.meade.lnec.update;

public abstract class Module {

    private String _name;
    
    public Module(String name) {
	
	this._name = name;
	
	System.out.println(name + ": ENABLING...");
	enable();
	System.out.println(name + ": ENABLED!");
	
    }
    
    public String getName() {
	return this._name;
    }
    
    public void enable() {}
    public void debug() {}
    
}
