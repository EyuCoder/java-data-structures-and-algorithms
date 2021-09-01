public class StudentNode{
	private int grade;
	private String name;
	private StudentNode next;

	public StudentNode(int grade, String name){
		this.grade = grade;
		this.name = name;
		this.next = null;
	}

	public int getGrade(){
		return grade;
	}

	public void setGrade(int grade){
		this.grade = grade;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public StudentNode getNext(){
		return next;
	}

	public void setNext(StudentNode next){
		this.next = next;
	}

	@Override
    public String toString() {
        return "StudentGrade{" +
                "Name='" + name + '\'' +
                ", Grade='" + grade + '\''+
                '}';
    }
}