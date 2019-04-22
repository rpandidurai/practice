/**
 * 
 */
package ps.iv.enums;

/**
 * @author e3025685
 *
 */
public enum DAY implements EnumInterface {

	SUNDAY(1),
	MONDAY(2),
	TUESDAY(3),
	WEDNESDAY(4),
	THURSDAY(5),
	FRIDAY(6),
	SATURDAY(7);
	
	DAY()
	{
		System.out.println(this);
	}
	
	private int value;
	private DAY (int v)
	{
		this();
		this.value = v;
	}
	
	@Override
	public int getValue() {
		return value;
	}

	public DAY getType()
	{
		return this;
	}
	
	@Override
	public DAY getType(int x) {
		switch(x)
		{
		case 1:
			return DAY.SUNDAY;
		case 2:
			return DAY.MONDAY;
		case 3:
			return DAY.TUESDAY;
		case 4:
			return DAY.WEDNESDAY;
		case 5:
			return DAY.THURSDAY;
		case 6:
			return DAY.FRIDAY;
		case 7:
			return DAY.SATURDAY;			
		}
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(DAY.SUNDAY == DAY.SUNDAY.getType());
	}
	
	@Override
	public String toString() {		
		return super.toString();
	}
}
