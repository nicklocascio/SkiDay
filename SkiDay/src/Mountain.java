
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
	protected int priceRank;
	protected int acreRank;
	protected int mileRank;
	protected int timeRank;
	protected int crowdRank;
	protected double average;
	
	public Mountain(String n, String par, String pow, String g, int p, int a, int m, int t, int tour, int pr, int ar, int mr, int tr, int cr, double avg)
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
		priceRank = pr;
		acreRank = ar;
		mileRank = mr;
		timeRank = tr;
		average = avg;
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

	public void setCrowd(int crowd)
		{
		this.crowd = crowd;
		}

	public int getPriceRank()
		{
		return priceRank;
		}

	public void setPriceRank(int priceRank)
		{
		this.priceRank = priceRank;
		}

	public int getAcreRank()
		{
		return acreRank;
		}

	public void setAcreRank(int acreRank)
		{
		this.acreRank = acreRank;
		}

	public int getMileRank()
		{
		return mileRank;
		}

	public void setMileRank(int mileRank)
		{
		this.mileRank = mileRank;
		}

	public int getTimeRank()
		{
		return timeRank;
		}

	public void setTimeRank(int timeRank)
		{
		this.timeRank = timeRank;
		}

	public int getCrowdRank()
		{
		return crowdRank;
		}

	public void setCrowdRank(int crowdRank)
		{
		this.crowdRank = crowdRank;
		}

	public double getAverage()
		{
		return average;
		}

	public void setAverage(double average)
		{
		this.average = average;
		}	
	}
