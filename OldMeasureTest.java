package avigimplementation;

import junit.framework.TestCase;

public class OldMeasureTest extends junit.framework.TestCase
{
      
    
    private Transform mTransfor1;
    private Measure mMeasure1;
    private Measure mMeasure2;
    private Measure mMeasure3;
    private Measure mMeasure4;
    
    private int mMetre, mDeciMetre; //värden för att lagra antalet centimeter för respektive längd


    public OldMeasureTest()
    {
    }

    
    protected void setUp()
    {
        mTransfor1 = new Transform();
        mMeasure1 = new Measure("tum", 2.47);
        mMeasure2 = new Measure("tvähand", (4 * mMeasure1.getLength()));
        mMeasure3 = new Measure("fot", 29.7);
        mMeasure4 = new Measure("aln", 59.4);
        mMetre = 100;
        mDeciMetre = 10;

    }
    
    protected void tearDown()
    {
    }
    

    public void testConvertToCentimetre()
    {
        assertEquals(7.41, mTransfor1.convertToCentimetre(3, mMeasure1));
        assertEquals(39.52, mTransfor1.convertToCentimetre(4, mMeasure2));
    }
    

    public void testConvertFromCentimetre()
	{
		assertEquals(3.367003367003367, mTransfor1.convertFromCentimetre(mMetre, mMeasure3));
		assertEquals(0.16835016835016836, mTransfor1.convertFromCentimetre(mDeciMetre, mMeasure4));
	}
	

	public void testGetDescription()
	{
		assertEquals("tvärhand", mMeasure2.getDescription());
		assertEquals("fot", mMeasure3.getDescription());
	}
	 
	
	public void testGetLength()
	{
		assertEquals(2.47, mMeasure1.getLength());
		assertEquals(59.4, mMeasure4.getLength());
		assertEquals(mMetre, (mDeciMetre *10));
	}
	

	public void testToString()
	{
		assertEquals("En aln är 59.4 centimeter.", mMeasure4.toString());
		assertEquals("En tvärhand är 9.88 centimeter.", mMeasure2.toString());
	}
}
