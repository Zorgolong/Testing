package avigimplementation;

public class Measure {
    public String _description;
    public double _value;

    public Measure(String _description, double _value)
    {
        this._description = _description;
        this._value = _value;
    }
        public double getValue()
    {
        return _value;
    }
    
    public void setValue(double _value)
    {
        this._value = _value;
    }
    
    public String GetDescription()
    {
        return _description;
    }
    
    public void setDescription(String _description)
    {
        this._description = _description;
    }
}
