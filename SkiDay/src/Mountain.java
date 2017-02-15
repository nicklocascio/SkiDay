
public class Mountain
	{
	protected String name;
	protected String park;
	protected String powder;
	protected String groomer;
	protected int price;
	protected int acres;
	protected int miles;
	protected int time;
	protected int crowd;
	
	public Mountain(String n, String par, String pow, String g, int p, int a, int m, int t, int tour)
		{
		name = n;
		park = par;
		powder = pow;
		groomer = g;
		price = p;
		acres = a;
		miles = m;
		time = t;
		crowd = tour;
		}

	public String getName()
		{
		return name;
		}

	public void setName(String name)
		{
		this.name = name;
		}

	public String getPark()
		{
		return park;
		}

	public void setPark(String park)
		{
		this.park = park;
		}

	public String getPowder()
		{
		return powder;
		}

	public void setPowder(String powder)
		{
		this.powder = powder;
		}

	public String getGroomer()
		{
		return groomer;
		}

	public void setGroomer(String groomer)
		{
		this.groomer = groomer;
		}

	public int getPrice()
		{
		return price;
		}	

	public void setPrice(int price)
		{
		this.price = price;
		}	

	public int getAcres()
		{
		return acres;
		}	

	public void setAcres(int acres)
		{
		this.acres = acres;
		}

	public int getMiles()
		{
		return miles;
		}

	public void setMiles(int miles)
		{
		this.miles = miles;
		}	

	public int getTime()
		{
		return time;
		}

	public void setTime(int time)
		{
		this.time = time;
		}

	public int getCrowd()
		{
		return crowd;
		}

	public void getCrowd(int crowd)
		{
		this.crowd = crowd;
		}
	}
