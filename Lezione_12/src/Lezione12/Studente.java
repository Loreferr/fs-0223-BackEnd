package Lezione12;

public class Studente {

	private Integer id;
	private String name;
	private String lastname;
	private String gender;
	private Integer birthday;
	private Integer avg;
	private Integer min_vote;
	private Integer max_vote;

	public Studente(Integer id, String name, String lastname, String gender, Integer birthday, Integer avg,
			Integer min_vote, Integer max_vote) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.gender = gender;
		this.birthday = birthday;
		this.avg = avg;
		this.min_vote = min_vote;
		this.max_vote = max_vote;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getBirthday() {
		return birthday;
	}

	public void setBirthday(Integer birthday) {
		this.birthday = birthday;
	}

	public Integer getAvg() {
		return avg;
	}

	public void setAvg(Integer avg) {
		this.avg = avg;
	}

	public Integer getMin_vote() {
		return min_vote;
	}

	public void setMin_vote(Integer min_vote) {
		this.min_vote = min_vote;
	}

	public Integer getMax_vote() {
		return max_vote;
	}

	public void setMax_vote(Integer max_vote) {
		this.max_vote = max_vote;
	}

}