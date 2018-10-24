class NamedCow extends Cow
{
	protected String myName;
	protected NamedCow(String type, String n, String sound){
		myName = n;
		myType = type;         
        mySound = sound;
	}
	public String getName()
	{
		return myName;
	} 
}